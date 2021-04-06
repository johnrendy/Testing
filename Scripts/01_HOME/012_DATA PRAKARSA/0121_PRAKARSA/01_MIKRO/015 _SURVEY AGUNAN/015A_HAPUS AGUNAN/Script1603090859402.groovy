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

'Start aplikasi\r\n'
Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BRISPOT_AO_6282020.apk', false, FailureHandling.CONTINUE_ON_FAILURE)

'Delay 5 second'
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\HAPUS\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('APLIKASI MIKRO DAN RITEL/01_HALAMAN HOME/012_MENU PRAKARSA/012A_MENU PRAKARSA LAYOUT'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\HAPUS\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\HAPUS\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116A_MENU SURVEY AGUNAN'), 
    GlobalVariable.timeOut)

Mobile.tapAtPosition(305, 980)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\HAPUS\\04_AKSI AGUNAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116F_HAPUS'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\HAPUS\\05_HAPUS AGUNAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116G_YA'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\HAPUS\\06_BERHASIL HAPUS AGUNAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Delay 5 second'
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116C_BACK'), 
    GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121C_BACK'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116C_BACK'), 
    GlobalVariable.timeOut)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

