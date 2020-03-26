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

/*headers manager */
TestObjectProperty header1 = new TestObjectProperty('Sehati-Product', ConditionType.EQUALS, 'midwife')

TestObjectProperty header2 = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')

TestObjectProperty header3 = new TestObjectProperty('Sehati-Platform', ConditionType.EQUALS, 'android')

TestObjectProperty header4 = new TestObjectProperty('Sehati-App-Version', ConditionType.EQUALS, '3.2.0')

//TestObjectProperty header5 = new TestObjectProperty("Authorization", ConditionType.EQUALS, "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxMDMzOSwiZXhwaXJ5X2RhdGUiOjE1ODQwNzE4MzZ9.k5oXdztxKIYVHyMIwfpHATyVgt0cMLO89lGUV86RV_o")
ArrayList defaultHeaders = Arrays.asList(header1, header2, header3, header4)

println(defaultHeaders)

/*post body*/
String body = '{"identifier": "0812345678917", "password": "qwerty"}'

println(body)

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

//send data.id value to global variable
token = parsedJson.meta.token

//GlobalVariable.ctg_id = ctg_id
println(token)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Request GET midwife_prop,group,works
/*headers manager*/
RequestObject ro2 = new RequestObject()

ro2.setRestUrl('https://id-staging.sehati.co/api/v3/users/profile?include=works,midwife_prop,group')

TestObjectProperty header1s = new TestObjectProperty('Sehati-Product', ConditionType.EQUALS, 'midwife')

TestObjectProperty header2s = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json' //dont forget to use this one if you choose json as your post body
)

TestObjectProperty header3s = new TestObjectProperty('Sehati-Platform', ConditionType.EQUALS, 'android')

TestObjectProperty header4s = new TestObjectProperty('Sehati-App-Version', ConditionType.EQUALS, '3.2.0')

TestObjectProperty header5s = new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + token)

ArrayList defaultHeaderss = Arrays.asList(header1s, header2s, header3s, header4s, header5s)

println(defaultHeaderss)

ro2.setHttpHeaderProperties(defaultHeaderss)

ro2.setRestRequestMethod('GET')

Object res2 = WS.sendRequest(ro2)

// check response body
String w2 = res2.getResponseText()

println(w2)

// get data.id value from json
JsonSlurper slurpers = new JsonSlurper()

def parsedJson2 = slurpers.parseText(w2)

assert parsedJson2 instanceof Map

midwife_name = parsedJson2.data.full_name

println(midwife_name)

midwife_phone = parsedJson2.data.phone

println(midwife_phone)

midwife_email = parsedJson2.data.email

println(midwife_email)

str = parsedJson2.data.midwife_prop.str_number

println(str)

ibi = parsedJson2.data.midwife_prop.ibi_number

println(ibi)

sipb = parsedJson2.data.midwife_prop.sipb_number

println(sipb)

String healthcare_name = parsedJson2.data.works.name

healthcare_name = healthcare_name.replaceAll("[\\[\\]]", "");

println(healthcare_name)

String healthcare_address = parsedJson2.data.works.address

healthcare_address = healthcare_address.replaceAll("[\\[\\]]", "");

println(healthcare_address)

Mobile.callTestCase(findTestCase('Login_25'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Menu HamBurger/AkunSaya'), 0)

Mobile.delay(2)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ProfilBidan/value_midwifename'), 'text', midwife_name, 
    0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ProfilBidan/value_midwifephone'), 'text', midwife_phone, 
    0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ProfilBidan/value_midwifeemail'), 'text', midwife_email, 
    0)

Mobile.scrollToText('Tempat Pelayanan')

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ProfilBidan/value_str'), 'text', str, 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ProfilBidan/value_ibi'), 'text', ibi, 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/ProfilBidan/value_sipb'), 'text', sipb, 0)

a = Mobile.getText(findTestObject('Object Repository/ProfilBidan/value_healthcarename'), 0)

b = Mobile.getText(findTestObject('Object Repository/ProfilBidan/value_healthcareaddress'), 0)

Mobile.verifyMatch(healthcare_name, a, false)

Mobile.verifyMatch(healthcare_address, b, false)