import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.media.control.MpegAudioControl

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUIs
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.tap(findTestObject('Object Repository/Home/section_asuhanPersalinan'), 0)

Mobile.tap(findTestObject('ANC/Pilih Pasien ANC/android.view.ViewGroup12 pasien list 2'), 0)

Mobile.tap(findTestObject('Object Repository/INC/section_observasi'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/option_incObservasi_30min'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Tanggal Kunjungan/field_tanggalPemeriksaanObservasi'), 0)

//Mobile.swipe(221, 814, 221, 1184)

Mobile.tap(findTestObject('INC/Observasi/Tanggal Kunjungan/button_simpanTgl'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Tanggal Kunjungan/field_jamPemeriksaanObservasi'), 0)

//Mobile.swipe(331, 814, 331, 1184)

Mobile.tap(findTestObject('INC/Observasi/Tanggal Kunjungan/button_simpanTgl'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/button_selanjutnya'), 0)

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Tanda Vital/field_denyutNadi'), '20', 0)

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Tanda Vital/field_jumlahKontraksi'), '20', 0)

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Tanda Vital/field_kontraksiDalamMenit'), '20', 0)

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Tanda Vital/field_kontraksiDurasiDetik'), '20', 0)

Mobile.scrollToText('Selanjutnya')

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Tanda Vital/field_detakJantungJanin'), '20', 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/button_selanjutnya'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Obat/section_tambahObat'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Obat/field_pilihObat'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Obat/option_MgSO4'), 0)

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Obat/field_dosisObat'), '99', 0)

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Obat/field_jumlahTetes'), '88', 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Obat/button_simpanObat'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Obat/section_tambahObat'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Obat/field_pilihObat'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Obat/option_lainnya'), 0)

String charset = ('a'..'z').join()
Integer length = 9
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Obat/lainnya/field_namaObat'), randomString, 0)

Mobile.setText(findTestObject('Object Repository/INC/Observasi/Obat/lainnya/field_jumlah'), '88', 0)

Mobile.tap(findTestObject('INC/Observasi/Obat/lainnya/option_satuan_Ml'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/Obat/button_simpanObat'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Observasi/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_kista'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat Penyakit/chips_hepatitis'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('INC/Observasi/Konseling/button_lihatUlasan'), 0)

Mobile.tap(findTestObject('INC/Observasi/Ulasan/checkbox_sayaYakin'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.scrollToText('Tidak, Pemeriksaan Pasien Sudah Selesai')