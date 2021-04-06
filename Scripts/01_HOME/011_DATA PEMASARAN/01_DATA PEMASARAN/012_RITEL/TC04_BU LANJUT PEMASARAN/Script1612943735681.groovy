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
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\RITEL\\DATA PEMASARAN BADAN USAHA\\01_HALAMAN HOME.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01A_MENU PEMASARAN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011A_DATA PEMASARAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.SearchData'(nama_perusahaan)

CustomKeywords.'com.brispotmikroritel.pemasaran.DataPemasaran.fotoRitel'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\RITEL\\DATA PEMASARAN BADAN USAHA\\02_IDENTITAS.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('UBAH LOKASI', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.UbahLokasi'(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'))

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\RITEL\\DATA PEMASARAN BADAN USAHA\\03_IDENTITAS.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/0111B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.pemasaran.DataPemasaran.DataUsaha'(npwp, nama_perusahaan, status_badan_usaha, bentuk_badan_usaha, 
    kota_tempat_usaha, tgl_usaha, no_hp, email, bidang_usaha)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/0111B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Alamat'(alamat, rt, rw, kodepos_pemohon)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\RITEL\\DATA PEMASARAN BADAN USAHA\\06_ALAMAT.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/0111B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.pemasaran.DataPemasaran.DataPengajuanRitel'(status, jml_permohonan, periode, tujuan_kredit)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011G_BACK'), GlobalVariable.timeOut)

