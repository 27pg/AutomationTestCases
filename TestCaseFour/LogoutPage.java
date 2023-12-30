package TestCaseFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
			WebDriver driver;
			
			public LogoutPage( WebDriver d) {
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
			public void btn1()
			{
				driver.findElement(By.xpath("//a[text()=\" Logout\"]")).click();
			}
			
}
