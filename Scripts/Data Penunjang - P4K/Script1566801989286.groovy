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

Mobile.delay(4)

Mobile.tap(findTestObject('null'), 0)

Mobile.scrollToText('Lihat data penunjang')

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/section_P4K'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/field_tanggalPemeriksaan'), 0)

Mobile.swipe(444, 1400, 444, 1950) //change date, back date 1days

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/field_penolongPersalinan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/option_penolongPersalinan_bidan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/field_penolongPersalinan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/option_penolongPersalinan_dokter'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/field_tempatPersalinan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/option_tempatPersalinan_klinik'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/field_tempatPersalinan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/option_tempatPersalinan_bidanMandiri'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/field_tempatPersalinan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/option_tempatPersalinan_polindes'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/field_tempatPersalinan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/option_tempatPersalinan_puskesmas'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/field_tempatPersalinan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/option_tempatPersalinan_rumahSakit'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/checkbox_pendampingPersalinan_suami'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/checkbox_pendampingPersalinan_keluarga'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/checkbox_pendampingPersalinan_dukun'), 0)

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/radioBt_kendaraanUmum'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/radioBt_kendaraanPribadi'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/radioBt_calonPendonorKeluarga'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/radioBt_calonPendonorBukankeluarga'), 0)

String charset = ('a'..'z').join()
Integer length = 5
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/Data Penunjang/P4K/field_namaPendonor1'), randomString, 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/checkbox_sayaYakin1'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/P4K/button_simpan'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Data Penunjang/section_P4K'), 0)