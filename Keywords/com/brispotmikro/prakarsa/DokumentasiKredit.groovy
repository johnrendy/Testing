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

public class DokumentasiKredit {

	@Keyword
	public void FotoDokumentasiKredit(){
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119B_FOTODEBITUR'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.DokumentasiKredit.Foto'()

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\04_FOTO DEBITUR.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119J_BACK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119C_FOTOISTRISUAMI'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.DokumentasiKredit.Foto'()

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\05_FOTO ISTRI SUAMI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119J_BACK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119D_FOTOIJINUSAHA'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.DokumentasiKredit.Foto'()

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\06_FOTO IJIN USAHA.png',
				FailureHandling.CONTINUE_ON_FAILURE)


		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119J_BACK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119E_FOTOKK'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.DokumentasiKredit.Foto'()

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\07_FOTO KARTU KELUARGA.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119J_BACK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119F_FOTONPWP'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.DokumentasiKredit.Foto'()

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\08_FOTO NPWP.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119J_BACK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119G_FOTOSK'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.DokumentasiKredit.Foto'()

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\09_FOTO SK.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119J_BACK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119H_FOTOBUKTIKEPEMILIKANAGUNAN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.DokumentasiKredit.Foto'()

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\10_FOTO BUKTI KEPEMILIKAN.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119J_BACK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119I_FOTOLAINLAIN'),
				GlobalVariable.timeOut)

		CustomKeywords.'com.brispotmikro.prakarsa.DokumentasiKredit.Foto'()

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\11_FOTO LAIN-LAIN.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0122119J_BACK'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\DOKUMENTASI KREDIT\\12_DOKUMENTASI.png',
				FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void Foto(){

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0121191_FOTO/0121191A_FOTO'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0121191_FOTO/0121191B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012119_DOKUMENTASI KREDIT/0121191_FOTO/0121191E_OK'),
				GlobalVariable.timeOut)
	}
}
