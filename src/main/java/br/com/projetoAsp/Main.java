package br.com.projetoAsp;

import java.io.File;
import com.asprise.ocr.Ocr;

public class Main {

	public static void main(String[] args) {
		Ocr.setUp();
		String fileName = "C:/ocrDi/testeEng.png";
		Ocr ocr = new Ocr();
		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
		String s = ocr.recognize(new File[] {new File(fileName)},
		  Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT); // PLAINTEXT | XML | PDF | RTF
		System.out.println("Result: " + s);
		ocr.stopEngine();
	}

}
