package com.newtours.Pages;
import com.alejo.Util.ScreenShot;
import com.newtours.UI.LoginUi;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//Declaro Driver
	private WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	//validar login rutina completa con pantallazos
	public void loguinToNewTours(String userid,String pass) {
		try {
		typeUserName(userid);
		typePassword(pass);
		ScreenShot.pantallazo(driver, "Chrome", "Login_DataRegist");
		cliclOnLoginButton();
		ScreenShot.pantallazo(driver, "Chrome", "Login_DataResult");
		}catch(Exception e) 
		{
			System.out.println("Exception: ");
			System.out.println(e);
		}
	}
	//metodos individuales para interactuar con cada uno de los elementos
	public void typeUserName(String uid) {
		driver.findElement(LoginUi.LOGIN_TXT_USER_NAME).sendKeys(uid);
	}
	
	public void typePassword(String pas) {
		driver.findElement(LoginUi.LOGIN_TXT_PASSWORD).sendKeys(pas);
	}
	
	public void cliclOnLoginButton() {
		driver.findElement(LoginUi.LOGIN_BTN_SIGN).click();
	}

}
