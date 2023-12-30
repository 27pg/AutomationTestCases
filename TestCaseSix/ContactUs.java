package TestCaseSix;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
		WebDriver driver;		
		public ContactUs( WebDriver d) {
			// TODO Auto-generated constructor stub
			this.driver =d;
		}
		public void name()
		{
			driver.findElement(By.name("name")).sendKeys("Poonam");
		}
		public void email()
		{
			driver.findElement(By.name("email")).sendKeys("poonamgade@hotmail.com");
		}
		public void subject()
		{
			driver.findElement(By.name("subject")).sendKeys("Automation");
		}
		public void message()
		{
			driver.findElement(By.name("message")).sendKeys("Automated testing is the application of software tools to automate a"
					+ " human-driven manual process of reviewing and validating a software product.");
		}
		public void file()
		{
			WebElement browse = driver.findElement(By.xpath("//input[@name='upload_file']"));
			browse.sendKeys("C:\\Users\\yoges\\Downloads\\Suggestions.txt");
		}
		public void btn()
		{try
		{
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			Thread.sleep(2000);
			Alert a=driver.switchTo().alert();		
			a.accept();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
		public void home()
		{
			 driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();
		}
		
		
			
			
			
			
			
		
		
}
