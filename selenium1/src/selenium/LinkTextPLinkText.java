package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPLinkText {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/SAIFUL/Documents/.html");
		//driver.findElement(By.linkText("password")).click();
		//driver.findElement(By.partialLinkText("fog")).click();
		driver.findElement(By.linkText("a")).click();
		
		
	}

}
