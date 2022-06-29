package pages;

import helpers.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Home extends Base {
	public Page_Home() {
		PageFactory.initElements(webDriver, this);
	}
	
	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//a[text() = 'Home ']//parent::a")
	private WebElement link_Home;
	
	@FindBy(xpath = "//a[text() = 'Contact']//parent::a")
	private WebElement link_Contact;
	
	@FindBy(xpath = "//a[text() = 'About us']//parent::a")
	private WebElement link_AboutUs;
	
	@FindBy(xpath = "//a[text() = 'Cart']//parent::a")
	private WebElement link_Cart;
	
	@FindBy(xpath = "//a[text() = 'Log in']//parent::a")
	private WebElement link_Login;
	
	@FindBy(xpath = "//a[text() = 'Sign up']//parent::a")
	private WebElement link_Signup;
	
	@FindBy(xpath = "//a[text() = 'Log out']//parent::a")
	private WebElement link_Logout;

	
	// ############################################## Return Page Objects ###############################################
	public WebElement getLinkHome() {
		return link_Home;
	}
	
	public WebElement getLinkContact() {
		return link_Contact;
	}
	
	public WebElement getLinkAboutus() {
		return link_AboutUs;
	}
	
	public WebElement getLinkCart() {
		return link_Cart;
	}
	
	public WebElement getLinkLogin() {
		return link_Login;
	}
	
	public WebElement getLinkSignup() {
		return link_Signup;
	}
	
	public WebElement getLinkLogout() {
		return link_Logout;
	}
	
}