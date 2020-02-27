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

Mobile.tap(findTestObject('Object Repository/List Pasien/tab_bersalin'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/INC/section_catatanIbuDatang'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/field_tanggalPemeriksaan'), 0)

Mobile.tap(findTestObject('Date Picker/SimpanWaktuPemeriksaan'), 0)

a = Mobile.getText(findTestObject('Object Repository/INC/Catatan Ibu Datang/field_tanggalPemeriksaan'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/field_tanggalPemeriksaan'), 0)

Mobile.swipe(439, 1743, 439, 1300)

Mobile.delay(1)

Mobile.tap(findTestObject('Date Picker/SimpanWaktuPemeriksaan'), 0)

Mobile.delay(1)

b = Mobile.getText(findTestObject('Object Repository/INC/Catatan Ibu Datang/field_tanggalPemeriksaan'), 0)

Mobile.verifyEqual(a, b)