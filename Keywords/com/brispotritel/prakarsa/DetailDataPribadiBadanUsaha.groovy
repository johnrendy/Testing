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

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

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

public class DetailDataPribadiBadanUsaha {

	@Keyword
	public void PencarianData(nama_perusahaan){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/012A_CARIDATA'), nama_perusahaan, GlobalVariable.timeOut)

		Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

		Mobile.tapAtPosition(489, 948)
	}

	@Keyword
	public void DataPerusahaan(String npwp,String status_badan_usaha, String bentuk_badan_usaha, String gelar_badan_usaha, String jenis_badan_usaha,String nama_perusahaan,String no_hp,String email,String fixed_line,String fax, String tempat_akta_awal, String no_akta_awal, String no_akta_akhir,
			String tanggal_debitur, String tanggal_akta_awal, String tanggal_akta_akhir){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111A_FOTO NPWP'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121111_FOTO NPWP NASABAH/0121111A_CAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121111_FOTO NPWP NASABAH/02_CAMERA/02A_OK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121111_FOTO NPWP NASABAH/02_CAMERA/02B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121111_FOTO NPWP NASABAH/02_CAMERA/02D_OK'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111B_NPWP'),
				npwp, GlobalVariable.timeOut)

		if (status_badan_usaha == 'YA') {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111N_STATUS BU'),
					GlobalVariable.timeOut)

			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111N_STATUS BU'),
					GlobalVariable.timeOut)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111N_STATUS BU'),
					GlobalVariable.timeOut)
		}
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\02_Data Perusahaan.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Isi Nomor HP', FailureHandling.STOP_ON_FAILURE)

		if (bentuk_badan_usaha == 'Non Badan Hukum') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121112_BENTUK BU/0121112A_NONBDNHUKUM'),
					GlobalVariable.timeOut)

			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121112_BENTUK BU/0121112A_NONBDNHUKUM'),
					GlobalVariable.timeOut)
		} else if (bentuk_badan_usaha == 'Badan Hukum') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121112_BENTUK BU/0121112B_BDNHUKUM'),
					GlobalVariable.timeOut)

			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121112_BENTUK BU/0121112B_BDNHUKUM'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121112_BENTUK BU/0121112C_BDNHUKUMASING'),
					GlobalVariable.timeOut)

			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121112_BENTUK BU/0121112C_BDNHUKUMASING'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111O_GELAR BU'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121113_GELAR BU/0121113A_CARIDATA'),
				gelar_badan_usaha, GlobalVariable.timeOut)

		Mobile.tapAtPosition(456, 263)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111P_JNS BU'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/0121114_JENIS BU/0121114A_CARIDATA'),
				jenis_badan_usaha, GlobalVariable.timeOut)

		Mobile.tapAtPosition(456, 263)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111C_NAMAPERUSAHAAN'),
				nama_perusahaan, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111D_TGLDEBITUR'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(tanggal_debitur, GlobalVariable.timeOut,
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111E_NOHP'),
				no_hp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111F_EMAIL'),
				email, GlobalVariable.timeOut)

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\03_Data Perusahaan.png',
				FailureHandling.STOP_ON_FAILURE)
		Mobile.scrollToText('Isi Tanggal Akhir', FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111G_FIXEDLINE'),
				fixed_line, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111H_FAX'),
				fax, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111I_TMPTAKTA'),
				tempat_akta_awal, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111J_NOAKTAAWAL'),
				no_akta_awal, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111K_TGLAKTAAWAL'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(tanggal_akta_awal, GlobalVariable.timeOut,
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111L_NOAKTAAKHIR'),
				no_akta_akhir, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012111_DATA PERUSAHAAN/012111M_TGLAKTAAKHIR'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(tanggal_akta_akhir, GlobalVariable.timeOut,
				GlobalVariable.timeOut)
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\04_Data Perusahaan.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void Alamat(String alamat, String rt, String rw, String kode_pos){
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012112_ALAMAT/012112A_ALAMAT'),
				alamat, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012112_ALAMAT/012112B_RT'),
				rw, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012112_ALAMAT/012112C_RW'),
				rt, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012112_ALAMAT/012112D_KODEPOS'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012112_ALAMAT/0121121_KODEPOS/0121121A_SEARCHKODEPOS'),
				kode_pos, GlobalVariable.timeOut)

		Mobile.tapAtPosition(530, 303)

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\05_Alamat.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void DataUsaha(String bidang_usaha,String lama_usaha,String gol_debit,String gol_debit_LBU,String hub_bank,String sumber_utama,
			String bidang_usaha_brinets,String sumber_utama_brinets,String federal_wh,String customer_type,String sub_customer_type){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113A_BDGUSAHA'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121131_BDGUSAHA/0121131A_SEARCHDATA'),
				bidang_usaha, GlobalVariable.timeOut)

		Mobile.tapAtPosition(390, 266)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113B_LAMAUSAHA'),
				lama_usaha, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113C_GOLDEBT'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121132_GOLDEBT/0121132A_SEARCHDATA'),
				gol_debit, GlobalVariable.timeOut)

		Mobile.tapAtPosition(390, 266)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113D_GOLDEBTLBU'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121133_GOLDEBTLBU/0121133A_SEARCHDATA'),
				gol_debit_LBU, GlobalVariable.timeOut)

		Mobile.tapAtPosition(390, 266)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113E_HUBBANK'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121134_HUBBANK/0121134A_SEARCHDATA'),
				hub_bank, GlobalVariable.timeOut)

		Mobile.tapAtPosition(390, 266)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113F_BU BRINETS'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121135_BUBRINETS/0121135A_SEARCHDATA'),
				bidang_usaha_brinets, GlobalVariable.timeOut)

		Mobile.tapAtPosition(390, 266)

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\06_DataUsaha.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Isi Sub Customer Type', FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113G_SUMBERUTAMA'),
				GlobalVariable.timeOut)

		if (sumber_utama == 'Hasil Usaha') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121136_SUMBER UTAMA/0121136A_HASIL USAHA'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121136_SUMBER UTAMA/0121136B_LAINLAIN'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113H_SUBRINETS'),
				GlobalVariable.timeOut)

		if (sumber_utama_brinets == 'Hasil Usaha') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121136_SUMBER UTAMA/0121136A_HASIL USAHA'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121136_SUMBER UTAMA/0121136B_LAINLAIN'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113I_FEDERALWH'),
				GlobalVariable.timeOut)

		if (federal_wh == 'Tidak Kena Pajak') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121138_FEDERALWH/0121138A_TDK KENA PAJAK'),
					GlobalVariable.timeOut)
		} else if (federal_wh == 'Kena Pajak dan Penduduk') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121138_FEDERALWH/0121138B_KPAJAK PNDKK'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121138_FEDERALWH/0121138C_KPAJAK BPNDKK'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113J_CUSTYPE'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121134_HUBBANK/0121134A_SEARCHDATA'),
				customer_type, GlobalVariable.timeOut)

		Mobile.tapAtPosition(390, 266)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/012113K_SUBCUSTYPE'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012113_DATA USAHA/0121134_HUBBANK/0121134A_SEARCHDATA'),
				sub_customer_type, GlobalVariable.timeOut)

		Mobile.tapAtPosition(390, 266)

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\07_DataUsaha.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void Lainnya(String segmen_kredit, String pendapatan_bulanan, String omzet, String omzet_bulanan, String transaksi_brinets, String penghasilan,String jenis_rekening, String hub_bank_lain, String nama_banklain, String tujuan_buka_rekening){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114A_SEGMENTASIKREDIT'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121141_SEGMENKREDIT/0121141C_OK'),
				GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121141_SEGMENKREDIT/0121141A_CARIDATA'),
				segmen_kredit, GlobalVariable.timeOut)

		Mobile.tapAtPosition(390, 266)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114B_PENDAPATANBLN'),
				pendapatan_bulanan, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114C_OMZET'),
				omzet, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114D_OMZET BLN'),
				GlobalVariable.timeOut)

		if (omzet_bulanan == 's.d 50 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121142_OMZET BULAN/0121142A_SD50JT'),
					GlobalVariable.timeOut)
		} else if (omzet_bulanan == '50 - 100 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121142_OMZET BULAN/0121142B_50SD100JT'),
					GlobalVariable.timeOut)
		} else if (omzet_bulanan == '100 - 500 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121142_OMZET BULAN/0121142C_100SD500'),
					GlobalVariable.timeOut)
		} else if (omzet_bulanan == '500 juta - 1 milyar') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121142_OMZET BULAN/0121142D_500SD1M'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121142_OMZET BULAN/0121142E_LEBIHSD1M'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114E_PENGHASILAN'),
				GlobalVariable.timeOut)

		if (penghasilan == 's.d 5 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121143_PENGHASILAN/0121143A_SD5JT'),
					GlobalVariable.timeOut)
		} else if (penghasilan == '5 - 10 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121143_PENGHASILAN/0121143B_5SD10JT'),
					GlobalVariable.timeOut)
		} else if (penghasilan == '10 - 50 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121143_PENGHASILAN/0121143C_10SD50JT'),
					GlobalVariable.timeOut)
		} else if (penghasilan == '50 - 100 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121143_PENGHASILAN/0121143D_50SD100JT'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121143_PENGHASILAN/0121143E_LBH100JT'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114F_TRANSAKSIBRINETS'),
				GlobalVariable.timeOut)

		if (transaksi_brinets == 's.d 5 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121144_TRANSAKSIBRINETS/0121144A_SD5JT'),
					GlobalVariable.timeOut)
		} else if (transaksi_brinets == '5 - 10 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121144_TRANSAKSIBRINETS/0121144B_5SD10JT'),
					GlobalVariable.timeOut)
		} else if (transaksi_brinets == '10 - 50 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121144_TRANSAKSIBRINETS/0121144C_10SD50JT'),
					GlobalVariable.timeOut)
		} else if (transaksi_brinets == '50 - 100 juta') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121144_TRANSAKSIBRINETS/0121144D_50SD100JT'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121144_TRANSAKSIBRINETS/0121144E_LBH100JT'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114G_JNSREKENING'),
				GlobalVariable.timeOut)

		if (jenis_rekening == 'Simpanan') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121145_JNSREKENING/0121145A_SIMPANAN'),
					GlobalVariable.timeOut)
		} else if (jenis_rekening == 'Pinjaman') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121145_JNSREKENING/0121145B_PINJAMAN'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121145_JNSREKENING/0121145C_TDKADA'),
					GlobalVariable.timeOut)
		}

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114H_HUBBANK'),
				GlobalVariable.timeOut)

		if (hub_bank_lain == 'Ya') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121146_HUBBANK/0121146B_YA'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114I_BANKLAIN'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121147_NAMABANKLAIN/0121146A_CARIDATA'),
					nama_banklain, GlobalVariable.timeOut)

			Mobile.tapAtPosition(390, 266)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121146_HUBBANK/0121146A_TIDAK'),
					GlobalVariable.timeOut)
		}
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\08_Lainnya.png',
				FailureHandling.STOP_ON_FAILURE)

		Mobile.scrollToText('Tujuan Buka Rekening', FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/012114J_TUJUANBR'),
				GlobalVariable.timeOut)

		if (tujuan_buka_rekening == 'Investasi') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121148_TUJUANBR/0121148A_INVESTASI'),
					GlobalVariable.timeOut)
		} else if (tujuan_buka_rekening == 'Transaksi') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121148_TUJUANBR/0121148B_TRANSAKSI'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012114_LAINNYA/0121148_TUJUANBR/0121148C_LAINNYA'),
					GlobalVariable.timeOut)
		}

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\09_Lainnya.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void Selesai(String status_kirim){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012115_SELESAI/012115A_KIRIM'),
				GlobalVariable.timeOut)

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\10_Selesai.png',
				FailureHandling.STOP_ON_FAILURE)

		if (status_kirim == 'YA') {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012115_SELESAI/012115C_YA'),
					GlobalVariable.timeOut)

			Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/012131D_OK'),
					GlobalVariable.timeOut)

			Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut)
			
			Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)
			
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut)
		} else {
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/012115_SELESAI/012115B_TIDAK'),
					GlobalVariable.timeOut)
		}

		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\11_Selesai.png',
				FailureHandling.STOP_ON_FAILURE)
	}
}
