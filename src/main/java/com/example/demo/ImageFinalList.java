package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ImageFinalList {

	private static List<Images> imageList = new ArrayList();
	static List<Images> currentImageList = FilterImages.filterImages();

	static {
		for (int a = 0; a < currentImageList.size(); a++) {
			imageList.add(new Images(currentImageList.get(a).getId(), currentImageList.get(a).getName(),
					currentImageList.get(a).getUrl(), currentImageList.get(a).getWidth(),
					currentImageList.get(a).getHeight()));

		}
	}

	public List<Images> findAll() {
		return imageList;
	}

}
