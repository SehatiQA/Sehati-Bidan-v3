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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('RiwayatAlergi_01'), [:], FailureHandling.STOP_ON_FAILURE)

String charset = ('a'..'z').join()
Integer length = 6
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/Riwayat Alergi/field_alergiObat'), randomString, 0)

Mobile.setText(findTestObject('Object Repository/Riwayat Alergi/field_alergiMakanan'), randomString, 0)

Mobile.setText(findTestObject('Object Repository/Riwayat Alergi/field_alergiLainnya'), randomString, 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Alergi/button_back'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_riwayatAlergi'), 0)

a = Mobile.getText(findTestObject('Object Repository/Riwayat Alergi/field_alergiObat'), 0)

b = Mobile.getText(findTestObject('Object Repository/Riwayat Alergi/field_alergiMakanan'), 0)

c = Mobile.getText(findTestObject('Object Repository/Riwayat Alergi/field_alergiLainnya'), 0)

Mobile.verifyNotMatch(a, randomString, false)

Mobile.verifyNotMatch(b, randomString, false)

Mobile.verifyNotMatch(c, randomString, false)