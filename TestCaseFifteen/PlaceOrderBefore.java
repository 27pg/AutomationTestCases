package TestCaseFifteen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PlaceOrderBefore {
	WebDriver driver;

	public PlaceOrderBefore(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver = d;
	}

	public void placeOrder() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,500)", "");
		Thread.sleep(2000);
		WebElement mouseHover1 = driver
				.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[3]//div[1]//div[1]//div[1]"));// second
																													// item
		Actions a = new Actions(driver);
		a.moveToElement(mouseHover1).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]"))
				.click();// 2nd item add to cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-content']//div[2]//p[2]//u")).click();// view cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click(); // proceed to checkout button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-content']//p[2]//a//u")).click();// register/login button
		Thread.sleep(2000);

	}

	public void checkCart() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click(); // cart Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click(); // proceed to checkout button
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(350,500)", "");
		driver.findElement(By.xpath("//textarea[@class='form-control']"))
				.sendKeys("Please Call , before you delivered the Package. Dont handover to anybody,Thank you !!!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("Poonam Gade");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("4444333322221111");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);

	}
}

