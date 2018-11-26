package br.com.projetoAsp;

import java.io.File;

public class Leitura {

	public static void main(String[] args) {
		
		String arquivo = "C:/test_OCR/arq10.JPG";
		String arquivo2 = "C:/test_OCR/arq10_test.JPG";
		String lang	   = "por";
		
		Crop c = new Crop();
		File f = new File(arquivo);
		
		try {
			f = c.imageCrop(arquivo, arquivo2, 120, 270, 905,380);
		}catch (Exception e) {
			e.getMessage();
		}
		
		OCRReader ocr = new OCRReader(arquivo, lang);
		String xx = ocr.getTexto(f);
		
		System.out.println(xx);
		
	}
}
