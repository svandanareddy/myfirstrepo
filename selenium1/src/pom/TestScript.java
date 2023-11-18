package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/login");
				
				LoginPage page=new LoginPage(driver);
				Thread.sleep(2000);
				page.getLoginLink().click();
				Thread.sleep(2000);
				page.getEmailTB().sendKeys("selenium@gmail.com");
				Thread.sleep(2000);
				page.getPasswordTB().sendKeys("vandana@1432");
				Thread.sleep(2000);
				page.getLoginbutton().click();
				
				
			}

		}