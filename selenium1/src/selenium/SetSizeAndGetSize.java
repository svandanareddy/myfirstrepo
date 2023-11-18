package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndGetSize {
	public static void main(String[]args){
	System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
	ChromeDriver ref=new ChromeDriver();
	
System.out.println(ref.manage().window().getSize().height);
System.out.println(ref.manage().window().getSize().width);
	
		Dimension d=new Dimension(500,350);
	
	ref.manage().window().setSize(d);
	
	
	System.out.println("the x coordinate is:"+ref.manage().window().getPosition().x);
	
	System.out.println("the y coordinate is :"+ref.manage().window().getPosition().y);
	
	Point p=new Point(300,400);
	ref.manage().window().setPosition(p);

}
}
