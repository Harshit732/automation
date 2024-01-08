package testcase.one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

class ProjectTest {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_test\\testcase.one\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver,2);
//		Thread.sleep(2000);
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@title='My Account']")).click();
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	    
	  
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("beast00732@gmail.com");
	    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("abcxyz");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
	    driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
	    
	    
	}
}
