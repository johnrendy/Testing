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

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.openApplication'()

'Take screenshot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\MESINALATBRT\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Tap Menu Prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_SUPLESIPERPANJANGAN'), GlobalVariable.timeOut)

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

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/012161H_MESIN BRT'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Foto'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\MESINALATBRT\\02_FOTO.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('UBAH LOKASI', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.UbahLokasi'(findTestObject('01_HOME/011_PEMASARAN/0111_DATA PEMASARAN/01_IDENTITAS/012_UBAHLOKASI/012F_OK'), 
    lokasi, kode_pos)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\MESINALATBRT\\03_UBAH LOKASI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06A_JENIS'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(jenis_mesin_alat)

if (jenis_mesin_alat.equals('Alat Berat')) {
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06B_NOSERI'), 
        no_seri, GlobalVariable.timeOut)

    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06C_OKUPASI'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataRecyclerView'(pil_okupasi_alat)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06D_NORANGKA'), 
        no_rangka, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06E_NOMESIN'), 
        no_mesin, GlobalVariable.timeOut)

    Mobile.scrollToText('Isikan nomor bukti kepemilikan', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06F_JNSPENGGUNAAN'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataRecyclerView'(jns_penggunaan)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06G_DESKRIPSI'), 
        deskripsi, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06H_MERK'), 
        merk, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06I_THNPEMBUATAN'), 
        thn_pembuatan, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06J_NAMA'), 
        atas_nama_pemilik, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06K_NOBUKTIKEPEMILIKAN'), 
        no_bukti_kepemilikan, GlobalVariable.timeOut)
} else {
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06B_NOSERI'), 
        pil_okupasi_mesin, GlobalVariable.timeOut)

    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06C_OKUPASI'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataRecyclerView'(pil_okupasi_mesin)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06G_DESKRIPSI'), 
        deskripsi, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06H_MERK'), 
        merk, GlobalVariable.timeOut)

    Mobile.scrollToText('Isikan nomor bukti kepemilikan', FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06I_THNPEMBUATAN'), 
        thn_pembuatan, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06J_NAMA'), 
        atas_nama_pemilik, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121613_DATA/06_MSNBRT/06K_NOBUKTIKEPEMILIKAN'), 
        no_bukti_kepemilikan, GlobalVariable.timeOut)
}

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\MESINALATBRT\\05_DATA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.AlamatAgunanPemilik'(alamat_ktp, alamat, kode_pos_alamat)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\MESINALATBRT\\06_ALAMAT PEMILIK.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('Pastikan kode pos agunan sesuai', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.AlamatAgunanMesinBrt'(alamat_ktpa, alamat_agunan, kodepos_agunan)

'CaptureScreenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\MESINALATBRT\\06_ALAMAT AGUNAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04A_PKTASURANSI'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(pkt_asuransi)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04B_PERLUASANASURANSI'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(pluasan_asuransi)

if (flag_paripasu.equals('Ya')) {
    Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/041_FLAGPARIPAS/041A_YA'), 
        GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/041_FLAGPARIPAS/041A_YA'), 
        GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04C_VALUEPARIPASU'), 
        value_paripasu, GlobalVariable.timeOut)
} else {
    Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/041_FLAGPARIPAS/041B_TDK'), 
        GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/041_FLAGPARIPAS/041B_TDK'), 
        GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)
}

Mobile.scrollToText('CEK PREMI', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04D_NPSRWAJAR'), 
    nilai_pasar_wajar, GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04E_PNILAIANAGUNAN'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.ListView'(pagunan)

if (pagunan.equals('Independent')) {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04F_PENILAI INDEPENDENT'), 
        GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.DataListView'(pidependent)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04G_TGLNILAI'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.brispotritel.prakarsa.SurveyAgunan.Tanggal'(tgl_penilai_asuransi, GlobalVariable.timeOut, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04H_NILAIASURANSI'), 
    nilai_asuransi, GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121616_NILAI/04_MSNBRT/04I_CEK PREMI'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

'Capture Screenshot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\RUMAH TINGGAL\\07_NILAI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/01212B_NEXT'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\SURVEY AGUNAN\\ISI SENDIRI\\MESINALATBRT\\08_SELESAI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121618_SELESAI/08A_KIRIM'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/012161_ISI SENDIRI/0121618_SELESAI/08B_OK'), 
    GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01216_SURVEY AGUNAN/01216A_BACK'), GlobalVariable.timeOut, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

