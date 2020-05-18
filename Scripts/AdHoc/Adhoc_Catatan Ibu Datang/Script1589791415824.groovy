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
import io.appium.java_client.MobileElement

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

/*headers manager */
TestObjectProperty header1 = new TestObjectProperty('Sehati-Product', ConditionType.EQUALS, 'midwife')

TestObjectProperty header2 = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')

TestObjectProperty header3 = new TestObjectProperty('Sehati-Platform', ConditionType.EQUALS, 'android')

TestObjectProperty header4 = new TestObjectProperty('Sehati-App-Version', ConditionType.EQUALS, '3.2.0')

//TestObjectProperty header5 = new TestObjectProperty("Authorization", ConditionType.EQUALS, "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxMDMzOSwiZXhwaXJ5X2RhdGUiOjE1ODQwNzE4MzZ9.k5oXdztxKIYVHyMIwfpHATyVgt0cMLO89lGUV86RV_o")
ArrayList defaultHeaders = Arrays.asList(header1, header2, header3, header4)

/*post body*/
String body = '{"identifier": "0812345678917", "password": "qwerty"}'

// Request POST CTG
RequestObject ro = new RequestObject()

ro.setRestUrl('https://id-staging.sehati.co/api/v3/login')

ro.setBodyContent(new HttpTextBodyContent(body, 'UTF-8', 'application/json') //dont forget to set charset and content-type
    )

ro.setHttpHeaderProperties(defaultHeaders)

ro.setRestRequestMethod('POST')

Object res = WS.sendRequest(ro)

// check response body
String w = res.getResponseText()

println(w)

// get data.id value from json
JsonSlurper slurper = new JsonSlurper()

def parsedJson = slurper.parseText(w)

assert parsedJson instanceof Map

println(parsedJson.meta.token)

token = parsedJson.meta.token

println(token)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
String charset = ('a'..'z').join()
String intset = ('1'..'9').join()
Integer length = 13
String randomString = RandomStringUtils.random(length, charset.toCharArray())
String randomInt = RandomStringUtils.random(length, intset.toCharArray())

// POST Create new mother

TestObjectProperty header1s = new TestObjectProperty('Sehati-Product', ConditionType.EQUALS, 'midwife')

TestObjectProperty header2s = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json') //dont forget to use this one if you choose json as your post body

TestObjectProperty header3s = new TestObjectProperty('Sehati-Platform', ConditionType.EQUALS, 'android')

TestObjectProperty header4s = new TestObjectProperty('Sehati-App-Version', ConditionType.EQUALS, '3.2.0')

TestObjectProperty header5s = new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + token)

ArrayList defaultHeaderss = Arrays.asList(header1s, header2s, header3s, header4s, header5s)

/*post body*/
String body_createmother = '''{"date_of_birth": "100000", "region_id": 34604, "address": "ini adalah nama jalans", "name": "Ibu ''' + randomString + '''"}'''

println(randomString)

RequestObject ro2 = new RequestObject()

ro2.setRestUrl('https://id-staging.sehati.co/api/v3/healthcares/3875/mothers')

ro2.setBodyContent(new HttpTextBodyContent(body_createmother, 'UTF-8', 'application/json')) //dont forget to set charset and content-type

ro2.setHttpHeaderProperties(defaultHeaderss)

ro2.setRestRequestMethod('POST')

Object res2 = WS.sendRequest(ro2)

String w2 = res2.getResponseText()

println(w2)

JsonSlurper slurpers = new JsonSlurper()

def parsedJson2 = slurpers.parseText(w2)

assert parsedJson2 instanceof Map

mother_id = parsedJson2.data.id

mother_name = parsedJson2.data.name

println(mother_name)

println(mother_id)

GlobalVariable.ibu = mother_name

println(GlobalVariable.ibu)

//////////////////////////////////////////////////////////////////////////////

TestObjectProperty header_ANC1 = new TestObjectProperty('Sehati-Product', ConditionType.EQUALS, 'midwife')

TestObjectProperty header_ANC2 = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json') //dont forget to use this one if you choose json as your post body

TestObjectProperty header_ANC3 = new TestObjectProperty('Sehati-Platform', ConditionType.EQUALS, 'android')

TestObjectProperty header_ANC4 = new TestObjectProperty('Sehati-App-Version', ConditionType.EQUALS, '3.2.0')

TestObjectProperty header_ANC5 = new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + token)

ArrayList defaultHeader_ANC = Arrays.asList(header_ANC1, header_ANC2, header_ANC3, header_ANC4, header_ANC5)

String body_ANC = '{"abortus":1,"advices":["alert"],"advices_display":["Tanda Bahaya"],"baby":{"abdomen":"fundal-height","fetus_position":"breech","fundal_height":30,"leopold":"single","pulse_1":250,"weight":1000},"complaints":[],"complaints_text":[],"diseases":["tuberkolosis"],"edd":1609545600,"gravida":3,"has_complaints":false,"has_diseases":true,"has_smoking_family":false,"history":{"blood_transfusion":true,"forcep":true,"macrosomia":true,"manual_removal_placenta":true,"premature":true,"sc":true},"id_mother":"44556|anc","include":"medications,complaint","is_drinking_alcohol":false,"is_smoking":false,"last_abortus_at":757395888,"last_abortus_number":2,"last_maternity_at":284010288,"lmp":1585180800,"medications":[],"menstruation_cycle":23,"mother":{"conjunctiva":"normal","current_tt":"tt2","diastolic":300,"height":100,"isOedemaFill":true,"isPatellarFill":true,"isVaricesFill":true,"last_tt":"tt1","muac":20.5,"pulse":30,"respiration":30,"systolic":300,"temperature":45,"weight":30},"occurrence_at":1586390400,"para":1,"return_at":1586476800,"state":"anc"}'

RequestObject ro3 = new RequestObject()

ro3.setRestUrl('https://id-staging.sehati.co/api/v3/healthcares/3875/mothers/'+mother_id+'/ancs')

ro3.setBodyContent(new HttpTextBodyContent(body_ANC, 'UTF-8', 'application/json')) //dont forget to set charset and content-type

ro3.setHttpHeaderProperties(defaultHeader_ANC)

ro3.setRestRequestMethod('POST')

Object res3 = WS.sendRequest(ro3)

String w3 = res3.getResponseText()

println(w3)

JsonSlurper slurperss = new JsonSlurper()

def parsedJson3 = slurperss.parseText(w3)

assert parsedJson3 instanceof Map

ANC_id = parsedJson3.data.id

println(ANC_id)

WebUI.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Home/Button INC Beranda'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/List Pasien/icon_search'), 0)

Mobile.setText(findTestObject('Object Repository/List Pasien/field_searchPasiens'), GlobalVariable.ibu, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('List Pasien/list_ibu_1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/INC/section_catatanIbuDatang'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/field_tanggalPemeriksaan'), 0)

Mobile.tap(findTestObject('Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/field_jamPemeriksaan'), 0)

Mobile.tap(findTestObject('Global/DatePicker/button_simpantanggal'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/rb_mulas_no'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/rb_keluarketuban_yes'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/rb_lendirdarah_yes'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/field_kontrasepsi'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/field1'), '100', 0)

Mobile.setText(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/field2'), '100', 0)

Mobile.setText(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/field3'), '30', 0)

Mobile.setText(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/field4'), '31', 0)

Mobile.setText(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/field4'), '32', 0)

Mobile.scrollToText('Mata')

Mobile.setText(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/field2'), '33', 0)

Mobile.setText(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/field3'), '34', 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/radio_konjungtiva_normal'), 0)

Mobile.setText(findTestObject('Object Repository/INC/Catatan Ibu Datang/Antropometri/field1'), '30', 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.setText(findTestObject('Object Repository/ANC/Antropometri/field1'), '30', 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Obstetri/radio_Gemili'), 0)

Mobile.setText(findTestObject('Object Repository/ANC/Antropometri/field2'), '31', 0)

Mobile.setText(findTestObject('Object Repository/ANC/Antropometri/field3'), '32', 0)

Mobile.scrollToText('BATAL')

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Obstetri/radio_kontraksi_yes'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/rb_tidak_ada_kelainan'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field1'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field3'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

Mobile.setText(findTestObject('Object Repository/ANC/Antropometri/field2'), '2', 0)

Mobile.scrollToText('Pengeluaran')

Mobile.setText(findTestObject('Object Repository/ANC/Antropometri/field4'), '323', 0)

Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field1'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field2'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Antropometri/field3'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/agama_protestan'), 0)

Mobile.scrollToText('BATAL')

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Pemeriksaan Ekstrimitas/dropdown_ekstrimitas'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Pemeriksaan Ekstrimitas/opt_tidak_diperiksa'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Pemeriksaan Ekstrimitas/dropdown_patela'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Pemeriksaan Ekstrimitas/opt_positive'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Pemeriksaan Ekstrimitas/dropdown_oedema'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Pemeriksaan Ekstrimitas/opt_negative'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/ANC/Waktu Kunjungan/button_selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/ANC/KONSELING/cKonseling yang Diberikan - Tanda Bahaya'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/button_lihatUlasan'), 0)

Mobile.scrollToText('BATAL')

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Ulasan/checkbox_sayaYakin'), 0)

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/Ulasan/button_hasilKunjungan'), 0)

Mobile.delay(20)

Mobile.scrollToText('TUTUP')

Mobile.tap(findTestObject('Object Repository/INC/Catatan Ibu Datang/button_pemeriksaanSelesaiorTutup'), 0)

Mobile.delay(1)

Mobile.verifyElementExist(findTestObject('Object Repository/INC/section_catatanIbuDatang'), 0)