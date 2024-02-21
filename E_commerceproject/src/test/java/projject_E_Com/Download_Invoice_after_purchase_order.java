package projject_E_Com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Download_Invoice_after_purchase_order {
	
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
		
	  driver.findElement(By.xpath("//div[@class='features_items']/div[2]/div/div/div/a")).click();//add to cart
		
	  driver.findElement(By.xpath("//div[@class='modal show']/div/div/div[2]/p[2]/a")).click();//click on view cart button
		
	  driver.findElement(By.xpath("//section[@id='do_action']/div/div/div/a")).click();// proceed to check out
		
	  WebElement Signup = driver.findElement(By.xpath("//div/ul/li[4]/a[@href='/login']"));
		Signup.sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("name")).sendKeys("amit kumar");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("blaster6920@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
       
    
		
		driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.name("password")).sendKeys("123456");
        
        Select days = new Select(driver.findElement(By.id("days")));
        days.selectByValue("10");
        
        Select months = new Select(driver.findElement(By.id("months")));
        months.selectByValue("10");

        
        Select years = new Select(driver.findElement(By.id("years")));
        years.selectByValue("2002");

        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("amit");
        driver.findElement(By.id("last_name")).sendKeys("kumar");
        driver.findElement(By.id("company")).sendKeys(" ducat pvt ltd");
        driver.findElement(By.id("address1")).sendKeys("gali no.7,281204,aligarh");
        driver.findElement(By.id("address2")).sendKeys("aligarh,up");
        
        Select count = new Select(driver.findElement(By.id("country")));
        count.selectByValue("India");
        
        driver.findElement(By.id("state")).sendKeys("up");
        driver.findElement(By.id("city")).sendKeys("aligarh");
        driver.findElement(By.id("zipcode")).sendKeys("281205");
        driver.findElement(By.id("mobile_number")).sendKeys("8564789393");
        
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
        
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[3]/a")).click();//click on cart button 
		
		driver.findElement(By.xpath("//section[@id='do_action']/div/div/div/a")).click();// proceed to check out
			
		driver.findElement(By.name("message")).sendKeys("your product s massive");
		
	driver.findElement(By.xpath("//a[text()='Place Order']")).click();//place order
		
		driver.findElement(By.name("name_on_card")).sendKeys("amit");//card name
		
		driver.findElement(By.name("card_number")).sendKeys("2234567788");//card no.
		
		driver.findElement(By.name("cvc")).sendKeys("2345");//cvc no.
		
		driver.findElement(By.name("expiry_month")).sendKeys("2");
		
		driver.findElement(By.name("expiry_year")).sendKeys("2029");
		
		driver.findElement(By.id("submit")).click();//pay and confirm order
		
		driver.findElement(By.xpath("//a[text()='Download Invoice']")).click();//download ivoice
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();//click continue button
		
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a")).click();//delete account
		
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();//click  on continue button
		
		
		
		
		
		
		
		
		
	}
	/*@Test
	public void  Signup() throws InterruptedException {
		
	}*/
		
	@AfterMethod
	public void close() {
		//driver.close();
	}


}
