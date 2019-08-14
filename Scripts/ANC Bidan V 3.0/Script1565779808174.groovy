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

Mobile.startApplication('C:\\Users\\Sehati-Adel\\Downloads\\bidan-app-universal-debug-3.0 (1).apk', false)

Mobile.tap(findTestObject('ANC/Beranda/android.view.ViewGroup6'), 0)

Mobile.tap(findTestObject('ANC/Beranda/Ibu Aisyah'), 0)

Mobile.tap(findTestObject('ANC/Date Picker/Date Picker Waktu Kunjungan'), 0)

Mobile.tap(findTestObject('ANC/Date Picker/Button Simpan Tanggal'), 0)

Mobile.tap(findTestObject('ANC/Waktu Kunjungan/Button Selanjutnya Waktu Pemeriksaan'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/Radio Button Keadaan Ibu - Ada'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/Chips Keadaan Ibu - Asma'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/Chips Keadaan Ibu - Ketuban Pecah Dini'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/Radio Button Keadaan Ibu - Tidak'), 0)

Mobile.scrollToText('Selanjutnya', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/Radio Button Keadaan Ibu - Ya'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/Radio Button Keadaan Ibu - Tidak (1)'), 0)

Mobile.tap(findTestObject('ANC/Keadaan Ibu/Button Selanjutnya Keadaan Ibu'), 0)

Mobile.tap(findTestObject('ANC/Keluhan Ibu/Radio Button Keluhan Ibu - Ada'), 0)

Mobile.tap(findTestObject('ANC/Keluhan Ibu/Chips Keluhan Ibu - Demam Tinggi'), 0)

Mobile.tap(findTestObject('ANC/Keluhan Ibu/Chips Keluhan Ibu - Diare'), 0)

Mobile.tap(findTestObject('ANC/Keluhan Ibu/Chips Keluhan Ibu - Mual muntah berlebihan'), 0)

Mobile.scrollToText('Selanjutnya', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ANC/Keluhan Ibu/Button Selanjutnya Keluhan Ibu'), 0)

Mobile.tap(findTestObject('ANC/GPA/Field Gravida'), 0)

Mobile.setText(findTestObject('ANC/GPA/Set Text Gravida'), '1', 0)

Mobile.tap(findTestObject('ANC/GPA/Field Para'), 0)

Mobile.setText(findTestObject('ANC/GPA/Set Text Para'), '0', 0)

Mobile.tap(findTestObject('ANC/GPA/Field Abortus'), 0)

Mobile.setText(findTestObject('ANC/GPA/Set Text Abortus'), '0', 0)

Mobile.tap(findTestObject('ANC/GPA/Button Selanjutnya GPA'), 0)

Mobile.tap(findTestObject('ANC/Date Picker/Date Picker Prakiraan HPHT'), 0)

Mobile.tap(findTestObject('ANC/Date Picker/Button Simpan Tanggal'), 0)

Mobile.tap(findTestObject('ANC/HPHT/Field Siklus Haid'), 0)

Mobile.setText(findTestObject('ANC/HPHT/Set Text Siklus Haid'), '25', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ANC/HPHT/Button Lihat Taksiran Persalinan'), 0)

Mobile.tap(findTestObject('ANC/HPHT/Button Selanjutnya Taksiran Persalinan'), 0)

Mobile.tap(findTestObject('ANC/Antropometri/Field Tinggi Badan'), 0)

Mobile.setText(findTestObject('ANC/Antropometri/Set Text Tinggi Badan'), '160', 0)

Mobile.tap(findTestObject('ANC/Antropometri/Field Berat Badan'), 0)

Mobile.setText(findTestObject('ANC/Antropometri/Set Text Berat Badan'), '63', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ANC/Antropometri/Field Tekanan Darah - Sistol'), 0)

Mobile.setText(findTestObject('ANC/Antropometri/Set Text Tekanan Darah - Sistol'), '76', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ANC/Antropometri/Field Tekanan Darah - Diastol'), 0)

Mobile.setText(findTestObject('ANC/Antropometri/Set Text Tekanan Darah - Diastol'), '85', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Denyut Nadi', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ANC/Antropometri/Field Suhu Tubuh'), 0)

Mobile.setText(findTestObject('ANC/Antropometri/Set Text Suhu Tubuh'), '36', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ANC/Antropometri/Field Respirasi'), 0)

Mobile.setText(findTestObject('ANC/Antropometri/Set Text Respirasi'), '25', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ANC/Antropometri/Field Denyut Nadi'), 0)

Mobile.setText(findTestObject('ANC/Antropometri/Set Text Denyut Nadi'), '70', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ANC/Antropometri/Field Lingkar Lengan Atas'), 0)

Mobile.setText(findTestObject('ANC/Antropometri/Set Text Lingkar Lengan Atas'), '24', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Selanjutnya', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ANC/Antropometri/Radio Button Konjungtiva - Normal'), 0)

Mobile.tap(findTestObject('ANC/Antropometri/Button Selanjutnya Antropometri'), 0)

Mobile.tap(findTestObject('ANC/Obstetri/Dropdown Pemeriksaan Abdomen'), 0)

Mobile.tap(findTestObject('ANC/Obstetri/Set Dropdown Pemeriksaan Abdomen - Ballotemen Teraba'), 0)

Mobile.tap(findTestObject('ANC/Obstetri/Radio Button Detak Jantung Janin - Terdengar'), 0)

Mobile.tap(findTestObject('ANC/Obstetri/Field Detak Jantung Janin'), 0)

Mobile.setText(findTestObject('ANC/Obstetri/Set Text Detak Jantung Janin'), '135', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ANC/Obstetri/Button Selanjutnya Obstetri'), 0)

Mobile.tap(findTestObject('ANC/Pemeriksaan Ekstrimitas/Dropdown Varises Ekstrimitas'), 0)

Mobile.tap(findTestObject('ANC/Pemeriksaan Ekstrimitas/Set Dropdown Varises Ekstrimitas'), 0)

Mobile.tap(findTestObject('ANC/Pemeriksaan Ekstrimitas/Dropdown Refleks Patela'), 0)

Mobile.tap(findTestObject('ANC/Obstetri/Set Dropdown Pemeriksaan Abdomen - Ballotemen Teraba'), 0)

Mobile.tap(findTestObject('ANC/Pemeriksaan Ekstrimitas/Dropdown Oedema'), 0)

Mobile.tap(findTestObject('ANC/Pemeriksaan Ekstrimitas/Set Dropdown Oedema'), 0)

Mobile.tap(findTestObject('ANC/Pemeriksaan Ekstrimitas/Button Selanjutnya Pemeriksaan Ekstrimitas'), 0)

Mobile.tap(findTestObject('ANC/Status Imunisasi/Dropdown Status Imunisasi TT'), 0)

Mobile.tap(findTestObject('ANC/Status Imunisasi/Set Dropdown Status Imunisasi TT'), 0)

Mobile.tap(findTestObject('ANC/Status Imunisasi/Dropdown Pemberian Imunisasi TT'), 0)

Mobile.tap(findTestObject('ANC/Status Imunisasi/Set Dropdown Pemberian Imunisasi TT'), 0)

Mobile.tap(findTestObject('ANC/Status Imunisasi/Button Selanjutnya Status Imunisasi'), 0)

Mobile.tap(findTestObject('ANC/Konseling/Chips Konseling - Tanda Persalinan'), 0)

Mobile.tap(findTestObject('ANC/Konseling/Chips Konseling - Persiapan Laktasi'), 0)

Mobile.tap(findTestObject('ANC/Konseling/Chips Konseling - Persiapan Persalinan'), 0)

Mobile.tap(findTestObject('ANC/Date Picker/Date Picker Jadwal Kunjungan Kembali'), 0)

Mobile.tap(findTestObject('ANC/Date Picker/Button Simpan Tanggal'), 0)

Mobile.tap(findTestObject('ANC/Ulasan/Button - Lihat Ulasan'), 0)

Mobile.tap(findTestObject('ANC/Ulasan/CheckBox - Saya yakin dengan data yang sudah saya isi'), 0)

Mobile.tap(findTestObject('ANC/Ulasan/Button - Hasil Kunjungan'), 0)

Mobile.closeApplication()

