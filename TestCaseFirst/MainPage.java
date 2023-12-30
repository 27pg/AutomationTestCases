package TestCaseFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

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
  driver.findElement(By.xpath("//a[@href='/login']")).click();
  Thread.sleep(2000);
  } 
	  catch(Exception e) 
	  { 
		  System.out.println(e.getMessage()); 
	  }
	  
	}
  
  @Test
  public void Test() throws InterruptedException 
  {
  signUp signup1=new signUp(driver);
  signup1.enterName();
  Thread.sleep(1000);
  signup1.enteremail(); 
  Thread.sleep(1000);
  signup1.login(); 
  Thread.sleep(1000);
  signup1.title(); 
  Thread.sleep(1000);
  signup1.password();
  Thread.sleep(1000);
  signup1.dob();
  Thread.sleep(1000);
  signup1.firstname();
  Thread.sleep(1000);
  signup1.lastname();
  Thread.sleep(1000);
  signup1.company();
  Thread.sleep(1000);
  signup1.address();
  Thread.sleep(1000);
  signup1.address2();
  Thread.sleep(1000);
  signup1.country();
  Thread.sleep(1000);
  signup1.state();
  Thread.sleep(1000);
  signup1.city();
  Thread.sleep(1000);
  signup1.zipcode();
  Thread.sleep(1000);
  signup1.mobile();
  Thread.sleep(1000);
  signup1.btn();		//create account
  Thread.sleep(3000); 
  signup1.btn1();		//continue
  Thread.sleep(3000);
 signup1.deleteacc();   //delete account
  Thread.sleep(1000);
  signup1.btn2();        //delete continue
  Thread.sleep(1000);
  }
  
  @AfterTest 
  public void AfterTest() throws InterruptedException 
  { 
	  Thread.sleep(2000);
	  driver.quit();
	  }
 }