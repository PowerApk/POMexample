package com.alejo.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	//Metodo para Capturar Screenshot
		public static void pantallazo(WebDriver driver,String navegador,String nombre){
			File fin = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(fin, new File("c:\\tmp\\"+navegador+"_"+nombre+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
