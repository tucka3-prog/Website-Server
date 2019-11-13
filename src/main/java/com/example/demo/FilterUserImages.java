package com.example.demo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class FilterUserImages {

	static final File dir2 = new File("C:\\test\\user\\");

	static final String[] EXTENSIONS = new String[] { "gif", "png", "bmp", "jpg", "jpeg" };

	static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

		@Override
		public boolean accept(final File dir2, final String name) {
			for (final String ext : EXTENSIONS) {
				if (name.endsWith("." + ext)) {
					return (true);
				}
			}
			return (false);
		}
	};

	public static List<Images> filterImages() {

		List<Images> filteredImagesUser = new ArrayList<>();

		if (dir2.isDirectory()) {
			for (final File f : dir2.listFiles(IMAGE_FILTER)) {
				BufferedImage img = null;

				try {
					img = ImageIO.read(f);

					String width = Integer.toString(img.getWidth());
					String height = Integer.toString(img.getHeight());
					String url = "http://35.224.119.47:8080/images/users/" + f.getName();

					filteredImagesUser.add(new Images(f.getName(), url, width, height));

				} catch (final IOException e) {
					System.out.println("Unknown error occured");
				}
			}
		}
		return filteredImagesUser;
	}

}