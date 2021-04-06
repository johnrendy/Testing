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

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.openApplication'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\01_MENU UTAMA.png', 
    FailureHandling.STOP_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\02_MENU PRAKARSA.png', 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\03_DETAIL PRAKARSA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120A_MENU REKOMENDASI KREDIT'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120B_CEKREKENING'), 
    GlobalVariable.timeOut)

Mobile.delay(GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120D_NEXT'), GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201A_BAKIDEBET'), 
    BAKIDEBET, GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\04_DATA PINJAMAN SATU.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Sifat Suku Bunga', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201B_SUMBERPENGAJUAN'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataList'(SUMBERPENGAJUAN)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201C_PROMO'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataList'(PROMO)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201D_SUKUBUNGA'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataList'(SIFATSUKUBUNGA)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201E_TBREKENING'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataList'(TUJUANBUKAREKENING)

Mobile.scrollToText('HITUNG MAKS PLAFON DAN ANGSURAN', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201F_PLAFONPINJAM'), 
    PLAFONPINJAMAN, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201G_JANGKAWAKTU'), 
    JANGKAWAKTU, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201H_SUKUBUNGA'), 
    SUKUBUNGA, GlobalVariable.timeOut)

'BUGS GA BSA TAP LOAD==============================='
Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

//Mobile.tapAtPosition(628, 1083)
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201I_LOAN'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListView'(LOANTYPE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201J_HITUNGPLAFON'), 
    GlobalVariable.timeOut)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\06_DATA PINJAMAN DUA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Asuransi', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201K_BAKIDEBETEKS'), 
    BAKIDEBETEKS, GlobalVariable.timeOut)

if (TAKEOVER == 'YA') {
    Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Q_SWITCHTAKEOVER'), 
        GlobalVariable.timeOut)

    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Q_SWITCHTAKEOVER'), 
        GlobalVariable.timeOut)

    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201O_BANKTAKEOVER'), 
        BANKTAKEOVER, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/02_PROMO/02A_CARI'), 
        BANKTAKEOVER, GlobalVariable.timeOut)

    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/02_PROMO/02H_LISTPROMO'), 
        GlobalVariable.timeOut)
} else {
    Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201Q_SWITCHTAKEOVER'), 
        GlobalVariable.timeOut)
}

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201L_BIAYAADMIN'), 
    BIAYAADMIN, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201P_PROVISI'), 
    PROVISI, GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/0121201_DATAPINJAMAN/0121201N_ASURANSI'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListView'(ASURANSI)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\07_DATA PINJAMAN TIGA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120D_NEXT'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120E_OK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121C_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)

