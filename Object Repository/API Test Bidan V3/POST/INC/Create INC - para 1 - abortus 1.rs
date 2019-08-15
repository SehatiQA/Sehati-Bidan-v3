<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create INC - para 1 - abortus 1</name>
   <tag></tag>
   <elementGuidId>a28ab721-14b4-4eb4-9f8f-0ad1a3d1385b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n \&quot;gravida\&quot;: 3,\n \&quot;para\&quot;: 1,\n \&quot;abortus\&quot;: 1,\n \&quot;last_maternity_at\&quot;: 1562646036,\n \&quot;last_abortus_at\&quot;: 1562646036,\n \&quot;last_abortus_number\&quot;: 2,\n \&quot;lmp\&quot;: 1562646036,\n \&quot;menstruation_cycle\&quot;: 20,\n \&quot;history\&quot;: {\n   \&quot;premature\&quot;: true,\n   \&quot;macrosomia\&quot;: true,\n   \&quot;sc\&quot;: true,\n   \&quot;forcep\&quot;: true,\n   \&quot;manual_removal_placenta\&quot;: true,\n   \&quot;blood_transfusion\&quot;: true\n },\n  \&quot;filled_at\&quot;: 7347459349,\n \&quot;has_contraception\&quot;: false,\n \&quot;contraception_id\&quot;: 23,\n  \&quot;mother\&quot;: {\n   \&quot;height\&quot;: 150,\n   \&quot;weight\&quot;: 60,\n   \&quot;systolic\&quot;: 100,\n   \&quot;diastolic\&quot;: 110,\n   \&quot;temperature\&quot;: 34,\n   \&quot;respiration\&quot;: 34,\n   \&quot;pulse\&quot;: 34,\n   \&quot;muac\&quot;: 34,\n   \&quot;conjunctiva\&quot;: \&quot;pale\&quot;,\n   \&quot;varices\&quot;: true,\n   \&quot;patellar_reflex\&quot;: true,\n   \&quot;oedema\&quot;: true,\n   \&quot;has_heartburn\&quot;: true,\n   \&quot;heartburn_at\&quot;: 1212323232,\n   \&quot;membrane_rupture\&quot;: true,\n   \&quot;membrane_bloody\&quot;: false,\n   \&quot;vulva_vagina_abnormal\&quot;: false,\n   \&quot;vulva_vagina_description\&quot;: \&quot;adfs\&quot;,\n   \&quot;portio\&quot;: \&quot;343\&quot;,\n   \&quot;cervical_dilation\&quot;: 3,\n   \&quot;amniotic_color\&quot;: \&quot;merah\&quot;,\n   \&quot;moulage\&quot;: 2,\n   \&quot;presentation\&quot;: \&quot;kepala\&quot;,\n   \&quot;station\&quot;: \&quot;dfd\&quot;,\n   \&quot;urine_volume\&quot;: 343\n },\n  \&quot;baby\&quot;: {\n   \&quot;fundal_height\&quot;: \&quot;dsfds\&quot;,\n   \&quot;leopold\&quot;: \&quot;twin\&quot;,\n   \&quot;fetus_position\&quot;: \&quot;head\&quot;,\n   \&quot;head_position\&quot;: \&quot;convergent\&quot;,\n   \&quot;pulse_1\&quot;: 343,\n   \&quot;pulse_2\&quot;: 343,\n   \&quot;weight\&quot;: 343\n },\n  \&quot;has_contraction\&quot;: true,\n \&quot;contraction\&quot;: {\n   \&quot;count\&quot;: 232,\n   \&quot;minute\&quot;: 23,\n   \&quot;second\&quot;: 34\n },\n \&quot;medications\&quot;: [\n   {\n     \&quot;id\&quot;: 12,\n     \&quot;amount\&quot;: 3.4,\n     \&quot;unit\&quot;: \&quot;ml\&quot;\n   }\n ],\n \&quot;advices\&quot;: [\n   \&quot;string\&quot;\n ]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>id</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Sehati-Product</name>
      <type>Main</type>
      <value>midwife</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Sehati-Platform</name>
      <type>Main</type>
      <value>android</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Sehati-App-Version</name>
      <type>Main</type>
      <value>3.0.0</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoyMzI0OSwiZXhwaXJ5X2RhdGUiOjE1NzMxODM2NTZ9.EUnJETB65fD71lS7r35nPLRxVdNppZjiT4rt3-RpFUE</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://staging.sehati.co/api/v3/healthcares/9995/mothers/42509/incs</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
