package com.fundacionview.controladores;


import com.fundacionview.modelos.Contactos;
import com.fundacionview.modelos.RepositorioContactos;
import com.fundacionview.vistas.FormularioCrear;
import com.fundacionview.vistas.FormularioView;
import com.fundacionview.vistas.JFrameVistaPrincipal;
import com.fundacionview.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.Collection;

/**
 *
 * @author Victor Ramirez
 */
public class Controlador {

    private JFrameVistaPrincipal vPrincipal;
    private FormularioCrear vFormAgregar;
    private FormularioView vFormVer;
    //private JFrameVistaLogin vLogin;
    private RepositorioContactos model;

    public void iniciar() {
        this.model = new RepositorioContactos();
        this.vPrincipal = new JFrameVistaPrincipal("Agenda Java-BBDD");

        this.vPrincipal.manejarAccionAgregar(new HandlerAgregarContactoVP());
        this.vPrincipal.manejarAccionConectar(new HandlerConectarVP());
        this.vPrincipal.manejarAccionVaciar(new HandlerVaciarVP());
        this.vPrincipal.manejarClickEnTabla(new HandlerClickTablaVP());
        this.vPrincipal.manejarCambioItemFiltrar(new HandlerFiltrarVP());

        this.vPrincipal.setVisible(true);

    }

    private void tratarExcepcion(Exception ex) {
        String causeMessage = ex.getCause() == null ? "" : "\n" + ex.getCause().getMessage();
        vPrincipal.mostrarCartelDeError(ex.getMessage() + "\n" + causeMessage);
    }

    private void listarContactosEnVista() {
        try {
            Collection<Contactos> contactos = model.getContactos(vPrincipal.obtenerCategoriaSeleccionada());
            vPrincipal.listarContactos(contactos);
        } catch (Exception ex) {
            tratarExcepcion(ex);
        }
    }

    private void agregarContacto() {
        try {
            Contactos co = vFormAgregar.getContacto();
            model.insertContacto(co);
            listarContactosEnVista();
          //  vFormAgregar.cerrarVentana();
            vPrincipal.mostrarCartelDeInfo("Se agregó a " + co.getNombre() + " a la agenda.");
        } catch (Exception ex) {
            tratarExcepcion(ex);
        }
    }

    private void actualizarContacto() {
        try {
            Contactos co = vFormVer.getContacto();
            model.actualizarContacto(co);
        } catch (Exception ex) {
            tratarExcepcion(ex);
        }
    }

    private void borrarContacto() {
        Contactos co = vFormVer.getContacto();
        boolean confirma = vPrincipal.confirmar("¿Estás segur@ de borrar a " + co.getNombre() + "?");
        if (confirma) {
            try {
                model.borrarContacto(co.getId());
                listarContactosEnVista();
              //  vFormVer.cerrarVentana();
                vPrincipal.mostrarCartelDeInfo("Se borró a " + co.getNombre() + " de la agenda.");
            } catch (Exception ex) {
                tratarExcepcion(ex);
            }
        }
    }

    private void vaciarAgenda() {
        boolean confirma = vPrincipal.confirmar("¿Estás segur@ de vaciar la agenda?");
        if (confirma) {
            try {
                model.eliminarTodos();
                listarContactosEnVista();
                vPrincipal.mostrarCartelDeInfo("Agenda vacía.");
            } catch (Exception ex) {
                tratarExcepcion(ex);
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////// HANDLERS PARA CADA ACCION /////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////// VISTA PRINCIPAL ///////////////////////////////////////
    private class HandlerConectarVP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
         /*   vLogin = new JFrameVistaLogin("Login", vPrincipal);
            vLogin.manejarAccionConectar(new HandlerConectarVA());
            vLogin.setVisible(true);
            */ 
        }
    }

    private class HandlerAgregarContactoVP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vFormAgregar = new FormularioCrear("Agregar Contactos", vPrincipal);
            vFormAgregar.manejarAccionAgregar(new HandlerAgregarContactoVC());
            vFormAgregar.setVisible(true);
        }
    }

    private class HandlerVaciarVP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vaciarAgenda();
        }
    }

    private class HandlerFiltrarVP implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                listarContactosEnVista();
            }
        }
    }

    private class HandlerClickTablaVP implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                try {
                    Contactos co = model.getByID(vPrincipal.obtenerIDSeleccionado());
                    vFormVer = new FormularioView("Contactos " + co.getNombre(), vPrincipal, co);
                  //  vFormVer.manejarAccionEditar(new HandlerEditarContactoVC());
                  //  vFormVer.manejarAccionBorrar(new HandlerBorrarContactoVC());
                    vFormVer.setVisible(true);
                } catch (Exception ex) {
                    tratarExcepcion(ex);
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    //////////////////// VISTA DE LOGIN ////////////////////////////////////////
    private class HandlerConectarVA implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
              //  model.conectarBD(vLogin.getDriver(), vLogin.getUrl(), vLogin.getUser(), vLogin.getPass());
              //  vLogin.cerrarVentana();
                vPrincipal.actualizarEstado(true);
                listarContactosEnVista();
            } catch (Exception ex) {
                tratarExcepcion(ex);
            }
        }
    }

    //////////////////// VISTA DE Contactos /////////////////////////////////////
    private class HandlerEditarContactoVC implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
              //  vFormVer.habilitarCampos(true);
            } else {
              //  vFormVer.habilitarCampos(false);
                actualizarContacto();
                listarContactosEnVista();
            }
        }
    }

    private class HandlerBorrarContactoVC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            borrarContacto();
            listarContactosEnVista();

        }
    }

    private class HandlerAgregarContactoVC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            agregarContacto();
        }
    }

}

