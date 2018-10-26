package com.newtours.TestCases;
import com.alejo.Rutas.Variables;
import com.alejo.Util.IniciarDriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.codoid.products.exception.FilloException;
import com.newtours.Data.LoginData;
import com.newtours.Pages.LoginPage;

public class VerifyNewtoursLogin{
	//Aca se inicia el Test sobre la pagina Login
	@Test
	public void test() throws FilloException {
		//Inicio el WebDriver y el Modelo de la Pagina
		WebDriver driver = IniciarDriver.startDriver();
		LoginPage login = new LoginPage(driver);
		//Interactuar con elementos de la pagina
		//Usar ciclo si se quiere con toda la info de la DB
		login.loguinToNewTours(
				LoginData.getInfo(
						Variables.EXCEL_DB).get(0).getUserName(),
				LoginData.getInfo(
						Variables.EXCEL_DB).get(0).getUserName());
		//Cerrar driver
		driver.close();
		
	}
}
