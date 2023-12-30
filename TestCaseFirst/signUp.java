package TestCaseFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class signUp 
{
	WebDriver driver;
	
	public signUp( WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver =d;
	}

	public void enterName()
	{	
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("poonam");
	}
	public void enteremail()
	{
			driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("poonamgade@hotmail.com");
	}
	public void login()
	{
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
	}
	public void title() 
	{
		driver.findElement(By.xpath("//input[@value='Mrs']")).click();
	}
	public void password()
	{
		driver.findElement(By.id("password")).sendKeys("poonam@123");
	}
	public void dob()
	{
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");		
		Select day=new Select(driver.findElement(By.name("days")));
		day.selectByVisibleText("22");
		Thread.sleep(1000);
		Select month=new Select(driver.findElement(By.name("months")));
		month.selectByVisibleText("May");
		Thread.sleep(1000);
		Select year=new Select(driver.findElement(By.name("years")));
		year.selectByVisibleText("1990");
		Thread.sleep(1000);
		driver.findElement(By.name("newsletter")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("optin")).click();
		Thread.sleep(1000);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	public void firstname()
	{
		driver.findElement(By.name("first_name")).sendKeys("Poonam");
	}
	public void lastname()
	{
		driver.findElement(By.name("last_name")).sendKeys("Gade");
	}
	public void company()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,450)", "");	
		driver.findElement(By.name("company")).sendKeys("ExcelR");
	}
	public void address()
	{
		driver.findElement(By.name("address1")).sendKeys("ABC Road");
	}
	public void address2()
	{
		driver.findElement(By.name("address2")).sendKeys("Pune");
	}
	public void country()
	{
		Select con=new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("India");
	}
	public void state()
	{
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
	}
	public void city()
	{
		driver.findElement(By.name("city")).sendKeys("Pune");
	}
	public void zipcode()
	{
		driver.findElement(By.name("zipcode")).sendKeys("411045");
	}
	public void mobile()
	{
		driver.findElement(By.name("mobile_number")).sendKeys("9876543210");
	}
	public void btn()
	{
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
	}
	public void btn1()
	{
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	}
	public void deleteacc()
	{
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
	}
	public void btn2()
	{
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	}
}
