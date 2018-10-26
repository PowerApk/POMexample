package com.alejo.Generador;

import com.alejo.Rutas.Variables;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Excel {
	
	//Leer el archivo Excel y retornar el Array de valores usando el Modelo de datos
			public static Recordset getInfo () throws FilloException {
				Fillo fillo=new Fillo();
				Connection connection=fillo.getConnection(Variables.EXCEL_COMPONENTES_PATH);
				String strQuery="Select * from page1";
				Recordset recordset=connection.executeQuery(strQuery);
				connection.close();
				//recordset.close();
				return recordset;
			}	
}
