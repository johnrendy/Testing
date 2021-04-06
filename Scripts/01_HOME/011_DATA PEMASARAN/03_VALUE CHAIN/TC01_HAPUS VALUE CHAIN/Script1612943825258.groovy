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
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\VALUE CHAIN\\HAPUS VALUE CHAIN\\01_HALAMAN HOME.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Pilih menu pemasaran\r\n'
Mobile.tap(findTestObject('01_HOME/01A_MENU PEMASARAN'), GlobalVariable.timeOut)

'Pilih menu value chain\r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011B_DATA VALUE CHAIN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.SearchData'(nama_lengkap)

'Cari kata HAPUS'
Mobile.scrollToText('HAPUS', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0113_VALUE CHAIN/01132_VALUE CHAIN/011321_DETAIL VALUE CHAIN/011321B_HAPUS'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\VALUE CHAIN\\HAPUS VALUE CHAIN\\02_HAPUS DATA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Cari kata HAPUS'
Mobile.scrollToText('SUBMIT', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0113_VALUE CHAIN/01132_VALUE CHAIN/011321_DETAIL VALUE CHAIN/01_HAPUS/01B_KETERANGAN'), 
    'Data Tidak Sesuai', GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0113_VALUE CHAIN/01132_VALUE CHAIN/011321_DETAIL VALUE CHAIN/01_HAPUS/01A_SUBMIT'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\VALUE CHAIN\\HAPUS VALUE CHAIN\\03_HAPUS VALUE CHAIN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'Pilih menu value chain\r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0113_VALUE CHAIN/01132_VALUE CHAIN/011321_DETAIL VALUE CHAIN/011321C_OK'), 
    GlobalVariable.timeOut)

'Memilih back to home'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011G_BACK'), GlobalVariable.timeOut)

Mobile.delay(15)

Mobile.closeApplication()

