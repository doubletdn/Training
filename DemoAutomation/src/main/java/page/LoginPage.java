package page;

import common.Interfaces;

public class LoginPage extends AbstractPage {
	public LoginPage() {
		control.setPage(this.getClass().getSimpleName());
	}

	/**
	 * Click on the top Navigation Tab
	 * 
	 * @param tabName
	 */
	public void login(String userName, String password) {
		while(isControlDisplayed(Interfaces.LoginPage.userNameTextbox))
		{
			type(Interfaces.LoginPage.userNameTextbox, userName);
			sleep();
			type(Interfaces.LoginPage.passwordTextbox, password);
			sleep();
			click(Interfaces.LoginPage.loginButton);
			waitForPageLoaded();
		}
	}
	
}
