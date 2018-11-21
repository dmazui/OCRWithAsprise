package br.com.projetoAsp;

public class Main {

	public static void main(String[] args) {

		String file	= "C:/ocrDi/testePor.png";
		String lang	= "por";
		
		OcrReader leitor = new OcrReader(file, lang);
		
		System.out.println(leitor.getText());
		
	}

}
