package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class HomePage extends PreAndPost{
	
	public HomePage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public HomePage clickAppLauncer() {
		sleep(10000);
		click(locateElement("class", "slds-icon-waffle"));
		return this;
	}
	
	public AppLauncherPage clickViewAll() {
		sleep(10000);
		click(locateElement("xpath", "//button[text()='View All']"));
		return new AppLauncherPage(driver, test);
	}
	
	
	
}
