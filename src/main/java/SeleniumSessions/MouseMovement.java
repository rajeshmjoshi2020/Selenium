package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\d data\\Installables\\Browser drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
	//	driver.manage().window().maximize();
		//Adding wait 
		 //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Add-Ons"))).build().perform();
	}

}
