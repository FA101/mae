package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class FileUploaderController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        // Save the file somewhere, like local storage or cloud
        // Return a response with file information or URL
        return ResponseEntity.ok("Arquivo carregado com sucesso!");
    }

}
