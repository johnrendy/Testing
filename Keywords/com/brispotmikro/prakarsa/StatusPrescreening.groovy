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

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import internal.GlobalVariable


import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

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

public class StatusPrescreening {
	@Keyword
	public void StatusPrescrening(String SEGMENTASIKREDIT){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113A_MENU STATUS PRE-SCREENING'),
				GlobalVariable.timeOut)

		Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113B_NEKSISTING'),
				GlobalVariable.timeOut)

		'Menampilkan data detail prakasa'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113B_NEKSISTING'),
				GlobalVariable.timeOut)

		//		String notif = Mobile.getText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113F_NOTIF'),
		//				GlobalVariable.timeOut)

		//String notif = Mobile.verifyElementExist(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113F_NOTIF'),
		//GlobalVariable.timeOut)

		//while(notif != ('Prescreening selesai.') || notif != ('Prescreening selesai.\n')){
		if(SEGMENTASIKREDIT.equals('KUR Mikro')){
			AppiumDriver<?> driver = MobileDriverFactory.getDriver()
			ArrayList<AndroidElement> textElement = driver.findElementsByClassName('android.widget.TextView')
			ArrayList<AndroidElement> alltext = new ArrayList<AndroidElement>()

			Boolean stopLoop = false

			for (int i = 0; i < textElement.size; i++) {
				String text = textElement.get(i).getText().toLowerCase()
				if(text.equals("Prescreening selesai. Kuota KUR Masih Tersedia.")){
					stopLoop = true
				}
			}
			while(!stopLoop){


				CustomKeywords.'com.brispotmikro.prakarsa.StatusPrescreening.Refresh'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113E_REFRESH'))


				textElement = driver.findElementsByClassName('android.widget.TextView')
				for (int i = 0; i < textElement.size; i++) {
					String text = textElement.get(i).getText().toLowerCase()
					if(text.equals("prescreening selesai. kuota kur masih tersedia.")){
						stopLoop = true
					}
				}
			}
		}else{
			AppiumDriver<?> driver = MobileDriverFactory.getDriver()
			ArrayList<AndroidElement> textElement = driver.findElementsByClassName('android.widget.TextView')
			ArrayList<AndroidElement> alltext = new ArrayList<AndroidElement>()

			Boolean stopLoop = false

			for (int i = 0; i < textElement.size; i++) {
				String text = textElement.get(i).getText().toLowerCase()
				if(text.equals("Prescreening selesai.")){
					stopLoop = true
				}
			}
			while(!stopLoop){

				CustomKeywords.'com.brispotmikro.prakarsa.StatusPrescreening.Refresh'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113E_REFRESH'))

				textElement = driver.findElementsByClassName('android.widget.TextView')
				for (int i = 0; i < textElement.size; i++) {
					String text = textElement.get(i).getText().toLowerCase()
					if(text.equals("prescreening selesai.")){
						stopLoop = true
					}
				}
			}


		}

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\STATUS PRESCREENING\\04 DETAIL PRESCREENING.png',
				FailureHandling.STOP_ON_FAILURE)

		if (SEGMENTASIKREDIT.equals('Cash Coll')) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/0121131B_KEMENDAGRI'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211313_DETAILKEMENDAGRI/01211313A_PLUS'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211313_DETAILKEMENDAGRI/01211313B_SDATA'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211313_DETAILKEMENDAGRI/01211313D_OK'),
					GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/0121131A_SLIK'),
					GlobalVariable.timeOut)

			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311A_CHECKBOX'),
					GlobalVariable.timeOut)

			Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311A_CHECKBOX'),
					GlobalVariable.timeOut)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311A_CHECKBOX'),
					GlobalVariable.timeOut)

			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311A_CHECKBOX'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311B_PLUS'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311C_SIMPANSID'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/0121131B_SICD'),
					GlobalVariable.timeOut)

			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311A_CHECKBOX'),
					GlobalVariable.timeOut)

			Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311A_CHECKBOX'),
					GlobalVariable.timeOut)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311A_CHECKBOX'),
					GlobalVariable.timeOut)

			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311A_CHECKBOX'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311B_PLUS'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211311_DETAILSLIK/01211311C_SIMPANSID'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/0121131B_KEMENDAGRI'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211313_DETAILKEMENDAGRI/01211313A_PLUS'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211313_DETAILKEMENDAGRI/01211313B_SDATA'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/0121131_Detail Prescreening/01211313_DETAILKEMENDAGRI/01211313D_OK'),
					GlobalVariable.timeOut)
		}
	}
	@Keyword
	public void ScrollView(){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		Integer screenWidth = Mobile.getDeviceWidth()

		Integer screenHeight = Mobile.getDeviceHeight()

		Integer xBawah = screenWidth * 0.5

		Integer yBawah = screenHeight * 0.5

		Integer xAtas = screenWidth * 0.5

		Integer yAtas = screenHeight * 0.4

		ArrayList<AndroidElement> elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

		ArrayList<AndroidElement> textIsiDariDropdown = new ArrayList<AndroidElement>()

		for (int i = 0; i < elementDariDropdown.size; i++) {
			textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		}

		//		while (!(textIsiDariDropdown.contains(scrollview))) {
		//			Mobile.swipe(xBawah, yBawah, xAtas, yAtas)
		//
		//		elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')
		//
		//		textIsiDariDropdown = new ArrayList<AndroidElement>()
		//
		//			for (int i = 0; i < elementDariDropdown.size; i++) {
		//				textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		//			}
		//		}
		Mobile.swipe(559, 2005,559, 1521)

	}

	@Keyword
	def Refresh(TestObject to){

		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)
		if (element != null) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113E_REFRESH'),
					GlobalVariable.timeOut)
			Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
		}else{

			CustomKeywords.'com.brispotmikro.prakarsa.StatusPrescreening.ScrollView'()
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012113_STATUS PRE-SCREENING/012113E_REFRESH'),
					GlobalVariable.timeOut)
			Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
		}
	}

}
