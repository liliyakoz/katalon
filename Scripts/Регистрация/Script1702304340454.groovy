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

WebUI.verifyElementClickable(findTestObject('Регистрация/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/Регистрация/Page_Demo Web Shop/a_Register'))

WebUI.verifyElementPresent(findTestObject('Регистрация/Page_Demo Web Shop. Register/input_FirstName'), 0)

WebUI.setText(findTestObject('Object Repository/Регистрация/Page_Demo Web Shop. Register/input_FirstName'), 'Иван')

WebUI.verifyElementPresent(findTestObject('Регистрация/Page_Demo Web Shop. Register/input_LastName'), 0)

WebUI.setText(findTestObject('Object Repository/Регистрация/Page_Demo Web Shop. Register/input_LastName'), 'Иванов')

WebUI.verifyElementPresent(findTestObject('Регистрация/Page_Demo Web Shop. Register/input_Email'), 0)

WebUI.setText(findTestObject('Object Repository/Регистрация/Page_Demo Web Shop. Register/input_Email'), 'fgvchf@mail.ru')

WebUI.click(findTestObject('Object Repository/Регистрация/Page_Demo Web Shop. Register/div_Your Password                          _3011b2'))

WebUI.verifyElementPresent(findTestObject('Регистрация/Page_Demo Web Shop. Register/input_Password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Регистрация/Page_Demo Web Shop. Register/input_Password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Регистрация/Page_Demo Web Shop. Register/input_ConfirmPassword'), 
    'aeHFOx8jV/A=')

WebUI.verifyElementPresent(findTestObject('Регистрация/Page_Demo Web Shop. Register/input_register-button'), 0)

WebUI.verifyElementClickable(findTestObject('Регистрация/Page_Demo Web Shop. Register/input_register-button'))

WebUI.click(findTestObject('Object Repository/Регистрация/Page_Demo Web Shop. Register/input_register-button'))

