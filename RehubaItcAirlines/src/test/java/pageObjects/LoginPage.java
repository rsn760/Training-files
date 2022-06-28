package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver drive;
	
	public LoginPage(WebDriver d) {
		drive= d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="username")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(id="login")
	@CacheLookup
	WebElement btnlogin;
	
	public void setUserName(String uname) {
		txtusername.clear();
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		txtpassword.clear();
		txtpassword.sendKeys(pass);
	}
	
	public void ClickLogin() {
		btnlogin.click();
	}


}
