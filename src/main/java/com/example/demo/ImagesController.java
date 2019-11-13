package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.activation.FileTypeMap;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller

@RestController
@CrossOrigin(origins = "https://tucka3-prog.github.io/")
public class ImagesController {

	@GetMapping(path = "/images/{name}")
	public ResponseEntity<byte[]> getImage(@PathVariable String name) throws IOException {

		File img = new File("C:\\test\\" + name);
		return ResponseEntity.ok()
				.contentType(MediaType.valueOf(FileTypeMap.getDefaultFileTypeMap().getContentType(img)))
				.body(Files.readAllBytes(img.toPath()));
	}

	@GetMapping(path = "/images/users/{name}")
	public ResponseEntity<byte[]> getImageU(@PathVariable String name) throws IOException {

		File img = new File("C:\\test\\user\\" + name);
		return ResponseEntity.ok()
				.contentType(MediaType.valueOf(FileTypeMap.getDefaultFileTypeMap().getContentType(img)))
				.body(Files.readAllBytes(img.toPath()));
	}

	@GetMapping(path = "/images/user/{name}")
	public ResponseEntity<byte[]> getUserImage(@PathVariable String name) throws IOException {

		File img = new File("C:\\test\\user\\" + name);
		return ResponseEntity.ok()
				.contentType(MediaType.valueOf(FileTypeMap.getDefaultFileTypeMap().getContentType(img)))
				.body(Files.readAllBytes(img.toPath()));
	}

}