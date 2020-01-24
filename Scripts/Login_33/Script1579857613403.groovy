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

Mobile.startApplication(GlobalVariable.appPath, true)

Mobile.tap(findTestObject('Object Repository/LOGIN BIDAN/button_mengerti'), 0)

Mobile.delay(2)

Mobile.tapAtPosition(1000, 2117)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_nomor'), GlobalVariable.phone, 0)

Mobile.setText(findTestObject('Object Repository/LOGIN BIDAN/field_password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/LOGIN BIDAN/btn_masuk'), 0)

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/Menu Burger'), 0)

import org.apache.commons.ssl.util.UTF8
import org.apache.http.client.methods.HttpHead
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.object_return
import org.junit.After
import org.seleniumhq.jetty9.http.HttpHeader
import com.sun.xml.internal.org.jvnet.mimepull.DataFile

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import groovy.json.JsonSlurper
import java.util.Map
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.HttpBodyContent
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.testobject.impl.HttpFileBodyContent //for file in body
import com.kms.katalon.core.testobject.impl.HttpFormDataBodyContent //for form data body
import com.kms.katalon.core.testobject.impl.HttpUrlEncodedBodyContent //for URL encoded text
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.RestRequestObjectBuilder


/*headers manager */
TestObjectProperty header1 = new TestObjectProperty("Sehati-Product", ConditionType.EQUALS, "midwife")
TestObjectProperty header2 = new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json") //dont forget to use this one if you choose json as your post body
TestObjectProperty header3 = new TestObjectProperty("Sehati-Platform", ConditionType.EQUALS, "android")
TestObjectProperty header4 = new TestObjectProperty("Sehati-App-Version", ConditionType.EQUALS, "3.1.0")
//TestObjectProperty header5 = new TestObjectProperty("Authorization", ConditionType.EQUALS, "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxMDMzOSwiZXhwaXJ5X2RhdGUiOjE1ODQwNzE4MzZ9.k5oXdztxKIYVHyMIwfpHATyVgt0cMLO89lGUV86RV_o")
ArrayList defaultHeaders = Arrays.asList(header1, header2, header3, header4)
println (defaultHeaders)

/*post body*/
String body = '{ "identifier": "+62812345678917", "password": "qwerty"}'
println (body)

// Request POST CTG
RequestObject ro = new RequestObject()
ro.setRestUrl("https://id-staging.sehati.co/api/v3/login")
ro.setBodyContent(new HttpTextBodyContent(body, "UTF-8", "application/json")) //dont forget to set charset and content-type
ro.setHttpHeaderProperties(defaultHeaders)
ro.setRestRequestMethod("POST")
Object res = WS.sendRequest(ro)

// check response body
String w = res.getResponseText()
println (w)

Mobile.tap(findTestObject('Object Repository/Home/Menu Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Menu HamBurger/PasienIbu'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/LOGIN BIDAN/hyperlink_lupaKatasandi'), 0)
