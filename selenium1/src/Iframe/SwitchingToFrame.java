package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToFrame {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@title='notification-frame-~10cb43881']"));
		//driver.switchTo().frame("notification-frame-~10cb43881");
         driver.switchTo().frame(frame);	
         //driver.switchTo().frame(3);
         //driver.findElement(By.id("webengage-engagement-callback-frame"));
}
}

