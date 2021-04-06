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

//CaptureScreenshoot
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\01_MENU UTAMA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama_lengkap)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121D_DETAIL DATA PRIBADI'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.DataPribadi'(nik, nama_lengkap, nama_alias, jenis_kelamin, status_perkawinan, 
    tempat_lahir, tgl_lahir, pekerjaan, agama, agama_lainnya, jenis_pekerjaan, status_gelar, jml_tanggungan, nama_ibu, no_hp, 
    no_telp, email, bidang_usaha, debitur2, debitur3, debitur4)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.Alamat'(alamat_ktp, rt_ktp, rw_ktp, kodepos_ktp, lama_menetap, 
    alamat_domisili_sama, alamat_domisili, kodepos_domisili)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.Pasangan'(nik_pasangan, nama_pasangan, tgl_pasangan)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.DataUsaha'(nama_perusahaan, tgl_usaha, jabatan, npwp, jml_tenaga_kerja, 
    alamat_usaha_sama, alamat_usaha, kodepos_usaha)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.InfoLainnya'(produk_kredit, perjanjian_pisah_harta, status_kepemilikan, 
    transaksi_normal_harian, penghasilan_perbulan, pinjam_banklain, jenisrekening_banklain, nama_banklain, tujuan_buka_rekening, 
    ket_buka_rekening)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01212_DETAIL DATA PRIBADI/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadi.Selesai'(status_kirim)

Mobile.delay(GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

