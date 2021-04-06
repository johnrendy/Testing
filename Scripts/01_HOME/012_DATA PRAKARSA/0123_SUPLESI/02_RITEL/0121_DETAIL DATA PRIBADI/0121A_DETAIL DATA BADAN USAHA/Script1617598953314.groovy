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

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\DETAIL DATA PRIBADI\\BADAN USAHA\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_SUPLESIPERPANJANGAN'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama_perusahaan)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121D_DETAIL DATA PRIBADI'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.Suplesi.DataPerusahaan'(npwp, status_badan_usaha, bentuk_badan_usaha, gelar_badan_usaha, 
    jenis_badan_usaha, nama_perusahaan, no_hp, email, fixed_line, fax, tempat_akta_awal, no_akta_awal, no_akta_akhir, tanggal_debitur, 
    tanggal_akta_awal, tanggal_akta_akhir)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.Alamat'(alamat, rt, rw, kode_pos)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.DataUsaha'(bidang_usaha, lama_usaha, gol_debit, gol_debit_LBU, 
    hub_bank, sumber_utama, bidang_usaha_brinets, sumber_utama_brinets, federal_wh, customer_type, sub_customer_type)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.Suplesi.Lainnya'(segmen_kredit, pendapatan_bulanan, omzet, omzet_bulanan, transaksi_brinets, 
    penghasilan, jenis_rekening, hub_bank_lain, nama_banklain, tujuan_buka_rekening)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01211_DETAIL DATA BADAN USAHA/01212B_NEXT'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.Selesai'(status_kirim)

Mobile.delay(GlobalVariable.timeOut)

