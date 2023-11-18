package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("svandanareddy074@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sai@5573");
		driver.findElement(By.xpath("//button[@value='1']")).submit();
		

	}

}
