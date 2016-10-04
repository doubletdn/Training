package common;

import org.openqa.selenium.WebDriver;

public class Constant {

	public static class PathConfig {
		public static final String AUTOMATION_CONFIG_XML = "src/main/resource/automation.config.xml";
		public static final String DATA_TEST_XML = "src/main/resource/TestData/";
		public static final String CAPTURE_SCREENSHOT = "\\test-output\\screenshots";
		public static final String interfacesXMLPath = "src/main/resource/interfaces/";

		public static String HOME_URL = "";
		public static String browser = "";
		public static WebDriver driver;
	}

}
