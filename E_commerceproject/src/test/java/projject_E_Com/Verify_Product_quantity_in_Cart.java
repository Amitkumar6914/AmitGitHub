package projject_E_Com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verify_Product_quantity_in_Cart {
	
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
		
		driver.findElement(By.xpath("//div[@class='col-sm-4'][1]/div/div[2]/ul/li")).click();//click on view product
		
	WebElement qty=	driver.findElement(By.xpath("//input[@type='number']"));
		qty.clear();
		qty.sendKeys("4");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();//add to cart
		
		driver.findElement(By.xpath("//p[@class='text-center'][2]")).click();//view cart
		
		
		
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
