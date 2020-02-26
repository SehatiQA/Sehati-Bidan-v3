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

Mobile.tap(findTestObject('null'), 0)

Mobile.scrollToText('Lihat data penunjang')

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_lihatDataPenunjang1'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/section_USG'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/field_tanggalPemeriksaan'), 0)

Mobile.swipe(443, 1414, 443, 1990) //change date, back date 2days

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/radioBt_JumlahJanin-Tunggal'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/radioBt_JumlahJanin-Gemili'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/radioBt_KelainanKongential-TidakAda'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/radioBt_KelainanKongential-Ada'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/field_letakJanin'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/option_letakJanin_Kepala'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/field_letakJanin'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/option_letakJanin_Sungsang'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/field_letakJanin'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/option_letakJanin_Lintang'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/field_letakPlasenta'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/option_letakPlasenta_Normal'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/field_letakPlasenta'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/option_letakPlasenta_LetakRendah'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/field_letakPlasenta'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/option_letakPlasenta_Marginalis'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/field_letakPlasenta'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/option_letakPlasenta_Parsialis'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/field_letakPlasenta'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/option_letakPlasenta_Totalis'), 0)

Mobile.scrollToText('Simpan')

String charset = ('1'..'4').join()
Integer length = 2
String randomInteger = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Data Penunjang/USG/field_usiaKehamilan_week'), randomInteger, 0)

Integer lengths = 1
String randomInteger2 = RandomStringUtils.random(lengths, charset.toCharArray())

Mobile.setText(findTestObject('Data Penunjang/USG/field_usiaKehamilan_day'), randomInteger2, 0)

Integer lengthz = 4
String randomInteger3 = RandomStringUtils.random(lengthz, charset.toCharArray())
Mobile.setText(findTestObject('Data Penunjang/USG/field_beratBadanJanin'), randomInteger3, 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/field_airKetuban'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/option_airKetuban_Cukup'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/field_airKetuban'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/option_airKetuban_Sedang'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/field_airKetuban'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/option_airKetuban_Kurang'), 0)

Mobile.tap(findTestObject('Data Penunjang/USG/checkbox_sayaYakin'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/USG/button_Simpan'), 0)