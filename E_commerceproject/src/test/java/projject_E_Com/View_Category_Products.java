package projject_E_Com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class View_Category_Products {
	
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
		
		driver.findElement(By.xpath("//a[@data-toggle='collapse'][1]")).click();//click on category
		
		driver.findElement(By.xpath("//a[text()='Dress '][1]")).click();//click on sub-category
		
		driver.findElement(By.xpath("//div[@class='panel panel-default'][2]/div/h4/a")).click();//click on category
		
		driver.findElement(By.xpath("//div[@id='Men']/div/ul/li[1]/a")).click();
		
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
