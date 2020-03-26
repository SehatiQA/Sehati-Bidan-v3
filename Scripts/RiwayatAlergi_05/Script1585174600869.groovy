import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('RiwayatAlergi_01'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Object Repository/Riwayat Alergi/field_alergiObat'), 0)

Mobile.clearText(findTestObject('Object Repository/Riwayat Alergi/field_alergiMakanan'), 0)

Mobile.clearText(findTestObject('Object Repository/Riwayat Alergi/field_alergiLainnya'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Alergi/button_simpan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Alergi/button_back'), 0)

Mobile.tap(findTestObject('Object Repository/Profile Pasien/section_riwayatAlergi'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Riwayat Alergi/field_alergiObat'), 'Contoh: Aspirin, Ranitidin')

Mobile.verifyElementText(findTestObject('Object Repository/Riwayat Alergi/field_alergiMakanan'), 'Contoh: Kepiting, Udang')

Mobile.verifyElementText(findTestObject('Object Repository/Riwayat Alergi/field_alergiLainnya'), 'Contoh: Debu, Cuaca')