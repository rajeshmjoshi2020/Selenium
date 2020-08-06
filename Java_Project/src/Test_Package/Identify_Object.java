package Test_Package;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Identify_Object {
public static void main(String[] args) {
		 try {
			 System.setProperty("webdriver.chrome.driver","C:\\d data\\Installables\\Browser drivers\\Chrome\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://demowebshop.tricentis.com/");
						
				driver.manage().window().maximize();
				
				
				driver.findElement(By.linkText("Register")).click(); // Click on Register link. 
				
				driver.findElement(By.id("gender-male")).click();
				
				driver.findElement(By.name("FirstName")).sendKeys("Rajesh");
				driver.findElement(By.name("LastName")).sendKeys("Joshi"); // Last Name

				driver.findElement(By.cssSelector("#Email")).sendKeys("whatisubscribed@gmail.com");
				
				driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("RMJ@123!"); //password
				driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Rmj@123!"); // confirm password
				driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click(); // Click on register button
						
				driver.getPageSource().contains("The password and confirmation password do not match."); //Verify Text
							
				
				driver.findElement(By.linkText("Books")).click();  // Click on BOOKS menu
				
				
				Select select1 = new Select(driver.findElement(By.id("products-orderby")));  
				select1.selectByVisibleText("Price: Low to High");	// Select product
				
				driver.findElement(By.linkText("Computing and Internet")).click(); // click on product link
				
				driver.findElement(By.id("addtocart_13_EnteredQuantity")).sendKeys("2");
				
				driver.findElement(By.id("add-to-cart-button-13")).click();
			
				
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.findElement(By.id("addtocart_13_EnteredQuantity")).sendKeys("2");
				
				
				
				//driver.findElement(By.className("flyout-cart active")).click();		
				//driver.findElement(By.id("checkout")).click();
				
				
				Actions a = new Actions(driver);
				//a.moveToElement(driver.findElement(By.className("ico-cart"))).build().perform();
				//a.moveToElement(driver.findElement(By.linkText("Shopping cart"))).build().perform();
				a.moveToElement(driver.findElement(By.id("flyout-cart"))).build().perform();
				
				
				
				System.out.println("Test")
		 }
		
		 
		 catch(Exception e) {
			 System.out.println("Error Occured");
		 }
		
		
		//WebElement we = driver.findElement(By.className("ico-cart"));
		//we.findElement(By.className("flyout-cart active"));
		//Test
		//a.moveToElement(we).perform();
		//a.moveToElement(driver.findElement(By.className("button-1 cart-button"))).click().perform();
			
		//driver.findElement(By.className("mini-shopping-cart")).findElement(By.className("button-1 cart-button")).click();

	}
		

}
