package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class LoginPage {
	
	WebDriver driver;
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.id("wp-submit");
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void loguinToWordpress(String userid,String pass) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	public void typeUserName(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pas) {
		driver.findElement(password).sendKeys(pas);
	}
	
	public void cliclOnLoginButton() {
		driver.findElement(loginButton).click();
	}

}
