package projject_E_Com;


import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Contact_Us_Form {
	
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
		
		driver.findElement(By.xpath("//header[@id='header']/div//ul/li[8]/a")).click();
	    driver.findElement(By.name("name")).sendKeys("amit");
	    driver.findElement(By.name("email")).sendKeys("blaster6919@gmail.com");
	    driver.findElement(By.name("subject")).sendKeys("subject");
		driver.findElement(By.id("message")).sendKeys("amit");
     WebElement upload=  driver.findElement(By.name("upload_file"));
     upload.sendKeys("E:\\New Text Document.txt");
     
     WebElement sub=   driver.findElement(By.name("submit"));
     sub.submit();
     
     driver.switchTo().alert().accept();//to press ok button
     
		
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
