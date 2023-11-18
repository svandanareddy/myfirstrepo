package testNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ConfigurationAnnotations {
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("Before suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");

}
	@BeforeClass
	public void beforeclas() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	@AfterMethod
	public void Aftermethod() {
		System.out.println("Before method");
	}
	@Test
	public void suite() {
		System.out.println("from suite");
	}
	@Test
	public void method() {
		System.out.println("from method");
	}
	}
	
	
