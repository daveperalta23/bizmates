package pages;

import helpers.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Login extends Base {
	public Page_Login() {
		PageFactory.initElements(webDriver, this);
	}
	
	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement button_Login;
		
	@FindBy(xpath = "//input[@id = 'loginusername']")
	private WebElement input_Username;
	
	@FindBy(xpath = "//input[@id = 'loginpassword']")
	private WebElement input_Password;
	
	//a[@id = 'logout2']
	
	// ############################################## Return Page Objects ###############################################
	public WebElement getButtonLogIn() {
		return button_Login;
	}
	
	public WebElement getInputEmail() {
		return input_Username;
	}
	
	public WebElement getInputPassword() {
		return input_Password;
	}
}