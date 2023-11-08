package com.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public WebDriver driver;
	
	public Properties property;
	
	
	@BeforeMethod
	
	public void launch() throws IOException, InterruptedException {
		
		FileInputStream urlfile= new FileInputStream("src/test/resources/properties/pom.properties");
		
		property= new Properties();
		
		property.load(urlfile);
		
		WebDriverManager.edgedriver().setup();
		
		driver= new EdgeDriver();
		
		driver.get(property.getProperty("url"));
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		

	}
	
	
	@AfterMethod
	
	public void closebrower() {
		
		driver.close();

	}
	
}
