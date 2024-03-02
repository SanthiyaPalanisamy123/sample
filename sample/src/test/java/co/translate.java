package co;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class translate {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://secure.trialinteractive.com/");
		
		driver.findElement(By.id("pre-username")).sendKeys("minukrish0510@gmail.com");
		driver.findElement(By.id("proceed-username-button")).click(); 
		
		driver.findElement(By.name("passwordEntry")).sendKeys("Atara@0510");
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.linkText("Irfan Training Room")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@class='k-button-icon fa fa-th icon-size ng-star-inserted']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@title='eTMF']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[@class='fa fa-file routes-menu__icon']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//kendo-icon[@class='k-i-caret-alt-right k-icon ng-star-inserted'])[15]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='tree-node-wrapper ng-star-inserted'])[43]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("((//input[@type='checkbox'])[2])")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[normalize-space()='Document View'])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='fa fa-globe icon margin relative ng-star-inserted']")).click();
		//Thread.sleep(10000);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(50)); 

		WebElement d= driver.findElement(By.xpath("//*[contains(@id,'TranslateToLanguageList')]"));
		w.until(ExpectedConditions.elementToBeClickable(d)); 
		//WebElement d= driver.findElement(By.xpath("//*[contains(@id,'TranslateToLanguageList')]"));
		//d.click();
		Thread.sleep(10000);
		Select objselect = new Select(d);
		objselect.selectByVisibleText("Tamil");

	} 

}
