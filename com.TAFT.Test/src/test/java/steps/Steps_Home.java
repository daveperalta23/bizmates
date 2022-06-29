package steps;

import org.junit.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_Home extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();
	
	// ################################################## Given Steps ##################################################
	
	// ################################################## When Steps ###################################################
	@When("^the user logs out$")
	public void the_user_logs_out() throws Throwable {
		elementClick(pages.getPageHome().getLinkLogout());
	}
	
	// ################################################## Then Steps ###################################################
	@Then("^\"([^\"]*)\" related controls are shown on the landing page$")
	public void related_controls_are_shown_on_the_landing_page(String arg1) throws Throwable {
		try {
			waitUntilElementVisible(pages.getPageHome().getLinkHome());
			
			if (arg1.equals("User")) {
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkHome()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkContact()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkAboutus()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkCart()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkLogin()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkSignup()));
			}
			else if (arg1.equals("InvalidUser")) {
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkHome()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkContact()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkAboutus()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkCart()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkLogin()));
				Assert.assertTrue(isElementDisplayed(pages.getPageHome().getLinkSignup()));
			}

		}
		catch (AssertionError exception) {
			throw new AssertionError("The controls for the logged in user are incorrect.");
		}
	}
}