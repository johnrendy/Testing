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
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY TEMPAT TINGGAL\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY TEMPAT TINGGAL\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY TEMPAT TINGGAL\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/012114A_MENU SURVEY TEMPAT TINGGAL'), 
    GlobalVariable.timeOut)

if (SEGMENPRODUK.equals('Briguna Karya/Umum')) {
    CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatTinggal.AlamatTempatTinggal'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'), 
        ALAMATSAMA, ALAMAT, LOKASI, RT, RW, KODEPOS, KEC, KEL, STATUSKEPEMILIKAN, LAMAMENETAP)
} else if (SEGMENPRODUK.equals('Briguna Purna')) {
    CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatTinggal.AlamatTempatTinggal'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'), 
        ALAMATSAMA, ALAMAT, LOKASI, RT, RW, KODEPOS, KEC, KEL, STATUSKEPEMILIKAN, LAMAMENETAP)
} else if (SEGMENPRODUK.equals('Briguna Karyawan')) {
    CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatTinggal.AlamatTempatTinggal'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'), 
        ALAMATSAMA, ALAMAT, LOKASI, RT, RW, KODEPOS, KEC, KEL, STATUSKEPEMILIKAN, LAMAMENETAP)
} else {
    CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatTinggal.Foto'()

    CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatTinggal.AlamatTempatTinggal'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'), 
        ALAMATSAMA, ALAMAT, LOKASI, RT, RW, KODEPOS, KEC, KEL, STATUSKEPEMILIKAN, LAMAMENETAP)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/012112B_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)

