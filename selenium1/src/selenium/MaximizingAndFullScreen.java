package selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class MaximizingAndFullScreen {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://www.amazon.com");
	}

}
