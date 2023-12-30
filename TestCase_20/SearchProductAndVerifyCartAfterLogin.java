package TestCase_20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SearchProductAndVerifyCartAfterLogin {
	
	WebDriver driver;

	public SearchProductAndVerifyCartAfterLogin(WebDriver d) {
		this.driver = d;
	}

	public void verify() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Blue Top");
		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//button[@id='submit_search']")).click();
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(250,500)", "");
		driver.findElement(By.xpath("//a[contains(text(), \"Add to cart\")][1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//p[contains(text(),'Your product has been added to cart.')]/..//a[@href='/view_cart']")).click();// view cart
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(), \"Blue Top\")]"));
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("poonam");
		driver.findElement(By.xpath("//form[@action=\"/login\"]/input[@name=\"password\"]")).sendKeys("poonamgade@hotmail.com");
		driver.findElement(By.xpath("//form[@action=\"/login\"]/button[@type=\"submit\"]")).click();
	}

}
