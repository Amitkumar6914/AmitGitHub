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

public class Login_with_incorrect_email_and_password {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		WebElement Signup = driver.findElement(By.xpath("//div/ul/li[4]/a[@href='/login']"));
		Signup.sendKeys(Keys.ENTER);


	
}
	
	@Test
	public void  Verify_home_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("blaster6918@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
