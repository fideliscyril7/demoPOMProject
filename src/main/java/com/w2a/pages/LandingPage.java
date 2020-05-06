package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LandingPage extends Page {
//	WebDriver driver;
//	
//	public LandingPage(WebDriver driver1){
//		this.driver = driver1;
//	}
	public void goToCustService(){
		driver.findElement(By.xpath("//*[@id='topSearch']/ul/li[2]/a")).click();
		
	}
	
	public void goToAtmLocations() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='topSearch']/ul/li[3]/a")).click();
		Thread.sleep(5000);
	}
}
