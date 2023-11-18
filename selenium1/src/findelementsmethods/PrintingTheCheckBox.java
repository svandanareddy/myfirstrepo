package findelementsmethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingTheCheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("/*[@type='checkbox']"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		driver.quit();
		}
}
