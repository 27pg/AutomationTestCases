package TestCaseFive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExistingUser {
	WebDriver driver;
	
	public ExistingUser( WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver =d;
	}
	public void name()
	{
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("poonam");
	}
	public void email()
	{
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("poonamgade@hotmail.com");
	}
	public void btn()
	{
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
	}
}
