import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://iddtrain.georgiacollaborative.com/IDDPortal/')

not_run: WebUI.navigateToUrl('https://iddtrain.georgiacollaborative.com/IDDPortal/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/1_Page_HomePage to Login/input__username'), 
    'Test123')

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/1_Page_HomePage to Login/input__password'), 
    'Password123')

not_run: Thread.sleep(3000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/1_Page_HomePage to Login/button_Login'))

not_run: Thread.sleep(2000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/2_Page_Welcome/b_Submit a New Application'))

not_run: Thread.sleep(2000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/3_Page_TermsAndConditions/div_httpsgadbhdd.policystat.co'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/3_Page_TermsAndConditions/button_Proceed with online app'))

not_run: Thread.sleep(2000)

'Start of General Page'
WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input__fName'), 
    'FirstName')

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input__lName'), 
    'LastName')

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input__dob'), 
    '01/01/1990')

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/label_Select_Gender'))

not_run: Thread.sleep(2000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/li_Male'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/label_Select_MaritalStatus'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/li_Married'))

not_run: Thread.sleep(2000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/label_Select_Race'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/li_WhiteCaucasian'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/label_Select_Hispanic'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/li_No'))

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input__SSN'), 
    '800-10-0101')

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/label_Select_CurrentLivingArrangements'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/li_Community living arrangemen'))

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input__pphoneNumber'), 
    '(111) 111-1111')

'Enter Street Address'
WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input__generalStreetPrimary_pr'), 
    '3 Ravinia Dr, At')

Thread.sleep(1000)

WebUI.sendKeys(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input__generalStreetPrimary_pr'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

not_run: Thread.sleep(1000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input_Yes_law (1)'))

Thread.sleep(1000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/input_No_veteran (1)'))

Thread.sleep(1000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/CheckhereifMailingAddressisSame'))

not_run: Thread.sleep(1000)

WebUI.scrollToElement(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/button_Next Page'), 
    0)

'End of General Information Page 1'
WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 1/button_Next Page'))

'Start of General info Page 2/2'
Thread.sleep(1000)

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/input__pFName'), 
    'PrimaryName')

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/input__pLName'), 
    'PrimaryLastName')

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/label_Enter Relationship'))

Thread.sleep(1000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/span_Case Worker'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/label_Enter Relationship'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/input__pAge'), 
    '30')

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/input__ppphoneNumber'), 
    '2111111111')

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/div_Check here if the primary'))

Thread.sleep(1000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/4_Page_GeneralInformation/General info Page 2/button_Next Page'))

'Start of Legal Status and Guardian Page'
WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/5_Legal Status and Guardian/label_Select'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/5_Legal Status and Guardian/Span in the dropdown'))

not_run: Thread.sleep(1000)

'End of Legal Status and Guardian Page'
WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/5_Legal Status and Guardian/button_Next Page_2'))

not_run: Thread.sleep(1000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/label_Select'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/label_Select - Value'))

not_run: Thread.sleep(1000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/No- other than English'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/Communicated Verbally'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/label_Select - Preferred Mode of Communication'))

not_run: Thread.sleep(2000)

'Add Send Keys here'
not_run: WebUI.sendKeys(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/label_Select - Value - Preferred Mode of Communication'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/label_Select - Value - Preferred Mode of Communication'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/input_No_applicantdeaf'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/input_No_applicantdeaf- 2nd radio'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/input_No_Vision Radio 1'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/input_No_Vision Radio 2'))

'End of Communication, Hearing and Vision'
WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/6_Page_Communication, Hearing and Vision/button_Next Page_3'))

not_run: Thread.sleep(2000)

'Start of IDD Diagonosis, Resources & Referrals'
WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/7_Page_IDD Diagonosis Resources and Referrals/input_No_iddConfirmed'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/7_Page_IDD Diagonosis Resources and Referrals/div_Choose'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/7_Page_IDD Diagonosis Resources and Referrals/Label_Access_Crisis Line'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/7_Page_IDD Diagonosis Resources and Referrals/div_Current Resource Selection'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/7_Page_IDD Diagonosis Resources and Referrals/Label_Adoption Assistance'))

WebUI.sendKeys(findTestObject('Submit Application/Page_Online Application for Intelle/7_Page_IDD Diagonosis Resources and Referrals/input__pReferral Income'), 
    '50000')

'End of Page IDD Diagonosis, Resources and Referrals'
WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/7_Page_IDD Diagonosis Resources and Referrals/button_Next Page_4'))

'Start of Physician Page'
not_run: Thread.sleep(2000)

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/8_Physician Details/input__pPhysician Name'), 
    'Hopkins')

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/8_Physician Details/input__pCity'), 
    'Fort Smith')

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/8_Physician Details/label_Enter State'))

not_run: Thread.sleep(2000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/8_Physician Details/Span_State - Arkansas'))

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/8_Physician Details/input__pZip code'), 
    '30346')

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/8_Physician Details/input__pPhone Number'), 
    '2111111111')

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/8_Physician Details/div_Save Button'))

not_run: Thread.sleep(1000)

'End of Physician Page'
WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/8_Physician Details/button_Next Page_5'))

'Start of Application Supporting Document'
Thread.sleep(1000)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/9_Application Supporting Documents/label_Document Type'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/9_Application Supporting Documents/li_Birth Certificate'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: Thread.sleep(5000)

Actions actions = new Actions(DriverFactory.getWebDriver())

actions.moveToElement(WebUiCommonHelper.findWebElement(findTestObject('Submit Application/Page_Online Application for Intelle/9_Application Supporting Documents/div_Choose File'), 
        30))

actions.sendKeys('C:\\\\Users\\\\mitali.p.shah\\\\Downloads\\\\Test.docx')

actions.build().perform()

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/9_Application Supporting Documents/div_Upload'))

not_run: Thread.sleep(1000)

'End of Application Supporting Documents'
WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/9_Application Supporting Documents/button_Next Page_6'))

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/10_Application Signature/input__fName'), 
    'Applicant Name')

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/10_Application Signature/input__lName'), 
    'Applicant Last Name')

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/10_Application Signature/label_Application completed by'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/10_Application Signature/label_Method of Contact'))

WebUI.setText(findTestObject('Submit Application/Page_Online Application for Intelle/10_Application Signature/input__pphoneNumber'), 
    '2111111111')

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/10_Application Signature/div_I certify'))

WebUI.click(findTestObject('Submit Application/Page_Online Application for Intelle/10_Application Signature/button_Submit Application'))

