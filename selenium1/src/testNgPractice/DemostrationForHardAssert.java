package testNgPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemostrationForHardAssert {
	@Test
	public void demo() {
		String expectedTitle="demo";
		String actualTitle="sam";
		assertEquals(actualTitle,expectedTitle,"the condtion is not matching");
	
		//soft assert
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle,expectedTitle);
		System.out.println("done");
		soft.assertAll();
	

}
}
