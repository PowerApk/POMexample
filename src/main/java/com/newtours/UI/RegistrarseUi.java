package com.newtours.UI;
import org.openqa.selenium.By;

public class RegistrarseUi {
	//Links
	public static final By GO_REGISTRARSE = By.linkText("REGISTER");
	//TextBox
	public static final By REGISTRARSE_TXT_NOMBRE = By.name("firstName");
	public static final By REGISTRARSE_TXT_APELLIDO = By.name("lastName");
	public static final By REGISTRARSE_TXT_TELEFONO = By.name("phone");
	public static final By REGISTRARSE_TXT_CORREO = By.name("userName");
	public static final By REGISTRARSE_TXT_DIR_1 = By.name("address1");
	public static final By REGISTRARSE_TXT_DIR_2 = By.name("address2");
	public static final By REGISTRARSE_TXT_CIUDAD = By.name("city");
	public static final By REGISTRARSE_TXT_ESTADO_PROVINCIA = By.name("state");
	public static final By REGISTRARSE_TXT_COD_POSTAL = By.name("postalCode");
	public static final By REGISTRARSE_TXT_USER_NAME = By.name("email");
	public static final By REGISTRARSE_TXT_PASSWORD = By.name("password");
	public static final By REGISTRARSE_TXT_CONFIRM_PASSWORD = By.name("confirmPassword");
	//Lists
	public static final By REGISTRARSE_LIST_PAIS = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select");
	//Buttons
	public static final By REGISTRARSE_BTN_REGISTRAR = By.name("register");
}
