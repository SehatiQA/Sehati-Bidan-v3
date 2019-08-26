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

Mobile.tap(findTestObject('Object Repository/Home/list_pasien1_jadwalkunjunganA'), 0)

Mobile.scrollToText('Riwayat alergi')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_datapasangan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/radiobutton_belumMenikah'), 0)

Mobile.scrollToText('Pekerjaan saat ini')

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpan'), 0)

Mobile.scrollToText('Apakah ibu sudah menikah')

String charset = ('a'..'z').join()
Integer length = 4
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/Data Pasangan/field_nama'), randomString, 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/field_tanggalLahir'), 0)

Mobile.swipe(395, 1314, 395, 2000)

Mobile.swipe(886, 1314, 886, 2000)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

String x = ('1'..'9').join()
Integer y = 8
String z = RandomStringUtils.random(y, x.toCharArray())

Mobile.setText(findTestObject('Object Repository/Data Pasangan/field_noHp'), '0818' + z, 0)

Mobile.scrollToText('Golongan Darah')

Mobile.tap(findTestObject('Object Repository/Data Pasangan/field_goldar'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/goldar_AB'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/radiobutton_rhesusNegatif'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/field_agama'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/agama_buddha'), 0)

Mobile.scrollToText('Pekerjaan saat ini')

Mobile.tap(findTestObject('Object Repository/Data Pasangan/field_pendidikanTerakhir'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/pendidikan_D2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/field_pekerjaan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/pekerjaan_pegawaiProfesional'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpan'), 0)

Mobile.scrollToText('Apakah ibu sudah menikah')

Mobile.tap(findTestObject('Object Repository/Data Pasangan/radiobutton_sudahMenikah'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/field_nama'), 0)

Mobile.swipe(395, 1314, 395, 2000)

Mobile.swipe(886, 1314, 886, 2000)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

Mobile.scrollToText('Pekerjaan saat ini')

Mobile.tap(findTestObject('Object Repository/Data Pasangan/radiobutton_rhesusPositif'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpan'), 0)