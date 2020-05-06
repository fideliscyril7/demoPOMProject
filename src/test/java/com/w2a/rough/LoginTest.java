package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;
import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LandingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.wellsfargo.com/");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//		HomePage home = new HomePage(driver);
//		home.goToFinancialPage();
//		LandingPage landing = new LandingPage(driver);
		HomePage home = new HomePage();		
		LandingPage landing = new LandingPage();
	
		
		landing.goToCustService();
		home.goToSmallBusinessPage();
		landing.goToAtmLocations();
		
		
		Page.menu.goToWellsFargoHome();
		Page.menu.goToAboutWellsFargo();
		
		  
	}

}
