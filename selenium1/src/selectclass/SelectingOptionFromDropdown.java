package selectclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingOptionFromDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/SAIFUL/Documents/dropdown.html");
		WebElement dropdown=driver.findElement(By.id("multiple"));//it will use single (or) multiple also
		Select select=new Select(dropdown);
		System.out.println(select.isMultiple());
		select.selectByValue("3");
		Thread.sleep(2000);
		select.selectByVisibleText("sql");
		Thread.sleep(2000);
		select.selectByIndex(0);
		//System.out.println(select.getFirstSelectedOption().getText());
		
		List<WebElement> allselectedOptions = select.getAllSelectedOptions();//it will work only
		
		
		for(WebElement option:allselectedOptions) {
			System.out.println(option.getText());
			System.out.println("**************************get option****************");
	        List<WebElement> allselectedOptions1 = select.getOptions();//it will work only multiple select
			
			
			for(WebElement option1:allselectedOptions1) {
				System.out.println(option1.getText());
			}

		}

	}
		}

		
	
		

