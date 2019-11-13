package com.example.demo;

import java.io.File;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.boot.devtools.restart.Restarter;

@Controller
@CrossOrigin(origins = "https://tucka3-prog.github.io/")
//@CrossOrigin(origins="https://tucka3-prog.github.io")
@RequestMapping(path = "/files")
public class FileController {

	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity  handleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            System.out.printf("File name=%s, size=%s\n", file.getOriginalFilename(),file.getSize());
            //creating a new file in some local directory
            File fileToSave = new File("C:\\test\\" + file.getOriginalFilename());           
            //copy file content from received file to new local file
            file.transferTo(fileToSave);
            Restarter.getInstance().restart();

        } catch (IOException ioe) {
            //if something went bad, we need to inform client about it
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        //everything was OK, return HTTP OK status (200) to the client
        return ResponseEntity.ok().build();
    }
}
