package projject_E_Com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class View_and_Cart_Brand_Products {
	
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
		
		driver.findElement(By.xpath("//header[@id='header']/div/div/div/div[2]/div/ul/li[2]/a")).click();//click on product button
		
		driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-stacked']/li[1]/a")).click();//click on brand button 
		
		driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-stacked']/li[6]/a")).click();//click on other brand button 
		
		
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
