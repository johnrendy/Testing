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
Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\01_MENU UTAMA.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/01B_MENU PRAKARSA'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.DetailDataPribadiBadanUsaha.PencarianData'(nama)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121F_STATUS PRESCREENING'), GlobalVariable.timeOut)

//CustomKeywords.'com.brispotritel.prakarsa.StatusPrescreening.DetailPrescreening'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214C_REFRESH'))
for (int i = 0; i < 10; i++) {
    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214C_REFRESH'), 
        GlobalVariable.timeOut)

    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214E_YA'), GlobalVariable.timeOut)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214D_TUTUP'), 
        GlobalVariable.timeOut)

    Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012D_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/01215F_YA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121F_STATUS PRESCREENING'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.StatusPrescreening.PasarSasaran'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214M_PASAR SASARAN'))

//if(jenis_segmen_produk.equals('Ritel Komersial/Kecil')){
//	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//} else if (jenis_segmen_produk.equals('ritel / kecil')) {
//    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//}else{
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214M_PASAR SASARAN'),
//		GlobalVariable.timeOut)
//	
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214N_OKE'), GlobalVariable.timeOut)
//	
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214O_LAMPIRAN'), GlobalVariable.timeOut)
//	
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214P_FAB'), GlobalVariable.timeOut)
//	
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214Q_FOTO'), GlobalVariable.timeOut)
//	
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121312_FOTO/02_CAMERA/02B_SHUTTERCAMERA'),
//		GlobalVariable.timeOut)
//	
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01213_DATA PENJAMIN/012131_PENGURUS/0121312_FOTO/02_CAMERA/02D_OK'),
//		GlobalVariable.timeOut)
//	
//	Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//	
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214S_OK'), GlobalVariable.timeOut)
//	
//	CustomKeywords.'com.brispotritel.prakarsa.StatusPrescreening.AddLampiran'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214Q_ADD'))
//	
//	'CaptureScreenshoot'
//	Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\02_PENGECEKAN PASAR SASARAN.png',
//		FailureHandling.STOP_ON_FAILURE)
//	
//	Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214G_CLOSE'), GlobalVariable.timeOut)
//}
Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214H_SLIK'), GlobalVariable.timeOut)

Mobile.checkElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214T_CHECK SLIK'), 
    GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\03_DETAIL SLIK.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214G_CLOSE'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214I_KEMENDAGRI'), 
    GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\04_DETAIL KEMENDAGRI.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214G_CLOSE'), GlobalVariable.timeOut)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214J_SICD'), GlobalVariable.timeOut)

CustomKeywords.'com.brispotritel.prakarsa.StatusPrescreening.DataNull'(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214L_OK'))

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\05_DETAIL SICD.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214K_KRD'), GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142A_CB1'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142B_CB2'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142C_CB3'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142D_CB4'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142E_CB5'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142F_CB6'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142G_CB7'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142H_CB8'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142I_CB9'), 
    GlobalVariable.timeOut)

Mobile.uncheckElement(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/012142_KRD/012142J_CB10'), 
    GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\06_DETAIL KRD.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01214_STATUS PRESCREENING/01214G_CLOSE'), GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\06_HASIL PRESCREENING.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/01215B_KIRIM'), GlobalVariable.timeOut)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\07_KIRIM SLIK.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/01215F_YA'), GlobalVariable.timeOut)

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('E:\\KATALON DRIVE\\03_SCREENSHOOT\\BRISPOT RITEL\\PRAKARSA\\STATUSPRESCREENING\\08_KIRIM LAS.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/01215_DOKUMENTASI KREDIT/01215F_YA'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/0121_PRAKARSA/01212_RITEL/0121K_BACK'), GlobalVariable.timeOut)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01_HOME/012_PRAKARSA/012B_BACK'), GlobalVariable.timeOut)

Mobile.delay(GlobalVariable.timeOut, FailureHandling.STOP_ON_FAILURE)

