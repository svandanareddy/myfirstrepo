package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","./selenium/geckodriver.exe");
	        FirefoxDriver ref=new FirefoxDriver();
	}

}
