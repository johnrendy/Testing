package com.brispotritel.prakarsa
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.awt.List as List
import org.json.JSONObject as JSONObject
import org.stringtemplate.v4.compiler.STParser.element_return as element_return
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager
import io.appium.java_client.MobileDriver as MobileDriver
import io.appium.java_client.android.AndroidElement as AndroidElement
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

public class StatusPrescreening {
	@Keyword
	public static void DetailPrescreening(TestObject to){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		ArrayList<AndroidElement> textElement = driver.findElementsByClassName('android.widget.TextView')
		ArrayList<AndroidElement> alltext = new ArrayList<AndroidElement>()

		Boolean stopLoop = false

		//	WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)

		//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214M_PASAR SASARAN'),GlobalVariable.timeOut)
		WebElement element = MobileElementCommonHelper.findElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214C_REFRESH'), GlobalVariable.timeOut)

		while(!stopLoop){
			if(element != null){
				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214C_REFRESH'),
						GlobalVariable.timeOut)
				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214E_YA'), GlobalVariable.timeOut)
				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214D_TUTUP'), GlobalVariable.timeOut)
				Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)
				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/01215F_YA'), GlobalVariable.timeOut)
				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121F_STATUS PRESCREENING'), GlobalVariable.timeOut)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214M_PASAR SASARAN'),GlobalVariable.timeOut)
				Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
				//Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214N_OKE'), GlobalVariable.timeOut)

				WebElement tombolOk = MobileElementCommonHelper.findElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214N_OKE'), GlobalVariable.timeOut)
				Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
				if(tombolOk != null){
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214N_OKE'), GlobalVariable.timeOut)
				}

				element = MobileElementCommonHelper.findElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214C_REFRESH'),GlobalVariable.timeOut)
			}else{
				stopLoop = true
			}
		}
	}


	@Keyword
	def AddLampiran(TestObject to){
		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)
		if (element == null) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214U_DATAFOTO'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214Q_ADD'), GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214Q_ADD'), GlobalVariable.timeOut)
		}
	}

	@Keyword
	def DataNull(TestObject to){
		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)
		if (element != null) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214L_OK'), GlobalVariable.timeOut)

		}
	}

}