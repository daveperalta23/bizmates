package pages;

import helpers.Base;

public class Pages extends Base {
	public Pages() {

	}

	private Page_Home page_Home;
	private Page_Login page_Login;

	public Page_Home getPageHome() {
		return (page_Home == null) ? page_Home = new Page_Home() : page_Home;
	}

	public Page_Login getPageLogin() {
		return (page_Login == null) ? page_Login = new Page_Login() : page_Login;
	}

}