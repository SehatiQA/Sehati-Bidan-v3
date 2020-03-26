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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Home/NavDrawer - Daftar Ibu'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasien'), GlobalVariable.kehamilankecil, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.scrollToText('Riwayat alergi')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_riwayatAlergi'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Riwayat Alergi/title_Riwayat Alergi'), 'Riwayat Alergi')

Mobile.verifyElementText(findTestObject('Object Repository/Riwayat Alergi/copy_Alergi obat'), 'Alergi obat')

Mobile.verifyElementText(findTestObject('Object Repository/Riwayat Alergi/copy_Alergi makanan'), 'Alergi makanan')

Mobile.verifyElementText(findTestObject('Object Repository/Riwayat Alergi/copy_Alergi lainnya'), 'Alergi lainnya')

Mobile.verifyElementExist(findTestObject('Object Repository/Riwayat Alergi/field_alergiObat'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Riwayat Alergi/field_alergiMakanan'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Riwayat Alergi/field_alergiLainnya'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Riwayat Alergi/button_simpan'), 0)

Mobile.delay(1)