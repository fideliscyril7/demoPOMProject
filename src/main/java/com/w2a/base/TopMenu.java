package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
	
	WebDriver driver;
	public TopMenu(WebDriver driver){
		this.driver = driver;
	}
	
	public void goToWellsFargoHome(){
		
		driver.findElement(By.xpath("//*[@id=\"brand\"]/a/img")).click();
	}

	public void goToPersonal(){
		
		driver.findElement(By.xpath("//*[@id='tabNavPersonal']")).click();
	}
	
	public void goToSmallBusiness(){
		
	}
	
	public void goToCommercial(){
		
	}
	
	public void goToFinancial(){
		
	}

	
	public void goToAboutWellsFargo(){
		
		driver.findElement(By.xpath("//*[@id=\"headerTools\"]/nav/ul/li[2]/a")).click();
		
	}

}
