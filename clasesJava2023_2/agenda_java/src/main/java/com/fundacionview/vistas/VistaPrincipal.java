package com.fundacionview.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.fundacionview.modelos.Categoria;


public class VistaPrincipal extends TemlateJframe {

	
	private JLabel lblCategoria;
	private JLabel lblEstado;
	private JLabel lblLeyenda;
	
	private JComboBox<Categoria> jComboFiltro; 
	
	private JButton btnAgregar;
	private JButton btnVaciar;
	private JButton btnCargar;
	
	private JPanel panelBotones;
	private JPanel panelCabecera;
	private JPanel panelFiltros;
	private JScrollPane jscrollTabla;
	private JTable jtablaAgenda;
	

	public VistaPrincipal(String titulo, Component parent) {
		super(titulo, parent);
		initComponentes();
		cargarIconos();
		
		
	}
	

	public VistaPrincipal(String titulo) {
		this(titulo,null);
		
	}

	
	
	public void initComponentes() {	
		
		lblCategoria = new JLabel();
		lblLeyenda = new JLabel();
		lblEstado = new JLabel();
		
		panelCabecera = new JPanel();
		panelFiltros = new JPanel();
		panelBotones = new JPanel();
		
		btnCargar = new JButton();
		btnVaciar = new JButton();
		btnAgregar = new JButton();
		
		jscrollTabla = new JScrollPane();
		jtablaAgenda = new JTable();
		
		jComboFiltro = new JComboBox<Categoria>();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(new Color(217, 200, 184));
		
		getContentPane().setLayout(new BorderLayout(10,10));
		
		panelCabecera.setPreferredSize(new Dimension(400,60));
		panelCabecera.setLayout(new BorderLayout());
		
		panelFiltros.setPreferredSize(new Dimension(400,50));
		panelFiltros.setLayout(new FlowLayout(java.awt.FlowLayout.CENTER,2,10));
		
		lblCategoria.setFont(new Font("Lato",0,18));
		lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoria.setText("Categoría:");
		lblCategoria.setIconTextGap(10);
		
		panelFiltros.add(lblCategoria);
		
		jComboFiltro.setFont(new Font("Lato",0, 18));
		jComboFiltro.setToolTipText("Texto de ayuda**");
		jComboFiltro.setEnabled(false);
		jComboFiltro.setPreferredSize(new Dimension(200,40));
		
		panelFiltros.add(jComboFiltro);
		

		
		lblLeyenda.setFont(new Font("Lato",0,14));
		lblLeyenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeyenda.setText("Doble Click para mas información");
		lblLeyenda.setPreferredSize(new Dimension(400,20));
		lblLeyenda.setVerticalTextPosition(SwingConstants.BOTTOM);
		panelFiltros.add(lblLeyenda);
		
		panelCabecera.add(panelFiltros, java.awt.BorderLayout.WEST);
		
		lblEstado.setFont(new Font("Lato Black",1, 18));
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setText("Estado Conexión");
		
		panelCabecera.add(lblEstado,BorderLayout.CENTER);
		
	
		
		panelBotones.setPreferredSize(new Dimension(265,50));
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER,5,18));
		
		btnCargar.setBackground(new Color(238,245,247));
		btnCargar.setFont(new Font("Tahoma",0,18));
		btnCargar.setForeground(new Color(255,250,240));
		btnCargar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCargar.setIconTextGap(20);
		btnCargar.setMaximumSize(new Dimension(60,40));
		btnCargar.setMinimumSize(new Dimension(40,40));
		btnCargar.setPreferredSize(new Dimension(60,40));
		//btnCargar.setEnabled(false);
		btnCargar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
		        PrinterJob job=PrinterJob.getPrinterJob();
		        job.setJobName("Print Data");
		      
		            job.setPrintable(new Printable(){
		            public int print(Graphics pg,PageFormat pf, int pageNum){
		                    pf.setOrientation(PageFormat.LANDSCAPE);
		                 if(pageNum>0){
		                    return Printable.NO_SUCH_PAGE;
		                }
		                
		                Graphics2D g2 = (Graphics2D)pg;
		                g2.translate(pf.getImageableX(), pf.getImageableY());
		                g2.scale(0.24,0.24);
		                
		                jscrollTabla.paint(g2);
//		          
		               
		                return Printable.PAGE_EXISTS;
		                         
		                
		            }
		    });
		         
		        boolean ok = job.printDialog();
		        if(ok){
		        try{
		            
		        job.print();
		        }
		        catch (PrinterException ex){}
		        }
			}
		});
		
		
		panelBotones.add(btnCargar);
		
		
		btnVaciar.setBackground(new Color(238,245,247));
		btnVaciar.setFont(new Font("Tahoma",0,18));
		btnVaciar.setForeground(new Color(255,250,240));
		btnVaciar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnVaciar.setIconTextGap(20);
		btnVaciar.setMaximumSize(new Dimension(60,40));
		btnVaciar.setMinimumSize(new Dimension(40,40));
		btnVaciar.setPreferredSize(new Dimension(60,40));
		btnVaciar.setEnabled(false);
		
		panelBotones.add(btnVaciar);
		
		
		btnAgregar.setBackground(new Color(238,245,247));
		btnAgregar.setFont(new Font("Tahoma",0,18));
		btnAgregar.setForeground(new Color(255,250,240));
		btnAgregar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnAgregar.setIconTextGap(20);
		btnAgregar.setMaximumSize(new Dimension(60,40));
		btnAgregar.setMinimumSize(new Dimension(40,40));
		btnAgregar.setPreferredSize(new Dimension(60,40));
		//btnAgregar.setEnabled(false);
		
		panelBotones.add(btnAgregar);
		
		panelCabecera.add(panelBotones,BorderLayout.EAST);
		
		
		getContentPane().add(panelCabecera, BorderLayout.NORTH);
		
		setPreferredSize(new Dimension(900,300));
		
		jtablaAgenda.setBackground(new Color(238,245,247));
		jtablaAgenda.setFont(new Font("Lato",0,17));
		jtablaAgenda.setModel(new DefaultTableModel(
				new Object [][] {},
				new String [] {
						"ID","Nombre","Apellidos","Email"
				}
				) {
			
			Class[] types = new Class[] {
					java.lang.Integer.class, java.lang.String.class, java.lang.String.class
					, java.lang.String.class, java.lang.String.class
			};
			boolean [] canEdit = new boolean[] {
					false,false,false,false
			};
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			};
			public boolean isCellEditable(int rowIndex,int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		
		
		jscrollTabla.setViewportView(jtablaAgenda);
		getContentPane().add(jscrollTabla,BorderLayout.CENTER);
		pack();
		
	}
	
	
	private void cargarIconos() {
		
		cargarIcono(lblCategoria,"tag-icon.png");
		cargarIcono(btnCargar,"broken-link.png");
		cargarIcono(btnVaciar,"trash-icon.png");
		cargarIcono(btnAgregar, "add-user-icon.png");
		
	}
	

	
	
	
}
