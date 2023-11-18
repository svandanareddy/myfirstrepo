package selectclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectingAllOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/SAIFUL/Documents/dropdown.html");
		WebElement dropdown =driver.findElement(By.id("multiple"));
		Select select=new Select(dropdown);
		List<WebElement> alloptions=select.getOptions();
		//for(WebElement option:alloptions) {
		//	option.click();
		//}
		for(int i=0;i<alloptions.size();i++) {
			select.selectByIndex(i);
		}
		}
		
}
