package TestCaseTwelve;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddtoCartPage {
	WebDriver driver;
	
	public AddtoCartPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver=d;
	}
	public void addToCart() throws InterruptedException 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(50,350)", "");	
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		WebElement mouseHover1 = driver.findElement(By.xpath("//div[@class=\"col-sm-9 padding-right\"]//div[2]//div[1]//div[1]//div[1]"));//first item
	 	a.moveToElement(mouseHover1).build().perform();
	 	Thread.sleep(1000);
	 	driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();//add to cart
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[3]//button")).click();//continue
	 	Thread.sleep(2000);
	 	WebElement mouseHover2 =driver.findElement(By.xpath("//div[@class=\"col-sm-9 padding-right\"]//div[3]//div[1]//div[1]//div[1]"));//second item
	 	a.moveToElement(mouseHover2).build().perform();
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();//add to cart
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[2]//p[2]//u")).click();//view cart
	 	Thread.sleep(2000);
	} 

}
