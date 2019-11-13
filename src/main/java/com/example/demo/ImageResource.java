package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://tucka3-prog.github.io/")
public class ImageResource {

	ImageFinalList allImages = new ImageFinalList();
	ImageFinalListUser allImagesUsers = new ImageFinalListUser();

	@GetMapping(path = "/images/all")
	public List<Images> getAllTodos() {

		return allImages.findAll();

	}

	@GetMapping(path = "/users/all")
	public List<Images> getAllTodosU() {

		return allImagesUsers.findAll();

	}

	@GetMapping(path = "/pictures")
	public List<Images> test() {

		return allImages.findAll();

	}

}
