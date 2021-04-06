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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class DokumenPerijinan {
	@Keyword
	public void openApplication(){
		Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BrispotDevKemendagri_02.apk', false, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('01_HOME/012_PRAKARSA/012C_PRAKARSA'), GlobalVariable.timeOut)
		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DOKUMEN PERIJINAN\\01_MENU UTAMA.png',
				FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void Foto(){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121522_FOTO/0121522A_FOTO'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121522_FOTO/0121511A_CAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121522_FOTO/02_CAMERA/02B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121522_FOTO/02_CAMERA/02D_OK'),
				GlobalVariable.timeOut)
	}


	@Keyword
	public void dataPerijinan(String jenis_perijinan, String lainnya, String no_perijinan, String issue_date, String expired_date){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121521_DATA PERIJINAN/0121521B_JENISPERIJINAN'),
				GlobalVariable.timeOut)

		if (jenis_perijinan == 'TDP') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121521_DATA PERIJINAN/02_JENIS PERIJINAN/02A_TDP'),
					GlobalVariable.timeOut)
		} else if (jenis_perijinan == 'SIUP') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121521_DATA PERIJINAN/02_JENIS PERIJINAN/02B_SIUP'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121521_DATA PERIJINAN/02_JENIS PERIJINAN/02C_LAINNYA'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121521_DATA PERIJINAN/02_JENIS PERIJINAN/02D_JENISPERIJINAN'),
					lainnya, GlobalVariable.timeOut)
		}

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121521_DATA PERIJINAN/0121521A_Nomor Perijinan'),
				no_perijinan, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121521_DATA PERIJINAN/0121521C_Issued Date'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DokumenPerijinan.Tanggal'(issue_date, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121521_DATA PERIJINAN/0121521D_Expired Date'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DokumenPerijinan.Tanggal'(expired_date, GlobalVariable.timeOut, GlobalVariable.timeOut)
	}

	@Keyword
	public void Tanggal(String targetTanggal, Integer screenWidth, Integer screenHeight ) {

		screenWidth = Mobile.getDeviceWidth()
		screenHeight = Mobile.getDeviceHeight()

		String targetHari = targetTanggal.split('/')[0]

		String targetBulan = targetTanggal.split('/')[1]

		String targetTahun = targetTanggal.split('/')[2]

		ArrayList<AndroidElement> daftarBulan = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']

		def targetHariInteger = targetHari.toInteger()

		def targetTahunInteger = targetTahun.toInteger()

		'Pilih tahun akta\r\n'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115A_THN'),
				GlobalVariable.timeOut)

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		ArrayList<AndroidElement> elm = driver.findElementsByClassName('android.widget.TextView')

		ArrayList<AndroidElement> tahun = new ArrayList<AndroidElement>()

		for (int i = 0; i < elm.size; i++) {
			if (i > 1) {
				tahun.add(elm.get(i).getText())
			}
		}

		def tahunPertama = (tahun[0]).toInteger()

		def tahunTerakhir = (tahun[(tahun.size - 1)]).toInteger()

		Integer xBawah = screenWidth * 0.5

		Integer yBawah = screenHeight * 0.6

		Integer xAtas = screenWidth * 0.5

		Integer yAtas = screenHeight * 0.4

		if (targetTahunInteger < tahunPertama) {
			println('SWIPE DOWN')

			//Mobile.swipe(xAtas, yAtas, xBawah, yBawah)
			while (!(tahun.contains(targetTahun))) {
				Mobile.swipe(xAtas, yAtas, xBawah, yBawah)

				elm = driver.findElementsByClassName('android.widget.TextView')

				tahun = new ArrayList<AndroidElement>()

				for (int i = 0; i < elm.size; i++) {
					if (i > 1) {
						tahun.add(elm.get(i).getText())
					}
				}
			}

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115H_ListView'),
					targetTahun,GlobalVariable.timeOut)

			elm = driver.findElementsByClassName('android.widget.TextView')

			ArrayList<AndroidElement> ElementDate = new ArrayList<AndroidElement>()

			ElementDate = new ArrayList<AndroidElement>()

			for (int i = 0; i < elm.size; i++) {
				ElementDate.add(elm.get(i).getText())
				if(i==1){
					println('++++++')
					println(elm.get(i).getText())
					println('++++++')
				}
			}

			String currentMonth = ElementDate.get(1)toString().split(" ")[2]replaceAll(" ", " ")
			println ('===================== CurrentMonth 1')
			println (currentMonth)

			if (daftarBulan.indexOf(currentMonth) < daftarBulan.indexOf(targetBulan)) {
				for (int j = daftarBulan.indexOf(currentMonth); j < daftarBulan.indexOf(targetBulan); j++) {
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115B_BULAN NEXT'),
							GlobalVariable.timeOut)
				}
			} else {
				for (int j = daftarBulan.indexOf(currentMonth); j > daftarBulan.indexOf(targetBulan); j--) {
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115C_BULAN PREV'),
							GlobalVariable.timeOut)
				}
			}

			//PILIH TANGGAL
			try {
				elm = driver.findElementsByClassName('android.view.View')

				for (int i = 0; i < elm.size; i++) {
					while (!(targetHari.equals(elm.get(i).getText()))) {

						Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115I_MONTHVIEW'),
								targetHari,GlobalVariable.timeOut)

						Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115F_OK'),
								GlobalVariable.timeOut)
					}
				}
			}
			catch (Exception e) {
				e.printStackTrace()
			}
		} else if (tahunTerakhir < targetTahunInteger) {
			println('SWIPE UP')

			while (!(tahun.contains(targetTahun))) {
				Mobile.swipe(xBawah, yBawah, xAtas, yAtas)

				elm = driver.findElementsByClassName('android.widget.TextView')

				tahun = new ArrayList<AndroidElement>()

				for (int i = 0; i < elm.size; i++) {
					if (i > 1) {
						tahun.add(elm.get(i).getText())
					}
				}

			}

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115H_ListView'),
					targetTahun,GlobalVariable.timeOut)

			elm = driver.findElementsByClassName('android.widget.TextView')

			ArrayList<AndroidElement> ElementDate = new ArrayList<AndroidElement>()

			ElementDate = new ArrayList<AndroidElement>()

			for (int i = 0; i < elm.size; i++) {
				ElementDate.add(elm.get(i).getText())
			}

			String currentMonth = ElementDate.get(1)toString().split(" ")[2]replaceAll(" ", "")
			println ('===================== CurrentMonth 2')

			if (daftarBulan.indexOf(currentMonth) < daftarBulan.indexOf(targetBulan)) {
				for (int j = daftarBulan.indexOf(currentMonth); j < daftarBulan.indexOf(targetBulan); j++) {
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115B_BULAN NEXT'),
							GlobalVariable.timeOut)
				}

			} else {
				for (int j = daftarBulan.indexOf(currentMonth); j > daftarBulan.indexOf(targetBulan); j--) {
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115C_BULAN PREV'),
							GlobalVariable.timeOut)
				}
			}

			try {
				elm = driver.findElementsByClassName('android.view.View')

				for (int i = 0; i < elm.size; i++) {
					while (!(targetHari.equals(elm.get(i).getText()))) {

						Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115I_MONTHVIEW'),
								targetHari,GlobalVariable.timeOut)

						Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115F_OK'),
								GlobalVariable.timeOut)
					}
				}
			}
			catch (Exception e) {
				e.printStackTrace()
			}
		} else {

			elm = driver.findElementsByClassName('android.widget.TextView')
			println("ELM SIZE " + elm.size)

			tahun = new ArrayList<AndroidElement>()
			for (int i = 0; i < elm.size; i++) {
				if (i > 1) {
					tahun.add(elm.get(i).getText())
					println(elm.get(i).getText())
				}
			}

			try{
				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115H_ListView'),
						targetTahun,GlobalVariable.timeOut)
			}catch(Exception e){
				println("SELECT TAHUN ERROR")
				e.printStackTrace
			}
			elm = driver.findElementsByClassName('android.widget.TextView')

			ArrayList<AndroidElement> ElementDate = new ArrayList<AndroidElement>()
			ElementDate = new ArrayList<AndroidElement>()
			for (int i = 0; i < elm.size; i++) {
				ElementDate.add(elm.get(i).getText())
			}

			String currentMonth = ElementDate.get(1)toString().split(" ")[2]replaceAll(" ", "")
			println ('===================== CurrentMonth 3')

			if (daftarBulan.indexOf(currentMonth) < daftarBulan.indexOf(targetBulan)) {
				for (int j = daftarBulan.indexOf(currentMonth); j < daftarBulan.indexOf(targetBulan); j++) {
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115B_BULAN NEXT'),
							GlobalVariable.timeOut)
				}

			} else {
				for (int j = daftarBulan.indexOf(currentMonth); j > daftarBulan.indexOf(targetBulan); j--) {
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115C_BULAN PREV'),
							GlobalVariable.timeOut)
				}
			}
			try {
				elm = driver.findElementsByClassName('android.view.View')

				for (int i = 0; i < elm.size; i++) {
					while (!(targetHari.equals(elm.get(i).getText()))) {
						Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115I_MONTHVIEW'),
								targetHari,GlobalVariable.timeOut)

						Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121115_TGLDEBITUR/0121115F_OK'),
								GlobalVariable.timeOut)
					}
				}
			}
			catch (Exception e) {
				e.printStackTrace()
			}
		}


	}

}
