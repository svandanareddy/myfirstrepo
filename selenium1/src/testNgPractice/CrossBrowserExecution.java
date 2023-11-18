package testNgPractice;

import org.testng.annotations.Test;

public class CrossBrowserExecution {
@Test

public void cbt(String browser) {
	if(browser.equals("chrome")) {
		System.out.println("chrome browser is lanched");
	}else {
	System.out.println("firefox is launching");
}
}
}
	

