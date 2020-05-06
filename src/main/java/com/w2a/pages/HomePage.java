package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page {
	
//	public WebDriver driver;
//	
//	public HomePage(WebDriver driver1){
//		this.driver = driver1;
//	}

	public void goToPersonalPage(){
		driver.findElement(By.xpath("//*[@id='tabNavPersonal']")).click();
	}
	
	
	public void goToSmallBusinessPage(){
		
		driver.findElement(By.xpath("//*[@id='tabNavSmallBusiness']")).click();
		
	}
	
	public void goToCommercialPage(){
		
		driver.findElement(By.xpath("//*[@id='tabNavCommercial']")).click();
		
	}
	
	public void goToFinancialPage(){
		
		driver.findElement(By.xpath("//*[@id='headerTools']/nav/ul/li[1]/a")).click();
	}
}
