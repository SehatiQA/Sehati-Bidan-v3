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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUIs
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Menu HamBurger/AkunSaya'), 0)

String charset = ('a'..'z').join()
Integer length = 7
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/ProfilBidan/field_nama'), randomString, 0)

Mobile.setText(findTestObject('Object Repository/ProfilBidan/field_email'), randomString + '@mailinator.com', 0)

Mobile.tap(findTestObject('Object Repository/ProfilBidan/field_tanggalLahir'), 0)

Mobile.swipe(1000, 1414, 1000, 2000)
Mobile.swipe(1000, 1414, 1000, 2000)
Mobile.swipe(1000, 1414, 1000, 2000)
Mobile.swipe(1000, 1414, 1000, 2000)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Object Repository/ProfilBidan/button_simpan'), 0)

Mobile.delay(2)

Mobile.scrollToText('Nama Lengkap')

String charset2 = ('1'..'9').join()
Integer length2 = 8
String randomString2 = RandomStringUtils.random(length2, charset2.toCharArray())

Mobile.setText(findTestObject('Object Repository/ProfilBidan/field_noHp'), '0812' + randomString2, 0)