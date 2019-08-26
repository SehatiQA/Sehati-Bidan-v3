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

Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.tap(findTestObject('Object Repository/Home/list_pasien1_jadwalkunjunganA'), 0)

Mobile.scrollToText('Riwayat alergi')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_riwayatKontrasepsi'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Kontrasepsi/button_hapus'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Kontrasepsi/FAB_plusicon'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Kontrasepsi/dropdown_pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Kontrasepsi/pilih_kondom'), 0)

String charset = ('1'..'9').join()
Integer length = 3
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/Riwayat Kontrasepsi/field_lamapemakaian'), randomString, 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Kontrasepsi/button_simpan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Kontrasepsi/button_ubah'), 0)

String charset2 = ('1'..'9').join()
Integer length2 = 3
String randomString2 = RandomStringUtils.random(length2, charset2.toCharArray())

Mobile.setText(findTestObject('Object Repository/Riwayat Kontrasepsi/field_lamapemakaian'), randomString2, 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Kontrasepsi/button_simpan'), 0)