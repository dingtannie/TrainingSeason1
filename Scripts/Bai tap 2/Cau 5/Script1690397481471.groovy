import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open Browser'
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com')

'Click Forgot your password'
WebUI.click(findTestObject('Object Repository/Bai Tap 2/Link/lnk_ForgotPass'))

'Verify Cancel button'
WebUI.verifyElementClickable(findTestObject('Object Repository/Bai Tap 2/Button/btn_Cancel'))

'Verify Reset button'
WebUI.verifyElementClickable(findTestObject('Object Repository/Bai Tap 2/Button/btn_Reset'))

'Click on Cancel button'
WebUI.click(findTestObject('Object Repository/Bai Tap 2/Button/btn_Cancel'))

'Verify Login Page'
//WebUI.getWindowTitle('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

'Close browser'
WebUI.closeBrowser()