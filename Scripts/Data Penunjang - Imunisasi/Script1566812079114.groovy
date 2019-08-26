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
import org.junit.After

Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Home/list_pasien1_jadwalkunjunganA'), 0)

Mobile.scrollToText('Lihat data penunjang')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_lihatDataPenunjang'), 0)

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/section_Imunisasi'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Imunisasi/field_statusImunisasi'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Imunisasi/option_statusImunisasi_TT0_pemberianImunisasi_TidakDiberikan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Imunisasi/field_pemberianImunisasi'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Imunisasi/option_statusPemberianImunisasi_TT1'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Imunisasi/field_tanggalPemberianVaksin'), 0)

Mobile.swipe(210, 969, 210, 1055) //change date, back date 2days

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Imunisasi/checkbox_sayaYakin'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Imunisasi/button_simpan'), 0)