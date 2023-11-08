package com.testcases;

import org.testng.annotations.Test;

import com.library.Baseclass;
import com.pages.Flipkart_pages;

public class Flipkart_testcases extends Baseclass {
	
	Flipkart_pages flipkart;
	
	
	@Test
	public void logintestcase() throws InterruptedException {
		
		flipkart= new Flipkart_pages(driver);
		
		flipkart.logindetails();
		
		
}
	

}
