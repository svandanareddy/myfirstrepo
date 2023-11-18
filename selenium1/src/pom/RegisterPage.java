package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	private WebElement LinkText;
	
	@FindBy(id="gender-male")
	private WebElement Gender;
	
	@FindBy(id="FirstName")
	private WebElement Firstname;
	
	@FindBy(id="LastName")
	private WebElement Laststname;
	
	@FindBy(id="Email")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement Cfmpassword;
	
	@FindBy(id="register-button")
	private WebElement Regbutton;

	public WebElement getLinkText() {
	return LinkText;
	}
	public WebElement getGender() {
		return Gender;
		
	}
	public WebElement getFirstname() {
		return Firstname;
	}
	public WebElement getLastname() {
		return Laststname;
	}
	
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getCFmpassword() {
		return Cfmpassword;
	}
	public WebElement getRegbutton() {
		return Regbutton;
	}

}


		
		
	
	

	


	


