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

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.openApplication'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\SUPLESI\\01_MENU UTAMA.png', FailureHandling.STOP_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_SUPLESIPERPANJANGAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'('')

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012111_ICON PLUS/0121112A_PLUS'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03A_SEARCH SUPLESI'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121B_CARI DEBITUR'), GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121B_CARI DEBITUR'), 'a', GlobalVariable.timeOut)

Mobile.tapAtPosition(979, 2112)

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.RecyclerView'(nama_debt_suplesi)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.Suplesi.ScrollView'('')

if (jenis_plafond.equals('Suplesi')) {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03C_Suplesi'), GlobalVariable.timeOut)

    if (suplesi.equals('YA')) {
        Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03F_YA'), GlobalVariable.timeOut)

        Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03G_OK'), GlobalVariable.timeOut)
    } else {
        Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03E_TIDAK'), GlobalVariable.timeOut)
    }
} else {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03C_Suplesi'), GlobalVariable.timeOut)

    if (perpanjangan.equals('YA')) {
        Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03F_YA'), GlobalVariable.timeOut)

        Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03G_OK'), GlobalVariable.timeOut)
    } else {
        Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0123_SUPLESI/03E_TIDAK'), GlobalVariable.timeOut)
    }
}

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut)
//'Select menu prakarsa'
//Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)
//
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_SUPLESIPERPANJANGAN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/011_PEMASARAN/011F_LIST DATA'), GlobalVariable.timeOut)

//
//CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama_debt_suplesi)
Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

