package com.w2a.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {
	
	public static WebDriver driver;
	public static TopMenu menu;
	
	public Page(){
		if(driver == null){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wellsfargo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menu = new TopMenu(driver);
		
		}
	}

}
