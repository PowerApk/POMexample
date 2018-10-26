package com.newtours.Data;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.newtours.Model.LoginModel;

public class LoginData {
	
	//Leer el archivo Excel y retornar el Array de valores usando el Modelo de datos
	public static ArrayList<LoginModel> getInfo (String path) throws FilloException {
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection(path);
		String strQuery="Select * from "+ LoginModel.LOGIN_PAGE;
		Recordset recordset=connection.executeQuery(strQuery);
		ArrayList<LoginModel> list = new ArrayList<>();
		while(recordset.next()){
			LoginModel data = new LoginModel(
					recordset.getField(LoginModel.FIELD_USER),
					recordset.getField(LoginModel.FIELD_PASSWORD));
			list.add(data);
			}
		 
		recordset.close();
		connection.close();
		
		return list;
	}	

}
