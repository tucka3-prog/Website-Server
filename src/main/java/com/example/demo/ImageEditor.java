package com.example.demo;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageEditor {

	public void AddText(String fileName, String topText, String botText) throws IOException {

		String path = "C:\\test\\";
		String filePath = path + fileName;

		final BufferedImage image = ImageIO.read(new File(filePath));

		Graphics g = image.getGraphics();
		g.setFont(g.getFont().deriveFont(30f));
		g.setColor(Color.WHITE);

		FontMetrics fm = g.getFontMetrics();

////	    int x = (image.getWidth() - fm.stringWidth(text)) / 2;
////	    int y = (image.getHeight() - image.getHeight() + fm.getAscent());

		int xTop = (image.getWidth() - fm.stringWidth(topText)) / 2; // TOP CENTER
		int yTop = (image.getHeight() - image.getHeight() + fm.getAscent());

		int xBot = (image.getWidth() - fm.stringWidth(botText)) / 2; // BOT CENTER
		int yBot = (image.getHeight() - fm.getHeight()) + fm.getAscent();

		g.drawString(topText, xTop, yTop);
		g.drawString(botText, xBot, yBot);
		g.dispose();

		Graphics g2 = g;
		g2.dispose();

		BufferedImage newImage = image;

		ImageIO.write(newImage, "png", new File("C:\\test\\user\\" + "new" + fileName));
	}
}