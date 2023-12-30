package TestCaseEleven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class subscribePage {

	WebDriver driver;

	public subscribePage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver=d;
	}
	public void subscribe() throws InterruptedException 
	{
		//Thread.sleep(3000);
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		//js.executeScript("window.scrollBy(0,500)", "");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("poonamgade@hotmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
		Thread.sleep(2000);
		
		
	}

}
