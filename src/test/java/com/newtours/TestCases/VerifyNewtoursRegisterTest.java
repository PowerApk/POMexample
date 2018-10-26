package com.newtours.TestCases;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.alejo.Rutas.Variables;
import com.alejo.Util.IniciarDriver;
import com.codoid.products.exception.FilloException;
import com.newtours.Data.RegistrarseData;
import com.newtours.Pages.RegistrarsePage;

public class VerifyNewtoursRegisterTest{
	//Aca se inicia el Test sobre la pagina de Registro
	@Test
	public void test() throws FilloException, InterruptedException {
		//Inicio el WebDriver y el Modelo de la Pagina
				WebDriver driver = IniciarDriver.startDriver();
				RegistrarsePage regist = new RegistrarsePage(driver);
				
				//Interactuar con elementos de la pagina
				//Usar ciclo si se quiere con toda la info de la DB
				regist.RegistrarseNewTours(
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getNombre(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getApellido(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getTelefono(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getCorreo(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getDir1(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getDir2(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getCiudad(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getEstado(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getCod_postal(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getPais(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getUsername(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getPassword(), 
						RegistrarseData.getInfo(Variables.EXCEL_DB).get(0).getConf_pass());
				//regist.cliclOnGoRegisterButton();
				//regist.selectCountry("41");
				
				//Cerrar driver
				driver.close();
	}

}
