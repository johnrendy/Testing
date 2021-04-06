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

'Take screenshot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KENDARAAN\\01_MENU UTAMA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_SUPLESIPERPANJANGAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama_pencarian)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121H_SURVEY AGUNAN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216B_MENU ISI SENDIRI'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216D_ICONPLUS'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121611_ICON PLUS/0121611A_INPUT BARU'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121611_ICON PLUS/01A_INPUT BARU/01A_POKOK'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/012161B_KENDARAAN'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Foto'()

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KENDARAAN\\02_FOTO.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('UBAH LOKASI', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.UbahLokasi'(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'), 
    lokasi, kode_pos)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KENDARAAN\\03_UBAH LOKASI.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataKendaraan'(deskripsi_agunan, atas_nama, klasifikasi_kendaraan, 
    jenis_kendaraan, merk_kendaraan, tipe_merk, warna_kendaraan, thn_pembuatan, no_mesin, no_chasis, no_bukti_kepemilikan, 
    tgl_kepemilikan, jns_penggunaan, nopol)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KENDARAAN\\05_DATA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.AlamatAgunan'(alamat_ktp, alamat_agunan, rt_agunan, rw_agunan, kode_pos_agunan)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KENDARAAN\\06_ALAMAT.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.NilaiKendaraan'(pkt_asuransi, prluasan_asuransi, nilai_psr_wajar, 
    pnilai_agunan, pidenpedent, tgl_pnilai, nilai_asuransi)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KENDARAAN\\07_NILAI KENDARAAN.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KENDARAAN\\08_SELESAI.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121618_SELESAI/08A_KIRIM'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121618_SELESAI/08B_OK'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216A_BACK'), GlobalVariable.timeOut, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

