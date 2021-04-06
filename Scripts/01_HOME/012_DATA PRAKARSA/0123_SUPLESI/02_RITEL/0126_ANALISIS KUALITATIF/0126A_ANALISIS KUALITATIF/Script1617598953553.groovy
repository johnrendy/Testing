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

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\01_MENU UTAMA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_SUPLESIPERPANJANGAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121I_ANALISISKUALITATIF'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(kesediaan_penyampaian_info)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\02_ANALISA KONFIRMASI.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Tunggakan'(tunggakan)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\03_TUNGGAKAN.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Komitmen'(komitmen)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\04_KOMITMEN.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(pengelolaan_rekening_bank)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\05_ANALISA PENGELOLAAN REKENING BANK.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(reputasi_bisnis)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\06_REPUTASI BISNIS.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(prilaku_pribadi_debitur)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\07_ANALISA PRILAKU DEBITUR.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(keluhan)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\08_ANALISA KELUHAN.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.KomunitasBisnis'(komunitas_bisnis)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\09_KOMUNITAS BISNIS.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(kualitas_produk)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\10_KUALITAS PRODUK.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(strategi_pemasaran)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\11_STRATEGI PEMASARAN.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(ketergantungan_pasar)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\12_KETERGANTUNGAN PASAR.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(lokasi_usaha)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\13_LOKASI USAHA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(perkembangan_pasar)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\14_PERKEMBANGAN PASAR.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(persaingan)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\15_PERSAINGAN PASAR.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.UsahaOneManShow'(usaha_oms)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\16_USAHA OMS.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.KonsepKaderisasi'(konsep_kaderisasi)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\17_KONSEP KADERISASI.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(karyawan_bekerja)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\18_KARYAWAN BEKERJA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(kualifikasi_komersial)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\19_KUALIFIKASI KOMERSIAL.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(kualifikasi_teknis)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\20_KUALIFIKASI TEKNIS.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(prospek_industri)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\21_PROSPEK INDUSTRI.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(garansi)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\22_GARANSI.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(coverage_agunan)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\23_COVERAGE AGUNAN.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.AnalisisKualitatif.Jawaban'(marketabilitas_agunan)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\24_MARKETABILITAS AGUNAN.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/01217E_NEXT'), GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\ANALISIS KUALITATIF\\25_SELESAI.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01217_ANALISIS KUALITATIF/012198_KIRIM DATA/012198A_YA'), 
    GlobalVariable.timeOut)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut)

