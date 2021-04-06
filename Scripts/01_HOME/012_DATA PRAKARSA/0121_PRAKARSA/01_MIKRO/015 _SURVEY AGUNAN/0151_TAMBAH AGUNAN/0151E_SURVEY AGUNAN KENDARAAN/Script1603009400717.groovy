import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW


'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN KENDARAAN\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN KENDARAAN\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN KENDARAAN\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116A_MENU SURVEY AGUNAN'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116B_PLUS'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/0121161A_TAMBAHANGGUNAN'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN KENDARAAN\\04_DETAIL MENU SURVEY AGUNAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/0121161F_KENDARAAN'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataAgunan.DataKendaraan'(DESKRIPSI, KEPEMILIKAN, PEMILIK, KLASIFIKASIKENDARAAN, 
    MEREKKENDARAAN, JENISKENDARAAN, WARNAKENDARAAN, TAHUNPEMBUATAN, NOMORMESIN, NOMORCHASIS, STATEAGUNAN, NOBPKB, TGLBPKB)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN KENDARAAN\\05_DATA MENU SURVEY AGUNAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01P_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataAgunan.Alamat'(ALAMATSAMA, ALAMAT, RT, RW, KEC, KEL, KODEPOS)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN KENDARAAN\\06_ALAMAT.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612F_SIMPAN'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataAgunan.NilaiKendaraan'(NILAIPASARWAJAR, PERSENTASENILAILIKUIDASI)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\SURVEY AGUNAN KENDARAAN\\07_NILAI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01P_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataAgunan.Foto'(LOKASI, KODEPOS)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4P_SIMPAN'), 
    GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4M_YES'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116B_PLUS'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116C_BACK'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121C_BACK'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116C_BACK'), GlobalVariable.timeOut)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

