import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kasirdemo.belajarqa.com')

WebUI.click(findTestObject('Object Repository/Register Page Kasir Aja/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_nama toko_name'), 'Sample Toko')

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_email_email'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Register Page Kasir Aja/input_password_password'), '8SQVv/p9jVSS5nNkgwYDWQ==')

WebUI.click(findTestObject('Object Repository/Register Page Kasir Aja/button_daftar'))

KeywordLogger log = new KeywordLogger()

def alert_Text = WebUI.getText(findTestObject('Register Page Kasir Aja/Verify/div_email is not allowed to be empty'))

//log.logInfo(Berhasil_Text)
WebUI.verifyElementVisible(findTestObject('Register Page Kasir Aja/Verify/div_email is not allowed to be empty'))

WebUI.verifyMatch(alert_Text, '^"email" is not allowed to be empty.*', true)

WebUI.closeBrowser()

