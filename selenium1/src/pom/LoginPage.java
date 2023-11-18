package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	
	@FindBy(id="Email")
	private WebElement emailTB;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordTB;

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement loginbutton;

	public WebElement getLoginbutton() {
		return loginbutton;
}
}