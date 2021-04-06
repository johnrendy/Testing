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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper

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
import internal.GlobalVariable



import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By


public class SurveyDataPribadi {


	@Keyword
	public void Pencarian(TestObject to,String NAMALENGKAP){
		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)
		if (element != null) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), GlobalVariable.timeOut)

			'Search data'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121B_CARI DEBITUR'), NAMALENGKAP, GlobalVariable.timeOut)

			Mobile.delay(30, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tapAtPosition(481, 1024)
		}else{

			'Search data'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121B_CARI DEBITUR'), NAMALENGKAP, GlobalVariable.timeOut)

			Mobile.delay(30, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tapAtPosition(481, 1024)
		}
	}


	@Keyword
	public void FotoKTP(){
		'PIlih KTP Debitur'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/01_KTP DEBITUR/01A_FOTO'),
				GlobalVariable.timeOut)

		'Get Picture'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/01_KTP DEBITUR/01B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		'Pilih OK'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/01_KTP DEBITUR/01D_OK'),
				GlobalVariable.timeOut)

		'Pilih KTP Pasangan'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/02_KTP PASANGAN/02A_FOTO'),
				GlobalVariable.timeOut)

		'Get Picture'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/02_KTP PASANGAN/02B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		'Pilih OK'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/02_KTP PASANGAN/02D_OK'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\04_DETAIL KTP.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void DataPribadi(String NIK, String NAMALENGKAP, String JKELAMIN, String STATUS,
			String NIKPAS,
			String NAMAPAS,
			String JKELAMINPAS,
			String TGLPAS,
			String TANGGUNGAN,
			String TEMPATLAHIR,
			String TGLLAHIR,
			String NAMAIBU,
			String AGAMAIBU,
			String BIDANGUSAHA,
			String BIDANGUSAHALAIN, String PISAH_HARTA, String AGAMALAINNYA, String NOHP ){
		'Input NIK calon debitur'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/0121122A_NIK'),
				NIK, GlobalVariable.timeOut)

		'Input nama lengkap calon debitur'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/0121122B_NAMALENGKAP'),
				NAMALENGKAP, GlobalVariable.timeOut)

		if (JKELAMIN == 'WANITA') {
			'Memilih Jenis Kelamin Wanita'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/01_JKELAMIN/01211221B_WANITA'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Jenis Kelamin Pria'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/01_JKELAMIN/01211221A_PRIA'),
					GlobalVariable.timeOut)
		}

		if (STATUS == 'SINGLE') {
			'Memilih Status Single '
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/02_SPERKAWINAN/01211222A_SINGLE'),
					GlobalVariable.timeOut)
		} else if (STATUS == 'MENIKAH') {
			'Memilih Status Menikah '
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/02_SPERKAWINAN/01211222B_MENIKAH'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Status Cerai'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/02_SPERKAWINAN/01211222C_CERAI'),
					GlobalVariable.timeOut)
		}

		'Pilih menu tempatlahir\r\n'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/0121122C_TEMPATLAHIR'),
				TEMPATLAHIR, GlobalVariable.timeOut)

		'Pilih menu tanggallahir\r\n'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/03_TGL/03A_KLIK TGL'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(TGLLAHIR, GlobalVariable.timeOut, GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\05_DATA PRIBADI SATU.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Bidang Usaha', FailureHandling.STOP_ON_FAILURE)

		'Memasukkan Nama Ibu\r\n'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/0121122F_NAMA IBU'),
				NAMAIBU, GlobalVariable.timeOut)

		'Memilih agama ibu\r\n'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/05_AGAMAIBU/05A_AGAMA IBU'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListView'(AGAMAIBU)

		if (AGAMAIBU == 'Lainnya') {
			'Input Agama'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/05_AGAMAIBU/05H_AGAMA LAIN'),
					AGAMALAINNYA, GlobalVariable.timeOut)
		}

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/0121122D_NOHP'),
				NOHP, GlobalVariable.timeOut)

		'Select Bidang Usaha'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/04_BIDANGUSAHA/04A_BDGUSAHA'),
				GlobalVariable.timeOut)

		'Search Bidang Usaha'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/04_BIDANGUSAHA/04C_CARIDATA'),
				BIDANGUSAHA, GlobalVariable.timeOut)

		'List Data Pertama'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/04_BIDANGUSAHA/04A_LIST DATA'),
				GlobalVariable.timeOut)

		'Select Bidang Usaha Lain'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/0121122F_BIDANG USAHA LAIN'),
				BIDANGUSAHALAIN, GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\06_DATA PRIBADI DUA.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('NEXT', FailureHandling.STOP_ON_FAILURE)

		if (STATUS == 'MENIKAH') {
			CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.DataPasangan'(NIKPAS, NAMAPAS, JKELAMINPAS, TGLPAS, TANGGUNGAN, PISAH_HARTA)
		}

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\07_DATA PRIBADI TIGA.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void DataPasangan(String NIKPAS, String NAMAPAS, String JKELAMINPAS, String TGLPAS, String TANGGUNGAN,String PISAH_HARTA){
		'Input NIK calon debitur'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/06_DATA PASANGAN/06A_NIK Pasangan'),
				NIKPAS, GlobalVariable.timeOut)

		'Input NIK calon debitur'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/06_DATA PASANGAN/06G_Nama Lengkap Pasangan'),
				NAMAPAS, GlobalVariable.timeOut)

		if (JKELAMINPAS == 'WANITA') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/06_DATA PASANGAN/06C_WANITA'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/06_DATA PASANGAN/06B_PRIA'),
					GlobalVariable.timeOut)
		}

		'Pilih menu tanggallahir pasangan\r\n'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/06_DATA PASANGAN/06D_Tanggal Lahir Pasangan'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(TGLPAS, GlobalVariable.timeOut, GlobalVariable.timeOut)

		if (PISAH_HARTA.equals('YA')) {
			'Pisah Harta'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/06_DATA PASANGAN/06E_PISAH HARTA'),
					GlobalVariable.timeOut)
		} else {
			'Pisah Harta'
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/06_DATA PASANGAN/06E_PISAH HARTA'),
					GlobalVariable.timeOut)
		}

		'Pilih menu tempatlahir\r\n'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/06_DATA PASANGAN/06F_Tanggungan'),
				TANGGUNGAN, GlobalVariable.timeOut)
	}

	@Keyword
	public void Alamat(String ALAMAT,String RT,String RW,String KODEPOS,String KEC, String KEL,String STATUS,String ALAMATPAS,String RTPAS,String RWPAS,String KODEPOSPAS, String KECPAS, String KELPAS){
		'Input Alamat'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/0121123A_ALAMAT'),
				ALAMAT, GlobalVariable.timeOut)

		'Input RT'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/0121123B_RT'),
				RT, GlobalVariable.timeOut)

		'Input RW'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/0121123C_RW'),
				RW, GlobalVariable.timeOut)

		'Input Kode Pos'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/0121123D_KODEPOS'),
				GlobalVariable.timeOut)

		'Search Data'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211231_KODE POS/01211231B_CARIDATA'),
				KODEPOS, GlobalVariable.timeOut)

		'Selected Data Kode Pos'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211231_KODE POS/01211231C_LIST KODE POS'),
				GlobalVariable.timeOut)

		//		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/0121123G_KEC'),
		//				KEC, GlobalVariable.timeOut)

		if (STATUS == 'MENIKAH') {
			Mobile.scrollToText('Alamat pasangan', FailureHandling.STOP_ON_FAILURE)

			'Input Alamat Pas'
			if (ALAMAT == ALAMATPAS) {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211232_ALAMATP/01211232I_SWITCHONPAS'),
						GlobalVariable.timeOut)

				Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211232_ALAMATP/01211232I_SWITCHONPAS'),
						GlobalVariable.timeOut)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211232_ALAMATP/01211232I_SWITCHONPAS'),
						GlobalVariable.timeOut)
			} else {
				'Input Alamat'
				Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211232_ALAMATP/01211232A_ALAMATPAS'),
						ALAMATPAS, GlobalVariable.timeOut)

				'Input RT'
				Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211232_ALAMATP/01211232B_RTPAS'),
						RTPAS, GlobalVariable.timeOut)

				'Input RW'
				Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211232_ALAMATP/01211232C_RWPAS'),
						RWPAS, GlobalVariable.timeOut)

				'Input Kode Pos'
				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211232_ALAMATP/01211232D_KODEPOSPAS'),
						GlobalVariable.timeOut)

				'Search Data'
				Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211231_KODE POS/01211231B_CARIDATA'),
						KODEPOSPAS, GlobalVariable.timeOut)

				'Selected Data Kode Pos'
				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121123_ALAMAT/01211231_KODE POS/01211231C_LIST KODE POS'),
						GlobalVariable.timeOut)

				'Capture Screenshoot'
				Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\10_1 ALAMAT PASANGAN BERBEDA.png',
						FailureHandling.STOP_ON_FAILURE)

				Mobile.scrollToText('Next', FailureHandling.STOP_ON_FAILURE)

				'Capture Screenshoot'
				Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\09 ALAMAT DUA.png',
						FailureHandling.STOP_ON_FAILURE)
			}
		}
		else{
			Mobile.scrollToText('NEXT', FailureHandling.STOP_ON_FAILURE)
			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\08_ALAMAT SATU.png',
					FailureHandling.STOP_ON_FAILURE)
		}
	}


	@Keyword
	public void InfoLain(String PEKERJAAN,	String PEKERJAANCIF,	String STATUSGELAR,	String PINJAMBANK,	String NAMABANKLAIN,	String JENISREK,
			String TBREKENING, String datalistviewproduk,	String PKERJASAMA,	String INSTANSIBRIGUNA,	String NONGTOG,	String NAMAPJTKI,
			String PKSPJTKI, String NOPKS,
			String PENGHASILAN){
		'Input Pekerjaan'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/01_PEKERJAAN/01A_PEKERJAAN'),
				GlobalVariable.timeOut)

		'Search Pekerjaan'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/01_PEKERJAAN/01D_CARIDATA'),
				PEKERJAAN, GlobalVariable.timeOut)

		'Memilih Pekerjaan'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/01_PEKERJAAN/01C_LIST PEKERJAAN'),
				GlobalVariable.timeOut)

		'Input Pekerjaan CIF'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/02_PEKERJAAN CIF/02A_PKERJANCIF'),
				GlobalVariable.timeOut)

		'Search Pekerjaan CIF'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/02_PEKERJAAN CIF/02D_CARIDATA'),
				PEKERJAANCIF, GlobalVariable.timeOut)

		'Memilih Pekerjaan CIF'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/02_PEKERJAAN CIF/02C_LIST PCIF'),
				GlobalVariable.timeOut)

		'Input Status Gelar'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/03_STATUS GELAR/03A_STATUSGELAR'),
				GlobalVariable.timeOut)

		'Search Status Gelar'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/03_STATUS GELAR/03D_CARIDATA'),
				STATUSGELAR, GlobalVariable.timeOut)

		'Memilih Status Gelar'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/03_STATUS GELAR/03C_LIST STATUS'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\10 INFO LAIN SEGMENTASI KREDIT.png',
				FailureHandling.STOP_ON_FAILURE)
		if (PINJAMBANK == 'YA') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/05B_SWITCH ON'),
					GlobalVariable.timeOut)

			'Memilih YA Pinjam Bank Lain'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/05B_SWITCH ON'),
					GlobalVariable.timeOut)

			'Input Nama Bank Lain'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/05A_NAMABANKLAIN'),
					NAMABANKLAIN, GlobalVariable.timeOut)

			'Memilih YA Pinjam Bank Lain'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/051_JENISREK/1A_JENISREKENING'),
					GlobalVariable.timeOut)

			if (JENISREK == 'Simpanan') {
				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/051_JENISREK/1C_SIMPANAN'),
						GlobalVariable.timeOut)
			} else if (JENISREK == 'Pinjaman') {
				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/051_JENISREK/1B_PINJAMAN'),
						GlobalVariable.timeOut)
			} else {
				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/051_JENISREK/1D_TIDAKADA'),
						GlobalVariable.timeOut)
			}

			Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)

			'Memilih Tujuan Buka Rekening'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/05C_TBREKENING'),
					GlobalVariable.timeOut)

			if (TBREKENING == 'Transaksi') {
				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/052_TUJUANBUKAREKENING/2A_TRANS'),
						GlobalVariable.timeOut)
			} else if (TBREKENING == 'Pribadi') {
				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/052_TUJUANBUKAREKENING/2B_PRIBADI'),
						GlobalVariable.timeOut)
			} else {
				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/052_TUJUANBUKAREKENING/2C_LAINNYA'),
						GlobalVariable.timeOut)
			}
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/05B_SWITCH ON'),
					GlobalVariable.timeOut)

			Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/05_PINJAM/05B_SWITCH ON'),
					GlobalVariable.timeOut)
		}


		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04A_SEGKREDIT'),
				GlobalVariable.timeOut)
		CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.DataListSegmenProduk'(datalistviewproduk, PKERJASAMA, INSTANSIBRIGUNA, NONGTOG,
				NAMAPJTKI, PKSPJTKI, NOPKS)
		//		CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.SegmenProduk'(datalistviewproduk, PKERJASAMA, INSTANSIBRIGUNA, NONGTOG,
		//				NAMAPJTKI, PKSPJTKI, NOPKS)

		//		CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.DataListViewSegmenProduk'(datalistviewproduk, PKERJASAMA, INSTANSIBRIGUNA, NONGTOG,
		//				NAMAPJTKI, PKSPJTKI, NOPKS)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/012112E_PENGHASILAN'),
				GlobalVariable.timeOut)

		if (PENGHASILAN == 's.d. 5 Juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/06_PENDAPATAN/06A_sd5juta'),
					GlobalVariable.timeOut)
		} else if (PENGHASILAN == '> 5 Juta s.d. 10 Juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/06_PENDAPATAN/06B_lebih5juta'),
					GlobalVariable.timeOut)
		} else if (PENGHASILAN == '> 10 Juta s.d. 50 Juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/06_PENDAPATAN/06C_lebih10juta'),
					GlobalVariable.timeOut)
		} else if (PENGHASILAN == '> 50 Juta s.d. 100 Juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/06_PENDAPATAN/06D_lebih50juta'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/06_PENDAPATAN/06E_lebih100juta'),
					GlobalVariable.timeOut)
		}



		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\11 INFO LAIN.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/012112C_NEXT'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/012112G_SUKSESYA'),
				GlobalVariable.timeOut)
	}

	@Keyword
	public void DataListSegmenProduk(String datalistviewproduk, String PKERJASAMA, String INSTANSIBRIGUNA,String NONGTOG,	String NAMAPJTKI,
			String PKSPJTKI, String NOPKS){

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
		if(textIsiDariDropdown.contains(datalistviewproduk)) {
			if (datalistviewproduk.trim().equals('Briguna Karya/Umum')) {
				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)

				Mobile.scrollToText('Ada perjanjian kerjasama', FailureHandling.STOP_ON_FAILURE)
				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04F_INSTANSI'),
						GlobalVariable.timeOut)

				CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.DataListViewInstansi'(INSTANSIBRIGUNA)

				if (PKERJASAMA.equals('YA')) {

					Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/041_INSTANSIBRIGUNA/1B_SJANJI'),
							GlobalVariable.timeOut)

					Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04G_PJANJI'),
							GlobalVariable.timeOut)
				}else{
					Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/041_INSTANSIBRIGUNA/1B_SJANJI'),
							GlobalVariable.timeOut)
				}
			} else if(datalistviewproduk.equals('Briguna Purna')) {

				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)

				Mobile.scrollToText('Ada perjanjian kerjasama', FailureHandling.STOP_ON_FAILURE)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04F_INSTANSI'),
						GlobalVariable.timeOut)

				CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.DataListViewInstansi'(INSTANSIBRIGUNA)

				if (PKERJASAMA.equals('YA')) {

					Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/041_INSTANSIBRIGUNA/1B_SJANJI'),
							GlobalVariable.timeOut)

					Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04G_PJANJI'),
							GlobalVariable.timeOut)
				}else{
					Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/041_INSTANSIBRIGUNA/1B_SJANJI'),
							GlobalVariable.timeOut)
				}
			} else if(datalistviewproduk.equals('Briguna Karyawan')) {

				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)

				Mobile.scrollToText('Ada perjanjian kerjasama', FailureHandling.STOP_ON_FAILURE)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04F_INSTANSI'),
						GlobalVariable.timeOut)

				CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.DataListViewInstansi'(INSTANSIBRIGUNA)

				if (PKERJASAMA.equals('YA')) {

					Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/041_INSTANSIBRIGUNA/1B_SJANJI'),
							GlobalVariable.timeOut)

					Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04G_PJANJI'),
							GlobalVariable.timeOut)
				}else{
					Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/041_INSTANSIBRIGUNA/1B_SJANJI'),
							GlobalVariable.timeOut)
				}
			}else if(datalistviewproduk.equals('KUR Mikro')) {

				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04B_CLOSEKURMIKRO'),
						GlobalVariable.timeOut)
				Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)
			}else if(datalistviewproduk.equals('KUR Super Mikro')) {

				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)

				Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04B_CLOSEKURMIKRO'),
						GlobalVariable.timeOut)
				Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)
			}else if(datalistviewproduk.equals('KUR TKI')) {

				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)
				Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)
				if (NONGTOG.equals('YA')) {
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/042_NONGTOG/NGTOG'),
							GlobalVariable.timeOut)

					Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/042_NONGTOG/PJTKI'),
							NAMAPJTKI, GlobalVariable.timeOut)

					Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)

					if (PKSPJTKI.equals('YA')) {
						Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/042_NONGTOG/SPKS'),
								GlobalVariable.timeOut)
					}

					Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/042_NONGTOG/NOPKS'),
							NOPKS, GlobalVariable.timeOut)
				} else {
					Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04C_GTOG'),
							GlobalVariable.timeOut)
				}
			}else if(datalistviewproduk.equals('Kupedes')) {
				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)
				Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)
			}else if(datalistviewproduk.equals('Cashcoll')) {
				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)
				Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)
			}else if(datalistviewproduk.equals('Kupedes KECE')) {
				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)
				Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)
			}else if(datalistviewproduk.equals('Kemitraan')) {
				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)
				Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)
			}else{
				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
						datalistviewproduk, GlobalVariable.timeOut)
				Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)
			}
		}
	}

	@Keyword
	public void DataListViewInstansi(String datalistviewInstansi){

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

		if (textIsiDariDropdown.contains(datalistviewInstansi)) {

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
					datalistviewInstansi, GlobalVariable.timeOut)
		} else {
			while (!(textIsiDariDropdown.contains(datalistviewInstansi))) {
				Mobile.swipe(xBawah, yBawah, xAtas, yAtas)

				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

				textIsiDariDropdown = new ArrayList<AndroidElement>()

				for (int i = 0; i < elementDariDropdown.size; i++) {
					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
				}
			}

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121124_INFO LAIN/04_SEGKREDIT/04E_LISTPRODUK'),
					datalistviewInstansi, GlobalVariable.timeOut)
		}
	}


}
