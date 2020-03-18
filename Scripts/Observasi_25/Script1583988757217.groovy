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

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Home/Button INC Beranda'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasien'), GlobalVariable.kehamilankecil, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/INC/section_observasi'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/option_incObservasi_30min'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Tanggal Kunjungan/field_tanggalPemeriksaanObservasi'), 0)

Mobile.tap(findTestObject('Object Repository/Date Picker/SimpanWaktuPemeriksaan'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Tanggal Kunjungan/field_jamPemeriksaanObservasi'), 0)

Mobile.tap(findTestObject('Object Repository/Date Picker/SimpanWaktuPemeriksaan'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/button_selanjutnya'), 0)

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Tanda Vital/field_denyutNadi'), '151', 0)

Mobile.verifyElementExist(findTestObject('Object Repository/INC/Observasi/Error/error_denyut_more_150'), 0)