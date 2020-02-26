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

Mobile.tap(findTestObject('null'), 0)

Mobile.scrollToText('Riwayat Alergi')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_datadiri'), 0)

Mobile.delay(3)

String charset = ('a'..'z').join()
Integer length = 4
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Data Diri Pasien/field/field_name2'), 'ibu '+randomString, 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_tglLahir'), 0)

Mobile.delay(2)

Mobile.swipe(957, 1500, 957, 1800)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/button_simpanTgl'), 0)

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

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_goldar2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_goldar_ab'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_goldar2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_goldar_o'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field/field_agama2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_agama_buddha'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field/field_agama2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_agama_hindu'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field/field_agama2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_agama_islam'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field/field_agama2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_agama_katolik'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field/field_agama2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_agama_konghucu'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field/field_agama2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/opt_agama_protestan'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_tidaksekolah'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_sd'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_smp'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_sma'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_d1'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_d2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_pendidikanterakhir2'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_d3'), 0)

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_IRT'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_buruh'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_pegawaikantoran'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_pegawaiprofesional'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_pekerjakasar'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_petani'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/field_job'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_job_wirausaha'), 0)

Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/button_simpan'), 0)

Mobile.delay(5)

Mobile.closeApplication()