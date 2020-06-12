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

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Home/Button INC Beranda'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasiens'), 'Autometod Pusing Njir', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/INC/section_observasi'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/option_incObservasi_4jam'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Tanggal Kunjungan/field_tanggalPemeriksaanObservasi'), 0)

Mobile.tap(findTestObject('Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Tanggal Kunjungan/field_jamPemeriksaanObservasi'), 0)

Mobile.tap(findTestObject('Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

//sistolic
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field1'), '100', 0)

//suhu
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field2'), '30', 0)

//diastolic
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field3'), '31', 0)

//handling for cursor autoactive on diastolic field
Mobile.tap(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field4'), 0)
Mobile.hideKeyboard()

//respirasi
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field4'), '33', 0)

//denyut nadi
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field5'), '34', 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

//kontraksi
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field1'), '19', 0)

//dalam menit
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field2'), '18', 0)

//dalam detik
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field3'), '17', 0)

//DJJ
Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field4'), '32', 0)

Mobile.scrollToText('SELANJUTNYA')

/////////////////
///*PLEASE REMOVE THIS IF [B080520-01] WAS FIX*/
//Mobile.setText(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/field5'), '32', 0)
/////////////////

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

//tap portio field
Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field1'), 0)
//pilih option ke-3
Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

//pembukaan
Mobile.setText(findTestObject('Object Repository/ANC/Antropometri/field2'), '3', 0)

//tap air ketuban
Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field3'), 0)
//pilih option ke-3
Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

//pilih radio button ke 0 (sisi kiri)
Mobile.tap(findTestObject('Object Repository/INC/Observasi/4Jam/Tanda Vital/radio_konjungtiva_tdk_normal'), 0)

Mobile.scrollToText('Pengeluaran Urine')

//tap presentasi janin
Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field1'), 0)
//pilih option ke-3
Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

//tap moulage
Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field2'), 0)
//pilih option ke-3
Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

//tap station
Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field3'), 0)
//pilih option ke-3
Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

//field pengeluaran urine
Mobile.setText(findTestObject('Object Repository/ANC/Antropometri/field4'), '32', 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/KONSELING/cKonseling yang Diberikan - Tanda Bahaya'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/button_lihatUlasan'), 0)


//action di halaman ulasan
Mobile.scrollToText('BATAL')

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Ulasan/checkbox_sayaYakin'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Ulasan/button_hasilKunjungan'), 0)

Mobile.delay(10)
////


b = Mobile.getText(findTestObject('Object Repository/INC/Observasi/Hasil Kunjungan/copy_namaIbu'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/INC/Observasi/Hasil Kunjungan/copy_namaIbu'), 'text', b, 0)

Mobile.scrollToText('TUTUP')

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Hasil Kunjungan/button_tutup'), 0)

Mobile.delay(15)

Mobile.verifyElementExist(findTestObject('Object Repository/INC/section_observasi'), 0)