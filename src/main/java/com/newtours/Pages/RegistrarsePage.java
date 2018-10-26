package com.newtours.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.alejo.Util.ScreenShot;
import com.newtours.UI.RegistrarseUi;

public class RegistrarsePage {
	//Declaro Driver
	private WebDriver driver;
	public RegistrarsePage (WebDriver driver) {
		this.driver = driver;
	}
	//validar login rutina completa con pantallazos
		public void RegistrarseNewTours(
				String nombere,
				String apellido,
				String telefono,
				String correo,
				String dir1,
				String dir2,
				String ciudad,
				String estado,
				String cod_postal,
				String pais,
				String usuario,
				String password,
				String conf_password) {
			try {
			cliclOnGoRegisterButton();
			typeName(nombere);
			typeLastName(apellido);
			typePhone(telefono);
			typeEmail(correo);
			typeDir1(dir1);
			typeDir2(dir2);
			typeCity(ciudad);
			typeState(estado);
			typeCodPostal(cod_postal);
			selectCountry(pais);
			typeUser(usuario);
			typePass1(password);
			typePass2(conf_password);
			ScreenShot.pantallazo(driver, "Chrome", "Reegist_DataRegister");
			cliclOnRegisterButton();
			ScreenShot.pantallazo(driver, "Chrome", "Regist_DataResult");
			}catch(Exception e) 
			{
				System.out.println("Exception: ");
				System.out.println(e);
			}
		}
		//metodos individuales para interactuar con cada uno de los elementos
		public void cliclOnGoRegisterButton() {
			driver.findElement(RegistrarseUi.GO_REGISTRARSE).click();
		}
		
		public void typeName(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_NOMBRE).sendKeys(data);
		}
		
		public void typeLastName(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_APELLIDO).sendKeys(data);
		}
		
		public void typePhone(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_TELEFONO).sendKeys(data);
		}
		
		public void typeEmail(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_CORREO).sendKeys(data);
		}
		
		public void typeDir1(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_DIR_1).sendKeys(data);
		}
		
		public void typeDir2(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_DIR_2).sendKeys(data);
		}
		
		public void typeCity(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_CIUDAD).sendKeys(data);
		}
		
		public void typeState(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_ESTADO_PROVINCIA).sendKeys(data);
		}
		
		public void typeCodPostal(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_COD_POSTAL).sendKeys(data);
		}
		
		public void selectCountry(String data) {
			Select select = new Select(driver.findElement(RegistrarseUi.REGISTRARSE_LIST_PAIS));
			select.selectByValue(data);
		}
		
		public void typeUser(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_USER_NAME).sendKeys(data);
		}
		
		public void typePass1(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_PASSWORD).sendKeys(data);
		}
		
		public void typePass2(String data) {
			driver.findElement(RegistrarseUi.REGISTRARSE_TXT_CONFIRM_PASSWORD).sendKeys(data);
		}
		
		public void cliclOnRegisterButton() {
			driver.findElement(RegistrarseUi.REGISTRARSE_BTN_REGISTRAR).click();
		}
}
