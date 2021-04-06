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

//CaptureScreenshoot
CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.openApplication'()

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\HAPUS\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01A_MENU PEMASARAN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011A_DATA PEMASARAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.SearchData'(nama_lengkap)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06B_ICON_PLUS'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/06D_HAPUS'), GlobalVariable.timeOut)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\HAPUS\\02_HAPUS PEMASARAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Memilih Notifikasi Hapus '
Mobile.checkElement(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/063_HAPUS/063A_BLMBERMINAT'), 
    GlobalVariable.timeOut)

'Memilih Notifikasi Hapus '
Mobile.verifyElementChecked(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/063_HAPUS/063A_BLMBERMINAT'), 
    GlobalVariable.timeOut)

'Add Keterangan '
Mobile.setText(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/063_HAPUS/063E_KET'), 'Data Tidak Valid', 
    GlobalVariable.timeOut)

'Memilih Notifikasi Hapus '
Mobile.tapAndHold(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/063_HAPUS/063D_HAPUS'), 
    5, GlobalVariable.timeOut)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PEMASARAN\\HAPUS\\03_BERHASIL HAPUS.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/06_DETAIL PEMASARAN/063_HAPUS/063F_OK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011G_BACK'), GlobalVariable.timeOut)

WebUI.delay(10)

