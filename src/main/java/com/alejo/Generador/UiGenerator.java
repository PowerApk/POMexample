package com.alejo.Generador;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

public class UiGenerator {
	
	public static void generar () throws FilloException {
		System.out.println("**********");
		System.out.println("UI");
		System.out.println("**********");
		Recordset info = Excel.getInfo();
		while(info.next()){
			System.out.println(
							"public static final By " + 
							info.getField("alias") +
							" = By."+info.getField("by")+
							"("+info.getField("path")+");");
			}
		info.close();
	}

}
