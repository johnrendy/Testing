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

public class Pengurus {

	@Keyword
	public void openApplication(Integer screenWidth, Integer screenHeight){

		Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BrispotDevKemendagri_02.apk', false, FailureHandling.CONTINUE_ON_FAILURE)
		screenWidth = Mobile.getDeviceWidth()
		screenHeight = Mobile.getDeviceHeight()

		Mobile.waitForElementPresent(findTestObject('01_HOME/012_PRAKARSA/012C_PRAKARSA'), GlobalVariable.timeOut)
	}

	@Keyword
	public void DataPengurus(String nama, String nik, String npwp, String tempat_lahir, String tanggal_lahir,String jenis_kelamin, String jabatan, String share_kepemilikan, String alamat, String kode_pos){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/0121311A_NAMA'),
				nama, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/0121311B_NIK'),
				nik, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/0121311C_NPWP'),
				npwp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/0121311D_TEMPATLAHIR'),
				tempat_lahir, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012132_PENJAMIN/0121321_DATA PENJAMIN/0121321E_TGLLAHIR'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.Pengurus.Tanggal'(tanggal_lahir, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/0121311F_JKELAMIN'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		if (jenis_kelamin == 'Laki-Laki') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/03_JENISKELAMIN/03A_Laki-Laki'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/03_JENISKELAMIN/03B_Perempuan'),
					GlobalVariable.timeOut)
		}
		//PilihJabatan
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/0121311G_JABATAN'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

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
		if(textIsiDariDropdown.contains(jabatan)){
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012132_PENJAMIN/0121321_DATA PENJAMIN/0121321L_LISTVIEW JABATAN'),
					jabatan, GlobalVariable.timeOut)

		}else{
			while(!textIsiDariDropdown.contains(jabatan)){
				Mobile.swipe(xBawah, yBawah,xAtas, yAtas)
				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')
				textIsiDariDropdown = new ArrayList<AndroidElement>()
				for (int i = 0; i < elementDariDropdown.size; i++) {
					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
				}
			}
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012132_PENJAMIN/0121321_DATA PENJAMIN/0121321L_LISTVIEW JABATAN'),
					jabatan, GlobalVariable.timeOut)
		}

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\PENGURUS DAN PENJAMIN\\PENGURUS\\02_DATA PENGURUS.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.scrollToText('Kabupaten/Kota', FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/0121311H_SHAREKPMLKAN'),
				share_kepemilikan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/0121311I_ALAMAT'),
				alamat, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012132_PENJAMIN/0121321_DATA PENJAMIN/0121321J_KODEPOS'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121311_DATA PENGURUS/02_KODEPOS/02A_SEARCHKODEPOS'),
				kode_pos, GlobalVariable.timeOut)

		Mobile.tapAtPosition(530, 303)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\PENGURUS DAN PENJAMIN\\PENGURUS\\03_DATA PENGURUS.png',
				FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void Foto(){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121312_FOTO/0121312A_FOTO'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121312_FOTO/0121312B_CAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121312_FOTO/02_CAMERA/02B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121312_FOTO/02_CAMERA/02D_OK'),
				GlobalVariable.timeOut)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\PENGURUS DAN PENJAMIN\\PENGURUS\\04_FOTO.png',
				FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void Selesai(){
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\PENGURUS DAN PENJAMIN\\PENGURUS\\10_Selesai.png',
				FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121313_SELESAI/0121313A_KIRIM'),
				GlobalVariable.timeOut)


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
