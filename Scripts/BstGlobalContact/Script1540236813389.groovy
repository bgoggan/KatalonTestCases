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

WebUI.click(findTestObject('BST Global/ContactMenu'))

WebUI.sendKeys(findTestObject('BST Global/FirstName'), 'Bat')

WebUI.sendKeys(findTestObject('BST Global/Last Name'), 'Man')

WebUI.sendKeys(findTestObject('BST Global/Email'), 'batman@superheros.org')

WebUI.sendKeys(findTestObject('BST Global/JobTitle'), 'Superhero')

WebUI.sendKeys(findTestObject('BST Global/Company'), 'DC Comics')

WebUI.sendKeys(findTestObject('BST Global/MessageBox'), 'I was wondering if you could help us maintain our massive database of bad guys. It\'s getting a little out of control.')

WebUI.click(findTestObject('BST Global/BstGlobalCheckbox'))

WebUI.click(findTestObject('BST Global/BstGlobalPartnerCheckbox'))

WebUI.click(findTestObject('BST Global/BstGlobalPartnerCheckbox'))

WebUI.click(findTestObject('BST Global/ContactMenu'))

WebUI.closeBrowser()

