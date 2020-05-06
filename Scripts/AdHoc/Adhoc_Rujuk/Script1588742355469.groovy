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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Home/NavDrawer - Daftar Ibu'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasiens'), GlobalVariable.kehamilankecil, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/button_rujukPasien'), 0)

Mobile.delay(10)

String charset = ('a'..'z').join()
Integer length = 4
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Profile Pasien/Rujuk/copy_namaibu'), 'text', GlobalVariable.kehamilankecil, 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/Rujuk/chips_perdarahan'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/Rujuk/chips_hipertensi'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/Rujuk/chips_gemili'), 0)	

Mobile.tap(findTestObject('Object Repository/Profile Pasien/Rujuk/chips_gawatJanin'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/Rujuk/chips_serotinus'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/Rujuk/chips_kelainanLetak'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/Rujuk/field_JenisTempatRujuk'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/Rujuk/opt_1'), 0)

Mobile.scrollToText('SIMPAN')

Mobile.setText(findTestObject('Object Repository/Profile Pasien/Rujuk/field_namaTempatRujuk'), 'Rumah Sakit '+randomString, 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/button_Simpans'), 0)

Mobile.delay(5)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Profile Pasien/button_rujukPasien'), 'enabled', 'false', 0)