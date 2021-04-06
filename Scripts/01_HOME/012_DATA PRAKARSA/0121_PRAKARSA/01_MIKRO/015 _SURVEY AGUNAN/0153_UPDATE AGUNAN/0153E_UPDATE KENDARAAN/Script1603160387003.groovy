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

'Start aplikasi\r\n'
Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BRISPOT_AO_6282020.apk', false, FailureHandling.CONTINUE_ON_FAILURE)

'Delay 5 second'
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Get first list'
Mobile.setText(findTestObject('APLIKASI MIKRO DAN RITEL/01_HALAMAN HOME/012_MENU PRAKARSA/0121_PRAKARSA/0121B_CARI DEBITUR'), 
    GlobalVariable.SEARCHDATA, GlobalVariable.timeOut)

'Get first list'
Mobile.tap(findTestObject('APLIKASI MIKRO DAN RITEL/01_HALAMAN HOME/012_MENU PRAKARSA/0121_PRAKARSA/0121A_LIST PERTAMA DATA PRAKARSA'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116A_MENU SURVEY AGUNAN'), 
    GlobalVariable.timeOut)

Mobile.tapAtPosition(305, 980)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\04_DETAIL MENU SURVEY AGUNAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116E_UPDATE'), GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01A_DEKSKRIPSI'), 
    DESKRIPSI, GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01211611B_KEPEMILIKAN'), 
    GlobalVariable.timeOut)

if (KEPEMILIKAN == 'Milik Sendiri') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/011_KEPEMILIKAN/011A_SNDR'), 
        GlobalVariable.timeOut)
} else {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/011_KEPEMILIKAN/011B_ORGL'), 
        GlobalVariable.timeOut)
}

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01C_PEMILIK'), 
    PEMILIK, GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/015_KKENDARAAN/5A_KLASIF'), 
    GlobalVariable.timeOut)

if (KLASIFIKASIKENDARAAN == 'Mobil baru') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/015_KKENDARAAN/5B_MBLBARU'), 
        GlobalVariable.timeOut)
} else if (KLASIFIKASIKENDARAAN == 'Mobil bekas') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/015_KKENDARAAN/5C_MBLBKAS'), 
        GlobalVariable.timeOut)
} else {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/015_KKENDARAAN/5D_MTRBARU'), 
        GlobalVariable.timeOut)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6A_MERKKENDARAAN'), 
    GlobalVariable.timeOut)

if (MEREKKENDARAAN == 'Toyota') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6B_TOYOTA'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Suzuki') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6C_SUZUKI'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Mitsubishi') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6D_MITSUBISHI'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Daihatsu') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6E_DAIHATSU'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Honda') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6F_HONDA'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Nissan') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6G_NISSAN'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Isuzu') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6H_ISUZU'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Mercedes Benz') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6I_MERCEDESBENZ'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'BMW') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6J_BMW'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Peugeot') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6K_PEUGEOT'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Yamaha') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6L_YAMAHA'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Kawasaki') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6M_KAWASAKI'), 
        GlobalVariable.timeOut)
} else if (MEREKKENDARAAN == 'Bajaj') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6N_BAJAJ'), 
        GlobalVariable.timeOut)
} else {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/016_MERKKENDARAAN/6O_LAINNYA'), 
        GlobalVariable.timeOut)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/017_JENISKENDARAAN/7A_JENISKENDARAAN'), 
    GlobalVariable.timeOut)

if (JENISKENDARAAN == 'Minibus') {
    Mobile.tapAtPosition(265, 1475, FailureHandling.CONTINUE_ON_FAILURE)
} else if (JENISKENDARAAN == 'Sedan') {
    Mobile.tapAtPosition(213, 1630)
} else if (JENISKENDARAAN == 'SUV') {
    Mobile.tapAtPosition(205, 1740)
} else if (JENISKENDARAAN == 'Niaga/Komersial') {
    Mobile.tapAtPosition(206, 1888)
} else {
    Mobile.tapAtPosition(189, 1977)
}

Mobile.scrollToText('Nomor bukti kepemilikan', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01J_WARNAKENDARAAN'), 
    WARNAKENDARAAN, GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01K_THNPEMBUATAN'), 
    TAHUNPEMBUATAN, GlobalVariable.timeOut)

Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01L_NOMESIN'), 
    NOMORMESIN, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01M_NOCHASSIS'), 
    NOMORCHASIS)

Mobile.scrollToText('Isi dengan tanggal bukti kepemilikan agunan.', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01G_STATUSKETSEDIA'), 
    GlobalVariable.timeOut)

if (STATEAGUNAN == 'TERSEDIA') {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/013_STATEAGUNAN/3A_TRSEDI'), 
        GlobalVariable.timeOut)
} else {
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/013_STATEAGUNAN/3B_INDEN'), 
        GlobalVariable.timeOut)
}

Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01N_NOBPKB'), 
    findTestData('PRAKASA/DETAIL PRAKASA/SURVEY AGUNAN/E_DATA AGUNAN KENDARAAN').getValue(12, 1))

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01O_TGLBPKB'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/014_TGL/4B_TAHUN'), 
    GlobalVariable.timeOut)

'Pilih menu tanggallahir\r\n'
Mobile.swipe(528, 1116, 520, 1539)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/014_TGL/4F_SELECT TAHUN'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/014_TGL/4C_TGL22'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/014_TGL/4D_OK'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01P_NEXT'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\05_DATA MENU SURVEY AGUNAN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

if (ALAMATSAMA == 'YA') {
    'Memilih Switch OFF'
    Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'), 
        GlobalVariable.timeOut)

    'Memilih Switch ON'
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'), 
        GlobalVariable.timeOut)
} else {
    'Memilih Switch OFF'
    Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'), 
        GlobalVariable.timeOut)

    'Memilih Switch OFF'
    Mobile.verifyElementNotChecked(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612D_SWITCHALAMAT'), 
        GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612A_ALAMAT'), 
        ALAMAT, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612B_RT'), 
        RT, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612C_RW'), 
        RW, GlobalVariable.timeOut)

    'Search Kode Pos'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612E_KODEPOS'), 
        GlobalVariable.timeOut)

    'Create Text Data Kode Pos'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/021_KODE POS/021C_CARI'), 
        '17425', GlobalVariable.timeOut)

    'Selected Kode Pos'
    Mobile.doubleTap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/021_KODE POS/021B_LIST'), 
        GlobalVariable.timeOut)
}

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\06_ALAMAT.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/01211612F_SIMPAN'), 
    GlobalVariable.timeOut)

Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3O_NPSARWJR'), 
    NILAIPASARWAJAR, GlobalVariable.timeOut)

Mobile.sendKeys(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3P_PNILAILIKUIDASI'), 
    findTestData('PRAKASA/DETAIL PRAKASA/SURVEY AGUNAN/E_DATA AGUNAN KENDARAAN').getValue(23, 1), FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('HITUNG', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/03_NILAI/3N_HITUNG'), 
    GlobalVariable.timeOut)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\07_NILAI.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/01_DATA/01P_NEXT'), 
    GlobalVariable.timeOut)

Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/041_FOTO/041A_FOTO'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/041_FOTO/041B_SHUT'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/041_FOTO/041E_OK'), 
    GlobalVariable.timeOut)

Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4A_UBAH LOKASI'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\08_SEARCH LOCATION.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Search Lokasi'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4B_SEARCHBYLOCATION'), 
    GlobalVariable.timeOut)

'Search Kode Pos'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4F_KODEPOS'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\SURVEY AGUNAN\\UPDATE\\SURVEY AGUNAN KENDARAAN\\09_DATA KODE POS.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Create Text Data Kode Pos'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/042_KODEPOS/01211614C_CARIDATA'), 
    KODEPOS, GlobalVariable.timeOut)

'Selected Kode Pos'
Mobile.doubleTap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/02_ALAMAT/021_KODE POS/021B_LIST'), 
    GlobalVariable.timeOut)

'Create Text Data Lokasi'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4E_KETIKLOKASI'), 
    'Manggarai', GlobalVariable.timeOut)

'Klik Cari'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4G_CARI'), 
    GlobalVariable.timeOut)

'Klik Cari'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4C_SET LOCATION'), 
    GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4P_SIMPAN'), 
    GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/0121161_TAMBAHAGUNAN/04_FOTO/4M_YES'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116B_PLUS'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116C_BACK'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121C_BACK'), GlobalVariable.timeOut)

'Klik Set Location'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012116_ SURVEY AGUNAN/012116C_BACK'), GlobalVariable.timeOut)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

