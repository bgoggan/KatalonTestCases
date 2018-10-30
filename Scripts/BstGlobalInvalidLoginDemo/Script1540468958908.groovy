import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('www.bstglobal.com')

WebUI.maximizeWindow()

WebUI.click(findTestObject('BST Global/LoginSupportLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('BST Global/UsernameBox'), 'test')

WebUI.sendKeys(findTestObject('BST Global/PasswordBox'), 'password')

WebUI.click(findTestObject('BST Global/LoginButton'))

WebUI.getText(findTestObject('BST Global/LoginErrorMessage'))

assert 'The username or password is incorrect. Forgot password?' == 'The username or password is incorrect. Forgot password?'

WebUI.closeBrowser()

