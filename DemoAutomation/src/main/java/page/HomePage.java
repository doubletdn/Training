package page;

import common.Constant;
import common.Interfaces;

public class HomePage extends AbstractPage {
	public HomePage() {
		control.setPage(this.getClass().getSimpleName());
	}
	
	public boolean isHomePageDisplayed(){
		waitForPageLoaded();
		return isControlDisplayed(Interfaces.HomePage.userNameLabel, Constant.LoginInfo.userName);
	}
	
	public static void logout(){
		click(Interfaces.HomePage.userIcon);
		sleep(timeout);
		click(Interfaces.HomePage.logoutButton);
		waitForPageLoaded();
	}
}
