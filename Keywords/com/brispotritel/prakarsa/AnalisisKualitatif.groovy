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

public class AnalisisKualitatif {
	@Keyword
	public void openApplication(Integer screenWidth, Integer screenHeight){

		Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BrispotDevKemendagri_02.apk', false, FailureHandling.CONTINUE_ON_FAILURE)
		screenWidth = Mobile.getDeviceWidth()
		screenHeight = Mobile.getDeviceHeight()

		Mobile.waitForElementPresent(findTestObject('01_HOME/012_PRAKARSA/012C_PRAKARSA'), GlobalVariable.timeOut)
	}

	@Keyword
	public void Tunggakan(String tunggakan){

		if (tunggakan == 'Ya') {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217A_YA'), GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217B_TDK'), GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void Komitmen(String komitmen){

		if (komitmen == 'Ya') {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217A_YA'), GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217B_TDK'), GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void KomunitasBisnis(String komunitas_bisnis){

		if (komunitas_bisnis == 'Ya') {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217A_YA'), GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217B_TDK'), GlobalVariable.timeOut)
		}
	}



	@Keyword
	public void UsahaOneManShow(String usaha_oms){

		if (usaha_oms == 'YA') {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217F_YA'), GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217B_TDK'), GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void KonsepKaderisasi(String konsep_kaderisasi){

		if (konsep_kaderisasi == 'YA') {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217F_YA'), GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217B_TDK'), GlobalVariable.timeOut)
		}
	}


	@Keyword
	public void Jawaban(String jawaban){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		Integer screenWidth = Mobile.getDeviceWidth()

		Integer screenHeight = Mobile.getDeviceHeight()

		Integer xBawah = screenWidth * 0.5

		Integer yBawah = screenHeight * 0.6

		Integer xAtas = screenWidth * 0.5

		Integer yAtas = screenHeight * 0.4

		ArrayList<AndroidElement> elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

		ArrayList<AndroidElement> textIsiDariDropdown = new ArrayList<AndroidElement>()

		for (int i = 0; i < elementDariDropdown.size; i++) {
			textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		}

		if (textIsiDariDropdown.contains(jawaban)) {
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217D_LISTJAWABAN'),
					jawaban, GlobalVariable.timeOut)
		} else {
			while (!(textIsiDariDropdown.contains(jawaban))) {
				Mobile.swipe(xBawah, yBawah, xAtas, yAtas)

				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

				textIsiDariDropdown = new ArrayList<AndroidElement>()

				for (int i = 0; i < elementDariDropdown.size; i++) {
					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
				}
			}

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217D_LISTJAWABAN'),
					jawaban, GlobalVariable.timeOut)
		}
	}
}
