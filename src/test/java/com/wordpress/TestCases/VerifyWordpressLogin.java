package com.wordpress.TestCases;
import com.wordpress.Pages.LoginPage;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWordpressLogin {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPage login = new LoginPage(driver);
		login.loguinToWordpress("Alejo", "adw");
		driver.quit();
		
	}

}
