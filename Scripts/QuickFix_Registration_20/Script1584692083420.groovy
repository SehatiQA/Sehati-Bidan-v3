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

Mobile.startApplication(GlobalVariable.appPath, true)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Welcome Screen/button_saya_sudah_punya_akun'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_nomor'), '081234567784', 0)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/LOGIN BIDAN/btn_masuk'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/NavDrawer - chevron 2 healthcare'), 0)