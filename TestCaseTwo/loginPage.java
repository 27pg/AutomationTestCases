package TestCaseTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage 
{
		WebDriver driver;
		
		public loginPage( WebDriver d) {
			// TODO Auto-generated constructor stub
			this.driver =d;
		}
		public void email()
		{
			driver.findElement(By.name("email")).sendKeys("poonamgade@hotmail.com");
		}
		public void password()
		{
			driver.findElement(By.name("password")).sendKeys("poonam@123");
		}
		public void btn()
		{
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		}
		public void deleteacc()
		{
			driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
		}
		public void btn2()
		{
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		}
	/*	try
		{
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}*/
}

