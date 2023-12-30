package TestCaseFour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestCaseTwo.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage {

		  public WebDriver driver;
		  
		  @BeforeTest 
		  public void Beforetest() { 
		  try 
		  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  Thread.sleep(3000);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://automationexercise.com/"); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		  Thread.sleep(2000);
		  } 
			  catch(Exception e) 
			  { 
				  System.out.println(e.getMessage()); 
			  }
			  
		  }
		  @Test
		  public void test() throws InterruptedException
		  {
			  LogoutPage logout=new LogoutPage(driver);
			  logout.email();
			  Thread.sleep(2000);
			  logout.password();
			  Thread.sleep(2000);
			  logout.btn();
			  Thread.sleep(3000);
			  logout.btn1();
			  Thread.sleep(3000);	 
		  }
		  @AfterTest
		  public void AfterTest() throws InterruptedException 
		  { 
			  Thread.sleep(2000);
			  driver.quit();
			  }
}
