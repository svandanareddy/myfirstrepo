package testNgPractice;

import org.testng.annotations.Test;

public class DemostrationForInvocationCount {
@Test(invocationCount=5)
public void login() {
	System.out.println("i'm from login");
}
}
