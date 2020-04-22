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

passwordbaru = 'qwerty123'

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Home/NavDrawer - Pengaturan2'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan/section_gantipassword'), 0)

Mobile.setText(findTestObject('Object Repository/Pengaturan/Atur Kata Sandi/field_password'), passwordbaru, 0)

Mobile.setText(findTestObject('Object Repository/Pengaturan/Atur Kata Sandi/field_passwordulang'), passwordbaru, 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan/Atur Kata Sandi/button_simpanPassword'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Pengaturan/section_logout'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Welcome Screen/button_saya_sudah_punya_akun'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_nomor'), GlobalVariable.phone, 0)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/LOGIN BIDAN/btn_masuk'), 0)

Mobile.delay(3)

Mobile.clearText(findTestObject('Object Repository/LOGIN BIDAN/field_password'), 0)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_password'), passwordbaru, 0)

Mobile.tap(findTestObject('Object Repository/LOGIN BIDAN/btn_masuk'), 0)

Mobile.delay(3)

////////////////////////

Mobile.verifyElementExist(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Home/NavDrawer - Pengaturan2'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan/section_gantipassword'), 0)

Mobile.setText(findTestObject('Object Repository/Pengaturan/Atur Kata Sandi/field_password'), GlobalVariable.password, 0)

Mobile.setText(findTestObject('Object Repository/Pengaturan/Atur Kata Sandi/field_passwordulang'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan/Atur Kata Sandi/button_simpanPassword'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan/section_logout'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Welcome Screen/button_saya_sudah_punya_akun'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_nomor'), GlobalVariable.phone, 0)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/LOGIN BIDAN/btn_masuk'), 0)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/Menu Burger'), 0)