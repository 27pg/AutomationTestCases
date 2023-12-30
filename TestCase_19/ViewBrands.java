package TestCase_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewBrands {
	
	WebDriver driver;

	public ViewBrands(WebDriver d) {
		this.driver = d;
	}

	public void verify() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href='/brand_products/Polo']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//h2[contains(text(),'Brand - Polo Products')]"));
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href='/brand_products/H&M']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//h2[contains(text(),'Brand - H&M Products')]"));
	}

}
