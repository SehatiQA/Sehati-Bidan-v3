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

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ANC/Keadaan Ibu/chips_kista'), 'checked', 'false', 0)

Mobile.tap(findTestObject('Object Repository/ANC/Keadaan Ibu/chips_kista'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ANC/Keadaan Ibu/chips_kista'), 'checked', 'true', 0)

Mobile.tap(findTestObject('Object Repository/ANC/Keadaan Ibu/chip_gakada'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ANC/Keadaan Ibu/chips_kista'), 'checked', 'false', 0)