package TestCase_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage {

	public WebDriver driver;

	@BeforeTest
	public void Beforetest() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://automationexercise.com/");
			driver.findElement(By.xpath("//a[@href='/products']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void test() throws InterruptedException {
		ViewBrands ViewBrands = new ViewBrands(driver);
		ViewBrands.verify();
	}

	@AfterTest
	public void AfterTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
