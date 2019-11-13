package com.example.demo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class FilterImages {

	static final File dir = new File("C:\\test\\");

	static final String[] EXTENSIONS = new String[] { "gif", "png", "bmp", "jpg", "jpeg" };

	static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

		@Override
		public boolean accept(final File dir, final String name) {
			for (final String ext : EXTENSIONS) {
				if (name.endsWith("." + ext)) {
					return (true);
				}
			}
			return (false);
		}
	};

	public static List<Images> filterImages() {

		List<Images> filteredImages = new ArrayList<>();

		if (dir.isDirectory()) {
			for (final File f : dir.listFiles(IMAGE_FILTER)) {
				BufferedImage img = null;

				try {
					img = ImageIO.read(f);

					String width = Integer.toString(img.getWidth());
					String height = Integer.toString(img.getHeight());
					String url = "http://35.224.119.47:8080/images/" + f.getName();

					filteredImages.add(new Images(f.getName(), url, width, height));

				} catch (final IOException e) {
					System.out.println("Unknown error occured");
				}
			}
		}
		return filteredImages;
	}

}