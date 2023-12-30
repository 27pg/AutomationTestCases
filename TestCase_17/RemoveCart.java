package TestCase_17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RemoveCart {
	WebDriver driver;

	public RemoveCart(WebDriver d) {
		this.driver = d;
	}

	public void removeCart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,500)", "");
		driver.findElement(By.xpath("//a[contains(text(), \"Add to cart\")][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Your product has been added to cart.')]/..//a[@href='/view_cart']")).click();// view cart
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='cart_delete']/a")).click();// delete cart
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[contains(text(),'Cart is empty!')]")).click();// delete cart
	}

}
