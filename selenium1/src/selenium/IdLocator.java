package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
public static void main(String[]args) {

	System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/SAIFUL/Documents/.html");
	driver.findElement(By.id("username")).sendKeys("this is java");
	driver.findElement(By.name("password")).sendKeys("this is selenium");
	
	driver.findElement(By.className("confirmpassword")).sendKeys("this is manual");



}
}
