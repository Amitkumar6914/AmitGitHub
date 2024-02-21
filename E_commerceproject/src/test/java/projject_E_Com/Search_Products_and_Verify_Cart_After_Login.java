package projject_E_Com;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search_Products_and_Verify_Cart_After_Login {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	
}
	
	@Test
	public void  Verify_home_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a")).click();//click on product button
		
		 driver.findElement(By.id("search_product")).sendKeys("tshirts");//product search
		
		 driver.findElement(By.id("submit_search")).click();//click search product key
		 
		
	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a")).click();//add product to cart
	
	
		// driver.findElement(By.xpath("//a[@data-product-id='28'][1]")).click();
		
		
		
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
