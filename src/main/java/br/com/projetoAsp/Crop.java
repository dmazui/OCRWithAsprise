package br.com.projetoAsp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Crop {

	public File imageCrop(String arquivoIn, String arquivoOut, int x, int y, int w, int h) {

		return imageCrop(new File(arquivoIn), new File(arquivoOut), x, y, w, h);
		
	}

	public File imageCrop(File inputFile, File outputfile, int x, int y, int w, int h) {
		try {
			BufferedImage originalImgage = ImageIO.read(inputFile);
			BufferedImage SubImgage = originalImgage.getSubimage(x, y, w, h);
			
			ImageIO.write(SubImgage, "jpg", outputfile);
			return outputfile;

		} catch (IOException e) {
			e.printStackTrace();
			return inputFile;
		}
	}
}