package com.net;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mti-login.trialinteractive.com/cas/login?loc=en_US&service=https%3a%2f%2fsecure.trialinteractive.com%2fOrigami%2ftix%2f%3fclientdata%3d%2fti%2froom%2f2096%2fstartup%2fdashboard");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//input[@id='pre-username']")).sendKeys("santhiyatransperfect@gmail.com");
		driver.findElement(By.xpath("//button[@id='proceed-username-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Freebird@696");
		driver.findElement(By.xpath("//button[@id='login-button']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='room-name']")).click();
		
		//driver.close();
		

	}

}
