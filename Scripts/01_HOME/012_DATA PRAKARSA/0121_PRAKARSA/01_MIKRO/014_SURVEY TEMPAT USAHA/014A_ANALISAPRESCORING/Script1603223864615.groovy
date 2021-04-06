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

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.openApplication'()

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\01_MENU UTAMA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select menu prakarsa'
Mobile.tap(findTestObject('01_HOME/01A_MENU PEMASARAN'), GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\02_MENU PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.brispotmikro.prakarsa.SurveyDataPribadi.Pencarian'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121D_OKE'), 
    NAMALENGKAP)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\03_DETAIL PRAKARSA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115A_MENU SURVEY TEMPAT USAHA'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.UbahLokasi'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012114_SURVEY TEMPAT TINGGAL/0121141_UBAH LOKASI/0121141F_OK'), 
    ALAMAT, RT, RW, KODEPOS, KEC, KEL)

'NExt'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115J_NEXT'), GlobalVariable.timeOut)

'Select Transaksi Normal Harian'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153A_TRANSAKSINORMAL'), 
    GlobalVariable.timeOut)

CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.DataListView'(TRANSAKSINORMAL)

'Select Fitur Produk'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153B_FITURPRODUK'), 
    GlobalVariable.timeOut)

if (SEGMENPRODUK.equals('Briguna Karya/Umum')) {
    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.DataListViewProfesi'(FITURPRODUKBKARYA)
} else if (SEGMENPRODUK.equals('Briguna Purna')) {
    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.DataListViewProfesi'(FITURPRODUKBPURNA)
} else {
    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.DataListViewProfesi'(FITURPRODUKBKARYAWAN)
}

if (SEGMENPRODUK.equals('Briguna Karya/Umum')) {
    'Select Fitur Produk'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153C_PAYROLL'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.DataListView'(PAYROL)
}

'Create Text Data NPWP'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153D_NPWP'), 
    NPWP, GlobalVariable.timeOut)

if (SEGMENPRODUK.equals('Briguna Karya/Umum')) {
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153S_NIP'), 
        NIP, GlobalVariable.timeOut)

    'Create Text Data No SK Pensiun'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06A_NOSKAWAL'), 
        NOSKAWAL, GlobalVariable.timeOut)

    'Select Tgl No SK'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06D_TGLSKAWAL'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLSKAWAL, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Create Text Data No SK Pensiun'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06B_NOSKAKHIR'), 
        NOSKAKHIR, GlobalVariable.timeOut)

    'Select Tgl No SK'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06E_TGLSKAKHIR'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLSKAKHIR, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Scroll to text Pendapatan Per Bulan'
    Mobile.scrollToText('Pendapatan Per Bulan', FailureHandling.CONTINUE_ON_FAILURE)

    'Select Tgl No SK'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06C_TGLMULLAIKERJA'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLMULAIKERJA, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Create Text Data No SK Pensiun'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06F_USIAMPP'), 
        USIAMPP, GlobalVariable.timeOut)

    'Select Tgl No SK'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153I_TGLPENSIUN'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLPENSIUN, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Capture Screenshoot'
    Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\07_SKOR RPC SATU.png', 
        FailureHandling.CONTINUE_ON_FAILURE)
} else if (SEGMENPRODUK.equals('Briguna Purna')) {
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153E_NOPENSIUN'), 
        NOPENSIUN, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153E_NOSKPENSIUN'), 
        NOSK, GlobalVariable.timeOut)

    'Select Fitur Produk'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153G_TGLNOSK'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLSK, GlobalVariable.timeOut, GlobalVariable.timeOut)

    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153F_NOKARIP'), 
        NIP, GlobalVariable.timeOut)

    'Select Fitur Produk'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153H_TGLNOKARIP'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLKARIP, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Select Fitur Produk'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153I_TGLPENSIUN'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLPENSIUN, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Capture Screenshoot'
    Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\07_SKOR RPC SATU.png', 
        FailureHandling.CONTINUE_ON_FAILURE)
} else {
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153R_PN'), 
        PN, GlobalVariable.timeOut)

    'Create Text Data No SK Pensiun'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06A_NOSKAWAL'), 
        NOSK, GlobalVariable.timeOut)

    'Select Tgl No SK'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06D_TGLSKAWAL'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLSKAWAL, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Create Text Data No SK Pensiun'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06B_NOSKAKHIR'), 
        NOSK, GlobalVariable.timeOut)

    'Select Tgl No SK'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06E_TGLSKAKHIR'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLSKAKHIR, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Scroll to text Pendapatan Per Bulan'
    Mobile.scrollToText('Pendapatan Per Bulan', FailureHandling.CONTINUE_ON_FAILURE)

    'Select Tgl No SK'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06C_TGLMULLAIKERJA'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLMULAIKERJA, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Create Text Data No SK Pensiun'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06F_USIAMPP'), 
        USIAMPP, GlobalVariable.timeOut)

    'Select Tgl No SK'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153I_TGLPENSIUN'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.Tanggal'(TGLPENSIUN, GlobalVariable.timeOut, GlobalVariable.timeOut)

    'Capture Screenshoot'
    Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\07_SKOR RPC SATU.png', 
        FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.scrollToText('Apakah suplesi?', FailureHandling.CONTINUE_ON_FAILURE)

if (SUPLESI == 'YA') {
    'Select Transaksi Normal Harian'
    Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153J_SWITCHSUPLESI'), 
        GlobalVariable.timeOut)

    'Select Transaksi Normal Harian'
    Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153J_SWITCHSUPLESI'), 
        GlobalVariable.timeOut)

    'Select Transaksi Normal Harian'
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/01211534_SUPLESI/01211534A_JENISUPLESI'), 
        GlobalVariable.timeOut)

    CustomKeywords.'com.brispotmikro.prakarsa.AnalisaPrescoring.DataListView'(JENISSUPLESI)

    'Create Text Data plafond'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/01211534_SUPLESI/01211534B_PLAFONDBRIGUNA'), 
        PLAFONDBRIGUNA, GlobalVariable.timeOut)

    'Create Text Data aNGSURAN'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/01211534_SUPLESI/01211534C_ANGSURANBRIGUNA'), 
        ANGSURANBRIGUNA, GlobalVariable.timeOut)
}

if (SEGMENPRODUK.equals('Briguna Karya/Umum')) {
    if (FITURPRODUKBKARYA.equals('Briguna SMART Karya -- Briguna Karya Annuitas')) {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
            GAJIPERBULAN, GlobalVariable.timeOut)
    } else if (FITURPRODUKBKARYA.equals('Briguna Karya Annuitas -- Briguna Karya Annuitas')) {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
            GAJIPERBULAN, GlobalVariable.timeOut)
    } else if (FITURPRODUKBKARYA.equals('Briguna Umum Annuitas -- Briguna Umum Annuitas')) {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
            GAJIPERBULAN, GlobalVariable.timeOut)

        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153K_GAJIPENSIUN'), 
            GAJIPENSIUN, GlobalVariable.timeOut)
    } else if (FITURPRODUKBKARYA.equals('Briguna Outsourcing -- Briguna Karya Annuitas')) {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
            GAJIPERBULAN, GlobalVariable.timeOut)
    } else if (FITURPRODUKBKARYA.equals('Briguna SMART Umum -- Briguna Umum Annuitas')) {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
            GAJIPERBULAN, GlobalVariable.timeOut)

        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153K_GAJIPENSIUN'), 
            GAJIPENSIUN, GlobalVariable.timeOut)
    } else {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
            GAJIPERBULAN, GlobalVariable.timeOut)

        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153L_PENDAPATANPROFESI'), 
            PENDAPATANPROFESI, GlobalVariable.timeOut)
    }
} else if (SEGMENPRODUK.equals('Briguna Purna')) {
    if (FITURPRODUKBKARYA.equals('Briguna Purna Annuitas -- Briguna Purna Annuitas')) {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
            GAJIPERBULAN, GlobalVariable.timeOut)
    } else if (FITURPRODUKBPURNA.equals('Briguna Purna PP BRI -- Briguna Purna Annuitas')) {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
            GAJIPERBULAN, GlobalVariable.timeOut)
    } else {
        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06H_GAJIPEENSIUNBLN'), 
            GAJIPENSIUN, GlobalVariable.timeOut)

        'Create Text Data gaji'
        Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153L_PENDAPATANPROFESI'), 
            PENDAPATANPROFESI, GlobalVariable.timeOut)
    }
} else {
    'Create Text Data gaji'
    Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/06_SK/06G_GAJIPERBULAN'), 
        GAJIPERBULAN, GlobalVariable.timeOut)
}

'Select Transaksi Normal Harian'
Mobile.scrollToText('HITUNG RPC', FailureHandling.CONTINUE_ON_FAILURE)

'Create Text Data potongan'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153M_POTONGAN'), 
    POTONGAN, GlobalVariable.timeOut)

'Create Text Data potongan'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153N_ANGSURAN'), 
    ANGSURAN, GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\08_SKOR RPC DUA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Create Text Data NPWP'
Mobile.setText(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153N_ANGSURAN'), 
    ANGSURANBRIGUNA, GlobalVariable.timeOut)

'Select Transaksi Normal Harian'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/0121153_SKORRPC/0121153O_HITUNGRPC'), 
    GlobalVariable.timeOut)

'Capture Screenshoot'
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL DAN MIKRO\\PRAKARSA\\ANALISA PRESCORING\\07_SKOR RPC TIGA.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'NExt'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115J_NEXT'), GlobalVariable.timeOut)

'Select Transaksi Normal Harian'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01211_MIKRO/012115_SURVEY TEMPAT USAHA/012115H_IYA'), GlobalVariable.timeOut)

WebUI.delay(5)

'Select Transaksi Normal Harian'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/0121C_BACK'), GlobalVariable.timeOut)

'Select Transaksi Normal Harian'
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)

