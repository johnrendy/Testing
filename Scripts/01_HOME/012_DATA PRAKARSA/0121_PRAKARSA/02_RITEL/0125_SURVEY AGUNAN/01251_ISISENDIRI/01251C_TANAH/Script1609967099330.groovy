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

'Take screenshot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\01_MENU UTAMA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama_pencarian)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121H_SURVEY AGUNAN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216B_MENU ISI SENDIRI'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216D_ICONPLUS'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121611_ICON PLUS/0121611A_INPUT BARU'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121611_ICON PLUS/01A_INPUT BARU/01A_POKOK'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/012161C_TANAH'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Foto'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\02_FOTO.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('UBAH LOKASI', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.UbahLokasi'(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'), 
    lokasi, kode_pos)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\03_UBAH LOKASI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Data'(deskripsi_agunan, atas_nama, no_sertif, status_bukti_kepemilikan, 
    jangka_waktu_bukti_kepemilikan, perpanjang, akses_kendaraan, tgl_bukti_kepemilikan)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\04_DATA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Alamat'(alamat_ktp, alamat_agunan, rt_agunan, rw_agunan, kode_pos_agunan)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\05_ALAMAT.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.BatasTanah'(batas_timur, batas_utara, batas_barat, batas_selatan, 
    bentuk_tanah)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\06_BATAS TANAH.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.NilaiTanah'(luas_tanah, harga_tanah)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\08_NILAI TANAH.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\TANAH\\09_SELESAI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121618_SELESAI/08A_KIRIM'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121618_SELESAI/08B_OK'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216A_BACK'), GlobalVariable.timeOut, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

