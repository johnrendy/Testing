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


public class RekomendasiKredit {

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
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Z_LISTGRACEP'),
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

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Z_LISTGRACEP'),
					datalistview, GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void DataListSandiSTP(String datalistview){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		Integer screenWidth = Mobile.getDeviceWidth()

		Integer screenHeight = Mobile.getDeviceHeight()

		Integer xBawah = screenWidth * 0.5

		Integer yBawah = screenHeight * 0.6

		Integer xAtas = screenWidth * 0.5

		Integer yAtas = screenHeight * 0.4

		ArrayList<AndroidElement> elementDariDropdown = driver.findElementsByClassName('android.widget.CheckedTextView')
		ArrayList<AndroidElement> textIsiDariDropdown = new ArrayList<AndroidElement>()

		for (int i = 0; i < elementDariDropdown.size; i++) {
			textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		}

		if (textIsiDariDropdown.contains(datalistview)) {
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/05_JNSPENGGUNAAN/05D_LISTVIEW'),
					datalistview, GlobalVariable.timeOut)
		}
	}


	@Keyword
	public void DataListViewSpinner(String datalistviewspinner){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		Integer screenWidth = Mobile.getDeviceWidth()

		Integer screenHeight = Mobile.getDeviceHeight()

		Integer xBawah = screenWidth * 0.5

		Integer yBawah = screenHeight * 0.5

		Integer xAtas = screenWidth * 0.5

		Integer yAtas = screenHeight * 0.4
		ArrayList<AndroidElement> elementDariDropdownn = driver.findElementsByClassName('android.widget.TextView')
		ArrayList<AndroidElement> elementDariDropdown = driver.findElementsByClassName('android.widget.CheckedTextView')

		ArrayList<AndroidElement> textIsiDariDropdown = new ArrayList<AndroidElement>()
		ArrayList<AndroidElement> textIsiDariDropdownn = new ArrayList<AndroidElement>()
		for (int i = 0; i < elementDariDropdown.size; i++) {
			textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		}

		for (int i = 0; i < elementDariDropdownn.size; i++) {
			textIsiDariDropdownn.add(elementDariDropdownn.get(i).getText())
		}

		if (textIsiDariDropdown.contains(datalistviewspinner) || textIsiDariDropdownn.contains(datalistviewspinner) ) {
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/05_JNSPENGGUNAAN/05D_LISTVIEW'),
					datalistviewspinner, GlobalVariable.timeOut)
		} else {

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/05_JNSPENGGUNAAN/05D_LISTVIEW'),
					datalistviewspinner, GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void DataList(String datalistviewspinner){

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
		if (textIsiDariDropdown.contains(datalistviewspinner)) {
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/05_JNSPENGGUNAAN/05D_LISTVIEW'),
					datalistviewspinner, GlobalVariable.timeOut)
		} else {

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/05_JNSPENGGUNAAN/05D_LISTVIEW'),
					datalistviewspinner, GlobalVariable.timeOut)
		}
	}


	@Keyword
	public void DataPinjaman(String JNSPENGGUNAAN,String SEKTOREKONOMI, String BAKIDEBET, String  REKENINGSUPLESI, String PLAFONPINJAMAN, String JANGKAWAKTU, String POLAANGS, String GRACEPERIODE, String SUKUBUNGA,
			String ASURANSI,String SANDISTP, String TAKEOVER, String BANKTAKEOVER, String SEGMENPRODUK ){

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201S_JENISPENGGUNAAN'),
				GlobalVariable.timeOut)

		//CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListViewSpinner'(JNSPENGGUNAAN)
		
		CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataList'(JNSPENGGUNAAN)
		
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201T_SKTOREKONOMI'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/06_SKTREKONOMI/06B_CARIDATA'),
				SEKTOREKONOMI, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/06_SKTREKONOMI/06C_LIST'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201A_BAKIDEBET'),
				BAKIDEBET, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201U_RSUPLESI'),
				REKENINGSUPLESI, GlobalVariable.timeOut)

		Mobile.scrollToText('Jangka waktu kredit', FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201F_PLAFONPINJAM'),
				PLAFONPINJAMAN, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201G_JANGKAWAKTU'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListView'(JANGKAWAKTU)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201V_POLANGS'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListView'(POLAANGS)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201W_GRACEPER'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListView'(GRACEPERIODE)

		//Mobile.tapAtPosition(400, 708)
		//Mobile.tap(findTestObject('01_HALAMAN HOME/012_MENU PRAKARSA/0121_PRAKARSA/01211_DETAIL PRAKASA/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201W_GRACEPER'),
		//    GlobalVariable.timeOut)
		//
		//Mobile.tapAtPosition(479, 386, FailureHandling.STOP_ON_FAILURE)
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201H_SUKUBUNGA'),
				SUKUBUNGA, GlobalVariable.timeOut)

		Mobile.scrollToText('Hasil perhitungan sistem dari RPC', FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		//		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Y_HITUNG'),
		//				GlobalVariable.timeOut)

		//		Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Y_HITUNG'),
		//				Keys.chord(Keys.ENTER))

		Mobile.tapAtPosition(442, 779)

		Mobile.delay(GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\04_DATA PINJAMAN SATU.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('SIMPAN', FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		if(SEGMENPRODUK.equals("Kupedes KECE")){
			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\07_DATA PINJAMAN TIGA.png',
					FailureHandling.STOP_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120D_NEXT'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120E_OK'),
					GlobalVariable.timeOut)
		}else{
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201N_ASURANSI'),
					GlobalVariable.timeOut)

			Mobile.delay(GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListView'(ASURANSI)

			//Mobile.tapAtPosition(410, 302)
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201X_SANDISTP'),
					GlobalVariable.timeOut)

			CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListSandiSTP'(SANDISTP)

			//		if (JNSPENGGUNAAN == 'Modal Kerja') {
			//			if (SANDISTPMK == 'A205') {
			//				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/07_SANDISTP/07A_A205'),
			//						GlobalVariable.timeOut)
			//			} else if (SANDISTPMK == 'A206') {
			//				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/07_SANDISTP/07B_A206'),
			//						GlobalVariable.timeOut)
			//			} else if (SANDISTPMK == 'A207') {
			//				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/07_SANDISTP/07C_A207'),
			//						GlobalVariable.timeOut)
			//			} else {
			//				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/07_SANDISTP/07D_A208'),
			//						GlobalVariable.timeOut)
			//			}
			//		} else {
			//			if (SANDISTPINVENKOM == 'A256') {
			//				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/07_SANDISTP/07E_A256'),
			//						GlobalVariable.timeOut)
			//			} else if (SANDISTPINVENKOM == 'A257') {
			//				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/07_SANDISTP/07F_A257'),
			//						GlobalVariable.timeOut)
			//			} else if (SANDISTPINVENKOM == 'A258') {
			//				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/07_SANDISTP/07G_A258'),
			//						GlobalVariable.timeOut)
			//			} else {
			//				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/07_SANDISTP/07H_A259'),
			//						GlobalVariable.timeOut)
			//			}
			//		}

			if (TAKEOVER == 'YA') {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Q_SWITCHTAKEOVER'),
						GlobalVariable.timeOut)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Q_SWITCHTAKEOVER'),
						GlobalVariable.timeOut)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201O_BANKTAKEOVER'),
						GlobalVariable.timeOut)

				Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/02_PROMO/02A_CARI'),
						BANKTAKEOVER, GlobalVariable.timeOut)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/02_PROMO/02H_LISTPROMO'),
						GlobalVariable.timeOut)
			} else {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Q_SWITCHTAKEOVER'),
						GlobalVariable.timeOut)
			}

			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\07_DATA PINJAMAN TIGA.png',
					FailureHandling.STOP_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120D_NEXT'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120E_OK'),
					GlobalVariable.timeOut)
		}

	}
}
