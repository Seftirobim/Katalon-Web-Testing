import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kasirdemo.belajarqa.com')

WebUI.click(findTestObject('Object Repository/Register Page Kasir Aja/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_nama toko_name'), 'Sample Toko')

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_email_email'), 'sampletoko@')

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_password_password'), '123456')

WebUI.click(findTestObject('Object Repository/Register Page Kasir Aja/button_daftar'))

KeywordLogger log = new KeywordLogger()

def alert_Text = WebUI.getText(findTestObject('Register Page Kasir Aja/Verify/div_email must be a valid email'))

//log.logInfo(Berhasil_Text)
WebUI.verifyElementVisible(findTestObject('Register Page Kasir Aja/Verify/div_email must be a valid email'))

WebUI.verifyMatch(alert_Text, '^"email" must be a valid email.*', true)

WebUI.closeBrowser()

