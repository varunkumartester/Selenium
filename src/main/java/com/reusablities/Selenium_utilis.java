package com.reusablities;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

import com.library.Baseclass;

public class Selenium_utilis extends Baseclass {

	public Selenium_utilis(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void addtext(WebElement element, String text) {
		
		element.sendKeys(text);

	}
	
	public void doclick(WebElement element) {
		
		element.click();

	}
	
	
	
	public void scroll(WebElement element) {
		
		JavascriptExecutor scroll= (JavascriptExecutor)driver;
		
		scroll.executeScript("arguments[0].scrollIntoView(true)", scroll);
		

	}

	public void windowhandle(WebElement element) {
		
		String p = driver.getWindowHandle();
		
		Set<String> c = driver.getWindowHandles();
		
		for(String newwindow: c) {
		
		driver.switchTo().window(newwindow);
		
	}
}
	
	public void screenshot() throws IOException {
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		File target= new File("src/main/resources/screenshot");
		
		FileUtils.copyFile(source, target);
}
	
private void dropdown() {
	

}
}
