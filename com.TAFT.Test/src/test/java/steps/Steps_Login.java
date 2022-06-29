package steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_Login extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################
	@Given("^the web browser is on the Demo Store page$")
	public void the_web_browser_is_on_the_Demo_Store_page() throws Throwable {
		try {
			if (!getPageTitle().equals("STORE")) {
				steps.getStepsHome().the_user_logs_out();
			}

			assertEquals("Login", getPageTitle());
		}
		catch (AssertionError exception) {
			throw new AssertionError("The web browser is not on Demo Store page.");
		}
	}

	// ################################################## When Steps ###################################################
	@When("^the user logs in with \"([^\"]*)\" credentials$")
	public void the_user_logs_in_with_credentials(String arg1) throws Throwable {
		try {
			if (arg1.equals("User")) {
				elementClick(pages.getPageHome().getLinkLogin());
				elementSendKeys(pages.getPageLogin().getInputEmail(), properties.getProperty("userEmail"));
				elementSendKeys(pages.getPageLogin().getInputPassword(), properties.getProperty("userPassword"));
				elementClick(pages.getPageLogin().getButtonLogIn());
			}
			else if (arg1.equals("Invalid Password")) {
				elementClick(pages.getPageHome().getLinkLogin());
				elementSendKeys(pages.getPageLogin().getInputEmail(), "ABC@DEF.com");
				elementSendKeys(pages.getPageLogin().getInputPassword(), "123");
				elementClick(pages.getPageLogin().getButtonLogIn());
			}
			else if (arg1.equals("Invalid Email")) {
				elementClick(pages.getPageHome().getLinkLogin());
				elementSendKeys(pages.getPageLogin().getInputEmail(), "ABC");
				elementSendKeys(pages.getPageLogin().getInputPassword(), "123");
				elementClick(pages.getPageLogin().getButtonLogIn());
			}
		}
		catch (Exception exception) {
			throw new Exception("The login fields are not available.");
		}
	}

	// ################################################## Then Steps ###################################################
	@Then("^a message stating that the login credentials provided is invalid$")
	public void a_message_stating_that_the_login_credentials_provided_is_invalid() throws Throwable {
		try {
			assertEquals("Please fill out Username and Password.", isAlertPresent());
		}
		catch (AssertionError exception) {
			throw new AssertionError("The message is different from the expected message which is \"Username/Password is invalid.\".");
		}
	}

	@Then("^a message stating that a string in email format is expected$")
	public void a_message_stating_that_a_string_in_email_format_is_expected() throws Throwable {
		try {
			waitUntilElementVisible(pages.getPageLogin().getInputEmail().findElement(By.xpath(".//following-sibling::span")));
			assertEquals("Email expected.", getElementText(pages.getPageLogin().getInputEmail().findElement(By.xpath(".//following-sibling::span"))));
		}
		catch (AssertionError exception) {
			throw new AssertionError("The message is different from the expected message which is \"Email expected!\". " + exception.getMessage());
		}
	}
}