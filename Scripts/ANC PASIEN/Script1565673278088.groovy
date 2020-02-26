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

Mobile.tap(findTestObject('ANC/android.view.ViewGroup5AsuhanKehamilan'), 0)

Mobile.tap(findTestObject('ANC/Pilih Pasien ANC/android.view.ViewGroup12 pasien list 2'), 0)

not_run: Mobile.tap(findTestObject('ANC/Waktu Kunjungan/android.widget.EditText0WaktuPemeriksaan - Cth 23 September 2017'), 
    0)

not_run: Mobile.swipe(395, 1314, 395, 2000)

not_run: Mobile.tap(findTestObject('Date Picker/Button Simpan Tanggal'), 0)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - SelanjutnyaWaktuPemeriksaan'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/android.widget.RadioButton1 Adakah penyakit yang dialami ibu saat hamil ini - Ada (1)'), 
    0)

Mobile.tap(findTestObject('ANC/Penyakit/com.google.android.material.chip.Chip3 - Malaria'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/android.widget.RadioButton3 Apakah Pasien Ibu merokok - Ya'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/android.widget.RadioButton5 Apakah ada Keluarga Pasien Ibu merokok di rumah - Ya'), 
    0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/android.widget.RadioButton5 Apakah Pasien Ibu meminum alkohol - Ya'), 0)

Mobile.swipe(1000, 1200, 1000, 300)

Mobile.tap(findTestObject('ANC/Kesehatan/android.widget.Button0 Kesehatan - Selanjutnya (1)'), 0)

Mobile.tap(findTestObject('ANC/android.widget.RadioButton1 Adakah keluhan ibu hari ini - Ada'), 0)

Mobile.tap(findTestObject('ANC/Keluhan/com.google.android.material.chip.Chip0 Keluhan - Keputihan tidak normal'), 0)

Mobile.tap(findTestObject('ANC/Keluhan/android.widget.Button0 Keluhan  - Selanjutnya'), 0)

Mobile.setText(findTestObject('ANC/GPA/android.widget.EditText0 - Cth  1 Gravida'), '2', 0)

Mobile.setText(findTestObject('ANC/GPA/android.widget.EditText1 - Cth  1 Para'), '1', 0)

Mobile.setText(findTestObject('ANC/GPA/android.widget.EditText2 - Cth  0 Abortus'), '0', 0)

Mobile.tap(findTestObject('ANC/GPA/android.widget.EditText3 Waktu persalinan terakhir - Cth 23 September 2017'), 0)

Mobile.swipe(395, 1314, 395, 2000)

Mobile.swipe(510, 1314, 510, 2000)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.widget.Button0 - SimpanTanggal'), 0)

Mobile.tap(findTestObject('ANC/RIWAYAT PERSALINAN/android.widget.RadioButton0 - Riwayat bayi prematur - Tidak pernah'), 
    0)

Mobile.tap(findTestObject('ANC/RIWAYAT PERSALINAN/android.widget.RadioButton3  Riwayat bayi besar - Pernah'), 0)

Mobile.swipe(1000, 1200, 1000, 300)

Mobile.tap(findTestObject('ANC/RIWAYAT PERSALINAN/android.widget.RadioButton3 Persalinan caesar - Pernah'), 0)

Mobile.swipe(1000, 1200, 1000, 300)

Mobile.tap(findTestObject('ANC/GPA/android.widget.RadioButton8 Riwayat melahirkan dengan manual placenta - Tidak pernah'), 
    0)

Mobile.tap(findTestObject('ANC/GPA/android.widget.RadioButton11 Riwayat transfusi darah selama kehamilan dan persalinan - Pernah'), 
    0)

Mobile.tap(findTestObject('android.widget.Button0 GPA - Selanjutnya'), 0)

