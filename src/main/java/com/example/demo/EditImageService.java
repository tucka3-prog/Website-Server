package com.example.demo;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://tucka3-prog.github.io/")
public class EditImageService {

	ImageEditor ie = new ImageEditor();

	@CrossOrigin(origins = "https://tucka3-prog.github.io/")
	@GetMapping("/editPicture/{properties}")
	public void getAllTodos(@PathVariable String properties) throws NumberFormatException, IOException {

		List<String> inputInfo = Arrays.asList(properties.split("\\s*,\\s*"));
		ie.AddText(inputInfo.get(0), inputInfo.get(1), inputInfo.get(2));

	}

}
