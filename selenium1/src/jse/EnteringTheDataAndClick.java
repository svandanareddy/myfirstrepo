package jse;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTheDataAndClick {
	public static void main(String[]args) throws InterruptedException {
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the value:");
	String data=Sc.nextLine();
	
	System.setProperty("Webdriver.chrome.driver","./selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement searchstore=driver.findElement(By.id("small-searchterms"));
	
	WebElement searchbutton=driver.findElement(By.xpath("//input[@value='search']"));
	
	js.executeScript("argument[0].value='"+data+"'", searchstore);
	Thread.sleep(2000);
	js.executeScript("argument[0].value=' '",searchstore);
	Thread.sleep(2000);
	js.executeScript("argument[0].click()",searchbutton);
}
}
