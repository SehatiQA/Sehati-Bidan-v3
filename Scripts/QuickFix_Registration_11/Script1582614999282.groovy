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

Mobile.startApplication('C:\\Users\\Sehati - Rudi\\Documents\\app-universal-rc-quickfix.apk', true)

Mobile.delay(4)

Mobile.verifyElementExist(findTestObject('Object Repository/Welcome Screen/screentitle'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Welcome Screen/button_saya_sudah_punya_akun'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Welcome Screen/button_saya_mau_daftar'), 0)

Mobile.tap(1100, 1750)

Mobile.verifyElementText(findTestObject('Object Repository/Welcome Screen/buttomsheet_wa_tdk_ada/native_dialer'), '081318600070')