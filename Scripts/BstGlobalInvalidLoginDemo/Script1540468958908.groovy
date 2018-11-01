import org.openqa.selenium.By

import com.bst.BstLoginPage
import com.bst.Homepage
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('www.bstglobal.com')
def driver = DriverFactory.getWebDriver()

WebUI.maximizeWindow()

Homepage home = new Homepage(driver)

home.getLoginSupportLink().click()

BstLoginPage login = new BstLoginPage(driver)

login.getUsername().sendKeys("test")
login.getPassword().sendKeys("password")
login.getLoginButton().click()
String errorMessage = driver.findElement(By.xpath("//div[@id='pnlLoginAlert']")).getText()
assert 'The username or password is incorrect. Forgot password?' == errorMessage

WebUI.closeBrowser()

