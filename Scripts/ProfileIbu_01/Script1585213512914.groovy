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

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Home/NavDrawer - Daftar Ibu'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasiens'), GlobalVariable.kehamilankecil, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.verifyElementText(findTestObject('Object Repository/Profile Pasien/title_ProfileIbu'), 'Profil Ibu')

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/copy_namaIbu'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/copy_usiaIbu'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_fotoProfile'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/fab_tambah'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/button_teleCTGs'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/button_rujuk'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_riwayatKunjungan'), 0)

Mobile.scrollToText('Riwayat alergi')

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_datadiri'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_datapasangan1'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_riwayatGPA'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_riwayatKontrasepsi'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_riwayatPenyakit'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_riwayatOperasi'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_obatRutin'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_riwayatAlergi'), 0)

Mobile.scrollToText('Lihat riwayat faktor risiko')

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_lihatDataPenunjang'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/section_lihatFaktorResiko'), 0)