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

//CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.openApplication'()
'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\01_MENU UTAMA.png', 
    FailureHandling.STOP_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012C_TAB PRAKASA'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\02_MENU PRAKARSA.png', 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\03_DETAIL PRAKARSA.png', 
    FailureHandling.STOP_ON_FAILURE)

'Menampilkan data detail prakasa'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/012112A_MENU DETAIL DATA PRIBADI'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.FotoKTP'()

'Pilih Next to Data Pribadi'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/0121121_KTP/0121121A_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.DataPribadi'(NIK, NAMALENGKAP, JKELAMIN, STATUS, NIKPAS, NAMAPAS, 
    JKELAMINPAS, TGLPAS, TANGGUNGAN, TEMPATLAHIR, TGLLAHIR, NAMAIBU, AGAMAIBU, BIDANGUSAHA, BIDANGUSAHALAIN, PISAH_HARTA, 
    AGAMALAINNYA, NOHP)

'Next To Alamat'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/012112C_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Alamat'(ALAMAT, RT, RW, KODEPOS, KEC, KEL, STATUS, ALAMATPAS, 
    RTPAS, RWPAS, KODEPOSPAS, KECPAS, KELPAS)

'Next To Info Lain'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/012112C_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.InfoLain'(PEKERJAAN, PEKERJAANCIF, STATUSGELAR, PINJAMBANK, 
    NAMABANKLAIN, JENISREK, TBREKENING, SEGMENKREDIT, PKERJASAMA, INSTANSIBRIGUNA, NONGTOG, NAMAPJTKI, PKSPJTKI, NOPKS, 
    PENGHASILAN)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012112_DETAIL DATA PRIBADI/012112B_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)

