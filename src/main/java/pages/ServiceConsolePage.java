package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class ServiceConsolePage extends PreAndPost {
	
	public ServiceConsolePage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public ServiceConsolePage clickDropdownToSelectFile() {
		clickUsingJS("xpath", "//button[@title='Show Navigation Menu']");
		return this;
	}
	

	public ServiceConsolePage selectFileFromDropdown() {
		clickUsingJS("xpath", "//span[text()='Files']");
		return this;
	}

	public ServiceConsolePage clickOnUploadFile() throws InterruptedException {
		WebElement uploadButton = locateElement("xpath", "//div[text()='Upload Files']");
		//builder.moveToElement(uploadButton).click().perform();
		actionClass(uploadButton);
		Thread.sleep(10000);
		return this;
	}

	public ServiceConsolePage uploadFileUsingRobot() throws InterruptedException, AWTException {
		// upload files
		StringSelection stringSelection = new StringSelection("C:\\Users\\DELL\\Desktop\\Sun.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Paste it using Robot class
		Robot robot = new Robot();

		// Enter to confirm it is uploaded
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		return this;
		
	}
	
	public ServiceConsolePage completeDownLoad() throws InterruptedException {
		WebElement doneClick = locateElement("xpath", "//span[text()='Done']");
		//builder.moveToElement(doneClick).click().perform();
		actionClass(doneClick);
		Thread.sleep(3000);
		return this;
	}
	
	public ServiceConsolePage clickNewlyUploadedFileDropdown() throws InterruptedException {
		click(locateElement("xpath", "//div[@data-aura-class='forceVirtualAction']/a"));
		Thread.sleep(3000);
		return this;
	}
	
	public ServiceConsolePage selectViewFileDetails() {
		click(locateElement("xpath", "//a[@title='View File Details']"));
		return this;
	}
	
	public ServiceConsolePage verifyFileName() {
		String actFileName = getText(locateElement("xpath", "//div[text()='File']/following::span"));
		Assert.assertEquals(actFileName, "Sun");
		return this;
	}
	
	public ServiceConsolePage verifyFileExtension() throws InterruptedException {
		String actFileExtension = getText(locateElement("xpath", "//span[@title='File Extension']/following::span"));
		Assert.assertEquals(actFileExtension, "jpg");
		Thread.sleep(2000);
		return this;
	}
	
	public ServiceConsolePage closeFileWindowTab() throws InterruptedException {
		click(locateElement("xpath", "//div[@class='close slds-col--bump-left slds-p-left--none slds-context-bar__icon-action ']"));
		Thread.sleep(2000);
		return this;
	}
	
	public ServiceConsolePage clickLastModifiedItem() throws InterruptedException {
		click(locateElement("xpath", "(//div[@class='slds-truncate']//span)[1]"));
		Thread.sleep(2000);
		return this;
	}
	
	public ServiceConsolePage clickOnShare() throws InterruptedException {
		click(locateElement("xpath", "//button[@title='Share']"));
		Thread.sleep(2000);
		return this;
	}
	
	public ServiceConsolePage clickOnSearchUser() throws InterruptedException {
		click(locateElement("xpath", "//input[@title='Search People']"));
		Thread.sleep(2000);
		return this;
	}
	
	public ServiceConsolePage selectDerrickDsouza() {
		click(locateElement("xpath", "//div[text()='Derrick Dsouza']"));
		return this;
	}
	
	public ServiceConsolePage verifyShareErrorMessage() {
		String actErrorMessage = getText(locateElement("xpath", "//li[@class='form-element__help']"));
		Assert.assertEquals(actErrorMessage, "Can't share file with the file owner.");
		return this;
	}
	
	public ServiceConsolePage clickCancelButton() throws InterruptedException {
		click(locateElement("xpath", "(//span[text()='Cancel'])[2]"));
		Thread.sleep(3000);
		return this;
	}
	
	public ServiceConsolePage closeItemDialog() throws InterruptedException {
		click(locateElement("xpath", "//button[@title='Close']"));
		Thread.sleep(3000);
		return this;
	}
	
	public ServiceConsolePage clickNewlyUploadedFileDropdownend() {
		click(locateElement("xpath", "//li[@class='oneActionsDropDown']//a"));
		return this;
	}
	
	public ServiceConsolePage selectDelete() {
		click(locateElement("xpath", "//a[@title='Delete']"));
		return this;
	}
	
	public ServiceConsolePage clickConfirmDelete() {
		click(locateElement("xpath", "//span[text()='Delete']"));
		return this;
	}
	
	public ServiceConsolePage verifyDeleteMessage() {
		String actDeleteMsg = getText(locateElement("xpath", "//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		System.out.println(actDeleteMsg);
		return this;
	}

}
