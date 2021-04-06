package com.brispotmikroritel.publickeyword


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


public class PublicKeyword {

	@Keyword
	public void openApplication(){
		Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BRISPOT MIKRO DAN RITEL\\BrispotDev_v3.7.4.apk', false, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void SearchData(String search_data){
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/011E_CARIDATA'), search_data, GlobalVariable.timeOut)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		Mobile.tapAtPosition(416, 932)
	}

	@Keyword
	public void AddDataPemasaran(){

		//Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011A_DATA PEMASARAN'), GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011D_ICONPLUS'), GlobalVariable.timeOut)
	}

	@Keyword
	public void Foto(){
		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/01A_FOTO'), GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/011_FOTO/011A_CAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/011_FOTO/01_CAMERA/01A_OK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/011_FOTO/01_CAMERA/01B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/011_FOTO/01_CAMERA/01D_OK'),
				GlobalVariable.timeOut)
	}

	@Keyword
	def UbahLokasi(TestObject to, String LOKASI, String KODEPOS){
		'Pilih ubah lokasi'
		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/01B_UBAHLOKASI'), GlobalVariable.timeOut)

		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)
		if (element != null) {

			'Notif Lokasi'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'), GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'), GlobalVariable.timeOut)

			'Search Lokasi'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012A_SEARCHLOKASI'), GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012B_KODEPOS'), GlobalVariable.timeOut)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/01_KODEPOS/01A_CARIDATA'),
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.tapAtPosition(530, 303)

			'Create Text Data Lokasi'
			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012C_LOKASI'), LOKASI,
					GlobalVariable.timeOut)

			'Klik Cari'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012D_CARI'), GlobalVariable.timeOut)

			'Cari kata "set lokasi"'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012E_SETLOCATION'), GlobalVariable.timeOut)
		}else{
			'Search Lokasi'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012A_SEARCHLOKASI'), GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012B_KODEPOS'), GlobalVariable.timeOut)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/01_KODEPOS/01A_CARIDATA'),
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.tapAtPosition(530, 303)

			'Create Text Data Lokasi'
			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012C_LOKASI'), LOKASI,
					GlobalVariable.timeOut)

			'Klik Cari'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012D_CARI'), GlobalVariable.timeOut)

			'Cari kata "set lokasi"'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012E_SETLOCATION'), GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void Tanggal(String targetTanggal, Integer screenWidth, Integer screenHeight ) {

		screenWidth = Mobile.getDeviceWidth()
		screenHeight = Mobile.getDeviceHeight()

		String targetHari = targetTanggal.split('/')[0]

		String targetBulan = targetTanggal.split('/')[1]

		String targetTahun = targetTanggal.split('/')[2]

		String currentYear = Mobile.getText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023A_TAHUN'), GlobalVariable.timeOut)


		print("========")
		print(currentYear)
		ArrayList<AndroidElement> daftarBulan = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']

		def targetHariInteger = targetHari.toInteger()

		def targetTahunInteger = targetTahun.toInteger()

		def currentYearInteger = currentYear.toInteger()

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()


		//ArrayList<AndroidElement> tahun = new ArrayList<AndroidElement>()

		if(currentYearInteger != targetTahunInteger){
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023A_TAHUN'), GlobalVariable.timeOut)

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

			Integer yBawah = screenHeight * 0.5

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


				Mobile.selectListItemByLabel(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023B_LIST THN'),
						targetTahun, GlobalVariable.timeOut)

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
						Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023C_NEXT MONTH'), GlobalVariable.timeOut)

					}
				} else {
					for (int j = daftarBulan.indexOf(currentMonth); j > daftarBulan.indexOf(targetBulan); j--) {
						Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023D_BACK MONTH'), GlobalVariable.timeOut)

					}
				}

				//PILIH TANGGAL
				try {
					elm = driver.findElementsByClassName('android.view.View')

					for (int i = 0; i < elm.size; i++) {
						while (!(targetHari.equals(elm.get(i).getText()))) {

							Mobile.selectListItemByLabel(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023E_MONTHVIEW'),
									targetHari, GlobalVariable.timeOut)

							Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023F_OK'), GlobalVariable.timeOut)


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

				Mobile.selectListItemByLabel(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023B_LIST THN'),
						targetTahun, GlobalVariable.timeOut)


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
						Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023C_NEXT MONTH'), GlobalVariable.timeOut)

					}

				} else {
					for (int j = daftarBulan.indexOf(currentMonth); j > daftarBulan.indexOf(targetBulan); j--) {
						Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023D_BACK MONTH'), GlobalVariable.timeOut)

					}
				}

				try {
					elm = driver.findElementsByClassName('android.view.View')

					for (int i = 0; i < elm.size; i++) {
						while (!(targetHari.equals(elm.get(i).getText()))) {

							Mobile.selectListItemByLabel(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023E_MONTHVIEW'),
									targetHari, GlobalVariable.timeOut)
							Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023F_OK'), GlobalVariable.timeOut)

						}
					}
				}
				catch (Exception e) {
					e.printStackTrace()
				}

			}else{
				//=============edited==============
				Mobile.selectListItemByLabel(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023B_LIST THN'),
						targetTahun, GlobalVariable.timeOut)


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
						Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023C_NEXT MONTH'), GlobalVariable.timeOut)

					}

				} else {
					for (int j = daftarBulan.indexOf(currentMonth); j > daftarBulan.indexOf(targetBulan); j--) {
						Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023D_BACK MONTH'), GlobalVariable.timeOut)


					}
				}

				try {
					elm = driver.findElementsByClassName('android.view.View')

					for (int i = 0; i < elm.size; i++) {
						while (!(targetHari.equals(elm.get(i).getText()))) {

							Mobile.selectListItemByLabel(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023E_MONTHVIEW'),
									targetHari, GlobalVariable.timeOut)

							Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023F_OK'), GlobalVariable.timeOut)


						}
					}
				}
				catch (Exception e) {
					e.printStackTrace()
				}
				//=============edited==============
			}
		}else {
			ArrayList<AndroidElement> elm = driver.findElementsByClassName('android.widget.TextView')
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
					Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023C_NEXT MONTH'), GlobalVariable.timeOut)

				}

			} else {
				for (int j = daftarBulan.indexOf(currentMonth); j > daftarBulan.indexOf(targetBulan); j--) {
					Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023D_BACK MONTH'), GlobalVariable.timeOut)
				}
			}

			try {
				elm = driver.findElementsByClassName('android.view.View')

				for (int i = 0; i < elm.size; i++) {
					while (!(targetHari.equals(elm.get(i).getText()))) {

						Mobile.selectListItemByLabel(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023E_MONTHVIEW'),
								targetHari, GlobalVariable.timeOut)

						Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/023_TGL/023F_OK'), GlobalVariable.timeOut)
					}
				}
			}
			catch (Exception e) {
				e.printStackTrace()
			}
		}


	}

	@Keyword
	public void Alamat(String alamat, String rt, String rw, String kodepos_pemohon){
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/04_ALAMAT/04A_ALAMAT'), alamat, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/04_ALAMAT/04B_RT'), rt, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/04_ALAMAT/04C_RW'), rw, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/04_ALAMAT/04D_KODEPOS'), GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/04_ALAMAT/041_KODEPOS/041A_SEARCHKODEPOS'),
				kodepos_pemohon, GlobalVariable.timeOut)

		Mobile.tapAtPosition(530, 303)
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
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/05_JNSPENGGUNAAN/05D_LISTVIEW'),
					datalistview, GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void DataListViewCheck(String datalistview){

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
	public void RecyclerView(String jawaban){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		Integer screenWidth = Mobile.getDeviceWidth()

		Integer screenHeight = Mobile.getDeviceHeight()

		Integer xBawah = 408

		Integer yBawah = 1256

		Integer xAtas = 547

		Integer yAtas = 440

		ArrayList<AndroidElement> elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

		ArrayList<AndroidElement> textIsiDariDropdown = new ArrayList<AndroidElement>()

		for (int i = 0; i < elementDariDropdown.size; i++) {
			textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		}

		if (textIsiDariDropdown.contains(jawaban)) {
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03B_RecyclerView'), jawaban, GlobalVariable.timeOut)

		} else {
			while (!(textIsiDariDropdown.contains(jawaban))) {
				Mobile.swipe(xBawah, yBawah, xAtas, yAtas)

				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

				textIsiDariDropdown = new ArrayList<AndroidElement>()

				for (int i = 0; i < elementDariDropdown.size; i++) {
					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
				}
			}
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03B_RecyclerView'), jawaban, GlobalVariable.timeOut)

		}
		//CaptureScreenshoot

	}

}
