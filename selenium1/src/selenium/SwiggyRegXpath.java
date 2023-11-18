package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyRegXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[text()='sign up']")).click();
			Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7348907520");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vandana");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("svandanareddy074@gmail.com");

	}
}
