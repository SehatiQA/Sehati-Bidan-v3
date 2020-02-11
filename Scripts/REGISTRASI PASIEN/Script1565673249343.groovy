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

not_run: Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(2)

not_run: Mobile.tapAtPosition(1000, 2117)

not_run: Mobile.setText(findTestObject('Registrasi bidan/field_NoHp'), '085274037512', 
    0)

not_run: Mobile.setText(findTestObject('Registrasi bidan/android.widget.EditText3 - Buat kata sandi yang mudah diingat'), 
    '037512', 0)

not_run: Mobile.tap(findTestObject('Object Repository/LOGIN BIDAN/btn_masuk'), 0)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.view.ViewGroup20RegistrasiPasien'), 0)

Mobile.tap(findTestObject('android.widget.TextView1 - Ibu'), 0)

Mobile.setText(findTestObject('Registrasi Pasien/field_nameIbu'), findTestData('Registrasi Pasien').getValue(
        1, 1), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Pasien/field_noKTP'), findTestData('Registrasi Pasien').getValue(
        2, 1), 0)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.widget.EditText2tanggalLahirIbu - Contoh 1 January 1970'), 0)

Mobile.swipe(395, 1314, 395, 2000)

Mobile.swipe(886, 1314, 886, 2000)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.widget.Button0 - SimpanTanggal'), 0)

Mobile.swipe(1000, 1200, 1000, 300)

Mobile.tap(findTestObject('Registrasi Pasien/field_Provinsi'), 0)

Mobile.setText(findTestObject('Registrasi Pasien/cari/field_cariProvinsi'), findTestData(
        'Registrasi Pasien').getValue(3, 1), 0)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.widget.LinearLayout5Prov1'), 0)

Mobile.swipe(1000, 1200, 1000, 300)

Mobile.tap(findTestObject('ANC/KotaKabupaten/android.widget.FrameLayout6 Pilih KotaKabupaten'), 0)

Mobile.setText(findTestObject('ANC/KotaKabupaten/android.widget.EditText0 - Cari Kota. Ketik minimal 3 huruf'), findTestData(
        'Registrasi Pasien').getValue(4, 1), 0)

Mobile.tap(findTestObject('ANC/KotaKabupaten/android.widget.LinearLayout5HasilPencarianKotaKabupaten'), 0)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.widget.Button0 - SelanjutnyaRegistrasiIbu'), 0)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.widget.Button0DaftarIbu - Tambahkan Pasien Baru'), 0)

Mobile.setText(findTestObject('ANC/REGISTRASI PASIEN/android.widget.EditText0 - Nomor yang bisa nerima SMS'), findTestData(
        'Registrasi Pasien').getValue(5, 1), 0)

Mobile.tap(findTestObject('ANC/Kecamatan/android.widget.FrameLayout6 Pilih Kecamatan'), 0)

Mobile.setText(findTestObject('ANC/Kecamatan/android.widget.EditText0 - Cari Kecamatan. Ketik minimal 3 huruf'), findTestData(
        'Registrasi Pasien').getValue(6, 1), 0)

Mobile.tap(findTestObject('ANC/Kecamatan/android.widget.LinearLayout5HasilPencarianKecamatan'), 0)

Mobile.swipe(1000, 1200, 1000, 300)

Mobile.tap(findTestObject('ANC/DesaKelurahan/android.widget.EditText2 - Pilih Desa'), 0)

Mobile.setText(findTestObject('ANC/DesaKelurahan/android.widget.EditText0 - Cari DesaKelurahan. Ketik minimal 3 huruf'), 
    findTestData('Registrasi Pasien').getValue(7, 1), 0)

Mobile.tap(findTestObject('Registrasi bidan/HasilPencarianDesa1'), 0)

Mobile.swipe(1000, 1200, 1000, 300)

Mobile.setText(findTestObject('ANC/REGISTRASI PASIEN/android.widget.EditText3 - Alamat lengkap dengan nomor RTRW bila ada'), 
    findTestData('Registrasi Pasien').getValue(8, 1), 0)

Mobile.tap(findTestObject('ANC/REGISTRASI PASIEN/android.widget.Button0 DataIbu- Simpan'), 0)

