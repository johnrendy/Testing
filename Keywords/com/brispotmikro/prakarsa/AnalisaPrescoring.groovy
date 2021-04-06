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
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper

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


public class AnalisaPrescoring {

	@Keyword
	def UbahLokasi(TestObject to,String ALAMAT,String RT,String RW,String KODEPOS,String KEC, String KEL){

		Mobile.scrollToText('LANJUT', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141A_UBAH LOKASI'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\04_SEARCH LOCATION.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)

		if (element != null) {

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'),
					GlobalVariable.timeOut)

			'Search Lokasi'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141B_SEARCHBYLOCATION'),
					GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_KODEPOS'),
					GlobalVariable.timeOut)

			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\05_DATA KODE POS.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/01211411_KODE POS/01211411B_CARIDATA'),
					GlobalVariable.KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/01211411_KODE POS/01211411C_LIST KODE POS'),
					GlobalVariable.timeOut)

			'Create Text Data Lokasi'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141E_KETIKLOKASI'),
					'Cilandak', GlobalVariable.timeOut)

			'Klik Cari'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141G_CARI'),
					GlobalVariable.timeOut)

			'Klik Set Loc'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141C_SET LOCATION'),
					GlobalVariable.timeOut)
		}else {

			'Search Lokasi'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141B_SEARCHBYLOCATION'),
					GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_KODEPOS'),
					GlobalVariable.timeOut)

			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\05_DATA KODE POS.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/01211411_KODE POS/01211411B_CARIDATA'),
					GlobalVariable.KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/01211411_KODE POS/01211411C_LIST KODE POS'),
					GlobalVariable.timeOut)

			'Create Text Data Lokasi'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141E_KETIKLOKASI'),
					'Cilandak', GlobalVariable.timeOut)

			'Klik Cari'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141G_CARI'),
					GlobalVariable.timeOut)

			'Klik Set Loc'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141C_SET LOCATION'),
					GlobalVariable.timeOut)
		}

		'Klik Lanjut'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115C_LANJUT'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121152_ALAMAT/0121152A_ALAMAT'),
				ALAMAT, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121152_ALAMAT/0121152B_RT'),
				RT, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121152_ALAMAT/0121152C_RW'),
				RW, GlobalVariable.timeOut)

		'Search Kode Pos'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121152_ALAMAT/0121152D_KODEPOS'),
				GlobalVariable.timeOut)

		'Create Text Data Kode Pos'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121152_ALAMAT/01211521_KODE POS/01211521B_CARIDATA'),
				GlobalVariable.KODEPOS, GlobalVariable.timeOut)

		'Selected Kode Pos'
		Mobile.doubleTap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121152_ALAMAT/01211521_KODE POS/01211521C_LIST KODE POS'),
				GlobalVariable.timeOut)

		Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\06_DATA ALAMAT.png',
				FailureHandling.CONTINUE_ON_FAILURE)
	}


	@Keyword
	public void DataListView(String datalistview){

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

		if (textIsiDariDropdown.contains(datalistview)) {

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153P_LISTVIEW'),
					datalistview, GlobalVariable.timeOut)
		} else {
			while (!(textIsiDariDropdown.contains(datalistview))) {
				Mobile.swipe(xBawah, yBawah, xAtas, yAtas)

				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

				textIsiDariDropdown = new ArrayList<AndroidElement>()

				for (int i = 0; i < elementDariDropdown.size; i++) {
					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
				}
			}

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153P_LISTVIEW'),
					datalistview, GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void DataListViewProfesi(String datalistviewprofesi){

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

		if (textIsiDariDropdown.contains(datalistviewprofesi)) {

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153P_LISTVIEW'),
					datalistviewprofesi, GlobalVariable.timeOut)
		} else {
			while (!(textIsiDariDropdown.contains(datalistviewprofesi))) {
				Mobile.swipe(xBawah, yBawah, xAtas, yAtas)

				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

				textIsiDariDropdown = new ArrayList<AndroidElement>()

				for (int i = 0; i < elementDariDropdown.size; i++) {
					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
				}
			}

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153P_LISTVIEW'),
					datalistviewprofesi, GlobalVariable.timeOut)
		}
	}

}
