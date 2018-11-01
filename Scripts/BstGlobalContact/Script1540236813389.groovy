import org.openqa.selenium.By

import com.bst.Homepage
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('www.bstglobal.com')
def driver = DriverFactory.getWebDriver()

Homepage home = new Homepage(driver)

WebUI.maximizeWindow()

home.getContactMenu().click()
home.getFirstName().sendKeys("Bat")
home.getLastName().sendKeys("Man")
home.getEmail().sendKeys("batman@superheros.org")
home.getJobTitle().sendKeys("Superhero")
home.getCompany().sendKeys("DC Comics")
home.getMessageBox().sendKeys("I was wondering if you could help us maintain our massive database of bad guys. It\'s getting a little out of control.")
home.getBstGlobalCheckbox().click()
home.getBstGlobalPartnerCheckbox().click()
home.getBstGlobalPartnerCheckbox().click()
home.getContactMenu().click()

WebUI.closeBrowser()

