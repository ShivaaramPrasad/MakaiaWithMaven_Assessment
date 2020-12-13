package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class TC_Assessment extends PreAndPost{

	@BeforeTest
	public void setData() {
		testCaseName = "TC_Assessment";
		testDescription = "Assessment";
		authors = "Shivaaram";
		category = "Functional";
		nodes = "ServiceConsole";
	}
	
	@Test
	public void assessmentTestCase() throws InterruptedException, AWTException {
		new LoginPage(driver, test)
		.typeUserName("nupela@testleaf.com")
		.typePassword("Bootcamp$123")
		.clickLogIn()
		.clickAppLauncer()
		.clickViewAll()
		.clickServiceConsole()
		.clickDropdownToSelectFile()
		.selectFileFromDropdown()
		.clickOnUploadFile()
		.uploadFileUsingRobot()
		.completeDownLoad()
		.clickNewlyUploadedFileDropdown()
		.selectViewFileDetails()
		.verifyFileName()
		.verifyFileExtension()
		.closeFileWindowTab()
		.clickLastModifiedItem()
		.clickOnShare()
		.clickOnSearchUser()
		.selectDerrickDsouza()
		.verifyShareErrorMessage()
		.clickCancelButton()
		.closeItemDialog()
		.clickNewlyUploadedFileDropdownend()
		.selectDelete()
		.clickConfirmDelete()
		.verifyDeleteMessage();
		
	}

}
