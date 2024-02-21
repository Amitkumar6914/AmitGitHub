package projject_E_Com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add_review_on_product {
	
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
		
		driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-justified'][1]/li/a")).click();//click on view product
		
		driver.findElement(By.id("name")).sendKeys("amit");
		
		driver.findElement(By.id("email")).sendKeys("blaster6919@gmail.com");
		
		driver.findElement(By.id("review")).sendKeys("your product is very good quality");
		driver.findElement(By.id("button-review")).click();
		
		
		
		
		
		
		
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
