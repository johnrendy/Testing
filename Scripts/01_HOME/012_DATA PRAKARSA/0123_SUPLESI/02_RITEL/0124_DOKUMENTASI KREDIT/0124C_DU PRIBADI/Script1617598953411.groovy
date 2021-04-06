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

//CustomKeywords.'com.brispotritel.prakarsa.DokumenUtama.openApplication'()
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DOKUMEN UTAMA\\PRIBADI\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_SUPLESIPERPANJANGAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121G_DOKUMENTASI'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/01215D_DOKUMEN UTAMA'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DokumenUtama.dokumenUtamaPribadi'()

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/01215A_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut)

Mobile.delay(GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

