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

//CustomKeywords.'com.brispotritel.prakarsa.DokumenPerijinan.openApplication'()

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DOKUMEN PERIJINAN\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121G_DOKUMENTASI'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/01215E_DOKUMEN PERIJINAN'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/012152A_TAMBAH'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DokumenPerijinan.dataPerijinan'(jenis_perijinan, lainnya, no_perijinan, issue_date, 
    expired_date)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DOKUMEN PERIJINAN\\02_DATA PERIJINAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/012152B_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DokumenPerijinan.Foto'()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DOKUMEN PERIJINAN\\03_FOTO.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/012152B_NEXT'), 
    GlobalVariable.timeOut)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DOKUMEN PERIJINAN\\04_SELESAI.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/0121523_SELESAI/0121523A_KIRIM'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/012152_DOKUMEN PERIJINAN/012152C_BACK'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut)

Mobile.delay(GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

