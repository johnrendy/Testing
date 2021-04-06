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

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class DetailDataPribadi {

	@Keyword
	public void openApplication(){
		Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BrispotDevKemendagri_02.apk', false, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('01_HOME/012_PRAKARSA/012C_PRAKARSA'), GlobalVariable.timeOut)
		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\01_MENU UTAMA.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void FotoKTPNasabah(){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121A_FOTOKTPNASABAH'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121211_FOTO KTP NASABAH/0121211A_CAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121211_FOTO KTP NASABAH/02_CAMERA/02A_OK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121211_FOTO KTP NASABAH/02_CAMERA/02B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121211_FOTO KTP NASABAH/02_CAMERA/02D_OK'),
				GlobalVariable.timeOut)
	}

	@Keyword
	public void JenisKelamin(String jenis_kelamin){
		if (jenis_kelamin == 'WANITA') {
			'Memilih Jenis Kelamin Wanita'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121212_JKELAMIN/0121212B_WANITA'),
					GlobalVariable.timeOut)

			'Memilih Jenis Kelamin Wanita'
			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121212_JKELAMIN/0121212B_WANITA'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Jenis Kelamin Wanita'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121212_JKELAMIN/0121212A_PRIA'),
					GlobalVariable.timeOut)

			'Memilih Jenis Kelamin Wanita'
			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121212_JKELAMIN/0121212A_PRIA'),
					GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void StatusPerkawinan(String status_perkawinan){

		if (status_perkawinan == 'SINGLE') {
			'Memilih Status Single '
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121213_SPERKAWINAN/0121213A_SINGLE'),
					GlobalVariable.timeOut)

			'Memilih Status Single  '
			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121213_SPERKAWINAN/0121213A_SINGLE'),
					GlobalVariable.timeOut)
		} else if (status_perkawinan == 'MENIKAH') {
			'Memilih Status Single '
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121213_SPERKAWINAN/0121213B_MENIKAH'),
					GlobalVariable.timeOut)

			'Memilih Status Single  '
			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121213_SPERKAWINAN/0121213B_MENIKAH'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Status Single '
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121213_SPERKAWINAN/0121213C_CERAI'),
					GlobalVariable.timeOut)

			'Memilih Status Single  '
			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121213_SPERKAWINAN/0121213C_CERAI'),
					GlobalVariable.timeOut)
		}
	}

	@Keyword
	public void DataPribadi(String nik, String nama_lengkap, String nama_alias, String jenis_kelamin, String status_perkawinan, String tempat_lahir, String tgl_lahir,
			String pekerjaan, String agama, String agama_lainnya, String jenis_pekerjaan, String status_gelar, String jml_tanggungan, String nama_ibu, String no_hp,
			String no_telp, String email, String bidang_usaha, String debitur2, String debitur3, String debitur4 ){

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.FotoKTPNasabah'()

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121B_NIK'),
				nik, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121C_NAMALENGKAP'),
				nama_lengkap, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121D_NAMAALIAS'),
				nama_alias, GlobalVariable.timeOut)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\02_DATA PRIBADI.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Pekerjaan', FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.JenisKelamin'(jenis_kelamin)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.StatusPerkawinan'(status_perkawinan)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121E_TEMPATLAHIR'),
				tempat_lahir, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121F_TGLLAHIR'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.Tanggal'(tgl_lahir, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121G_PEKERJAAN'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121215_PEKERJAAN/0121215A_CARIDATA'),
				pekerjaan, GlobalVariable.timeOut)

		Mobile.tapAtPosition(456, 263)

		'Memilih agama ibu\r\n'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121H_AGAMA'),
				GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.Agama'(agama, agama_lainnya)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\03_DATA PRIBADI.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Nomor Telepon', FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121I_JENISPEKERJAAN'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121215_PEKERJAAN/0121215A_CARIDATA'),
				jenis_pekerjaan, GlobalVariable.timeOut)

		Mobile.tapAtPosition(456, 263)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121J_STATUS'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121217_STATUSGELAR/0121217A_CARIDATA'),
				status_gelar, GlobalVariable.timeOut)

		Mobile.tapAtPosition(456, 263)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121K_JMLTANGGUNGAN'),
				jml_tanggungan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121L_NAMAIBU'),
				nama_ibu, GlobalVariable.timeOut)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\04_DATA PRIBADI.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Debitur 4', FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121M_NOHP'),
				no_hp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121N_NOTELP'),
				no_telp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121O_EMAIL'),
				email, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121P_BIDANGUSAHA'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121218_BIDANGUSAHA/0121218A_CARIDATA'),
				bidang_usaha, GlobalVariable.timeOut)

		Mobile.tapAtPosition(456, 263)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121Q_DEBITUR2'),
				debitur2, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121R_DEBITUR3'),
				debitur3, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/012121S_DEBITUR4'),
				debitur4, GlobalVariable.timeOut)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\05_DATA PRIBADI.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void Alamat(String alamat_ktp, String rt_ktp, String rw_ktp, String kodepos_ktp, String lama_menetap, String alamat_domisili_sama,
			String alamat_domisili, String kodepos_domisili){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121221_KTP/01A_ALAMAT'),
				alamat_ktp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121221_KTP/01B_RT'),
				rt_ktp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121221_KTP/01C_RW'),
				rw_ktp, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121221_KTP/01D_KODEPOS'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121221_KTP/011_KODEPOS/011A_SEARCHKODEPOS'),
				kodepos_ktp, GlobalVariable.timeOut)

		Mobile.tapAtPosition(456, 263)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\06_ALAMAT.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Alamat sesuai KTP', FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121222_DOMISILI/02E_LAMA MENETAP'),
				lama_menetap, GlobalVariable.timeOut)

		if (alamat_domisili_sama == 'YA') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121222_DOMISILI/02F_ALAMATSAMA'),
					GlobalVariable.timeOut)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121222_DOMISILI/02F_ALAMATSAMA'),
					GlobalVariable.timeOut)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121222_DOMISILI/02F_ALAMATSAMA'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121222_DOMISILI/02A_ALAMAT'),
					alamat_domisili, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121222_DOMISILI/02D_KODEPOS'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012122_ALAMAT/0121222_DOMISILI/021_KODEPOS/021A_SEARCHKODEPOS'),
					kodepos_domisili, GlobalVariable.timeOut)

			Mobile.tapAtPosition(456, 263)
		}

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\07_ALAMAT DOMISILI.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void Pasangan(String nik_pasangan, String nama_pasangan, String tgl_pasangan){

		try {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012123_PASANGAN/012123A_FOTO'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012123_PASANGAN/0121231_FOTO KTP NASABAH/0121231A_CAMERA'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012123_PASANGAN/0121231_FOTO KTP NASABAH/02_CAMERA/02A_OK'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012123_PASANGAN/0121231_FOTO KTP NASABAH/02_CAMERA/02B_SHUTTERCAMERA'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012123_PASANGAN/0121231_FOTO KTP NASABAH/02_CAMERA/02D_OK'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012123_PASANGAN/012123B_NIK'),
					nik_pasangan, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012123_PASANGAN/012123C_NAMALENGKAP'),
					nama_pasangan, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012123_PASANGAN/012123D_TGLLAHIR'),
					GlobalVariable.timeOut)

			CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.Tanggal'(tgl_pasangan, GlobalVariable.timeOut, GlobalVariable.timeOut)
		}
		catch (Exception e) {
		}

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\07_ALAMAT PASANGAN.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void DataUsaha(String nama_perusahaan, String tgl_usaha, String  jabatan, String npwp, String jml_tenaga_kerja, String alamat_usaha_sama, String alamat_usaha, String kodepos_usaha ){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124A_NAMA PERUSAHAAN'),
				nama_perusahaan, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124B_TGLUSAHA'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.Tanggal'(tgl_usaha, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124C_JABATAN'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/0121242_JABATAN/0121242A_CARIDATA'),
				jabatan, GlobalVariable.timeOut)

		Mobile.tapAtPosition(456, 263)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124D_NPWP'),
				npwp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124E_JMLTNGAKERJA'),
				jml_tenaga_kerja, GlobalVariable.timeOut)

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\08_DATA USAHA.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.swipe(528, 386, 508, 1805)

		if (alamat_usaha_sama == 'YA') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124F_ALAMATSAMAKTP'),
					GlobalVariable.timeOut)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124F_ALAMATSAMAKTP'),
					GlobalVariable.timeOut)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124F_ALAMATSAMAKTP'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124G_ALAMAT'),
					alamat_usaha, GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/012124H_KODEPOS'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012124_DATAUSAHA/0121243_KODEPOS/0121243A_SEARCHKODEPOS'),
					kodepos_usaha, GlobalVariable.timeOut)

			Mobile.tapAtPosition(456, 263)
		}
		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\09_DATA USAHA.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void InfoLainnya(String produk_kredit, String perjanjian_pisah_harta, String status_kepemilikan, String transaksi_normal_harian,
			String penghasilan_perbulan, String pinjam_banklain, String jenisrekening_banklain, String nama_banklain, String tujuan_buka_rekening,
			String ket_buka_rekening){

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125A_SEGMENKREDIT'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/0121251_SEGMENKREDIT/0121251C_OK'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.ListView'(produk_kredit)

		if (perjanjian_pisah_harta == 'YA') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/0121258_PISAH HARTA/0121258A_YA'),
					GlobalVariable.timeOut)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/0121258_PISAH HARTA/0121258A_YA'),
					GlobalVariable.timeOut)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/0121258_PISAH HARTA/0121258B_TDK'),
					GlobalVariable.timeOut)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/0121258_PISAH HARTA/0121258B_TDK'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125B_STATUS KEPEMILIKAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.ListView'(status_kepemilikan)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125C_TRANSAKSI NORMAL HARIAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.ListView'(transaksi_normal_harian)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125D_PENGHASILAN PERBULAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.ListView'(penghasilan_perbulan)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125E_PINJAM BANK LAIN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.ListView'(pinjam_banklain)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125F_JNS REK BANK LAIN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.ListView'(jenisrekening_banklain)

		try {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125G_NAMA BANK LAIN'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/0121259_NAMABANKLAIN/0121259A_CARIDATA'),
					nama_banklain, GlobalVariable.timeOut)

			Mobile.tapAtPosition(456, 263)
		}
		catch (Exception e) {
		}

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\10_INFO LAINNYA.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Tujuan Buka Rekening', FailureHandling.STOP_ON_FAILURE)


		Mobile.swipe(559, 2005,559, 1521)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125H_TUJUAN BUKA REK'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.ListView'(tujuan_buka_rekening)

		if(tujuan_buka_rekening.equals('Lainnya')) {
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125I_KET BUKA REK'),
					ket_buka_rekening, GlobalVariable.timeOut)
		}

		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\11_INFO LAINNYA.png',
				FailureHandling.STOP_ON_FAILURE)

	}

	@Keyword
	public void Selesai(String status_kirim){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012115_SELESAI/012115A_KIRIM'),
				GlobalVariable.timeOut)

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\12_Selesai.png',
				FailureHandling.STOP_ON_FAILURE)
		if (status_kirim == 'Ya') {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012115_SELESAI/012115C_YA'),
					GlobalVariable.timeOut)


			Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012126_SELESAI/012126B_TUTUP'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012115_SELESAI/012115B_TIDAK'),
					GlobalVariable.timeOut)
		}
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\PRIBADI\\13_Selesai.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void ListView(String jawaban){

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		Integer screenWidth = Mobile.getDeviceWidth()

		Integer screenHeight = Mobile.getDeviceHeight()

		Integer xBawah = screenWidth * 0.4

		Integer yBawah = screenHeight * 0.3

		Integer xAtas = screenWidth * 0.4

		Integer yAtas = screenHeight * 0.3

		ArrayList<AndroidElement> elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')

		ArrayList<AndroidElement> textIsiDariDropdown = new ArrayList<AndroidElement>()

		for (int i = 0; i < elementDariDropdown.size; i++) {
			textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		}

		if (textIsiDariDropdown.contains(jawaban)) {
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125J_LISTVIEW'),
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

			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012125_INFOLAIN/012125J_LISTVIEW'),
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


	@Keyword
	public void Agama(String agama, String agama_lainnya){

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

		if (textIsiDariDropdown.contains(agama)) {
			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121219_AGAMA/0121219_LIST AGAMA'),
					agama, GlobalVariable.timeOut)

			if(agama.equals('lainnya')){
				'Input Agama'
				Mobile.setText(findTestObject('APLIKASI MIKRO DAN RITEL/01_HALAMAN HOME/012_MENU PRAKARSA/0121_PRAKARSA/01211_DETAIL PRAKASA/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/01211225_AGAMAIBU/01211225B_AGAMA LAIN'),
						agama_lain, GlobalVariable.timeOut)
			}
		}
		//		} else {
		//			while (!(textIsiDariDropdown.contains(agama))) {
		//				Mobile.swipe(xBawah, yBawah, xAtas, yAtas)
		//
		//				elementDariDropdown = driver.findElementsByClassName('android.widget.TextView')
		//
		//				textIsiDariDropdown = new ArrayList<AndroidElement>()
		//
		//				for (int i = 0; i < elementDariDropdown.size; i++) {
		//					textIsiDariDropdown.add(elementDariDropdown.get(i).getText())
		//				}
		//			}
		//
		//			Mobile.selectListItemByLabel(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/012121_DATA PRIBADI/0121219_AGAMA/0121219_LIST AGAMA'),
		//					agama, GlobalVariable.timeOut)
		//			if(agama == lainnya){
		//				'Input Agama'
		//				Mobile.setText(findTestObject('APLIKASI MIKRO DAN RITEL/01_HALAMAN HOME/012_MENU PRAKARSA/0121_PRAKARSA/01211_DETAIL PRAKASA/012112_DETAIL DATA PRIBADI/0121122_DATA PRIBADI/01211225_AGAMAIBU/01211225B_AGAMA LAIN'),
		//						agama_lain, GlobalVariable.timeOut)
		//			}
		//
		//		}
		//CaptureScreenshoot
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\24_PENGALAMAN.png',
				FailureHandling.STOP_ON_FAILURE)
	}
}
