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

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Home/NavDrawer - Daftar Ibu'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasiens'), GlobalVariable.kehamilankecil, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(4)

Mobile.scrollToText('Lihat riwayat faktor risiko')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_datadiri'), 0)

Mobile.delay(3)

String charset = ('a'..'z').join()
Integer length = 4
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_tglLahir'), 0)

Mobile.delay(2)

Mobile.swipe(1060, 1500, 1060, 1800)

Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

String charsets = ('1'..'9').join()
Integer lengths = 8
Integer lengthss = 16

String randomktp = RandomStringUtils.random(lengthss, charsets.toCharArray())

Mobile.setText(findTestObject('Object Repository/Data Diri Pasien/field/field_ktp'), randomktp, 0)

String randomphone = RandomStringUtils.random(lengths, charsets.toCharArray())
	
Mobile.setText(findTestObject('Object Repository/Data Diri Pasien/field/field_phoneNumber'), '0812'+randomphone, 0)

Mobile.setText(findTestObject('Object Repository/Data Diri Pasien/field/field_email'), randomString+'@mailinator.com', 0)

Mobile.scrollToText('Golongan Darah')	

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_goldar2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_goldar_a'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_goldar2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_goldar_b'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field/field_agama2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_agama_buddha'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field/field_agama2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_agama_hindu'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_tidaksekolah'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_sd'), 0)

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_IRT'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_buruh'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/button_Simpans'), 0)

Mobile.delay(3)

///////////////

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/tab_alamat'), 0)

Mobile.delay(1)

Mobile.scrollToText('SIMPAN')

Mobile.setText(findTestObject('Object Repository/Data Diri Pasien/field_on_alamat_tab/field_alamat'), 'jalan '+randomString, 0)

Mobile.tap(findTestObject('Data Diri Pasien/button_Simpans'), 0)

////////////

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Global/button_back'), 0)

Mobile.delay(3)

Mobile.scrollToText('Riwayat Alergi')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_datadiri'), 0)

Mobile.delay(2)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Data Diri Pasien/field/field_ktp'), 'text', randomktp, 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Data Diri Pasien/field/field_phoneNumber'), 'text', '0812'+randomphone, 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Data Diri Pasien/field/field_email'), 'text', randomString+'@mailinator.com', 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/tab_alamat'), 0)

Mobile.delay(1)

Mobile.scrollToText('SIMPAN')

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Data Diri Pasien/field_on_alamat_tab/field_alamat'), 'text', 'jalan '+randomString, 0)