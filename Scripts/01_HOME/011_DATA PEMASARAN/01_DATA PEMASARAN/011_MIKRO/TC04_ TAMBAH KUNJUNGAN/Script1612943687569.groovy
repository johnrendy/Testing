import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.openApplication'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\TAMBAH KUNJUNGAN\\01_HALAMAN HOME.png', 
    FailureHandling.STOP_ON_FAILURE)

'Pilih menu pemasaran\r\n'
Mobile.tap(findTestObject('01_HOME/01A_MENU PEMASARAN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011A_DATA PEMASARAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.SearchData'(nama_debitur)

'Memilih menu icon plus'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06B_ICON_PLUS'), GlobalVariable.timeOut)

'Memilih action tambah kunjungan'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061A_TAMBAHKUNJUNGAN'), 
    GlobalVariable.timeOut)

'Input data tujuan kunjungan'
Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061B_TUJUANKUNJUNGAN'), 
    'Survey Lokasi', GlobalVariable.timeOut)

'Memilih action tambah kunjungan'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061C_TGLKUNJUNGAN'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.Tanggal'(tgl_kunjungan, GlobalVariable.timeOut, GlobalVariable.timeOut)

'Memilih action tambah kunjungan'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061F_WAKTU'), 
    GlobalVariable.timeOut)

'Pilih menu pemasaran\r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061M_TYPE TIME'), 
    GlobalVariable.timeOut)

'Memilih action tambah kunjungan'
Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/01_TIME/01G_EHOUR'), 
    hour, GlobalVariable.timeOut)

'Memilih action tambah kunjungan'
Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/01_TIME/01H_MINUTE'), 
    minute, GlobalVariable.timeOut)

'Memilih action tambah kunjungan'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/01_TIME/01E_OK'), 
    GlobalVariable.timeOut)

'Memilih action tambah kunjungan'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061D_LOKASI'), 
    GlobalVariable.timeOut)

Mobile.scrollToText('UBAH LOKASI', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.UbahLokasi'(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'), 
    lokasi, kode_pos)

'Klik Cari'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061E_SIMPANRENCANA'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\TAMBAH KUNJUNGAN\\02_TAMBAH DATA KUNJUNGAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Klik Cari'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061G_YA'), 
    GlobalVariable.timeOut)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\TAMBAH KUNJUNGAN\\03_DATA LIST KUNJUNGAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Memilih back to home'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06F_BACK'), GlobalVariable.timeOut)

'Memilih back to home'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011G_BACK'), GlobalVariable.timeOut)

WebUI.delay(10)

Mobile.closeApplication()

