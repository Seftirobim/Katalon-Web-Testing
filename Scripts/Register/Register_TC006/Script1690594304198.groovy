import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kasirdemo.belajarqa.com')

WebUI.click(findTestObject('Object Repository/Register Page Kasir Aja/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_nama toko_name'), '')

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_email_email'), '')

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_password_password'), '')

WebUI.click(findTestObject('Object Repository/Register Page Kasir Aja/button_daftar'))

KeywordLogger log = new KeywordLogger()

def alert_Text = WebUI.getText(findTestObject('Register Page Kasir Aja/Verify/div_name email and password are not allowed to be empty'))

//log.logInfo(Berhasil_Text)
WebUI.verifyElementVisible(findTestObject('Register Page Kasir Aja/Verify/div_name email and password are not allowed to be empty'))

WebUI.verifyMatch(alert_Text, '^"name,email, and password" are not allowed to be empty.*', true)

WebUI.closeBrowser()

