package projject_E_Com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add_Products_in_Cart {
	
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
		
		driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		
	//	/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a
		
		driver.findElement(By.xpath("//div[@class='features_items']/div[2]/div/div/div/a")).click();
		
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a")).click();
		// 2nd product add to cart
		
	//driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/a")).click();
		//click 2nd product add cart
		driver.findElement(By.xpath("//div[@class='col-sm-8']/div/ul/li[3]")).click();//click cart button
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
