package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettagNameAndAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element=driver.findElement(By.name("firstname"));
		
System.out.println(element.getTagName());
System.out.println(element.getAttribute("class"));
System.out.println(element.getAttribute("id"));
System.out.println(element.getAttribute("value"));
System.err.println("***********");
System.out.println("abc124");
System.out.println(element.getAttribute("value"));
System.err.println("*******");
System.out.println(driver.findElement(By.linkText("already have an account")));

	}
}
