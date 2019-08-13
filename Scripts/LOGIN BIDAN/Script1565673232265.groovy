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

Mobile.startApplication('C:\\Users\\Sehati - Nita\\.jenkins\\workspace\\Bidan_v.3.0.0\\app\\build\\outputs\\apk\\debug\\app-universal-debug.apk', 
    false)

not_run: Mobile.tap(findTestObject('LOGIN BIDAN/android.widget.Button0 - Oke mengerti'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tapAtPosition(1000, 2117)

Mobile.setText(findTestObject('Registrasi bidan/android.widget.EditText2 - Nomor yang bisa nerima SMS'), '085274037512', 
    0)

Mobile.setText(findTestObject('Registrasi bidan/android.widget.EditText3 - Buat kata sandi yang mudah diingat'), '037512', 
    0)

Mobile.tap(findTestObject('LOGIN BIDAN/android.widget.Button0 - MASUK'), 0)

