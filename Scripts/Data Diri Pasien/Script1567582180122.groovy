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

Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.tap(findTestObject('Data Diri Pasien/list_Pasien'), 0)

Mobile.scrollToText('Riwayat Alergi', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.swipe(395, 1314, 395, 2000)

not_run: Mobile.swipe(886, 2000, 886, 1314)

Mobile.tap(findTestObject('Data Diri Pasien/tap_datadiri'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field_name'), 0)

Mobile.clearText(findTestObject('Data Diri Pasien/field_name'), 0)

Mobile.setText(findTestObject('Data Diri Pasien/android.widget.EditText0 - Seno'), 'Berber', 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Data Diri Pasien/tap_tanggallahir'), 0)

not_run: Mobile.swipe(395, 1314, 395, 2000)

not_run: Mobile.swipe(886, 2000, 886, 1314)

not_run: Mobile.tap(findTestObject('Data Diri Pasien/android.widget.EditText1'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/tap - Simpan TTL'), 0)

//Mobile.tap(findTestObject('Data Diri Pasien/tap_nohp1'), 0)
Mobile.setText(findTestObject('Data Diri Pasien/tap_nohp1'), '0819283746587', 0)

not_run: Mobile.scrollToText('Pendidikan Terakhir', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.swipe(395, 1314, 395, 2000)

Mobile.swipe(886, 2000, 886, 1314)

not_run: Mobile.tap(findTestObject('Data Diri Pasien/tap_email3'), 0)

Mobile.setText(findTestObject('Data Diri Pasien/tap_email3'), 'bertania@mailinator.com', 0)

not_run: Mobile.hideKeyboard()

Mobile.tap(findTestObject('Data Diri Pasien/tap goldar 3'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/tap_B'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field_agama'), 0)

not_run: Mobile.swipe(395, 1314, 395, 2000)

not_run: Mobile.swipe(886, 1314, 886, 2000)

Mobile.tap(findTestObject('Data Diri Pasien/android.widget.TextView1 - Islam'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field_edukasi'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/android.widget.TextView6 - D2'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/field_pekerjaan'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/android.widget.TextView1 - Ibu Rumah Tangga'), 0)

Mobile.tap(findTestObject('Data Diri Pasien/android.widget.Button0 - Simpan (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

