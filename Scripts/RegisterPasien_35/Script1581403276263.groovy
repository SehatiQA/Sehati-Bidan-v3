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

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Home/section_registrasiPasien'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/buttomsheet_register/buttomsheet_ibu'), 0)

Mobile.tap(findTestObject('Object Repository/Home/buttomsheet_register/buttomsheet_ibu'), 0)

Mobile.delay(1)

Mobile.verifyElementExist(findTestObject('Object Repository/Registrasi Pasien/title_PendaftaranIbu'), 0)

String charset = ('a'..'z').join()
String intset = ('1'..'9').join()
Integer length = 13
String randomString = RandomStringUtils.random(length, charset.toCharArray())
String randomInt = RandomStringUtils.random(length, intset.toCharArray())

Mobile.setText(findTestObject('Registrasi Pasien/field_nameIbu'), 'ibu '+randomString, 0)

Mobile.setText(findTestObject('Registrasi Pasien/field_noKTP'), '327'+randomInt, 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/field_tglLahir'), 0)

Mobile.swipe(417, 1770, 417, 2100)

Mobile.swipe(1000, 1770, 1000, 2100)

Mobile.tap(findTestObject('Object Repository/DatePicker/button_simpantanggal'), 0)

a = Mobile.getText(findTestObject('Object Repository/Registrasi Pasien/field_tglLahir'), 0)

println (a)

Mobile.scrollToText('Kota/Kabupaten')

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/field_Provinsi'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Pasien/cari/field_cariProvinsi'), 'Barat', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/cari/result_1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/field_Kota'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Pasien/cari/field_cariProvinsi'), 'Depok', 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/cari/result_1'), 0)

b = Mobile.getText(findTestObject('Object Repository/Registrasi Pasien/field_Kota'), 0)

println (b)

Mobile.verifyElementExist(findTestObject('Object Repository/Registrasi Pasien/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/button_selanjutnya'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Registrasi Pasien/button_tambahpasienbaru'), 0)

Mobile.delay(1)

w = Mobile.getText(findTestObject('Object Repository/Registrasi Pasien/plaintext_ktp'), 0)

x = Mobile.getText(findTestObject('Object Repository/Registrasi Pasien/plaintext_namaibu'), 0)

y = Mobile.getText(findTestObject('Object Repository/Registrasi Pasien/plaintext_tgllahir'), 0)

z = Mobile.getText(findTestObject('Object Repository/Registrasi Pasien/plaintext_kota'), 0)

Mobile.verifyEqual(w, '327'+randomInt)

Mobile.verifyEqual(x, 'ibu '+randomString)

Mobile.verifyEqual(y, a)

Mobile.verifyEqual(z, b)