package pages;


import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class AppLauncherPage extends PreAndPost {

	public AppLauncherPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public ServiceConsolePage clickServiceConsole() {
		click(locateElement("xpath", "//p[text()='Service Console']"));
		return new ServiceConsolePage(driver, test);
	}

}
