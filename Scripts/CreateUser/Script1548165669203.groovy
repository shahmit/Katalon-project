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
import org.openqa.selenium.Keys as Keys

for (def row = 1; row <= findTestData('TestData').getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://iddtrain.georgiacollaborative.com/IDDPortal/')

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/a_New User Please Sign Up Here'))

    WebUI.setText(findTestObject('GeorgiaPowerPOC/Page_Online Application for Intelle/input__firstname'), findTestData('TestData').getValue(
            'FirstName', row))

    WebUI.setText(findTestObject('GeorgiaPowerPOC/Page_Online Application for Intelle/input__lastname'), findTestData('TestData').getValue(
            'LastName', row))

    WebUI.setText(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/input__username'), 
        findTestData('TestData').getValue('CreateUsername', row))

    WebUI.setMaskedText(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/input__password'), 
        findTestData('TestData').getValue('CreatePassword', row))

    WebUI.setMaskedText(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/input__rpassword'), 
        findTestData('TestData').getValue('ConfirmPassword', row))

    WebUI.setText(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/input__email'), 
        findTestData('TestData').getValue('Email', row))

    WebUI.selectOptionByValue(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/select_-- Select --'), 
        '14: 7', true)

    WebUI.setText(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/input__answer1'), 
        findTestData('TestData').getValue('Answer1', row))

    WebUI.selectOptionByValue(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/select_-- Select --           _1'), 
        '12: 3', true)

    WebUI.setText(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/input__answer2'), 
        findTestData('TestData').getValue('Answer2', row))

    WebUI.selectOptionByValue(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/select_-- Select --           _2'), 
        '13: 4', true)

    WebUI.setText(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/input__answer3'), 
        findTestData('TestData').getValue('Answer3', row))

    WebUI.click(findTestObject('GeorgiaPowerPOC/Page_Online Application for Intelle/input__preflang'))

    WebUI.click(findTestObject('Object Repository/GeorgiaPowerPOC/Page_Online Application for Intelle/button_Continue'))

    WebUI.closeBrowser()
}

