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

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
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


public class SurveyAgunan {

	@Keyword
	public void openApplication(Integer screenWidth, Integer screenHeight){

		Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BrispotDevKemendagri_02.apk', false, FailureHandling.STOP_ON_FAILURE)
		screenWidth = Mobile.getDeviceWidth()
		screenHeight = Mobile.getDeviceHeight()

		Mobile.waitForElementPresent(findTestObject('01_HOME/012_PRAKARSA/012C_PRAKARSA'), GlobalVariable.timeOut)
	}

	@Keyword
	public void Foto(){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/01A_FOTO'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/011_FOTO/011A_CAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/011_FOTO/0112_CAMERA/0112A_OK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/011_FOTO/0112_CAMERA/0112B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/011_FOTO/0112_CAMERA/0112D_OK'),
				GlobalVariable.timeOut)
	}

	@Keyword
	def UbahLokasi(TestObject to,String lokasi, String kode_pos){

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/01B_UBAH LOKASI'),
				GlobalVariable.timeOut)

		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)
		if (element != null) {
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'),
					GlobalVariable.timeOut)
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'),
					GlobalVariable.timeOut)
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012A_SEARCHLOKASI'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012B_KODEPOS'),
					GlobalVariable.timeOut)

			Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/01_KODEPOS/01A_CARIDATA'),
					kode_pos)

			Mobile.tapAtPosition(530, 303)

			Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012C_LOKASI'),
					lokasi)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012D_CARI'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012E_SETLOCATION'),
					GlobalVariable.timeOut)
		} else {

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012A_SEARCHLOKASI'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012B_KODEPOS'),
					GlobalVariable.timeOut)

			Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/01_KODEPOS/01A_CARIDATA'),
					kode_pos)

			Mobile.tapAtPosition(530, 303)

			Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012C_LOKASI'),
					lokasi)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012D_CARI'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121612_FOTO/012_UBAHLOKASI/012E_SETLOCATION'),
					GlobalVariable.timeOut)
		}
	}
	@Keyword
	public void Data(String deskripsi_agunan,String atas_nama,String no_sertif,String status_bukti_kepemilikan,
			String jangka_waktu_bukti_kepemilikan,String perpanjang, String akses_kendaraan, String tgl_bukti_kepemilikan){

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01A_DESKRIPSI'),
				deskripsi_agunan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01B_NAMA'),
				atas_nama, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01C_NOSERTIF'),
				no_sertif, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01D_STATUS'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(status_bukti_kepemilikan)


		if (status_bukti_kepemilikan == 'Sertifikat Hak Guna Usaha') {
			Mobile.scrollToText('Apakah dapat di perpanjang?', FailureHandling.STOP_ON_FAILURE)
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01E_TGLBUKTI'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti_kepemilikan, GlobalVariable.timeOut, GlobalVariable.timeOut)
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01F_JANGKAWAKTUBUKTI'),
					jangka_waktu_bukti_kepemilikan, GlobalVariable.timeOut)

			if (perpanjang == 'Ya') {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			} else {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			}
			if (akses_kendaraan == 'Ya') {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			} else {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			}
		} else if (status_bukti_kepemilikan == 'Sertifikat Hak Guna Bangunan') {
			Mobile.scrollToText('Apakah dapat di perpanjang?', FailureHandling.STOP_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01E_TGLBUKTI'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti_kepemilikan, GlobalVariable.timeOut, GlobalVariable.timeOut)
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01F_JANGKAWAKTUBUKTI'),
					jangka_waktu_bukti_kepemilikan, GlobalVariable.timeOut)

			if (perpanjang == 'Ya') {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			} else {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			}
			if (akses_kendaraan == 'Ya') {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			} else {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			}
		} else if (status_bukti_kepemilikan == 'Sertifikat Hak Pakai') {
			Mobile.scrollToText('Apakah dapat di perpanjang?', FailureHandling.STOP_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01E_TGLBUKTI'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti_kepemilikan, GlobalVariable.timeOut, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01F_JANGKAWAKTUBUKTI'),
					jangka_waktu_bukti_kepemilikan, GlobalVariable.timeOut)

			if (perpanjang == 'Ya') {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			} else {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/011_PERPANJANG/011B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			}

			if (akses_kendaraan == 'Ya') {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			} else {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/012_AKSES/012B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			}
		}else{
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01E_TGLBUKTI'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti_kepemilikan, GlobalVariable.timeOut, GlobalVariable.timeOut)
		}
	}


	@Keyword
	public void DataKendaraan(String deskripsi_agunan, String atas_nama, String klasifikasi_kendaraan, String jenis_kendaraan, String merk_kendaraan, String tipe_merk, String warna_kendaraan, String thn_pembuatan,
			String no_mesin, String no_chasis, String no_bukti_kepemilikan, String tgl_kepemilikan, String jns_penggunaan, String nopol ){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01A_DESKRIPSI'),
				deskripsi_agunan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/01_RMHBGNPROPERTIK/01B_NAMA'),
				atas_nama, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02C_KKENDARAAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(klasifikasi_kendaraan)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02D_JNSKENDARAAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(jenis_kendaraan)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02E_MERKKENDARAAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(merk_kendaraan)

		Mobile.scrollToText('Nomor mesin', FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02F_TIPEKENDARAAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(tipe_merk)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02G_WARNAKENDARAAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(warna_kendaraan)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02H_THNPEMBUATAN'),
				thn_pembuatan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02I_NOMESIN'),
				no_mesin, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02J_NOCHASSIS'),
				no_chasis, GlobalVariable.timeOut)

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KENDARAAN\\04_DATA.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Nomor Polisi', FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02K_NOBPKB'),
				no_bukti_kepemilikan, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02L_TGLBPKB'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_kepemilikan, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02M_JNSPENGGUNAAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(jns_penggunaan)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/02_KENDARAAN/02N_NOPOL'),
				nopol, GlobalVariable.timeOut)
	}

	@Keyword
	public void DataKas(String tipe_kas, String deskripsi_agunan, String no_bukti, String tgl_bukti, String pnilaiagunan,
			String atas_nama, String status_buktikepemilikan, String tgl_jthtempo, String perpanjangan_otomatis){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04A_TIPEKAS'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(tipe_kas)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04B_DESKRIPSI'),
				deskripsi_agunan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04C_NOBUKTI'),
				no_bukti, GlobalVariable.timeOut)

		if (tipe_kas.equals('Tabungan')) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04D_TGLBUKTI'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti, GlobalVariable.timeOut, GlobalVariable.timeOut)

			'CaptureScreenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KAS\\04_DATA.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.scrollToText('Isikan state bukti kepemilikan', FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04G_NOMINAL'),
					no_bukti, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04H_PENILAIAGUNAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pnilaiagunan)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04I_NAMA'),
					atas_nama, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04J_KEPEMILIKAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(status_buktikepemilikan)
		} else if (tipe_kas.equals('Giro')) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04D_TGLBUKTI'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti, GlobalVariable.timeOut, GlobalVariable.timeOut)

			'CaptureScreenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KAS\\04_DATA.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.scrollToText('Isikan state bukti kepemilikan', FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04G_NOMINAL'),
					no_bukti, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04H_PENILAIAGUNAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pnilaiagunan)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04I_NAMA'),
					atas_nama, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04J_KEPEMILIKAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(status_buktikepemilikan)
		} else if (tipe_kas.equals('Setoran Tunai')) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04D_TGLBUKTI'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti, GlobalVariable.timeOut, GlobalVariable.timeOut)

			'CaptureScreenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KAS\\04_DATA.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.scrollToText('Isikan state bukti kepemilikan', FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04G_NOMINAL'),
					no_bukti, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04H_PENILAIAGUNAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pnilaiagunan)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04I_NAMA'),
					atas_nama, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04J_KEPEMILIKAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(status_buktikepemilikan)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04D_TGLBUKTI'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti, GlobalVariable.timeOut, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04E_JANGKA WAKTU'),
					atas_nama, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04F_TGLJTHTEMPO'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_jthtempo, GlobalVariable.timeOut, GlobalVariable.timeOut)

			'CaptureScreenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KAS\\04_DATA.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.scrollToText('Isikan state bukti kepemilikan', FailureHandling.STOP_ON_FAILURE)

			if (perpanjangan_otomatis.equals('Ya')) {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/042_POTOMATIS/023A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/042_POTOMATIS/023A_YA'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			} else {
				Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/042_POTOMATIS/023B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

				Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/042_POTOMATIS/023B_TDK'),
						GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			}

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04G_NOMINAL'),
					no_bukti, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04H_PENILAIAGUNAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pnilaiagunan)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04I_NAMA'),
					atas_nama, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/04_KAS/04J_KEPEMILIKAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(status_buktikepemilikan)
		}
	}

	@Keyword
	public void DataPiutang(String nama_debitur,String deskripsi_agunan,String piutang_kepada,String status_buktikepemilikan,
			String atas_nama_pemilik,String no_bukti_pemilik,String tgl_bukti_kpemilikan){

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/05_PIUTANG/05A_NAMA'),
				nama_debitur, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/05_PIUTANG/05B_DESKRIPSI'),
				deskripsi_agunan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/05_PIUTANG/05C_PIUTANG'),
				piutang_kepada, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/05_PIUTANG/05D_STATUS'),
				status_buktikepemilikan, GlobalVariable.timeOut)

		Mobile.scrollToText('Isikan tanggal bukti kepemilikan')

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/05_PIUTANG/05E_NAMA PEMILIK'),
				atas_nama_pemilik, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/05_PIUTANG/05F_NOBUKTI'),
				no_bukti_pemilik, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/05_PIUTANG/05G_TGLBUKTI'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti_kpemilikan, GlobalVariable.timeOut, GlobalVariable.timeOut)
	}

	@Keyword
	public void Alamat(String alamat_ktp, String alamat_agunan, String rt_agunan, String  rw_agunan, String kode_pos_agunan){

		if (alamat_ktp == 'Ya') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04C_ALAMAT AGUNAN'),
					alamat_agunan, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04F_RT AGUNAN'),
					rt_agunan, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04E_RW AGUNAN'),
					rw_agunan, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04H_KODEPOS'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/041_KODE POS/041B_CARIDATA'),
					kode_pos_agunan, GlobalVariable.timeOut)

			Mobile.tapAtPosition(530, 303)
		}
	}


	@Keyword
	public void AlamatAgunanMesinBrt(String alamat_ktpa, String alamat_agunan, String kode_pos_agunan){

		if (alamat_ktpa == 'Ya') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04B_ALAMAT KTPA'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04B_ALAMAT KTPA'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04B_ALAMAT KTPA'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04C_ALAMAT AGUNAN'),
					alamat_agunan, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04G_KODEPOS_AGUNAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/041_KODE POS/041B_CARIDATA'),
					kode_pos_agunan, GlobalVariable.timeOut)

			Mobile.tapAtPosition(530, 303)
		}
	}

	@Keyword
	public void AlamatAgunanPemilik(String alamat_ktp, String alamat, String kode_pos){

		if (alamat_ktp == 'Ya') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04D_ALAMAT PEMILIK'),
					alamat, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04H_KODEPOS'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/041_KODE POS/041B_CARIDATA'),
					kode_pos, GlobalVariable.timeOut)

			Mobile.tapAtPosition(530, 303)
		}
	}


	@Keyword
	public void AlamatAgunan(String alamat_ktp, String alamat_agunan, String rt_agunan, String  rw_agunan, String kode_pos_agunan){

		if (alamat_ktp == 'Ya') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04A_ALAMAT KTP'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04C_ALAMAT AGUNAN'),
					alamat_agunan, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04F_RT AGUNAN'),
					rt_agunan, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04E_RW AGUNAN'),
					rw_agunan, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/04G_KODEPOS_AGUNAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121614_ALAMAT/041_KODE POS/041B_CARIDATA'),
					kode_pos_agunan, GlobalVariable.timeOut)

			Mobile.tapAtPosition(530, 303)
		}
	}
	@Keyword
	public void Batas(String batas_timur, String batas_utara, String batas_barat, String batas_selatan, String bentuk_tanah, String no_imb,
			String tgl_imb){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05A_BTIMUR'),
				batas_timur, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05B_BUTARA'),
				batas_utara, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05C_BBARAT'),
				batas_barat, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05D_BSELATAN'),
				batas_selatan, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05I_FBTANAH'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(bentuk_tanah)

		Mobile.scrollToText('Pastikan Tanggal IMB sesuai', FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05F_NOIMB'),
				no_imb, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05G_TGLIMB'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_imb, GlobalVariable.timeOut, GlobalVariable.timeOut)
	}
	@Keyword
	public void BatasTanah(String batas_timur, String batas_utara, String batas_barat, String batas_selatan, String bentuk_tanah){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05A_BTIMUR'),
				batas_timur, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05B_BUTARA'),
				batas_utara, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05C_BBARAT'),
				batas_barat, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05D_BSELATAN'),
				batas_selatan, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05I_FBTANAH'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(bentuk_tanah)
	}



	@Keyword
	public void Nilai(String luas_tanah, String harga_tanah, String luas_bangunan, String  harga_bangunan ){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06A_LUASTANAH'),
				luas_tanah, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06B_HARGATANAH'),
				harga_tanah, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06C_LUASBANGUNAN'),
				luas_bangunan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06D_HARGABANGUNAN'),
				harga_bangunan, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06E_HITUNG'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	public void NilaiTanah(String luas_tanah, String harga_tanah){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06A_LUASTANAH'),
				luas_tanah, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06B_HARGATANAH'),
				harga_tanah, GlobalVariable.timeOut)

		'CaptureScreenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\07_NILAI TANAH.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06E_HITUNG'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void NilaiBangunan(String luas_tanah, String luas_bangunan, String  harga_bangunan ){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06A_LUASTANAH'),
				luas_tanah, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06C_LUASBANGUNAN'),
				luas_bangunan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06D_HARGABANGUNAN'),
				harga_bangunan, GlobalVariable.timeOut)

		'CaptureScreenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\BANGUNAN\\07_NILAI BANGUNAN.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06E_HITUNG'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void NilaiKas(String nilai_pasar_wajar,String no_rek, String nama_bank ){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/02_KAS/02A_NPSRWAJAR'),
				nilai_pasar_wajar, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/02_KAS/02B_NOREK'),
				no_rek, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/02_KAS/02C_NMBANK'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(nama_bank)
	}

	@Keyword
	public void Asuransi(String jenis_asuransi, String pluasan_asuransi, String nilai_asuransi, String jarak_pusat_kota,String lokasi_pasar, String nama_pasar,
			String pnilai_agunan, String pidenpendent, String okupasi_agunan, String dinding, String lantai, String atap, String rangka, String jmlah_lantai
	){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07A_JNSASURANSI'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(jenis_asuransi)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07B_PLUASANASURANSI'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(pluasan_asuransi)


		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07C_NILAIASURANSI'),
				nilai_asuransi, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07D_JRKPUSKOT'),
				jarak_pusat_kota, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07E_LOKPASAR'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(lokasi_pasar)

		Mobile.scrollToText('Pilihan Okupasi Agunan', FailureHandling.STOP_ON_FAILURE)

		if(lokasi_pasar.equals('Dalam pasar')) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07F_NAMAPSR'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/062_PRLUASANASURANSI/062A_CARIDATA'),
					nama_pasar, GlobalVariable.timeOut)

			Mobile.tapAtPosition(347, 270)
		}
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07G_PNLAIAGUNAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pnilai_agunan)

		if(pnilai_agunan.equals('Independent')){
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07O_PIDEPENDEN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(pidenpendent)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07H_OKUPASIAGUNAN'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(okupasi_agunan)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07I_DINDING'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(dinding)


		Mobile.scrollToText('CEK PREMI', FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07J_LANTAI'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(lantai)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07K_ATAP'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(atap)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07L_RANGKA'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(rangka)

		Mobile.scrollToText('Info Cek Premi', FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07M_JMLLANTAI'),
				jmlah_lantai, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07N_CEK PREMI'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(30)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216E_OK'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void NilaiKendaraan(String pkt_asuransi,String prluasan_asuransi,String nilai_psr_wajar,String pnilai_agunan,String pidenpedent,String tgl_pnilai,String nilai_asuransi){

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/01_KENDARAAN/01A_PKTASURANSI'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pkt_asuransi)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/01_KENDARAAN/01B_PERLUASANASURANSI'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(prluasan_asuransi)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/01_KENDARAAN/01C_NILAIPASARWAJAR'),
				nilai_psr_wajar, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/01_KENDARAAN/01D_PNLAIAGUNAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pnilai_agunan)

		if (pnilai_agunan.equals('Independent')) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/06F_PIDENPENDENT'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pidenpedent)
		} else {
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/01_KENDARAAN/01E_TGLPNLAI'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_pnilai, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.scrollToText('CEK PREMI', FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/01_KENDARAAN/01F_NILAIASURANSI'),
				nilai_asuransi, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/01_KENDARAAN/01G_CEK PREMI'),
				GlobalVariable.timeOut)
	}


	@Keyword
	public void NilaiPiutang(String nilai_pasar_wajar,String penilaian_agunan,String penilaian_idependen,String tgl_penilaian_akhir){

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/02_KAS/02A_NPSRWAJAR'),
				nilai_pasar_wajar, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/03_PIUTANG/03B_PNILAIANAGUNAN'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(penilaian_agunan)

		if (penilaian_agunan.equals('Independent')) {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/03_PIUTANG/03D_PIDEPENDEN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(penilaian_idependen)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/03_PIUTANG/03C_TGLPENILAIAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_penilaian_akhir, GlobalVariable.timeOut, GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/03_PIUTANG/03C_TGLPENILAIAN'),
					GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

			CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_penilaian_akhir, GlobalVariable.timeOut, GlobalVariable.timeOut)
		}
	}


	@Keyword
	public void DataListView(String jawaban){

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
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07R_LISTVIEW'),
					jawaban,GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
		} else {
			while (!(textIsiDariDropdown.contains(jawaban))) {
				if(yBawah > Mobile.getDeviceHeight()){
					Mobile.swipe(xBawah, Mobile.getDeviceHeight(), xAtas, yAtas)
				}else{
					Mobile.swipe(xBawah, yBawah, xAtas, yAtas)
				}

				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

				textIsiDariDropdown = new ArrayList<AndroidElement>()

				for (int i = 0; i < elementDariDropdown.size; i++) {
					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
				}
			}
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07R_LISTVIEW'),
					jawaban,GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
		}		//CaptureScreenshoot
	}

	@Keyword
	public void DataRecyclerView(String jawaban){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		Integer screenWidth = Mobile.getDeviceWidth()

		Integer screenHeight = Mobile.getDeviceHeight()

		Integer xBawah = screenWidth * 0.4

		Integer yBawah = screenHeight * 0.5

		Integer xAtas = screenWidth * 0.4

		Integer yAtas = screenHeight * 0.4

		ArrayList<AndroidElement> elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

		ArrayList<AndroidElement> textIsiDariDropdown = new ArrayList<AndroidElement>()

		for (int i = 0; i < elementDariDropdown.size; i++) {
			textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		}

		if (textIsiDariDropdown.contains(jawaban)) {
			if(jawaban.trim()) {
				Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07S_RECYCLERVIEW'),
						jawaban,GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
			}
		} else {
			while (!(textIsiDariDropdown.contains(jawaban))) {
				Mobile.swipe(xBawah, yBawah, xAtas, yAtas)

				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

				textIsiDariDropdown = new ArrayList<AndroidElement>()

				for (int i = 0; i < elementDariDropdown.size; i++) {
					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
				}
			}
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121617_ASURANSI/07S_RECYCLERVIEW'),
					jawaban,GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
		}
	}


	@Keyword
	public void ListView(String jawaban){

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
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05H_LISTVIEW'),
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
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121615_BATAS/05H_LISTVIEW'),
					jawaban, GlobalVariable.timeOut)
		}
		//CaptureScreenshoot

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
