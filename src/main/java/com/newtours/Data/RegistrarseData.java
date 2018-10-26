package com.newtours.Data;
import java.util.ArrayList;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.newtours.Model.RegistrarseModel;

public class RegistrarseData {
	
	//Leer el archivo Excel y retornar el Array de valores usando el Modelo de datos
		public static ArrayList<RegistrarseModel> getInfo (String path) throws FilloException {
			Fillo fillo=new Fillo();
			Connection connection=fillo.getConnection(path);
			String strQuery="Select * from "+ RegistrarseModel.REGISTER_PAGE;
			Recordset recordset=connection.executeQuery(strQuery);
			ArrayList<RegistrarseModel> list = new ArrayList<>();
			while(recordset.next()){
				RegistrarseModel data = new RegistrarseModel(
						recordset.getField(RegistrarseModel.FIELD_NOMBRE),
						recordset.getField(RegistrarseModel.FIELD_LAST_NAME),
						recordset.getField(RegistrarseModel.FIELD_PHONE),
						recordset.getField(RegistrarseModel.FIELD_EMAIL),
						recordset.getField(RegistrarseModel.FIELD_DIR1),
						recordset.getField(RegistrarseModel.FIELD_DIR2),
						recordset.getField(RegistrarseModel.FIELD_CITY),
						recordset.getField(RegistrarseModel.FIELD_STATE),
						recordset.getField(RegistrarseModel.FIELD_COD_POSTAL),
						recordset.getField(RegistrarseModel.FIELD_CONTRY),
						recordset.getField(RegistrarseModel.FIELD_NAME),
						recordset.getField(RegistrarseModel.FIELD_PASSWORD),
						recordset.getField(RegistrarseModel.FIELD_CONFIRM_PASS));
				list.add(data);
				}
			 
			recordset.close();
			connection.close();
			
			return list;
		}	

}
