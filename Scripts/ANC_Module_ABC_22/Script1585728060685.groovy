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

WebUI.callTestCase(findTestCase('ANC_Module_ABC_14'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/field_tanggal'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/copy_adakahpenyakit'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/chip_gakada'), 0)

Mobile.scrollToText('SELANJUTNYA')

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_alkohol_no'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_alkohol_yes'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_merokok_no'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_merokok_yes'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_kel_merokok_no'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_kel_merokok_yes'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/cari/button_batal'), 0)

Mobile.tap(findTestObject('Object Repository/Global/Peringatan Keluar Form/button_keluar'), 0)

Mobile.delay(1)

// WUS

Mobile.tap(findTestObject('Object Repository/Home/Button ANC Beranda'), 0)

Mobile.tap(findTestObject('Object Repository/List Pasien/tab_wus'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/field_tanggal'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/copy_adakahpenyakit'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/chip_gakada'), 0)

Mobile.scrollToText('SELANJUTNYA')

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_alkohol_no'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_alkohol_yes'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_merokok_no'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_merokok_yes'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_kel_merokok_no'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_kel_merokok_yes'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/cari/button_batal'), 0)

Mobile.tap(findTestObject('Object Repository/Global/Peringatan Keluar Form/button_keluar'), 0)

Mobile.delay(1)

// Hamil

Mobile.tap(findTestObject('Object Repository/Home/Button ANC Beranda'), 0)

Mobile.tap(findTestObject('Object Repository/List Pasien/tab_hamil'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasiens'), GlobalVariable.kehamilankecil, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/field_tanggal'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keluhan Ibu/copy_keluhan_ibu'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Keluhan Ibu/chips_tidak_ada'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)