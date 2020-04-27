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
//
///*headers manager */
//TestObjectProperty header1 = new TestObjectProperty('Sehati-Product', ConditionType.EQUALS, 'midwife')
//
//TestObjectProperty header2 = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')
//
//TestObjectProperty header3 = new TestObjectProperty('Sehati-Platform', ConditionType.EQUALS, 'android')
//
//TestObjectProperty header4 = new TestObjectProperty('Sehati-App-Version', ConditionType.EQUALS, '3.2.0')
//
////TestObjectProperty header5 = new TestObjectProperty("Authorization", ConditionType.EQUALS, "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxMDMzOSwiZXhwaXJ5X2RhdGUiOjE1ODQwNzE4MzZ9.k5oXdztxKIYVHyMIwfpHATyVgt0cMLO89lGUV86RV_o")
//ArrayList defaultHeaders = Arrays.asList(header1, header2, header3, header4)
//
///*post body*/
//String body = '{"identifier": "0812345678917", "password": "qwerty"}'
//
//// Request POST CTG
//RequestObject ro = new RequestObject()
//
//ro.setRestUrl('https://id-staging.sehati.co/api/v3/login')
//
//ro.setBodyContent(new HttpTextBodyContent(body, 'UTF-8', 'application/json') //dont forget to set charset and content-type
//    )
//
//ro.setHttpHeaderProperties(defaultHeaders)
//
//ro.setRestRequestMethod('POST')
//
//Object res = WS.sendRequest(ro)
//
//// check response body
//String w = res.getResponseText()
//
//println(w)
//
//// get data.id value from json
//JsonSlurper slurper = new JsonSlurper()
//
//def parsedJson = slurper.parseText(w)
//
//assert parsedJson instanceof Map
//
//println(parsedJson.meta.token)
//
//token = parsedJson.meta.token
//
//println(token)
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////
//String charset = ('a'..'z').join()
//String intset = ('1'..'9').join()
//Integer length = 13
//String randomString = RandomStringUtils.random(length, charset.toCharArray())
//String randomInt = RandomStringUtils.random(length, intset.toCharArray())
//
//// POST Create new mother
//
//TestObjectProperty header1s = new TestObjectProperty('Sehati-Product', ConditionType.EQUALS, 'midwife')
//
//TestObjectProperty header2s = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json') //dont forget to use this one if you choose json as your post body
//
//TestObjectProperty header3s = new TestObjectProperty('Sehati-Platform', ConditionType.EQUALS, 'android')
//
//TestObjectProperty header4s = new TestObjectProperty('Sehati-App-Version', ConditionType.EQUALS, '3.2.0')
//
//TestObjectProperty header5s = new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + token)
//
//ArrayList defaultHeaderss = Arrays.asList(header1s, header2s, header3s, header4s, header5s)
//
///*post body*/
//String body_createmother = '''{"date_of_birth": "100000", "region_id": 34604, "address": "ini adalah nama jalans", "name": "Ibu ''' + randomString + '''"}'''
//
//println(randomString)
//
//RequestObject ro2 = new RequestObject()
//
//ro2.setRestUrl('https://id-staging.sehati.co/api/v3/healthcares/3875/mothers')
//
//ro2.setBodyContent(new HttpTextBodyContent(body_createmother, 'UTF-8', 'application/json')) //dont forget to set charset and content-type
//
//ro2.setHttpHeaderProperties(defaultHeaderss)
//
//ro2.setRestRequestMethod('POST')
//
//Object res2 = WS.sendRequest(ro2)
//
//String w2 = res2.getResponseText()
//
//println(w2)
//
//JsonSlurper slurpers = new JsonSlurper()
//
//def parsedJson2 = slurpers.parseText(w2)
//
//assert parsedJson2 instanceof Map
//
//mother_id = parsedJson2.data.id
//
//mother_name = parsedJson2.data.name
//
//println(mother_name)
//
//println(mother_id)

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Home/Button ANC Beranda'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasiens'), 'Automation Teraba', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/field_tanggal'), 0)

Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)
//
Mobile.tap(findTestObject('Object Repository/ANC/Keadaan Ibu/chip_gakada'), 0)
//
Mobile.scrollToText('SELANJUTNYA')
//
Mobile.tap(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_alkohol_no'), 0)
//
Mobile.tap(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_ibu_merokok_yes'), 0)
//
Mobile.tap(findTestObject('Object Repository/ANC/Keadaan Ibu/rb_kel_merokok_no'), 0)
//
Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)
//
Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/ANC/Keluhan Ibu/chips_tidak_ada'), 0)

Mobile.scrollToText('SELANJUTNYA')

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.delay(1)

//Mobile.verifyElementExist(findTestObject('Object Repository/ANC/GPA/field_G'), 0)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/ANC/GPA/field_P'), 0)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/ANC/GPA/field_A'), 0)
//
//Mobile.setText(findTestObject('Object Repository/ANC/GPA/field_G'), '1', 0)
//
//Mobile.setText(findTestObject('Object Repository/ANC/GPA/field_P'), '0', 0)
//
//Mobile.setText(findTestObject('Object Repository/ANC/GPA/field_A'), '0', 0)
//
//Mobile.scrollToText('SELANJUTNYA')
//
//Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)
//
//Mobile.setText(findTestObject('Object Repository/ANC/HPHT/field_siklusHaidz'), '23', 0)
//
//Mobile.tap(findTestObject('Object Repository/ANC/HPHT/field_HPHT'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)
//
//Mobile.tap(findTestObject('Object Repository/ANC/HPHT/button_lihatTaksiranPersalinan'), 0)
//
//Mobile.delay(1)
//
//Mobile.tap(findTestObject('Object Repository/ANC/HPHT/button_selanjutnya'), 0)
//
////tinggi
//Mobile.setText(findTestObject('ANC/Antropometri/field1'), '101', 0)

//berat
Mobile.setText(findTestObject('ANC/Antropometri/field1'), '101', 0)

//sistol
Mobile.setText(findTestObject('ANC/Antropometri/field2'), '101', 0)

//diastol
Mobile.setText(findTestObject('ANC/Antropometri/field3'), '40', 0)

//suhu
Mobile.setText(findTestObject('ANC/Antropometri/field4'), '40', 0)

Mobile.scrollToText('BATAL')

//respirasi
Mobile.setText(findTestObject('ANC/Antropometri/field1'), '30', 0)

//denyut nadi
Mobile.setText(findTestObject('ANC/Antropometri/field2'), '30', 0)

////LILA
//Mobile.setText(findTestObject('ANC/Antropometri/field3'), '20', 0)

Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/radio_konjungtiva_normal'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('ANC/Obstetri/dropdown_abdoment'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Obstetri/abdoment/opt_balotement_teraba'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Obstetri/radio_DJJtidakterdengar'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Pemeriksaan Ekstrimitas/dropdown_ekstrimitas'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Pemeriksaan Ekstrimitas/opt_tidak_diperiksa'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Pemeriksaan Ekstrimitas/dropdown_patela'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Pemeriksaan Ekstrimitas/opt_positive'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Pemeriksaan Ekstrimitas/dropdown_oedema'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Pemeriksaan Ekstrimitas/opt_negative'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Status Imunisasi/dropdown_statusImunisasi'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Status Imunisasi/opt_TT1'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Status Imunisasi/dropdown_pemberianImunisasi'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Status Imunisasi/opt_TT5'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/KONSELING/cKonseling yang Diberikan - Tanda Bahaya'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/KONSELING/field_tanggalKembali'), 0)

Mobile.tap(findTestObject('Object Repository/Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/KONSELING/button_lihatUlasan'), 0)

Mobile.scrollToText('BATAL')

Mobile.tap(findTestObject('Object Repository/ANC/Ulasan/checkbox_sayaYakin'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Ulasan/button_hasilKunjungan'), 0)

Mobile.delay(5)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ANC/Hasil Kunjungan/copy_hasilKunjungan'), 'text', 'Hasil Kunjungan', 0)

//Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ANC/Hasil Kunjungan/copy_hasilPemeriksaan'), 'text', 'Ny. Automation Teraba P0A0 dengan Ballotemen Teraba', 0)

Mobile.tap(findTestObject('Object Repository/ANC/Hasil Kunjungan/button_pemeriksaanSelesai'), 0)

Mobile.delay(1)

Mobile.verifyElementExist(findTestObject('Object Repository/Profile Pasien/button_call'), 0)