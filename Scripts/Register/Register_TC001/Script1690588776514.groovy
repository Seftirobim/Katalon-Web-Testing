import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kasirdemo.belajarqa.com')

WebUI.click(findTestObject('Object Repository/Register Page Kasir Aja/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_nama toko_name'), 'Sample Toko')

WebUI.setText(findTestObject('Object Repository/Register Page Kasir Aja/input_email_email'), 'sampletoko@fmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register Page Kasir Aja/input_password_password'), '8SQVv/p9jVSS5nNkgwYDWQ==')

WebUI.click(findTestObject('Object Repository/Register Page Kasir Aja/button_daftar'))

KeywordLogger log = new KeywordLogger()
def Berhasil_Text = WebUI.getText(findTestObject('Register Page Kasir Aja/Verify/div_Toko berhasil didaftarkananda dapat men_b3a8bd'))
//log.logInfo(Berhasil_Text)

WebUI.verifyElementVisible(findTestObject('Register Page Kasir Aja/Verify/div_Toko berhasil didaftarkananda dapat men_b3a8bd'))
WebUI.verifyMatch(Berhasil_Text, '^Toko berhasil didaftarkan.*', true)

WebUI.closeBrowser()

