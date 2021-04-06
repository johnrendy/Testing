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
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\HASIL KUNJUNGAN\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Pilih menu pemasaran\r\n'
Mobile.tap(findTestObject('01_HOME/01A_MENU PEMASARAN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011A_DATA PEMASARAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.SearchData'(nama_debitur)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06G_LIST KUNJUNGAN'), GlobalVariable.timeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)

if (HASILKUNJUNGAN == ' Calon nasabah tidak ada') {
    'Memilih Jenis Kelamin Wanita'
    Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062A_ALSN1'), 
        GlobalVariable.timeOut)

    'Memilih Jenis Kelamin Wanita'
    Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062A_ALSN1'), 
        GlobalVariable.timeOut)
} else if (HASILKUNJUNGAN == ' Calon nasabah belum menyiapkan dokumen') {
    'Memilih Jenis Kelamin Wanita'
    Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062B_ALSN2'), 
        GlobalVariable.timeOut)

    'Memilih Jenis Kelamin Wanita'
    Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062B_ALSN2'), 
        GlobalVariable.timeOut)
} else if (HASILKUNJUNGAN == ' Calon nasabah meminta pertemuan lanjutan') {
    'Memilih Jenis Kelamin Wanita'
    Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062C_ALSN3'), 
        GlobalVariable.timeOut)

    'Memilih Jenis Kelamin Wanita'
    Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062C_ALSN3'), 
        GlobalVariable.timeOut)
} else if (HASILKUNJUNGAN == ' Lainnya') {
    'Memilih Jenis Kelamin Wanita'
    Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062D_ALSN4'), 
        GlobalVariable.timeOut)

    'Memilih Jenis Kelamin Wanita'
    Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062D_ALSN4'), 
        GlobalVariable.timeOut)
} else {
    'Memilih Jenis Kelamin Wanita'
    Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062E_ALSN5'), 
        GlobalVariable.timeOut)

    'Memilih Jenis Kelamin Wanita'
    Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062E_ALSN5'), 
        GlobalVariable.timeOut)
}

'Memilih data user pertama \r\n'
Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062F_Hasil kunjungan'), 
    KETERANGAN, GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\HASIL KUNJUNGAN\\04_HASIL KUNJUNGAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('SUBMIT KUNJUNGAN', FailureHandling.CONTINUE_ON_FAILURE)

'Memilih data user pertama \r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/062_HASILKUNJUNGAN/062G_SUBMIT KUNJUNGAN'), 
    GlobalVariable.timeOut)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\HASIL KUNJUNGAN\\05_BERHASIL SUBMIT KUNJUNGAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Memilih data user pertama \r\n'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/061_ TAMBAH KUNJUNGAN/061L_OK'), 
    GlobalVariable.timeOut)

'Memilih back to home'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06F_BACK'), GlobalVariable.timeOut)

'Memilih back to home'
Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011G_BACK'), GlobalVariable.timeOut)

WebUI.delay(10)

Mobile.closeApplication()

