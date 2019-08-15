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

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_riwayatPenyakit'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_kista'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_hepatitis'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_IMS'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_TBC'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_riwayatkecelakaan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_riwayatkejiwaan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_miomauteri'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_addlainnya'), 0)

Mobile.setText(findTestObject('Object Repository/Riwayat Penyakit/field_caripenyakit'), 'Kuda', 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/suggestionlist_penyakit1'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/button_simpan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/button_x_selectedpenyakitmanual'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/button_simpan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_addlainnya'), 0)

String charset = ('a'..'z').join()
Integer length = 9
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/Riwayat Penyakit/field_caripenyakit'), randomString, 0)

Mobile.tap(findTestObject('Riwayat Penyakit/section_tambahpenyakit_manual'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/button_simpan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/button_x_selectedpenyakitmanual'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/button_simpan'), 0)