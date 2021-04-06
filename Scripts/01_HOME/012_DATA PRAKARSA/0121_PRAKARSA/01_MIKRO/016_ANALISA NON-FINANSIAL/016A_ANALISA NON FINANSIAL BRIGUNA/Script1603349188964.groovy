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

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA NON FINANSIAL\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA NON FINANSIAL\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA NON FINANSIAL\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0122117A_MENU ANALISA NON-FINANSIAL'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121171_REKENING/0121171A_REKENING'), 
    GlobalVariable.timeOut)

'Get first list'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121171_REKENING/0121171D_CARIDATA'), 
    REKENING, GlobalVariable.timeOut)

if (REKENING == 'Ya') {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121171_REKENING/0121171B_YA'), 
        GlobalVariable.timeOut)
} else {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121171_REKENING/0121171C_TIDAK'), 
        GlobalVariable.timeOut)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121172_RIWAYAT/0121172A_RIWAYAT'), 
    GlobalVariable.timeOut)

'Get first list'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121172_RIWAYAT/0121172D_CARIDATA'), 
    RIWAYAT, GlobalVariable.timeOut)

if (RIWAYAT == 'Debitur baru.') {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121172_RIWAYAT/0121172B_DEBITURBARU'), 
        GlobalVariable.timeOut)
} else {
    Mobile.tap(findTestObject('01_HALAMAN HOME/012_MENU PRAKARSA/0121_PRAKARSA/01211_DETAIL PRAKASA/012117_ANALISA NON-FINANSIAL/0121172_RIWAYAT/0121172C_DEBITURLAMA'), 
        GlobalVariable.timeOut)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121173_CASHFLOW/0121173A_CASHFLOW'), 
    GlobalVariable.timeOut)

if (CASHFLOW == 'Pembayaran gaji dilakukan sendiri.') {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121173_CASHFLOW/0121173B_PEMBAYARANSENDIRI'), 
        GlobalVariable.timeOut)
} else if (CASHFLOW == 'Pembayaran gaji dilakukan melalui bendahara.') {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121173_CASHFLOW/0121173C_PEMBAYARANBENDAHARA'), 
        GlobalVariable.timeOut)
} else {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121173_CASHFLOW/0121173D_DEBETBRI'), 
        GlobalVariable.timeOut)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121174_DOKUMEN/0121174A_DOKUMEN'), 
    GlobalVariable.timeOut)

'Get first list'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121174_DOKUMEN/0121174D_CARIDATA'), 
    KELENGKAPANDOKUMEN, GlobalVariable.timeOut)

if (KELENGKAPANDOKUMEN == 'Dokumen Lengkap.') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121174_DOKUMEN/0121174B_DLENGKAP'), 
        GlobalVariable.timeOut)
} else {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0121174_DOKUMEN/0121174C_DTLENGKAP'), 
        GlobalVariable.timeOut)
}

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA NON FINANSIAL\\04_ANALISANONFINANSIAL.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0122117B_SIMPAN'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012117_ANALISA NON-FINANSIAL/0122117C_IYA'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121C_BACK'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116C_BACK'), GlobalVariable.timeOut)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

