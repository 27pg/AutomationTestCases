package TestCase_18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ViewCategoryProducts {
	
	WebDriver driver;

	public ViewCategoryProducts(WebDriver d) {
		this.driver = d;
	}

	public void verify() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[@href=\"#Women\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href=\"/category_products/1\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//h2[contains(text(),'Women - Dress Products')]"));
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href=\"#Men\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href=\"/category_products/3\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//h2[contains(text(),'Men - Tshirts Products')]"));
	}

}
