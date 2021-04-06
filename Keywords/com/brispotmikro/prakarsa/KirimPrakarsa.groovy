package com.brispotmikro.prakarsa

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

import internal.GlobalVariable
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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.stringtemplate.v4.compiler.STParser.element_return as element_return
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager
import io.appium.java_client.MobileDriver as MobileDriver
import io.appium.java_client.android.AndroidElement as AndroidElement

public class KirimPrakarsa {

	@Keyword
	public void RefreshPrakarsa(){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		ArrayList<AndroidElement> textElement = driver.findElementsByClassName('android.widget.TextView')
		ArrayList<AndroidElement> alltext = new ArrayList<AndroidElement>()

		Boolean stopLoop = false

		for (int i = 0; i < textElement.size; i++) {
			String text = textElement.get(i).getText();
			alltext.add(textElement.get(i).getText())
		}
		stopLoop = alltext.contains("Hasil CRS / CRR.")

		while(stopLoop){
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012121_KIRIM PRAKARSA/012121B_REFRESH'),
					GlobalVariable.timeOut)
			Mobile.delay(120, FailureHandling.STOP_ON_FAILURE)
			
			Mobile.swipe(548, 1796, 552, 857)
			
			textElement = driver.findElementsByClassName('android.widget.TextView')
			alltext = new ArrayList<AndroidElement>()

			for (int i = 0; i < textElement.size; i++) {
				String text = textElement.get(i).getText();
				alltext.add(textElement.get(i).getText())
			}
			stopLoop = alltext.contains("Hasil CRS / CRR.")
		}
	}
}

