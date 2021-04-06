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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Start aplikasi\r\n'
Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BRISPOT_AO_6282020', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

'Ambil tampilan\r\n'
Mobile.takeScreenshot('D:\\KATALON DRIVE\\03_SCREENSHOOT\\MIKRO\\PEMASARAN\\PRAKARSA\\HAPUSPRAKARSA\\01_MENUUTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('PRAKARSA/HAPUS PRAKARSA/00_MENUPRAKARSA'), GlobalVariable.timeOut)

'Ambil tampilan\r\n'
Mobile.takeScreenshot('D:\\KATALON DRIVE\\03_SCREENSHOOT\\MIKRO\\PEMASARAN\\PRAKARSA\\HAPUSPRAKARSA\\02_MENUPRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('PRAKARSA/HAPUS PRAKARSA/01D_CARIDEBITUR'), '', GlobalVariable.timeOut)

Mobile.tapAtPosition(0, 0)

'Ambil tampilan\r\n'
Mobile.takeScreenshot('D:\\KATALON DRIVE\\03_SCREENSHOOT\\MIKRO\\PEMASARAN\\PRAKARSA\\HAPUSPRAKARSA\\03_DETAILPRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('PRAKARSA/HAPUS PRAKARSA/02B_HAPUS'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('PRAKARSA/HAPUS PRAKARSA/02B_HAPUS'), GlobalVariable.timeOut)

'Ambil tampilan\r\n'
Mobile.takeScreenshot('D:\\KATALON DRIVE\\03_SCREENSHOOT\\MIKRO\\PEMASARAN\\PRAKARSA\\HAPUSPRAKARSA\\04_HAPUSPRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('PRAKARSA/HAPUS PRAKARSA/02BA_KETERANGAN'), 'Data Tidak Sesuai', GlobalVariable.timeOut)

Mobile.tap(findTestObject('PRAKARSA/HAPUS PRAKARSA/02BC_SUBMIT'), GlobalVariable.timeOut)

'Ambil tampilan\r\n'
Mobile.takeScreenshot('D:\\KATALON DRIVE\\03_SCREENSHOOT\\MIKRO\\PEMASARAN\\PRAKARSA\\HAPUSPRAKARSA\\05_POPUPHAPUSPRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('PRAKARSA/HAPUS PRAKARSA/02BCB_YA'), GlobalVariable.timeOut)

'Ambil tampilan\r\n'
Mobile.takeScreenshot('D:\\KATALON DRIVE\\03_SCREENSHOOT\\MIKRO\\PEMASARAN\\PRAKARSA\\HAPUSPRAKARSA\\06_POPUPBERHASILHAPUSPRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('PRAKARSA/HAPUS PRAKARSA/02BCBA_OK'), GlobalVariable.timeOut)

Mobile.setText(findTestObject('PRAKARSA/HAPUS PRAKARSA/01D_CARIDEBITUR'), '', GlobalVariable.timeOut)

'Ambil tampilan\r\n'
Mobile.takeScreenshot('D:\\KATALON DRIVE\\03_SCREENSHOOT\\MIKRO\\PEMASARAN\\PRAKARSA\\HAPUSPRAKARSA\\07_CEKULANG.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('PRAKARSA/HAPUS PRAKARSA/01A_BACK'), GlobalVariable.timeOut)

