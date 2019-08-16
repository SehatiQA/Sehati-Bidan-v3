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

Mobile.tap(findTestObject('Object Repository/Home/list_pasien1_jadwalkunjungan'), 0)

Mobile.scrollToText('Riwayat alergi')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_riwayatOperasi'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/chips_hemeroit'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/chips_operasidaerahvagina'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/chips_lainnya'), 0)

Mobile.setText(findTestObject('Object Repository/Riwayat Operasi/field_carioperasi'), 'operasi', 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/suggestionlist_operasi1'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/button_simpan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/button_x_selectedoperasi'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/chips_lainnya'), 0)

String charset = ('a'..'z').join()
Integer length = 9
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/Riwayat Operasi/field_carioperasi'), randomString, 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/section_tambahoperasi_manual'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/button_simpan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/button_x_selectedoperasi'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Operasi/button_simpan'), 0)