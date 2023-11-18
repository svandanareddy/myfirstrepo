package selectclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/SAIFUL/Documents/dropdown.html");
		WebElement dropdown =driver.findElement(By.id("multiple"));
		Select select2 = new Select(null);
		select2.selectByValue("3");
		Thread.sleep(2000);
		Object select = null;
		((Select) select).selectByVisibleText("sql");
		Thread.sleep(2000);
		((Select) select).selectByIndex(0);
		//System.out.println(select.getFirstselectedoptions().gettext());
		
		//List<webElement> allselectedoptions =select.getAllselectedoptoptions();
		List<WebElement> alloptions =getoptions();
		WebElement[] allselectedoptions = null;
		for(WebElement option:allselectedoptions){
			System.out.println(option.getText());
		}
	}

	private static List<WebElement> getoptions() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
