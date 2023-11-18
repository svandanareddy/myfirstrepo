package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingIntoMainWindow {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tripodeal.com/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("destination")).sendKeys("banglore");
		driver.switchTo().defaultContent();
	driver.findElement(By.linkText("goa")).click();
		
		
}
}
