package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ImageFinalListUser {

	private static List<Images> imageListUser = new ArrayList();
	static List<Images> currentUserList = FilterUserImages.filterImages();

	static {
		for (int a = 0; a < currentUserList.size(); a++) {
			imageListUser.add(new Images(currentUserList.get(a).getId(), currentUserList.get(a).getName(),
					currentUserList.get(a).getUrl(), currentUserList.get(a).getWidth(),
					currentUserList.get(a).getHeight()));

		}
	}

	public List<Images> findAll() {
		return imageListUser;
	}

}