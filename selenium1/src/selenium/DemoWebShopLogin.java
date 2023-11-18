package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopLogin {
	
		private static WebDriver driver;

		public static void main(String[]args) {
			
		driver.manage().window().maximize();
		
		System.setProperty("webdriver.chrome.driver"," ./selenium/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SAIFUL/Documents/.html");
		driver.findElement(By.id("email")).sendKeys("svandanareddy074@gmail.com");
		driver.findElement(By.id("password")).sendKeys("vandu@143");
		
		
	}
		
}


