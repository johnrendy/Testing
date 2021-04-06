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
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
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


import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.webui.driver.DriverFactory

public class SurveyTempatUsaha {
	@Keyword
	public void Foto(){

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115K_PLUS'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115L_TAMBAHFOTO'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121156_FOTO/0121156B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121156_FOTO/0121156D_OK'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\04_FOTO.png',
				FailureHandling.STOP_ON_FAILURE)
	}


	@Keyword
	public void UbahLokasi(TestObject to, String KODEPOS, String LOKASI){

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151A_UBAH LOKASI'),
				GlobalVariable.timeOut)

		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)

		if (element != null) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'),
					GlobalVariable.timeOut)

			'Search Lokasi'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151B_SEARCHBYLOCATION'),
					GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151F_KODEPOS'),
					GlobalVariable.timeOut)

			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\05_DATA KODE POS.png',
					FailureHandling.STOP_ON_FAILURE)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/01211511_KODE POS/01211511B_CARIDATA'),
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.doubleTap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/01211511_KODE POS/01211511C_LIST KODE POS'),
					GlobalVariable.timeOut)

			'Create Text Data Lokasi'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151E_KETIKLOKASI'),
					LOKASI, GlobalVariable.timeOut)

			'Klik Cari'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151G_CARI'),
					GlobalVariable.timeOut)

			'Klik Set Loaction'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151C_SET LOCATION'),
					GlobalVariable.timeOut)
		}else{
			'Search Lokasi'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151B_SEARCHBYLOCATION'),
					GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151F_KODEPOS'),
					GlobalVariable.timeOut)

			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\05_DATA KODE POS.png',
					FailureHandling.STOP_ON_FAILURE)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/01211511_KODE POS/01211511B_CARIDATA'),
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.doubleTap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/01211511_KODE POS/01211511C_LIST KODE POS'),
					GlobalVariable.timeOut)

			'Create Text Data Lokasi'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151E_KETIKLOKASI'),
					LOKASI, GlobalVariable.timeOut)

			'Klik Cari'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151G_CARI'),
					GlobalVariable.timeOut)

			'Klik Set Loaction'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121151_UBAH LOKASI/0121151C_SET LOCATION'),
					GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void IdentitasUsaha(String IDENTITASUSAHA,String NOSIUP,String NOSKU,String NOPERIJINANLAINNYA,String TGLUSAHA,String NPWP){

		'Klik Cari'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121154_IDENTITASUSAHA/0121154A_IDENTITASUSAHA'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListView'(IDENTITASUSAHA)

		if (IDENTITASUSAHA == 'SIUP') {
			'Create Text Data No SIUP'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121154_IDENTITASUSAHA/0121154B_NOSIUP'),
					NOSIUP, GlobalVariable.timeOut)
		} else if (IDENTITASUSAHA == 'SKU') {
			'Create Text Data No SKU'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121154_IDENTITASUSAHA/0121154C_SKU'),
					NOSKU, GlobalVariable.timeOut)
		} else {
			'Create Text Data No Ijin Lain'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121154_IDENTITASUSAHA/0121154D_NOIJINLAIN'),
					NOPERIJINANLAINNYA, GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121154_IDENTITASUSAHA/0121154E_TGLUSAHA'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(TGLUSAHA, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121154_IDENTITASUSAHA/0121154F_NPWP'),
				NPWP, GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\06_IDENTITAS USAHA.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void AlamatUsaha(String ALAMATSAMA, String ALAMAT, String RT, String RW, String KODEPOS){
		if (ALAMATSAMA == 'YA') {
			'Memilih Switch OFF'
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Memilih Switch ON'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Switch OFF'
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
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
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.doubleTap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121152_ALAMAT/01211521_KODE POS/01211521C_LIST KODE POS'),
					GlobalVariable.timeOut)
		}

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\07_ALAMAT.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void DataKeuangan(
			String STATUSKEPEMILIKAN,String TRANSAKSI,String JENISANALISAFINANSIAL,String OMSET_B,String BIAYAHPP_B,String JMLTNGAKERJA_B,
			String UPAHKERJA_B,String JMLHARI,String OMSET_H,String BIAYAHPP_H,	String JMLTNGAKERJA_H,String UPAHKERJA_H,String JENISDAGANGAN,
			String JMLDAGANGAN,String HRGJUAL,String HPPDAGANGAN,String OMSET_D,String BIAYAHPP_D,String JMLTNGAKERJA_D,String UPAHKERJA_D,
			String LUASLAHAN,String PRODUKSI,String HARGAJUALPRODUKSI,String BIAYAPRODUKSI,String JMLTENAGAKERJA_T,	String UPAHKERJA_T,String BPAJAK,
			String BSEWA,String BLISTRIK,String BRMHTANGGA,String BLAINLAIN,String BANGSURAN,String PENDAPATSAMPINGAN
	){

		'Select Transaksi Normal Harian'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155B_TRANSAKSI'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListView'(TRANSAKSI)

		'Select Jenis Analisa Finansial'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155C_JENISANALISA'),
				GlobalVariable.timeOut)
		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListView'(JENISANALISAFINANSIAL)

		if (JENISANALISAFINANSIAL == 'Analisa Finansial Bulanan') {

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211554_AFINANSIALBULAN/01211554A_OMSET'),
					OMSET_B, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211554_AFINANSIALBULAN/01211554B_BIAYAHPP'),
					BIAYAHPP_B, GlobalVariable.timeOut)


			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211554_AFINANSIALBULAN/01211554C_JMLTENAGAKERJA'),
					JMLTNGAKERJA_B, GlobalVariable.timeOut)

			Mobile.scrollToText('Biaya Pajak', FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211554_AFINANSIALBULAN/01211554D_UPAHPERTNGA'),
					UPAHKERJA_B, GlobalVariable.timeOut)
		} else if (JENISANALISAFINANSIAL == 'Analisa Finansial Harian') {

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211555_AFINANSIALHARI/01211555A_JMLHARI'),
					JMLHARI, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211555_AFINANSIALHARI/01211555B_OMSET'),
					OMSET_H, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211555_AFINANSIALHARI/01211555C_BIAYAHPP'),
					BIAYAHPP_H, GlobalVariable.timeOut)

			Mobile.scrollToText('Biaya Pajak', FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211555_AFINANSIALHARI/01211555D_JMLTENAGAKERJA'),
					JMLTNGAKERJA_H, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211555_AFINANSIALHARI/01211555E_UPAHPERTNGA'),
					UPAHKERJA_H, GlobalVariable.timeOut)
		} else if (JENISANALISAFINANSIAL == 'Analisa Finansial Detail Dagangan') {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/01211556A_DETAILDAGANG'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/012115561_DETAIL/1A_JENIS'),
					JENISDAGANGAN, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/012115561_DETAIL/1B_JUMLAH'),
					JMLDAGANGAN, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/012115561_DETAIL/1C_HRG'),
					HRGJUAL, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/012115561_DETAIL/1D_HPP'),
					HPPDAGANGAN, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/012115561_DETAIL/1E_SUBMIT'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/01211556B_OMSET'),
					OMSET_D, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/01211556C_BIAYAHPP'),
					BIAYAHPP_D, GlobalVariable.timeOut)

			Mobile.scrollToText('Biaya Pajak', FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/01211556D_JMLTENAGAKERJA'),
					JMLTNGAKERJA_D, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211556_AFINANSIALDDAGANG/01211556E_UPAHPERTNGA'),
					UPAHKERJA_D, GlobalVariable.timeOut)
		} else {
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211557_AFINANSIALPERTANIAN/01211557A_LUASLAHAN'),
					LUASLAHAN, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211557_AFINANSIALPERTANIAN/01211557B_PRODUKSI'),
					PRODUKSI, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211557_AFINANSIALPERTANIAN/01211557C_HRGJUALP'),
					HARGAJUALPRODUKSI, GlobalVariable.timeOut)
			Mobile.swipe(540, 1381, 543, 670)
			//Mobile.scrollToText('Jumlah tenaga yang dipekerjakan dalam 1 periode.', FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211557_AFINANSIALPERTANIAN/01211557D_BPRODUKSI'),
					BIAYAPRODUKSI, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211557_AFINANSIALPERTANIAN/01211557E_JMLTENAGAKERJA'),
					JMLTENAGAKERJA_T, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/01211557_AFINANSIALPERTANIAN/01211557F_UPAHPERTNGA'),
					UPAHKERJA_T, GlobalVariable.timeOut)

			Mobile.swipe(540, 1381, 543, 670)

			//Mobile.scrollToText('Biaya angsuran', FailureHandling.STOP_ON_FAILURE)
		}

		'Create Text Data Biaya Pajak'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155D_BPAJAK'),
				BPAJAK, GlobalVariable.timeOut)

		'Create Text Data Biaya Sewa'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155E_BSEWA'),
				BSEWA, GlobalVariable.timeOut)

		'Create Text Data Biaya Listrik'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155F_BLTAIR'),
				BLISTRIK, GlobalVariable.timeOut)

		Mobile.scrollToText('Biaya kebutuhan rumah tangga', FailureHandling.STOP_ON_FAILURE)

		'Create Text Data Biaya Rumah Tangga'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155G_BRMHTGGA'),
				BRMHTANGGA, GlobalVariable.timeOut)

		Mobile.scrollToText('Biaya angsuran', FailureHandling.STOP_ON_FAILURE)

		'Create Text Data Biaya  Lain-lain'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155H_BLAIN'),
				BLAINLAIN, GlobalVariable.timeOut)

		'Create Text Data Biaya Angsuran'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155I_BANGSURAN'),
				BANGSURAN, GlobalVariable.timeOut)
		Mobile.scrollToText('Pendapatan diluar usaha utama', FailureHandling.STOP_ON_FAILURE)
		'Create Text Data Pendapatan Sampingan'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155J_PNDPTANS'),
				PENDAPATSAMPINGAN, GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\08_BIAYA ANALISA HARIAN.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('HITUNG', FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121155_DATAKEUANGAN/0121155K_HITUNG'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\09_DATAKEUANGAN.png',
				FailureHandling.STOP_ON_FAILURE)

		'Simpan data'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115J_NEXT'),
				GlobalVariable.timeOut)

		'Select Ya'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115H_IYA'),
				GlobalVariable.timeOut)
	}
}
