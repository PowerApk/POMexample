package com.alejo.Generador;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

public class PomGenerator {
	
	public static void generar(String className,String UIclassName) throws FilloException {
		System.out.println("**********");
		System.out.println("POM");
		System.out.println("**********");
		System.out.println("private WebDriver driver;");
		System.out.println("public "+className+" (WebDriver driver) {\r\n" + 
				"		this.driver = driver;\r\n" + 
				"	}");
		
		System.out.println("public void nombreRutina () {\r\n" + 
				"		try {\r\n" + 
				"		default();\r\n" + 
				"		}catch(Exception e) \r\n" + 
				"		{\r\n" + 
				"			System.out.println(\"Exception: \");\r\n" + 
				"			System.out.println(e);\r\n" + 
				"		}\r\n" + 
				"	}");
		
		Recordset info = Excel.getInfo();
		while(info.next()){
			String element = info.getField("tipo");
			switch(element) {
			
			case"txt":{
				System.out.println("public void "+info.getField("metodo")+" (String data) {\r\n" + 
						"		driver.findElement("+UIclassName+"."+info.getField("alias")+").sendKeys(data);\r\n" + 
						"	}");
			}
				
				break;
			case"btn":{
				System.out.println("public void "+info.getField("metodo")+" () {\r\n" + 
						"		driver.findElement("+UIclassName+"."+info.getField("alias")+").click();\r\n" + 
						"	}");
			}
				break;
			case"select":{
				System.out.println("public void "+info.getField("metodo")+" (String data) {\r\n" + 
						"		Select select = new Select(driver.findElement("+UIclassName+"."+info.getField("alias")+"));\r\n" + 
						"		select.selectByValue(data);\r\n"+
						"	}");				
			}
				break;
			
			}
			
			}
		info.close();
	}

}
