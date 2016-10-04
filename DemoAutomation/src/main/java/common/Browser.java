package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.LoadDataConfig;

public class Browser {
	public Browser() {
		LoadDataConfig loadDataConfig = new LoadDataConfig("Joomla");
		Constant.PathConfig.browser = loadDataConfig.getBROWSER();
		Constant.PathConfig.HOME_URL = loadDataConfig.getURL();
	}

	public WebDriver launch() {
		try {
			if (Constant.PathConfig.browser.toLowerCase().equals("firefox")) {
				driver = new FirefoxDriver();
			} else if (Constant.PathConfig.browser.toLowerCase().equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/main/resource/chromedriver.exe");
				driver = new ChromeDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	private WebDriver driver = null;
}
