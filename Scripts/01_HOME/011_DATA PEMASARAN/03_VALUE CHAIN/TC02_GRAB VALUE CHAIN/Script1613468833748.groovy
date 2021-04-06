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

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.openApplication'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\VALUE CHAIN\\TAMBAH VALUE CHAIN\\01_HALAMAN HOME.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Pilih menu pemasaran\r\n'
Mobile.tap(findTestObject('01_HOME/01A_MENU PEMASARAN'), GlobalVariable.timeOut)

'Pilih menu value chain\r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011B_DATA VALUE CHAIN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.SearchData'(nama_debitur)

'Cari kata "ubah lokasi"'
Mobile.scrollToText('UBAH LOKASI', FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.UbahLokasi'(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'), 
    lokasi, kode_pos)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\VALUE CHAIN\\TAMBAH VALUE CHAIN\\02_LOKASI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Pilih menu value chain\r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0113_VALUE CHAIN/01132_VALUE CHAIN/011321_DETAIL VALUE CHAIN/011321A_GRAB'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\VALUE CHAIN\\TAMBAH VALUE CHAIN\\02_GRAB VALUE CHAIN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'Pilih menu value chain\r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0113_VALUE CHAIN/01132_VALUE CHAIN/011321_DETAIL VALUE CHAIN/011321C_OK'), 
    GlobalVariable.timeOut)

'Memilih back to home'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011G_BACK'), GlobalVariable.timeOut)

Mobile.delay(GlobalVariable.timeOut)

