import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	String year = "2024";
	String month = "March";
	String date = "01";
	driver.findElement(By.xpath("//*[@id='onwardCal']")).click();;
	while (true) {
		WebElement title = driver.findElement(By.xpath("//td[@class='monthTitle']"));
		String monthyear = title.getText();
		String arr[] = monthyear.split(" ");
		String mon = arr[0];
		String yr = arr[1];
		if(mon.equalsIgnoreCase(month) && yr.equals(year)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//button[text()='>']")).click();
		}
		
	}
	Thread.sleep(3000);
	List<WebElement> date1 = driver.findElements(By.xpath("//*[@class='rb-monthTable first last']//td"));
	for(WebElement w : date1) {
	String text = w.getText();
	if(text.equals(date)) {
		w.click();
		break;
	}
	}
}
}
