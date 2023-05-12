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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_first_name'), 'Febbry')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_last_name'), 'Tambbunan')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_email'), 'xfbryafntif@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Login_password'), '4PUcrXEUMoto9ZfzK2raqQ==')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_name'), 'Company Indutrial')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_land Islands_form-control btn-log bor_48151b'), '8954362793')

WebUI.click(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your state  province (optional)nullsland'), 
    'Ísland', true)

WebUI.click(findTestObject('Object Repository/Page_Register/input_By clicking this box, I accept the,an_f76ab8'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Sales person                Search e_941074'), 
    'social_media', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Trading As_trading_name'), 'Owner')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'public', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/textarea_Description of your products or se_3a74f4'), 
    'Good')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Address line 1_company_street_no'), 
    'Hailand')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_City_company_city'), 'Jutra')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ZIP or Postal Code_company_postal_code'), 
    '87653')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_State  Province  Region_company_state'), 
    'Ísland')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_State  Province  Region_company_state'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_First name_signatory_first_name'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Email_signatory_email'), 'febryantimelati@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ID Number_signatory_id_number'), 
    '873928393')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'), 
    '89762829')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Same as company address_address_same__59d90d'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Account Holder_account_holder'), 
    'hakijs')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Account Number_account_number'), 
    '8739837')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Savings                    Cheque   _bc224e'), 
    'Savings', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Savings                    Cheque   _bc224e'), 
    'Business', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Bank_bank'), 'bri')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please select bank country --    _6e0ed3'), 
    '-- Please select bank country --', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please select bank country --    _6e0ed3'), 
    'ID', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Branch Code or Routing Number_branch_code'), 
    '892737293')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Skip'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Apply'))

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_first_name'), 'febbry')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_last_name'), 'tambbunan')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_email'), 'fegajb@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Login_password'), 'WlsejuanybU+TtECgzKVwg==')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_name'), 'hasks')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_land Islands_form-control btn-log bor_48151b'), '89736731')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    'Your country', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your state  province (optional)nullsland'), 
    'Ísland', true)

WebUI.click(findTestObject('Object Repository/Page_Register/input_By clicking this box, I accept the,an_f76ab8'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_land Islands_form-control btn-log bor_48151b'), '8973673133')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Sales person                Search e_941074'), 
    'social_media', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Trading As_trading_name'), 'owner')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'Select', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'public', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/textarea_Description of your products or se_3a74f4'), 
    'good')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Address line 1_company_street_no'), 
    'Hudia')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_City_company_city'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ZIP or Postal Code_company_postal_code'), 
    '245234')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Email_signatory_email'), 'febryan@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ID Number_signatory_id_number'), 
    '3455235242')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'), 
    '8956645')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/div_First name                             _f450b5'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'), 
    '8956645555')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Same as company address_address_same__59d90d'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Account Holder_account_holder'), 
    'haujsa')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Account Number_account_number'), 
    '7937829')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Savings                    Cheque   _bc224e'), 
    'Savings', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Savings                    Cheque   _bc224e'), 
    'Business', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Bank_bank'), 'yts')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please select bank country --    _6e0ed3'), 
    '-- Please select bank country --', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please select bank country --    _6e0ed3'), 
    'ID', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Branch Code or Routing Number_branch_code'), 
    '2342323')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Skip'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Dashboard/a_Skip  Close'))

WebUI.closeBrowser()

