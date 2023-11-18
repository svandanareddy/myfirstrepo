package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class GetTextAndCssValue {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element=driver.findElement(By.linkText("Log in" ));
		System.out.println(element.getText());
		System.out.println(element.getCssValue("color"));
		System.out.println(element.getCssValue("text-decoration"));
}
}
