package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		RegisterPage page=new RegisterPage(driver);
		
         page.getLinkText().click();
         page.getGender().click();
         page.getFirstname().sendKeys("vandana");
         page.getLastname().sendKeys("reddy");
         page.getEmail().sendKeys("vandanareddy123@gmail.com");
         page.getPassword().sendKeys("vandana@1432");
         page.getCFmpassword().sendKeys("vandana@1432");
         page.getRegbutton().click();

	}

}

