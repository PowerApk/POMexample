package com.alejo.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IniciarDriver {
	
	public static WebDriver startDriver() {
		//Inicio el Driver y lo retorno listo para usarse(SerenityWebDriver)
		//static WebDriver driver;
		//driver = new ChromeDriver();
		//
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		return driver;
	}

}
