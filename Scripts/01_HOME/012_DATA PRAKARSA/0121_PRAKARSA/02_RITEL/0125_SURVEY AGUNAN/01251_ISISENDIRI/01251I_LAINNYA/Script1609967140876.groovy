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
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\LAINNYA\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Tap Menu Prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Search Data berdasarkan nama'
CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama_pencarian)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121H_SURVEY AGUNAN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216B_MENU ISI SENDIRI'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216D_ICONPLUS'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121611_ICON PLUS/0121611A_INPUT BARU'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121611_ICON PLUS/01A_INPUT BARU/01A_POKOK'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/012161I_LAINNYA'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Foto'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\LAINNYA\\02_FOTO.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('UBAH LOKASI', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.UbahLokasi'(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'), 
    lokasi, kode_pos)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\LAINNYA\\03_UBAH LOKASI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/07_LAINNYA/02A_DESKRIPSI'), 
    deskripsi_agunan, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/07_LAINNYA/02B_NAMADAGANG'), 
    nama_brng, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/07_LAINNYA/02C_NAMAPEMILIK'), 
    atas_nama_pemilik, GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/07_LAINNYA/02D_BUKTIKEPEMILIKAN'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(bukti_kepemilikan)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/07_LAINNYA/02E_NOBUKTI'), 
    no_bukti_kepemilikan, GlobalVariable.timeOut)

Mobile.scrollToText('Isikan tanggal bukti kepemilikan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/07_LAINNYA/02F_TGLBUKTI'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_bukti, GlobalVariable.timeOut, GlobalVariable.timeOut)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\LAINNYA\\05_DATA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.AlamatAgunanPemilik'(alamat_ktp, alamat, kode_pos_alamat)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\LAINNYA\\06_ALAMAT.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/05_LAINNYA/05A_ELIGIBLE'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(eligibility)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/05_LAINNYA/05B_PNILAIANAGUNAN'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(penilai_oleh)

if (penilai_oleh.equals('Independent')) {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/05_LAINNYA/05E_PNILAIANINDENPENDEN'), 
        GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(pidenpendent)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/05_LAINNYA/05C_TGLNILAI'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_agunan_akhir, GlobalVariable.timeOut, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/05_LAINNYA/05D_NPSRWAJAR'), 
    nilai_pasar_wajar, GlobalVariable.timeOut)

'Capture Screenshot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\RUMAH TINGGAL\\07_NILAI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\KAS\\08_SELESAI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121618_SELESAI/08A_KIRIM'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121618_SELESAI/08B_OK'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216A_BACK'), GlobalVariable.timeOut, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

