<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>FixCreate ANC</name>
   <tag></tag>
   <elementGuidId>2487e367-1f2c-43e5-924c-891cbcd215c4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;has_diseases\&quot;: false,\n  \&quot;has_smoking_family\&quot;: true,\n  \&quot;is_smoking\&quot;: true,\n  \&quot;is_drinking_alcohol\&quot;: true,\n  \&quot;gravida\&quot;: 1,\n  \&quot;para\&quot;: 0,\n  \&quot;abortus\&quot;: 0,\n  \&quot;has_diseases\&quot;: false,\n  \&quot;has_smoking_family\&quot;: true,\n  \&quot;is_smoking\&quot;: true,\n  \&quot;is_drinking_alcohol\&quot;: true,\n  \&quot;gravida\&quot;: 1,\n  \&quot;para\&quot;: 0,\n  \&quot;abortus\&quot;: 0,\n  \&quot;has_diseases\&quot;: false,\n  \&quot;has_smoking_family\&quot;: true,\n  \&quot;is_smoking\&quot;: true,\n  \&quot;is_drinking_alcohol\&quot;: true,\n  \&quot;gravida\&quot;: 1,\n  \&quot;para\&quot;: 0,\n  \&quot;abortus\&quot;: 0,\n  \&quot;lmp\&quot;: 1562219647,\n  \&quot;menstruation_cycle\&quot;: 21,\n  \&quot;occurrence_at\&quot;: 1564398003,\n  \&quot;has_complaints\&quot;: false,\n  \&quot;return_at\&quot;: 1566619647,\n  \&quot;advices\&quot;:\&quot;nutrition_needs\&quot;,\n  \&quot;mother\&quot;: {\n    \&quot;height\&quot;: 160,\n    \&quot;weight\&quot;: 62,\n    \&quot;systolic\&quot;: 140,\n    \&quot;diastolic\&quot;: 90,\n    \&quot;temperature\&quot;: 31,\n    \&quot;respiration\&quot;: 80,\n    \&quot;pulse\&quot;: 30,\n    \&quot;muac\&quot;: 12,\n    \&quot;conjunctiva\&quot;: \&quot;normal\&quot;, // pale normal\n    \&quot;varices\&quot;: false,\n    \&quot;patellar_reflex\&quot;: false,\n    \&quot;oedema\&quot;: false\n  },\n  \&quot;baby\&quot;: {\n    \&quot;abdomen\&quot;: \&quot;internal-ballotement\&quot;,\n    \&quot;has_pulse\&quot;: true,\n    \&quot;pulse_1\&quot;: 70,\n    \&quot;leopold\&quot;: \&quot;single\&quot;,\n    \&quot;fetus_position\&quot;: \&quot;head\&quot;,\n    \&quot;head_position\&quot;: \&quot;convergent\&quot;,\n    \&quot;weight\&quot;: 7,\n    \&quot;fundal_height\&quot;: 3\n  }\n}&quot;,
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
      <value>Bearer eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoyMzI0OSwiZXhwaXJ5X2RhdGUiOjE1NzIzNDU5MjZ9.t-j0Maysjy9zE5clcBi6A-ehjhSQl-QXlR2PwAT_Jt4</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://staging.sehati.co/api/v3/healthcares/10492/mothers/42531/ancs</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d6ad701a-e0ba-48f8-bab6-b62fba9455dc</id>
      <masked>false</masked>
      <name>healthcare_id</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>8f9bcbe3-ac8f-49f1-b11e-518877464e0e</id>
      <masked>false</masked>
      <name>mother_id</name>
   </variables>
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
