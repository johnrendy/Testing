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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.brispotmikroritel.publickeyword.PublicKeyword.openApplication'()

Mobile.callTestCase(findTestCase('01_HOME/011_DATA PEMASARAN/01_DATA PEMASARAN/011_MIKRO/TC01_DP TAMBAH PEMASARAN'), [('kode_pos') : kodepos_pemasaran
        , ('lokasi') : lokasi_pemasaran, ('nik') : nik_pemasaran, ('nama_lengkap') : nama_lengkap_pemasaran, ('jenis_kelamin') : jkelamin_pemasaran
        , ('status_perkawinan') : status_pernikahan_pemasaran, ('no_hp') : nohp_pemasaran, ('email') : email_pemasaran, ('tmpt_lahir') : tempat_lahir_pemasaran
        , ('bidang_usaha') : bidang_usaha_pemasaran, ('alamat') : alamat_pemasaran, ('rt') : rt_pemasaran, ('rw') : rw_pemasaran
        , ('kodepos_pemohon') : kodepos_pemasaran, ('status_pengajuan') : status_pengajuan_pemasaran, ('jml_permohonan') : jmlpermohonan_pemasaran
        , ('periode') : periode_pemasaran, ('tujuan') : tujuan_pemasaran, ('tgl_lahir') : tgl_lahir_pemasaran], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/011_DETAIL DATA PRIBADI/011A_SURVEY DATA PRIBADI'), 
    [('NIK') : nik, ('NAMALENGKAP') : nama_lengkap, ('JKELAMIN') : jenis_kelamin, ('STATUS') : status_pernikahan, ('TEMPATLAHIR') : tempat_lahir
        , ('TGLLAHIR') : tgl_lahir, ('NAMAIBU') : nama_ibu, ('AGAMAIBU') : agama_ibu, ('AGAMALAINNYA') : agama_ibu_lainnya
        , ('NOHP') : no_hp, ('EMAIL') : email, ('BIDANGUSAHA') : bidang_usaha, ('BIDANGUSAHALAIN') : bidang_usaha_lainnya
        , ('NIKPAS') : nik_pasangan, ('NAMAPAS') : nama_pasangan, ('JKELAMINPAS') : jenis_kelamin_pasangan, ('TGLPAS') : tgl_lahir_pasangan
        , ('TANGGUNGAN') : tanggungan, ('ALAMAT') : alamat, ('RT') : rt, ('RW') : rw, ('KODEPOS') : kode_pos, ('ALAMATPAS') : alamat_pasangan
        , ('RTPAS') : rt_pasangan, ('RWPAS') : rw_pasangan, ('KODEPOSPAS') : kode_pos_pasangan, ('PEKERJAAN') : pekerjaan
        , ('PEKERJAANCIF') : pekerjaan_cif, ('STATUSGELAR') : status_gelar, ('PINJAMBANK') : pinjam_bank, ('NAMABANKLAIN') : nama_bank_lain
        , ('JENISREK') : jenis_rekening, ('TBREKENING') : tujuan_buka_rekening, ('SEGMENKREDIT') : segmentasi_kredit, ('INSTANSIBRIGUNA') : instansi_briguna
        , ('PKERJASAMA') : pkerjasama, ('PENGHASILAN') : penghasilan, ('NONGTOG') : nongtog, ('GTOG') : gtog, ('NAMAPJTKI') : nama_pjtki
        , ('PKSPJTKI') : pks_pjtki, ('NOPKS') : no_pks, ('KEC') : kecamatan, ('KEL') : kelurahan, ('KECPAS') : kecamatan_pasangan
        , ('PISAH_HARTA') : pisah_harta, ('KELPAS') : kelurahan_pasangan], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/012_STATUS PRESCREENING/012A_STATUS PRESCREENING'), 
    [('SEGMENTASIKREDIT') : segmentasi_kredit, ('NAMALENGKAP') : nama_lengkap], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/013_SURVEY TEMPAT TINGGAL/013A_SURVEY TEMPAT TINGGAL'), 
    [('ALAMATSAMA') : alamatsama_tmptgl, ('ALAMAT') : alamat_tmptgl, ('RT') : rt_tmptgl, ('RW') : rw_tmptgl, ('KODEPOS') : kodepos_tmptgl
        , ('KEC') : kec_tmptgl, ('KEL') : kel_tmptgl, ('STATUSKEPEMILIKAN') : statuskepemilikan_tmptgl, ('LAMAMENETAP') : lamamenetap_tmptgl
        , ('SEGMENPRODUK') : segmentasi_kredit, ('NAMALENGKAP') : nama_lengkap, ('LOKASI') : lokasi_tmptgl], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/014_SURVEY TEMPAT USAHA/014B_SURVEYTEMPATUSAHA'), 
    [('IDENTITASUSAHA') : identitas_usaha, ('NOSIUP') : no_siup, ('NOSKU') : no_sku, ('NOPERIJINANLAINNYA') : no_perijinan
        , ('TGLUSAHA') : tgl_usaha, ('NPWP') : npwp, ('ALAMATSAMA') : alamatsama_usaha, ('ALAMAT') : alamat_usaha, ('RT') : rt_usaha
        , ('RW') : rw_usaha, ('KODEPOS') : kodepos_usaha, ('STATUSKEPEMILIKAN') : status_kepemilikan_usaha, ('TRANSAKSI') : transaksi_usaha
        , ('JENISANALISAFINANSIAL') : jenis_analisa_finansial, ('OMSET_B') : omset_bulanan, ('BIAYAHPP_B') : biaya_hpp_bulanan
        , ('JMLTNGAKERJA_B') : jumlah_tenaga_kerja_bulanan, ('UPAHKERJA_B') : upah_kerja_bulanan, ('JMLHARI') : jumlah_hari
        , ('OMSET_H') : omset_harian, ('BIAYAHPP_H') : biaya_hpp_harian, ('JMLTNGAKERJA_H') : jumlah_tenaga_kerja_harian
        , ('UPAHKERJA_H') : upah_tenaga_kerja_harian, ('JENISDAGANGAN') : jumlah_dagangan, ('JMLDAGANGAN') : jumlah_dagangan
        , ('HRGJUAL') : harga_jual_dagangan, ('HPPDAGANGAN') : hpp_dagangan, ('OMSET_D') : omset_dagang, ('BIAYAHPP_D') : biaya_hpp_dagangan
        , ('JMLTNGAKERJA_D') : tenaga_kerja_dagang, ('UPAHKERJA_D') : upah_tenaga_kerja_dagang, ('LUASLAHAN') : luas_lahan
        , ('PRODUKSI') : produksi, ('HARGAJUALPRODUKSI') : harga_jual_produksi, ('BIAYAPRODUKSI') : biaya_produksi, ('JMLTENAGAKERJA_T') : jumlah_tenaga_kerjat
        , ('UPAHKERJA_T') : upah_tenaga_kerjat, ('BPAJAK') : biaya_pajak, ('BSEWA') : biaya_sewa, ('BLISTRIK') : biaya_listrik
        , ('BRMHTANGGA') : biaya_rmh_tangga, ('BLAINLAIN') : biaya_lainlain, ('BANGSURAN') : angsuran, ('PENDAPATSAMPINGAN') : pendapatan_sampingan
        , ('NAMALENGKAP') : nama_lengkap, ('LOKASI') : lokasi_usaha], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/016_ANALISA NON-FINANSIAL/016B_ANALISA NON FINANSIAL SELAIN BRIGUNA'), 
    [('REKENING') : rekening_nonfinansial, ('RIWAYAT') : riwayat_nonfinansial, ('CASHFLOW') : cashflow_nonfinansial, ('KELENGKAPANDOKUMEN') : kelengkapandata_nonfinansial
        , ('NAMALENGKAP') : nama_lengkap, ('KEPERCAYAAN') : kepercayaan_nonfinansial, ('RIWAYATHUB') : riwayat_hub_nonfinansial
        , ('PRILAKU') : prilaku_nonfinansial, ('KUSAHA') : kusaha_nonfinansial, ('KUSAHALAIN') : kusahalain_nonfinansial], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/017_CROSS SELL/017A_CROSSSELL'), [('NAMALENGKAP') : nama_lengkap], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/018_DOKUMENTASI KREDIT/18A_DOKUMENTASI KREDIT'), 
    [('NAMALENGKAP') : nama_lengkap], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/019_REKOMENDASI KREDIT/019B_RK SELAIN BRIGUNA'), 
    [('JNSPENGGUNAAN') : jenis_penggunaan_rekomk, ('SEKTOREKONOMI') : sektor_ekonomi_rekomk, ('BAKIDEBET') : baki_debet_rekomk
        , ('REKENINGSUPLESI') : rekening_suplesi_rekomk, ('PLAFONPINJAMAN') : plafon_pinjaman_rekomk, ('JANGKAWAKTU') : jangka_waktu_rekomk
        , ('POLAANGS') : pola_angsuran_rekomk, ('SUKUBUNGA') : suku_bunga_rekomk, ('ASURANSI') : asuransi_rekomk, ('SANDISTP') : sandi_stp_rekomk
        , ('TAKEOVER') : take_over_rekomk, ('BANKTAKEOVER') : bank_take_over_rekomk, ('GRACEPERIODE') : grace_peride_rekomk
        , ('NAMALENGKAP') : nama_lengkap, ('SEGMENPRODUK') : segmentasi_kredit], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/020_KIRIM PRAKARSA/020A_KIRIM PRAKASA'), 
    [('NAMALENGKAP') : nama_lengkap, ('KET') : ket_kirim_prakarasa], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

