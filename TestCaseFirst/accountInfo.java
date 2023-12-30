package TestCaseFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class accountInfo
{
	 WebDriver driver;
	By title = By.xpath("//input[@value=\"Mrs\"]");
	By name = By.id("name");
	By email = By.id("email");
	By password = By.id("password");
	By day = By.id("uniform-days");
	By month = By.id("uniform-months");
	By year = By.id("uniform-years");
	By news = By.id("uniform-newsletter");
	By offer = By.id("uniform-optin");
	By firstname = By.id("first_name");
	By lastname = By.id("last_name");
	By company = By.id("company");
	By address1 = By.id("address1");
	By address2 = By.id("address2");
	By country = By.id("country");
	By state = By.id("state");
	By city = By.id("city");
	By zipcode = By.id("zipcode");
	By mobile_number = By.id("mobile_number");
	By btn = By.className("btn btn-default");
	
	public accountInfo(WebDriver d) 
	{
		// TODO Auto-generated method stub
	this.driver=d;
	
	}
	public void title() 
	{
		driver.findElement(By.xpath("//input[@value=\"Mrs\"]")).click();
	}

	public void name()
	{
		driver.findElement(By.id("name")).sendKeys("Poonam");
	}
	public void email()
	{
		driver.findElement(email).sendKeys("poonamgade@hotmail.com");
	}
	public void password()
	{
		driver.findElement(By.id("password")).sendKeys("poonam@123");
	}
	public void dob()
	{
		try {
		driver.findElement(By.id("uniform-days")).sendKeys("22");
		Thread.sleep(1000);
		driver.findElement(By.id("uniform-months")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.id("uniform-years")).sendKeys("1998");
		Thread.sleep(1000);
		driver.findElement(By.id("uniform-newsletter")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("uniform-optin")).click();
		Thread.sleep(1000);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	public void firstName()
	{
		driver.findElement(firstname).sendKeys("Poonam");
	}
	public void lastName()
	{
		driver.findElement(lastname).sendKeys("Gade");
	}
	public void company()
	{
		driver.findElement(company).sendKeys("ABC corp");
	}
	public void address()
	{
		driver.findElement(address1).sendKeys("MG Road");
	}
	public void address2()
	{
		driver.findElement(address2).sendKeys("Near PVR cinema");
	}
	public void country()
	{
		driver.findElement(country).sendKeys("Gade");			
	}
	public void state()
	{
		WebElement dropdown = driver.findElement(state);
		Select select = new Select(dropdown);
		select.selectByValue("India");
	}
	public void city()
	{
		driver.findElement(city).sendKeys("Pune");
	}
	public void zipcode()
	{
		driver.findElement(zipcode).sendKeys("411054");
	}
	public void mobileNumber()
	{
		driver.findElement(mobile_number).sendKeys("9876543210");
	}
	public void createAccount()
	{
		driver.findElement(btn).click();
	}


}
