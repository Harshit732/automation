package testcase.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_test\\testcase.one\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement we = driver.findElement(By.xpath("//a[@id='login_Layer']"));
		we.click();                  
		Thread.sleep(2000);
		driver.quit();
	}

}
