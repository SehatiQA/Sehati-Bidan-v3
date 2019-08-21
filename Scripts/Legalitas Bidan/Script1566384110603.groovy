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

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Object Repository/ProfilBidan/LegalitasBidan'), 0)

String charset = ('1'..'9').join()
Integer length = 16
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.tap(findTestObject('Object Repository/Legalitas Bidan/field_expSTR'), 0)

Mobile.delay(2)

Mobile.swipe(471, 1164, 475, 809)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.widget.Button0 - SimpanTanggal'), 0)

Mobile.setText(findTestObject('Object Repository/Legalitas Bidan/field_STR'), randomString, 0)

Mobile.scrollToText('Kirim Dokumen')

Mobile.setText(findTestObject('Object Repository/Legalitas Bidan/field_SIPB'), randomString, 0)

Mobile.setText(findTestObject('Object Repository/Legalitas Bidan/field_IBI'), randomString, 0)

Mobile.tap(findTestObject('Object Repository/Legalitas Bidan/button_KirimDokumen'), 0)







