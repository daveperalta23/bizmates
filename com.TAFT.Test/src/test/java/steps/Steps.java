package steps;

import helpers.Base;

public class Steps extends Base {
	public Steps() {
		
	}
	
	private Steps_Home steps_Home;
	private Steps_Login steps_Login;
	
	public Steps_Home getStepsHome() {
		return (steps_Home == null) ? steps_Home = new Steps_Home() : steps_Home;
	}
	
	public Steps_Login getStepsLogin() {
		return (steps_Login == null) ? steps_Login = new Steps_Login() : steps_Login;
	}
}