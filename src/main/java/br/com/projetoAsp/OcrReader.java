package br.com.projetoAsp;

import java.io.File;
import com.asprise.ocr.Ocr;

public class OcrReader {
	
	private String arquivo;
	private String idioma;
	
	public Ocr ocr = new Ocr();

	public OcrReader() {
		super();
		Ocr.setUp();
	}

	public OcrReader(String arquivo, String idioma) {
		super();
		Ocr.setUp();
		this.arquivo = arquivo;
		this.idioma = idioma;
	} 

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

		
	public String getText() {		
		return getText(this.arquivo);
	}

	public String getText(String arquivo) {		
		return getText(arquivo,this.idioma);
	}
	
	public String getText(String arquivo, String idioma) {		
		ocr.startEngine(idioma, Ocr.SPEED_SLOW);
		String s = ocr.recognize(new File[] {new File(arquivo)},
				  Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		ocr.stopEngine();
		return s;
	}
}
