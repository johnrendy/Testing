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

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.openApplication'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\GALLERY\\01_HALAMAN HOME.png', 
    FailureHandling.STOP_ON_FAILURE)

'Pilih menu pemasaran\r\n'
Mobile.tap(findTestObject('01_HOME/01A_MENU PEMASARAN'), GlobalVariable.timeOut)

'Pilih menu pemasaran\r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011A_DATA PEMASARAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.SearchData'(nama_debitur)

'Memilih menu icon plus'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06B_ICON_PLUS'), GlobalVariable.timeOut)

'Memilih action gallery'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06E_GALLERY'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\GALLERY\\02_GALLERY.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Memilih menu icon plus'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06B_ICON_PLUS'), GlobalVariable.timeOut)

'Memilih menu icon plus'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/064_GALLERY/064C_FOTO'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.pemasaran.DataPemasaran.Camera'()

'Memilih view image'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/064_GALLERY/064H_IMAGE'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\GALLERY\\03_VIEW IMAGE.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Memilih action update gambar'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/064_GALLERY/01_VIEWIMAGE/01C_UPDATE'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.pemasaran.DataPemasaran.Camera'()

'Memilih view image'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/064_GALLERY/064H_IMAGE'), GlobalVariable.timeOut)

'Memilih action update gambar'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/064_GALLERY/01_VIEWIMAGE/01A_HAPUS'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\GALLERY\\04_DELETE IMAGE.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Memilih action update gambar'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/064_GALLERY/01_VIEWIMAGE/01D_YA'), 
    GlobalVariable.timeOut)

'Memilih back to home'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06F_BACK'), GlobalVariable.timeOut)

'Memilih menu icon plus'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06B_ICON_PLUS'), GlobalVariable.timeOut)

'Memilih back to home'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06F_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011G_BACK'), GlobalVariable.timeOut)

WebUI.delay(10)

