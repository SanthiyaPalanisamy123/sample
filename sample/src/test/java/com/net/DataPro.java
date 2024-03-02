package com.net;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro {
	@ Test(dataProvider="loginData")
	
	public void login(String user, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mti-login.trialinteractive.com/cas/login?loc=en_US&service=https%3a%2f%2fsecure.trialinteractive.com%2fOrigami%2ftix%2f%3fclientdata%3d%2fti%2froom%2f2096%2fstartup%2fdashboard");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//input[@id='pre-username']")).sendKeys(user);
		driver.findElement(By.xpath("//button[@id='proceed-username-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@id='login-button']")).click();
		

	}
	@DataProvider(name ="loginData")
	public Object[][] loginPage() {
		Object[][] data=new Object[2][2];
		
		data[0][0] = "santhiyatransperfect@gmail.com";
		data[0][1] = "Freebird@696";
		
		data[1][0] = "santhiya.palanisamy123@gmail.com";
		data[1][1] = "Appa*123";
		return data;
				
	//	data[2][0] = "";
	//	data[2][1] = "";
		
	

	}

}
