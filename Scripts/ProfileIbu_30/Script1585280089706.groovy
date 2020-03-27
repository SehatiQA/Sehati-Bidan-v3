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

WebUI.callTestCase(findTestCase('ProfileIbu_01'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_datadiri'), 0)

Mobile.delay(1)

x = Mobile.getText(findTestObject('Object Repository/Data Diri Pasien/field/field_name2'), 0)

String charset = ('a'..'z').join()
Integer length = 8
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/Data Diri Pasien/field/field_name2'), 'ibu '+randomString, 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/tab_alamat'), 0)

Mobile.delay(1)

Mobile.verifyElementExist(findTestObject('Object Repository/Data Diri Pasien/Modal Simpan Data (Pindah Tab)/copy_simpandata'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/Modal Simpan Data (Pindah Tab)/button_Tidak'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/tab_alamat'), 0)

Mobile.scrollToText('SIMPAN')

Mobile.setText(findTestObject('Object Repository/Data Diri Pasien/field_on_alamat_tab/field_alamat'), randomString, 0)

x1 = Mobile.getText(findTestObject('Object Repository/Data Diri Pasien/field_on_alamat_tab/field_alamat'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/tab_biodata'), 0)

Mobile.delay(1)

Mobile.verifyElementExist(findTestObject('Object Repository/Data Diri Pasien/Modal Simpan Data (Pindah Tab)/copy_simpandata'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/Modal Simpan Data (Pindah Tab)/button_Ya Simpan'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/button_back'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_datadiri'), 0)

y = Mobile.getText(findTestObject('Object Repository/Data Diri Pasien/field/field_name2'), 0)

Mobile.verifyMatch(x, y, false)

Mobile.scrollToText('SIMPAN')

y1 = Mobile.getText(findTestObject('Object Repository/Data Diri Pasien/field_on_alamat_tab/field_alamat'), 0)

Mobile.verifyMatch(x1, y1, false)