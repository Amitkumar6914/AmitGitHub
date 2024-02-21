package projject_E_Com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Place_Order_Register_before_Checkout {
	
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

		WebElement Signup = driver.findElement(By.xpath("//div/ul/li[4]/a[@href='/login']"));
		Signup.sendKeys(Keys.ENTER);
			
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("blaster6919@gmail.com");//login email
		
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");//login password 
		
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();//login button
	
		driver.findElement(By.xpath("//div[@class='features_items']/div[2]/div/div/div/a")).click();//add to cart
		
		driver.findElement(By.xpath("//div[@class='features_items']/div/div/div/div[2]/p[2]")).click();//cart view
		
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();//proceed to checkout
	
	driver.findElement(By.name("message")).sendKeys("good");//comment message
		
		driver.findElement(By.xpath("//a[text()='Place Order']")).click();//place order
		
		driver.findElement(By.name("name_on_card")).sendKeys("amit");//card name
		
		driver.findElement(By.name("card_number")).sendKeys("2234567788");//card no.
		
		driver.findElement(By.name("cvc")).sendKeys("2345");//cvc no.
		
		driver.findElement(By.name("expiry_month")).sendKeys("2");
		
		driver.findElement(By.name("expiry_year")).sendKeys("2029");
		
		driver.findElement(By.id("submit")).click();//pay and confirm order
		
		  driver.findElement(By.xpath("//div/ul/li[4]/a[@style='color:brown;']")).click();
	        
		
		
		
		
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
