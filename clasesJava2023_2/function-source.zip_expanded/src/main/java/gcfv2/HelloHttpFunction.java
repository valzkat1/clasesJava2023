package gcfv2;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;

public class HelloHttpFunction implements HttpFunction {
  //private static final Logger logger = Logger.getLogger(HttpFormData.class.getName());

  @Override
  public void service(HttpRequest request, HttpResponse response)
      throws IOException {

    if (!"POST".equals(request.getMethod())) {
      response.setStatusCode(HttpURLConnection.HTTP_BAD_METHOD);
      return;
    }

    // This code will process each file uploaded.
    String tempDirectory = System.getProperty("java.io.tmpdir");
    for (HttpRequest.HttpPart httpPart : request.getParts().values()) {
      String filename = httpPart.getFileName().orElse(null);
      if (filename == null) {
        continue;
      }

    //  logger.info("Processed file: " + filename);

      // Note: GCF's temp directory is an in-memory file system
      // Thus, any files in it must fit in the instance's memory.
      Path filePath = Paths.get(tempDirectory, filename).toAbsolutePath();

      // Note: files saved to a GCF instance itself may not persist across executions.
      // Persistent files should be stored elsewhere, e.g. a Cloud Storage bucket.
      Files.copy(httpPart.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

      // TODO(developer): process saved files here
      Files.delete(filePath);
    }

    // This code will process other form fields.
    request.getQueryParameters().forEach(
        (fieldName, fieldValues) -> {
          String firstFieldValue = fieldValues.get(0);

          // TODO(developer): process field values here
      //    logger.info(String.format(
        //      "Processed field: %s (value: %s)", fieldName, firstFieldValue));
        });
  }
}
