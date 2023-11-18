package findelementsmethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> allSuggestions = driver.findElements(By.xpath(""));
		for(WebElement Suggestions:allSuggestions) {
			WebElement Suggetions = null;
			System.out.print(Suggetions.getText());
		
}
}
}