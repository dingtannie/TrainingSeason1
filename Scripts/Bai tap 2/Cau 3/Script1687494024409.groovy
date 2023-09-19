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

'Input User Name'
WebUI.setText(findTestObject('Object Repository/Bai Tap 2/Text Field/txt_UserName'), 'Admin')

'Input Password'
WebUI.setText(findTestObject('Object Repository/Bai Tap 2/Text Field/txt_Password'), 'admin1234')

'Click on Login button'
WebUI.click(findTestObject('Object Repository/Bai Tap 2/Button/btn_Login'))

'Delay' 
WebUI.delay(2)

'Verify the invalid text'
WebUI.verifyElementText(findTestObject('Object Repository/Bai Tap 2/Text/txt_Invalid'), 'Invalid credentials')

'Verify Username'
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Bai Tap 2/Text Field/txt_UserName'), 'value', '', 20)

'Verify Password'
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Bai Tap 2/Text Field/txt_Password'), 'value', '', 20)

'Close browser'
WebUI.closeBrowser()

