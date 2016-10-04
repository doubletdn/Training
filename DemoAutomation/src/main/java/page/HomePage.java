package page;

import common.Interfaces;

public class HomePage extends AbstractPage {
	public HomePage() {
		control.setPage(this.getClass().getSimpleName());
	}
	
	public boolean loginToHomePageSuccessfully(String userName){
		waitForPageLoaded();
		sleep();
		return isControlDisplayed(Interfaces.HomePage.userNameLabel, userName);
	}
}
