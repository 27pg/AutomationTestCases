package TestCaseThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class incorrectLogin {
	WebDriver driver;
	
	public incorrectLogin( WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver =d;
	}
	public void email()
	{
		driver.findElement(By.name("email")).sendKeys("poonamgade22@hotmail.com");
	}
	public void password()
	{
		driver.findElement(By.name("password")).sendKeys("poonam123");
	}
	public void btn()
	{
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
}
