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

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISA 5C\\01_MENU UTAMA.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_SUPLESIPERPANJANGAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_ANALISIS5C'), GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012181_ASPEK/012181A_ANALISISKARAKTER'), 
    analisis_karakter, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012181_ASPEK/012181B_PRODUKSI'), 
    aspek_produksi, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012181_ASPEK/012181C_MANAJEMEN'), 
    manajemen, GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISA 5C\\02_ANALISIS KARAKTER PRODUKSI MANAJEMEN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('Aspek Kondisi dan Prospek Usaha', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012181_ASPEK/012181D_SPEMASARAN'), 
    strategi_pemasaran, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012181_ASPEK/012181E_PERSAINGAN'), 
    aspek_persaingan, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012181_ASPEK/012181F_PBISNIS'), 
    aspek_kondisi, GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISA 5C\\03_ANALISIS KONDISI USAHA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/01212B_NEXT'), GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012182_DATA BANK/012182A_RATAS'), 
    ratas_penjualan, GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012182_DATA BANK/012182B_TAMBAH BANK'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012182_DATA BANK/0121821_TAMBAHBANK/0121821A_NAMABANK'), 
    GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/01218_Cari Data'), nama_bank, 
    GlobalVariable.timeOut)

Mobile.tapAtPosition(530, 303)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012182_DATA BANK/0121821_TAMBAHBANK/0121821B_NOREK'), 
    norek, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012182_DATA BANK/0121821_TAMBAHBANK/0121821C_MUTASIDEBIT'), 
    mutasi_debit, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012182_DATA BANK/0121821_TAMBAHBANK/0121821D_MUTASIKREDIT'), 
    mutasi_kredit, GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012182_DATA BANK/0121821_TAMBAHBANK/0121821E_Simpan'), 
    GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISA 5C\\04_ANALISIS DATA BANK.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/01212B_NEXT'), GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISA 5C\\05_SELESAI.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01218_ANALISIS5C/012183_SELESAI/012183A_KIRIM'), 
    GlobalVariable.timeOut)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut)

