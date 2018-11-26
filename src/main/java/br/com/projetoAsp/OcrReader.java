package br.com.projetoAsp;

import java.io.File;
import com.asprise.ocr.Ocr;

public class OCRReader {
	
	private String arquivo;
	private String idioma;
	
	public Ocr ocr = new Ocr();

	public OCRReader() {
		super();
		this.idioma = "por";
	}

	public OCRReader(String arquivo, String idioma) {
		super();
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
		
	public String getTexto() {		
		return getTexto(this.arquivo);
	}

	public String getTexto(String arquivo) {		
		return getTexto(arquivo,this.idioma);
	}
	
	public String getTexto(String arquivo, String idioma) {
		return getTexto(new File(arquivo), idioma);
	}
	
	public String getTexto(File arquivo) {		
		return getTexto(arquivo, this.idioma);
	}
	
	public String getTexto(File arquivo, String idioma) {		
		ocr.startEngine(idioma, Ocr.SPEED_SLOW);
		String s = ocr.recognize(new File[] {arquivo},
				  Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		ocr.stopEngine();
		return s;
	}
	
}
