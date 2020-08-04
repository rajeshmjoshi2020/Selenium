package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for FF Browser
		// Why to download - thr is FireFox driver class. Need to create object of FireFox Browser
		
		System.setProperty("webdriver.gecko.driver","C:\\d data\\Installables\\Browser drivers\\FireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\d data\\Installables\\Browser drivers\\Chrome\\chromedriver.exe");
		//WebDriver driver1 = new ChromeDriver();
		//driver1.get("http://www.google.com");
		//String title = driver1.getTitle();
		//System.out.println(title);								// Get's the title of the page.
		//driver1.quit();
		
		if(title.equals("Google"))
		{
			System.out.println("Title is correct");
			
		}
		else
		{
			System.out.println("Title is not correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		}
	
}
