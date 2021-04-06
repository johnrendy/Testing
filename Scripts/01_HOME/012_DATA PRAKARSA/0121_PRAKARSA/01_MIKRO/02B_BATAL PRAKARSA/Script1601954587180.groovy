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

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\HAPUSPRAKARSA\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\HAPUSPRAKARSA\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\HAPUSPRAKARSA\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Clickable icon plus'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012111_ICON PLUS/0121112A_PLUS'), GlobalVariable.timeOut)

'Select button batal'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012111_ICON PLUS/0121112B_BATALPRAKARSA'), GlobalVariable.timeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)

'Create Text Data Keterangan'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012111_ICON PLUS/0121112_BATAL PRAKARSA/01_PEMBATALAN PRAKARSA/01A_KET'), 
    'Data Tidak Sesuai', 15)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\HAPUSPRAKARSA\\04_PEMBATALAN PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Clickable button batalkan'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012111_ICON PLUS/0121112_BATAL PRAKARSA/0121112A_BATAL PRAKARSA'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\MIKRO\\PEMASARAN\\PRAKARSA\\DETAIL PRAKARSA\\HAPUSPRAKARSA\\05_PEMBATALAN PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Success Notification batalkan prakarsa'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012111_ICON PLUS/0121112_BATAL PRAKARSA/01_PEMBATALAN PRAKARSA/01D_YA'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\HAPUSPRAKARSA\\06_HAPUS PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(10)

'Back to Home'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)

Mobile.delay(10)

