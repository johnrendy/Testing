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

public class SurveyDataAgunan {

	@Keyword
	public void Data(String DESKRIPSI, String KEPEMILIKAN, String PEMILIK, String STATUSKEPEMILIKAN, String NOSERTIFIKAT, String TGLBUKTIKPMLIKAN, String STATEAGUNAN, String KETERANGAN ){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01A_DEKSKRIPSI'),
				DESKRIPSI, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01B_KEPEMILIKAN'),
				GlobalVariable.timeOut)

		if (KEPEMILIKAN == 'Milik Sendiri') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/011_KEPEMILIKAN/011A_SNDR'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/011_KEPEMILIKAN/011B_ORGL'),
					GlobalVariable.timeOut)
		}

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01C_PEMILIK'),
				PEMILIK, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01D_STATUSKPMLKA'),
				GlobalVariable.timeOut)

		if (STATUSKEPEMILIKAN == 'Sertifikat Hak Milik') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/012_STATUS/012A_SKSHM'),
					GlobalVariable.timeOut)
		} else if (STATUSKEPEMILIKAN == 'Sertifikat Hak Guna Bangunan') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/012_STATUS/012B_SKSHGB'),
					GlobalVariable.timeOut)
		} else if (STATUSKEPEMILIKAN == 'Sertifikat Hak Pakai') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/012_STATUS/0112C_SKSHP'),
					GlobalVariable.timeOut)
		} else if (STATUSKEPEMILIKAN == 'Girik/Petok') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/012_STATUS/012D_SKGIRIK'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/012_STATUS/0112E_SKLAIN'),
					GlobalVariable.timeOut)
		}

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01E_NOSERTIFIKAT'),
				NOSERTIFIKAT, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01F_TGLBUKTI'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(TGLBUKTIKPMLIKAN, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01G_STATUSKETSEDIA'),
				GlobalVariable.timeOut)

		if (STATEAGUNAN == 'TERSEDIA') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/013_STATEAGUNAN/3A_TRSEDI'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/013_STATEAGUNAN/3B_INDEN'),
					GlobalVariable.timeOut)
		}

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01H_KETERANGAN'),
				KETERANGAN, GlobalVariable.timeOut)
	}

	@Keyword
	public void Alamat(String ALAMATSAMA, String ALAMAT, String RT, String RW, String KEC, String KEL, String KODEPOS ){
		if (ALAMATSAMA == 'YA') {
			'Memilih Switch OFF'
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Memilih Switch OFF'
			Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Memilih Switch ON'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Verify Switch ON'
			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Switch OFF'
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Memilih Switch OFF'
			Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612A_ALAMAT'),
					ALAMAT, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612B_RT'),
					RT, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612C_RW'),
					RW, GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612E_KODEPOS'),
					GlobalVariable.timeOut)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/021_KODE POS/021C_CARI'),
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/021_KODE POS/021B_LIST'),
					GlobalVariable.timeOut)
		}
	}


	@Keyword
	public void NilaiRumahTinggal(String LUASTANAH, String HARGATANAH, String PLIKUIDASITANAH, String LUASBANGUNAN, String HARGABANGUNAN, String PLIKUIDASIBANGUNAN ){

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3A_LUASTANAH'),
				LUASTANAH, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3B_HARGATANAH'),
				HARGATANAH, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3C_PERSENLIKUIDASITANAH'),
				PLIKUIDASITANAH, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3D_LUASBANGUNAN'),
				LUASBANGUNAN, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3E_HARGABANGUNAN'),
				HARGABANGUNAN, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3F_PLIKUIDASIBGN'),
				PLIKUIDASIBANGUNAN, GlobalVariable.timeOut)

		Mobile.scrollToText('HITUNG', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3N_HITUNG'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN RUMAH TINGGAL\\07_NILAI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612F_SIMPAN'),
				GlobalVariable.timeOut)
	}



	@Keyword
	public void NilaiBangunan(String LUASBANGUNAN, String HARGABANGUNAN, String PLIKUIDASIBANGUNAN ){

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3D_LUASBANGUNAN'),
				LUASBANGUNAN, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3E_HARGABANGUNAN'),
				HARGABANGUNAN, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3F_PLIKUIDASIBGN'),
				PLIKUIDASIBANGUNAN, GlobalVariable.timeOut)

		Mobile.scrollToText('HITUNG', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3N_HITUNG'),
				GlobalVariable.timeOut)

		Mobile.delay(GlobalVariable.timeOut, FailureHandling.CONTINUE_ON_FAILURE)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN BANGUNAN\\07_NILAI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612F_SIMPAN'),
				GlobalVariable.timeOut)
	}

	@Keyword
	public void NilaiTanah(String LUASTANAH, String HARGATANAH, String PLIKUIDASITANAH ){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3A_LUASTANAH'),
				LUASTANAH, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3B_HARGATANAH'),
				HARGATANAH, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3C_PERSENLIKUIDASITANAH'),
				PLIKUIDASITANAH, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3N_HITUNG'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN TANAH\\07_NILAI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612F_SIMPAN'),
				GlobalVariable.timeOut)
	}

	@Keyword
	public void NilaiPropertiKomersial(String LUASTANAH, String HARGATANAH, String PLIKUIDASITANAH, String LUASBANGUNAN, String HARGABANGUNAN, String PLIKUIDASIBANGUNAN ){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3A_LUASTANAH'),
				LUASTANAH, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3B_HARGATANAH'),
				HARGATANAH, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3C_PERSENLIKUIDASITANAH'),
				PLIKUIDASITANAH, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3D_LUASBANGUNAN'),
				LUASBANGUNAN, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3E_HARGABANGUNAN'),
				HARGABANGUNAN, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3F_PLIKUIDASIBGN'),
				PLIKUIDASIBANGUNAN, GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN PROPERTI KOMERSIAL\\07_NILAI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.scrollToText('HITUNG', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3N_HITUNG'),
				GlobalVariable.timeOut)

		Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN PROPERTI KOMERSIAL\\08_HASIL NILAI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612F_SIMPAN'),
				GlobalVariable.timeOut)
	}

	@Keyword
	public void Foto(String lokasi,String kode_pos){

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/041_FOTO/041A_FOTO'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/041_FOTO/041B_SHUT'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/041_FOTO/041E_OK'),
				GlobalVariable.timeOut)

		Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)
		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.UbahLokasi'(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'),
				lokasi, kode_pos)
	}

	@Keyword
	public void DataKendaraan(String DESKRIPSI,String KEPEMILIKAN,
			String PEMILIK,String KLASIFIKASIKENDARAAN,String MEREKKENDARAAN,String JENISKENDARAAN,String WARNAKENDARAAN,
			String TAHUNPEMBUATAN,String NOMORMESIN,String NOMORCHASIS,String STATEAGUNAN,String NOBPKB,String TGLBPKB){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01A_DEKSKRIPSI'),
				DESKRIPSI, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01B_KEPEMILIKAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListView'(KEPEMILIKAN)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01C_PEMILIK'),
				PEMILIK, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/015_KKENDARAAN/5A_KLASIF'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListView'(KLASIFIKASIKENDARAAN)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6A_MERKKENDARAAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListView'(MEREKKENDARAAN)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/017_JENISKENDARAAN/7A_JENISKENDARAAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListViewCheck'(JENISKENDARAAN)

		Mobile.scrollToText('Nomor bukti kepemilikan', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01J_WARNAKENDARAAN'),
				WARNAKENDARAAN, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01K_THNPEMBUATAN'),
				TAHUNPEMBUATAN, GlobalVariable.timeOut)

		Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01L_NOMESIN'),
				NOMORMESIN, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01M_NOCHASSIS'),
				NOMORCHASIS)

		Mobile.scrollToText('Isi dengan tanggal bukti kepemilikan agunan.', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01G_STATUSKETSEDIA'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.DataListView'(STATEAGUNAN)

		Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01N_NOBPKB'),
				NOBPKB)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01O_TGLBPKB'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(TGLBPKB, GlobalVariable.timeOut, GlobalVariable.timeOut)
	}

	@Keyword
	public void NilaiKendaraan(String NILAIPASARWAJAR, String PERSENTASENILAILIKUIDASI){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3O_NPSARWJR'),
				NILAIPASARWAJAR, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3P_PNILAILIKUIDASI'),
				PERSENTASENILAILIKUIDASI, GlobalVariable.timeOut)

		Mobile.scrollToText('HITUNG', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3N_HITUNG'),
				GlobalVariable.timeOut)

		Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)
	}
}
