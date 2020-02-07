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

Mobile.startApplication(GlobalVariable.appPath, true)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/heading_main'), 'Hai Bidan, ini yang baru dari kami!')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/heading_1'), 'Simpan Status dengan Mudah')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/text_1'), 'Catat, simpan, atur, dan lihat kembali semua pencatatan pasien Ibu dan Anak dengan mudah')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/heading_2'), 'Deteksi Faktor Risiko secara Cepat')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/text_2'), 'Deteksi secara aktual dan cepat untuk faktor risiko Ibu dan Anak')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/heading_3'), 'Koneksi dengan TeleCTG')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/text_3'), 'Kini Bidan dapat terhubung dengan TeleCTG untuk memantau kesejahteraan janin')