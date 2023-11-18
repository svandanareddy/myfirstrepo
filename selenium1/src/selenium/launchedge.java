package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class launchedge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./selenium/msedgedriver.exe");
		EdgeDriver ref=new EdgeDriver();

	}

}
