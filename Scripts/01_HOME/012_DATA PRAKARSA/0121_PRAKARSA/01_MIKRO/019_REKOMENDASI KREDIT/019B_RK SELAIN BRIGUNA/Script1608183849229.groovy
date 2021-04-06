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
import org.openqa.selenium.Keys as Keys

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\REKOMENDASI KREDIT\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120A_MENU REKOMENDASI KREDIT'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120B_CEKREKENING'), 
    GlobalVariable.timeOut)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012120_REKOMENDASI KREDIT/012120D_NEXT'), GlobalVariable.timeOut)

//CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataListViewSpinner'(JNSPENGGUNAAN)
CustomKeywords.'com.brispotmikro.prakarsa.RekomendasiKredit.DataPinjaman'(JNSPENGGUNAAN, SEKTOREKONOMI, BAKIDEBET, REKENINGSUPLESI, 
    PLAFONPINJAMAN, JANGKAWAKTU, POLAANGS, GRACEPERIODE, SUKUBUNGA, ASURANSI, SANDISTP, TAKEOVER, BANKTAKEOVER, SEGMENPRODUK)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121C_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)

