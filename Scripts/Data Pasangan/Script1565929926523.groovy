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

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Home/list_pasien1_jadwalkunjunganA'), 0)

Mobile.scrollToText('Riwayat alergi')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_datapasangan1'), 0)

Mobile.tap(findTestObject('Data Pasangan/radioBt-belummenikah'), 0)

String charset = ('a'..'z').join()
Integer length = 4
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Data Pasangan/field_namaPasangan'), randomString, 0)

Mobile.tap(findTestObject('Data Pasangan/field_tglLahir'), 0)

Mobile.delay(3)

Mobile.swipe(395, 1314, 395, 2000)

Mobile.swipe(886, 1314, 886, 2000)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/field/button_simpanTgl'), 0)

String x = ('1'..'9').join()
Integer y = 8
String z = RandomStringUtils.random(y, x.toCharArray())

Mobile.setText(findTestObject('Data Pasangan/field_phoneNumber'), '0818'+z, 0)

Mobile.scrollToText('Agama')

Mobile.tap(findTestObject('Data Pasangan/field_goldar'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/goldar_AB'), 0)

Mobile.tap(findTestObject('Data Pasangan/radioBt-rhesusnegativ'), 0)

Mobile.tap(findTestObject('Data Pasangan/field_agama'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/agama_buddha'), 0)

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Data Pasangan/field_pendidikanterakhir'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/pendidikan_D2'), 0)

Mobile.tap(findTestObject('Data Pasangan/field_pekerjaan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/pekerjaan_pegawaiProfesional'), 0)

Mobile.tap(findTestObject('Data Pasangan/button_simpan'), 0)

Mobile.scrollToText('Apakah ibu sudah menikah')

Mobile.tap(findTestObject('Data Pasangan/radioBt-sudahmenikah'), 0)

Mobile.setText(findTestObject('Data Pasangan/field_namaPasangan'), 'Parjo'+randomString, 0)

Mobile.tap(findTestObject('Data Pasangan/field_tanggalPernikahan'), 0)

Mobile.swipe(395, 1314, 395, 2000)

Mobile.swipe(886, 1314, 886, 2000)

Mobile.tap(findTestObject('Object Repository/Data Pasangan/field/button_simpanTgl'), 0)

Mobile.scrollToText('Pekerjaan saat ini')

Mobile.tap(findTestObject('Data Pasangan/radioBt-rhesusnegativ'), 0)

Mobile.tap(findTestObject('Data Pasangan/button_simpan'), 0)

Mobile.delay(5)

Mobile.closeApplication()