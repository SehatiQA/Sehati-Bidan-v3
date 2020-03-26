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

Mobile.delay(4)

Mobile.scrollToText('Lihat data penunjang')

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/section_Lab'), 0)

Mobile.delay(4)
def a = Mobile.verifyElementExist(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_hapus1'), 0)
int b = 3;
for (int i=0;i<b;i++)

if (a == true) {
	Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_hapus1'), 0)
}

//else {
//	Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/section_TambahPemeriksaanLab'), 0)
//}

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/section_TambahPemeriksaanLab'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_pilihLab'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/option_BTA'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_tglPemeriksaan'), 0)

Mobile.swipe(444, 1400, 444, 1950) //change date, back date 1days

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/radioBt_negative'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_selesai'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/section_TambahPemeriksaanLab'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_pilihLab'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/option_rhesus'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_tglPemeriksaan'), 0)

Mobile.swipe(444, 1400, 444, 1950) //change date, back date 1days

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/radioBt_positive'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_selesai'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/section_TambahPemeriksaanLab'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_pilihLab'), 0)

Mobile.swipe(700, 2000, 700, 900)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/option_Lainnya'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_tglPemeriksaan'), 0)

Mobile.swipe(444, 1400, 444, 1950) //change date, back date 1days

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

String charset = ('a'..'z').join()
Integer length = 5
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_jenisPemeriksaan'), randomString, 0)

Mobile.setText(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_hasilPemeriksaan'), randomString, 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_selesai'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/section_selectedLab1'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/field_tglPemeriksaan'), 0)

Mobile.swipe(444, 1400, 444, 1950) //change date, back date 1days

Mobile.tap(findTestObject('Object Repository/Data Pasangan/button_simpanTgl'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_selesai'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_hapus1'), 0)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/checkbox_sayaYakin'), 0)

Mobile.scrollToText('Selesai')

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_selesai'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_hapus2'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Data Penunjang/Laboratorium/button_hapus1'), 0)