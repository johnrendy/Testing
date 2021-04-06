package com.brispotmikroritel.pemasaran

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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class DataPemasaran {

	@Keyword
	public void fotoRitel(){
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
	public void fotoMikro(){
		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/01A_FOTO'), GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/011_FOTO/01_CAMERA/01B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/011_FOTO/01_CAMERA/01D_OK'),
				GlobalVariable.timeOut)
	}

	@Keyword
	public void Camera(){
		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/011_FOTO/01_CAMERA/01B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/011_FOTO/01_CAMERA/01D_OK'),
				GlobalVariable.timeOut)
	}

	@Keyword
	public void DataPribadi(String nik, String nama_lengkap, String jenis_kelamin, String status_perkawinan, String tmpt_lahir){
		'Input NIK calon debitur'
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/02A_NIK'), nik, GlobalVariable.timeOut)

		'Input nama lengkap calon debitur'
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/02B_NAMALENGKAP'), nama_lengkap,
				GlobalVariable.timeOut)

		if (jenis_kelamin == 'WANITA') {
			'Memilih Jenis Kelamin Wanita'
			Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/021_JKELAMIN/021B_WANITA'),
					GlobalVariable.timeOut)

			'Memilih Jenis Kelamin Wanita'
			Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/021_JKELAMIN/021B_WANITA'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Jenis Kelamin Pria'
			Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/021_JKELAMIN/021A_PRIA'),
					GlobalVariable.timeOut)

			'Memilih Jenis Kelamin Pria'
			Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/021_JKELAMIN/021A_PRIA'),
					GlobalVariable.timeOut)
		}

		if (status_perkawinan == 'SINGLE') {
			'Memilih Status Single '
			Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/022_SPERKAWINAN/022A_SINGLE'),
					GlobalVariable.timeOut)

			'Memilih Status Single  '
			Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/022_SPERKAWINAN/022A_SINGLE'),
					GlobalVariable.timeOut)
		} else if (status_perkawinan == 'MENIKAH') {
			'Memilih Status Menikah '
			Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/022_SPERKAWINAN/022B_MENIKAH'),
					GlobalVariable.timeOut)

			'Memilih Status Menikah '
			Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/022_SPERKAWINAN/022B_MENIKAH'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Status Cerai'
			Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/022_SPERKAWINAN/022C_CERAI'),
					GlobalVariable.timeOut)

			'Memilih Status Cerai'
			Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/022_SPERKAWINAN/022C_CERAI'),
					GlobalVariable.timeOut)
		}

		'Pilih menu tempatlahir\r\n'
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/02C_TEMPATLAHIR'), tmpt_lahir,
				GlobalVariable.timeOut)
	}
	@Keyword
	public void DataPribadiLain(String tgl_lahir, String no_hp, String email, String bidang_usaha){
		Mobile.scrollToText('Bidang usaha sesuai kategori baru', FailureHandling.STOP_ON_FAILURE)

		'Pilih menu tanggallahir\r\n'
		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/02F_TGL LHR'), GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(tgl_lahir, GlobalVariable.timeOut, GlobalVariable.timeOut)

		'Input No.HP calon debitur'
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/02D_NOHP'), no_hp, GlobalVariable.timeOut)

		'Input email calon debitur'
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/02E_EMAIL'), email, GlobalVariable.timeOut)

		'Select Bidang Usaha'
		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/02G_BIDANGUSAHA'), GlobalVariable.timeOut)

		'Select Bidang Usaha'
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/02_DATA PRIBADI/024_BIDANGUSAHA/024C_CARIDATA'),
				bidang_usaha, GlobalVariable.timeOut)

		Mobile.tapAtPosition(325, 312)
	}



	@Keyword
	public void DataUsaha(String npwp, String nama_perusahaan, String status_badan_usaha, String bentuk_badan_usaha, String kota_tempat_usaha, String tgl_usaha,String no_hp, String email, String bidang_usaha){
		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03A_NPWP'), npwp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03B_NAMAPERUSAHAAN'), nama_perusahaan,
				GlobalVariable.timeOut)

		if (status_badan_usaha == 'YA') {
			Mobile.uncheckElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03C_STATUSBDNUSAHA'), GlobalVariable.timeOut)

			'Memilih YA Status Badan Usaha'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03C_STATUSBDNUSAHA'), GlobalVariable.timeOut)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03C_STATUSBDNUSAHA'), GlobalVariable.timeOut)
		}

		if (bentuk_badan_usaha == 'Non Badan Hukum') {
			Mobile.uncheckElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/031_BENTUKBDNUSAHA/031A_NONBDNHUKUM'),
					GlobalVariable.timeOut)

			'Memilih Non Badan Hukum Bentuk Badan Usaha'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/031_BENTUKBDNUSAHA/031A_NONBDNHUKUM'),
					GlobalVariable.timeOut)
		} else if (bentuk_badan_usaha == 'Badan Hukum') {
			Mobile.uncheckElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/031_BENTUKBDNUSAHA/031B_BDNHUKUM'),
					GlobalVariable.timeOut)

			'Memilih Badan Hukum Bentuk Badan Usaha'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/031_BENTUKBDNUSAHA/031B_BDNHUKUM'),
					GlobalVariable.timeOut)
		} else {
			Mobile.uncheckElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/031_BENTUKBDNUSAHA/031C_BDNHUKUMASING'),
					GlobalVariable.timeOut)

			'Memilih Badan Hukum Asing Bentuk Badan Usaha'
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/031_BENTUKBDNUSAHA/031C_BDNHUKUMASING'),
					GlobalVariable.timeOut)
		}

		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03D_KOTATMPTUSAHA'), kota_tempat_usaha,
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\DATA PEMASARAN BADAN USAHA\\04_DATA PRIBADI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.scrollToText('Bidang usaha sesuai kategori baru', FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03H_TGLUSAHA'), GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(tgl_usaha, GlobalVariable.timeOut, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03E_NOHP'), no_hp, GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03F_EMAIL'), email, GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/03G_BDNGUSAHA'), GlobalVariable.timeOut)

		Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/03_DATAUSAHA/032_BIDANGUSAHA/03A_CARIDATA'), bidang_usaha,
				GlobalVariable.timeOut)

		Mobile.tapAtPosition(325, 312)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\DATA PEMASARAN BADAN USAHA\\05_DATA PRIBADI.png',
				FailureHandling.CONTINUE_ON_FAILURE)
	}


	@Keyword
	public void DataPengajuanMikro(String status_pengajuan, String jml_permohonan, String periode, String tujuan_kredit){

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\DATA PEMASARAN PRIBADI\\07_DATA PENGAJUAN.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		if (status_pengajuan == 'LANJUT PRAKARSA') {
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/05B_LANJUTPRAKARSA'), GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051A_JMLPERMOHONAN'),
					jml_permohonan, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051B_PERIODE'),
					periode, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051C_TUJUAN'),
					tujuan_kredit, GlobalVariable.timeOut)

			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\DATA PEMASARAN PRIBADI\\08_DATA PENGAJUAN.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051E_SUBMIT'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051F_RILIS OK'),
					GlobalVariable.timeOut)
		}else{
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/05A_SIMPAN'), GlobalVariable.timeOut)
		}
	}


	@Keyword
	public void SubmitPengajuan(String status_pengajuan){
		if (status_pengajuan == 'LANJUT PRAKARSA') {
		}else{
		}
	}


	@Keyword
	public void DataPengajuanRitel(String status_pengajuan, String jml_permohonan, String periode, String tujuan_kredit){
		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PEMASARAN\\DATA PEMASARAN BADAN USAHA\\LANJUT PRAKASA\\07_SELESAI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		if (status_pengajuan == 'LANJUT PRAKARSA') {
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/05B_LANJUTPRAKARSA'), GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051A_JMLPERMOHONAN'),
					jml_permohonan, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051B_PERIODE'),
					periode, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051C_TUJUAN'),
					tujuan_kredit, GlobalVariable.timeOut)

			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\DATA PEMASARAN PRIBADI\\07_DATA PENGAJUAN.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051E_SUBMIT'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051F_RILIS OK'),
					GlobalVariable.timeOut)
		}else{
			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/05A_SIMPAN'), GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051A_JMLPERMOHONAN'),
					jml_permohonan, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051B_PERIODE'),
					periode, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051C_TUJUAN'),
					tujuan_kredit, GlobalVariable.timeOut)

			'Capture Screenshoot'
			Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\DATA PEMASARAN PRIBADI\\07_DATA PENGAJUAN.png',
					FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/05_SELESAI/051_DATAPENGAJUAN/051E_SUBMIT'),
					GlobalVariable.timeOut)
		}
	}
}
