package com.alejo.Generador;
import com.codoid.products.exception.FilloException;

public class Generador {

	public static void main(String[] args) throws FilloException {
		UiGenerator.generar();
		PomGenerator.generar("main","UIejemplo");
	}

}
