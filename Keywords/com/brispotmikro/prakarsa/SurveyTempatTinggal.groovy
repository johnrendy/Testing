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
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

public class SurveyTempatTinggal {


	@Keyword
	public void Foto(){
		//		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114J_ICON PLUS'),
		//				GlobalVariable.timeOut)
		//
		//		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114K_TFOTO'),
		//				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115K_PLUS'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115L_TAMBAHFOTO'),
				GlobalVariable.timeOut)
		'Get Picture'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/01_KTP DEBITUR/01B_SHUTTERCAMERA'),
				GlobalVariable.timeOut)

		'Pilih OK'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/01_KTP DEBITUR/01D_OK'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114J_ICON PLUS'),
				GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY TEMPAT TINGGAL\\04_FOTO.png',
				FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def AlamatTempatTinggal(TestObject to,String ALAMATSAMA,String ALAMAT,String LOKASI,String RT,String RW,String KODEPOS,String KEC, String KEL, String STATUSKEPEMILIKAN,String LAMAMENETAP){

		Mobile.scrollToText('LANJUT', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141A_UBAH LOKASI'),
				GlobalVariable.timeOut)

		WebElement element = MobileElementCommonHelper.findElement(to, GlobalVariable.timeOut)

		if (element != null) {

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'),
					GlobalVariable.timeOut)

			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'),
					GlobalVariable.timeOut)

			'Search Lokasi'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141B_SEARCHBYLOCATION'),
					GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_KODEPOS'),
					GlobalVariable.timeOut)


			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/01211411_KODE POS/01211411B_CARIDATA'),
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/01211411_KODE POS/01211411C_LIST KODE POS'),
					GlobalVariable.timeOut)

			'Create Text Data Lokasi'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141E_KETIKLOKASI'),
					LOKASI, GlobalVariable.timeOut)

			'Klik Cari'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141G_CARI'),
					GlobalVariable.timeOut)

			'Klik Set Loc'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141C_SET LOCATION'),
					GlobalVariable.timeOut)
		}else {

			'Search Lokasi'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141B_SEARCHBYLOCATION'),
					GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_KODEPOS'),
					GlobalVariable.timeOut)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/01211411_KODE POS/01211411B_CARIDATA'),
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/01211411_KODE POS/01211411C_LIST KODE POS'),
					GlobalVariable.timeOut)

			'Create Text Data Lokasi'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141E_KETIKLOKASI'),
					LOKASI, GlobalVariable.timeOut)

			'Klik Cari'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141G_CARI'),
					GlobalVariable.timeOut)

			'Klik Set Loc'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141C_SET LOCATION'),
					GlobalVariable.timeOut)
		}

		Mobile.scrollToText('LANJUT', FailureHandling.CONTINUE_ON_FAILURE)

		'Klik Set Location'
		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114C_LANJUT'),
				GlobalVariable.timeOut)

		if (ALAMATSAMA == 'YA') {
			'Memilih Switch OFF'
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Memilih Switch OFF'
			Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Memilih Switch ON'
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Verify Switch ON'
			Mobile.verifyElementChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
					GlobalVariable.timeOut)
		} else {
			'Memilih Switch OFF'
			Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			'Memilih Switch OFF'
			Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114D_SWITCHALAMAT'),
					GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121142_ALAMAT/0121142A_ALAMAT'),
					ALAMAT, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121142_ALAMAT/0121142B_RT'),
					RT, GlobalVariable.timeOut)

			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121142_ALAMAT/0121142C_RW'),
					RW, GlobalVariable.timeOut)

			'Search Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121142_ALAMAT/0121142D_KODEPOS'),
					GlobalVariable.timeOut)

			'Create Text Data Kode Pos'
			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121142_ALAMAT/01211421_KODE POS/01211421B_CARIDATA'),
					KODEPOS, GlobalVariable.timeOut)

			'Selected Kode Pos'
			Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121142_ALAMAT/01211421_KODE POS/01211421C_LIST KODE POS'),
					GlobalVariable.timeOut)

			//			'data kec'
			//			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121142_ALAMAT/0121142E_KEC'),
			//					KEC, GlobalVariable.timeOut)
			//
			//			' data kel'
			//			Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121142_ALAMAT/0121142E_KEL'),
			//					KEL, GlobalVariable.timeOut)
		}

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY TEMPAT TINGGAL\\05_ALAMATSATU.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114E_STATUS'),
				GlobalVariable.timeOut)

		if (STATUSKEPEMILIKAN == 'Milik Sendiri') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121143_STATUSK/0121143A_MILIKSENDIRI'),
					GlobalVariable.timeOut)
		} else if (STATUSKEPEMILIKAN == 'Milik Orang Tua / Mertua') {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121143_STATUSK/0121143B_MILIKORTU'),
					GlobalVariable.timeOut)
		} else {
			Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121143_STATUSK/0121143C_SEWA'),
					GlobalVariable.timeOut)
		}

		'Create Text Data Lokasi'
		Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114F_LAMAMENETAP'),
				LAMAMENETAP, GlobalVariable.timeOut)

		'Capture Screenshoot'
		Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY TEMPAT TINGGAL\\06_ALAMATDUA.png',
				FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114G_SIMPAN'),
				GlobalVariable.timeOut)

		Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114H_IYA'),
				GlobalVariable.timeOut)
	}
}
