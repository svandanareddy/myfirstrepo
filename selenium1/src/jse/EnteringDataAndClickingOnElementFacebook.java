package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class EnteringDataAndClickingOnElementFacebook {
	public static  void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the email :");
		String email= sc.nextLine();
		System.out.println("enter the password :");
		String password=sc.nextLine();


		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?locale2=en_GB&_rdr");

		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement useremail=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='"+email+"'", useremail);
		Thread.sleep(3000);
		WebElement userpassword=driver.findElement(By.id("pass"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='"+password+"'", userpassword);
		Thread.sleep(3000);
		WebElement loginbutton=driver.findElement(By.xpath("//button[@value='1']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", loginbutton);
	}
}



