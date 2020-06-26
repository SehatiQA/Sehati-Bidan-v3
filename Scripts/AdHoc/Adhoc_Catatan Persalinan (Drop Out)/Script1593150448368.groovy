import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.ssl.util.UTF8 as UTF8
import org.apache.http.client.methods.HttpHead as HttpHead
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.object_return as object_return
import org.junit.After as After
import org.seleniumhq.jetty9.http.HttpHeader as HttpHeader
import com.googlecode.javacv.cpp.postproc as postproc
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.xml.internal.org.jvnet.mimepull.DataFile as DataFile
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import groovy.json.JsonSlurper as JsonSlurper
import java.util.Map as Map
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.HttpBodyContent as HttpBodyContent
import com.kms.katalon.core.testobject.RestRequestObjectBuilder as RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpFileBodyContent as HttpFileBodyContent
import com.kms.katalon.core.testobject.impl.HttpFormDataBodyContent as HttpFormDataBodyContent
import com.kms.katalon.core.testobject.impl.HttpUrlEncodedBodyContent as HttpUrlEncodedBodyContent
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Home/Button INC Beranda'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/tab_bersalin'), 0)

//Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)
//
//Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasiens'), GlobalVariable.ibu, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/INC/section_catatanPersalinan'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Persalinan/radio_bersalinDiluar'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Persalinan/field_jumlahJanin'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Persalinan/opt_jumlahJanin1'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.delay(1)

Mobile.tapAtPosition(700, 1350)

//Mobile.tap(findTestObject('Object Repository/INC/Catatan Persalinan/modal_dropout/button_ya'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Persalinan/Dropout/radio_lainnya'), 0)

String charset = ('a'..'z').join()
Integer length = 13
String randomString = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('Object Repository/INC/Catatan Persalinan/Dropout/field_alasanlainnya'), 'alasan '+randomString, 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Persalinan/Dropout/button_simpan'), 0)

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/button_call'), 0)

//Mobile.delay(1)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/field_jumlahJanin'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_tidaksekolah'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/button_selanjutnya'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/field_tglLahirBayi'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/field_jamLahirBayi'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/button_selanjutnya'), 0)
//
//Mobile.setText(findTestObject('Object Repository/Profile Pasien/IUFD/field_namaBayi'), 'anak '+randomString, 0)
//
//Mobile.setText(findTestObject('Object Repository/Profile Pasien/IUFD/field_usiaBayi'), '32', 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/field_caraPersalinan'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_tidaksekolah'), 0)
//
//Mobile.scrollToText('Perempuan')
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/field_penolongPersalinan'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_tidaksekolah'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/field_tempatPersalinan'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Data Diri Pasien/field/option_pendidikan_tidaksekolah'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/radio_Lakilaki'), 0)
//
//Mobile.setText(findTestObject('Object Repository/Profile Pasien/IUFD/field_beratBayi'), '323', 0)
//
//Mobile.setText(findTestObject('Object Repository/Profile Pasien/IUFD/field_panjangBayi'), '32', 0)
//
//Mobile.scrollToText('BATAL')
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/button_selanjutnya'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/checkbox_sayaYakin'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/button_hasilKunjungan'), 0)
//
//Mobile.delay(5)
//
//Mobile.scrollToText('TUTUP')
//
//Mobile.tap(findTestObject('Object Repository/Profile Pasien/IUFD/button_tutup'), 0)
//
//Mobile.delay(5)
//
//Mobile.verifyElementText(findTestObject('Object Repository/Profile Pasien/title_ProfileIbu'), 'Profil Ibu')