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
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY DATA PRIBADI\\01_MENU UTAMA.png', 
    FailureHandling.STOP_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\PRODUKKUPEDES\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115A_MENU SURVEY TEMPAT USAHA'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/019_SOSIALISASI VAKSIN/019B_OK'), GlobalVariable.timeOut)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115A_MENU SURVEY TEMPAT USAHA'),
	GlobalVariable.timeOut)


CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatUsaha.Foto'()

Mobile.scrollToText('LANJUT', FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatUsaha.UbahLokasi'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'), 
    KODEPOS, LOKASI)

'Lanjut Identitas Usha'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115C_LANJUT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatUsaha.IdentitasUsaha'(IDENTITASUSAHA, NOSIUP, NOSKU, NOPERIJINANLAINNYA, 
    TGLUSAHA, NPWP)

'Next Alamat Usaha'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121154_IDENTITASUSAHA/0121154G_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatUsaha.AlamatUsaha'(ALAMATSAMA, ALAMAT, RT, RW, KODEPOS)

Mobile.scrollToText('NEXT', FailureHandling.CONTINUE_ON_FAILURE)

'Next to Data Keuangan '
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115J_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyTempatUsaha.DataKeuangan'(STATUSKEPEMILIKAN, TRANSAKSI, JENISANALISAFINANSIAL, 
    OMSET_B, BIAYAHPP_B, JMLTNGAKERJA_B, UPAHKERJA_B, JMLHARI, OMSET_H, BIAYAHPP_H, JMLTNGAKERJA_H, UPAHKERJA_H, JENISDAGANGAN, 
    JMLDAGANGAN, HRGJUAL, HPPDAGANGAN, OMSET_D, BIAYAHPP_D, JMLTNGAKERJA_D, UPAHKERJA_D, LUASLAHAN, PRODUKSI, HARGAJUALPRODUKSI, 
    BIAYAPRODUKSI, JMLTENAGAKERJA_T, UPAHKERJA_T, BPAJAK, BSEWA, BLISTRIK, BRMHTANGGA, BLAINLAIN, BANGSURAN, PENDAPATSAMPINGAN)

'Back to Prakasa'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115B_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)

