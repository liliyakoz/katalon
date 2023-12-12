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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.verifyElementPresent(findTestObject('Изменение профиля/Page_Demo Web Shop/a_Log in'), 0)

WebUI.verifyElementClickable(findTestObject('Изменение профиля/Page_Demo Web Shop/a_Log in'))

WebUI.click(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop/a_Log in'))

WebUI.verifyElementPresent(findTestObject('Изменение профиля/Page_Demo Web Shop. Login/input_Email'), 0)

WebUI.setText(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Login/input_Email'), 'l.kozyreva@qpdev.ru')

WebUI.verifyElementPresent(findTestObject('Изменение профиля/Page_Demo Web Shop. Login/input_Password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Login/input_Password'), 'aeHFOx8jV/A=')

WebUI.verifyElementPresent(findTestObject('Изменение профиля/Page_Demo Web Shop. Login/input_button-1 login-button'), 0)

WebUI.click(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Login/input_button-1 login-button'))

WebUI.click(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop/a_l.kozyrevaqpdev.ru'))

WebUI.verifyElementPresent(findTestObject('Изменение профиля/Page_Demo Web Shop. Account/label_First name'), 0)

WebUI.click(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Account/label_First name'))

WebUI.setText(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Account/input_FirstName'), 'Семен')

WebUI.setText(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Account/input_LastName'), 'Иванов')

WebUI.verifyElementPresent(findTestObject('Изменение профиля/Page_Demo Web Shop. Account/label_Last name'), 0)

WebUI.click(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Account/label_Last name'))

WebUI.setText(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Account/input_LastName'), 'Сидоров')

WebUI.verifyElementPresent(findTestObject('Изменение профиля/Page_Demo Web Shop. Account/input_save-info-button'), 0)

WebUI.verifyElementClickable(findTestObject('Изменение профиля/Page_Demo Web Shop. Account/input_save-info-button'))

WebUI.click(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Account/input_save-info-button'))

WebUI.click(findTestObject('Object Repository/Изменение профиля/Page_Demo Web Shop. Account/input_save-info-button'))

