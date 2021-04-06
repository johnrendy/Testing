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

Mobile.callTestCase(findTestCase('01_HOME/011_DATA PEMASARAN/01_DATA PEMASARAN/012_RITEL/TC03_BU TAMBAH PEMASARAN'), [('kode_pos') : kode_pos_badanusaha_pemasaran
        , ('lokasi') : lokasi_badanusaha_pemasaran, ('npwp') : npwp_badanusaha_pemasaran, ('nama_perusahaan') : nama_perusahaan_badanusaha_pemasaran
        , ('status_badan_usaha') : status_badanusaha_pemasaran, ('bentuk_badan_usaha') : bentuk_badanusaha_pemasaran, ('kota_tempat_usaha') : kota_tu_badanusaha_pemasaran
        , ('no_hp') : nohp_badanusaha_pemasaran, ('email') : email_badanusaha_pemasaran, ('bidang_usaha') : bidang_usaha_badanusaha_prakarsa
        , ('alamat') : alamat_badanusaha_pemasaran, ('rt') : rt_badanusaha_pemasaran, ('rw') : rw_badanusaha_pemasaran, ('kodepos_pemohon') : kodeposalamat_badanusaha_pemasaran
        , ('status') : statuspengajuan_badanusaha_pemasaran, ('jml_permohonan') : jmlpermohonan_badanusaha_pemasaran, ('periode') : periode_badanusaha_pemasaran
        , ('tujuan_kredit') : tujuan_badanusaha_pemasaran, ('tgl_usaha') : tgl_usaha_badanusaha_pemasaran], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0121_DETAIL DATA PRIBADI/0121A_DETAIL DATA BADAN USAHA'), 
    [('npwp') : npwp_badanusaha_prakarsa, ('status_badan_usaha') : status_badanusaha_prakarsa, ('bentuk_badan_usaha') : bentuk_badanusaha_prakarsa
        , ('gelar_badan_usaha') : gelar_badanusaha_prakarsa, ('jenis_badan_usaha') : jenis_badanusaha_prakarsa, ('nama_perusahaan') : nama_perusahaan_badanusaha_prakarsa
        , ('kota_tempat_usaha') : kota_tu_badanusaha_pemasaran, ('no_hp') : nohp_badanusaha_prakarsa, ('email') : email_badanusaha_prakarsa
        , ('fixed_line') : fixed_line_badanusaha_prakarsa, ('fax') : fax_badanusaha_prakarsa, ('tempat_akta_awal') : tempat_akta_awal_badanusaha_prakarsa
        , ('no_akta_awal') : no_akta_awal_badanusaha_prakarsa, ('no_akta_akhir') : no_akta_akhir_badanusaha_prakarsa, ('alamat') : alamat_badanusaha_prakarsa
        , ('rt') : rt_badanusaha_prakarsa, ('rw') : rw_badanusaha_prakarsa, ('kode_pos') : kode_pos_badanusaha_prakarsa, ('bidang_usaha') : bidang_usaha_brinets_badanusaha_prakarsa
        , ('lama_usaha') : lama_usaha_badanusaha_prakarsa, ('gol_debit') : gol_debit_badanusaha_prakarsa, ('gol_debit_LBU') : gol_debit_lbdnu_badanusaha_prakarsa
        , ('hub_bank') : hub_bank_badanusaha_prakarsa, ('sumber_utama') : sumber_utama_badanusaha_prakarsa, ('bidang_usaha_brinets') : bidang_usaha_brinets_badanusaha_prakarsa
        , ('sumber_utama_brinets') : sumber_utama_brinets_badanusaha_prakarsa, ('federal_wh') : federal_wh_badanusaha_prakarsa
        , ('customer_type') : customer_type_badanusaha_prakarsa, ('sub_customer_type') : sub_customer_type_badanusaha_prakarsa
        , ('segmen_kredit') : segmentasi_kredit_badanusaha_prakarsa, ('pendapatan_bulanan') : pendapatan_perbulan_badanusaha_prakarsa
        , ('omzet') : omzet_badanusaha_prakarsa, ('omzet_bulanan') : omzet_perbulan_badanusaha_prakarsa, ('penghasilan') : penghasilan_perbulan_badanusaha_prakarsa
        , ('transaksi_brinets') : transaksih_brinets_badanusaha_prakarsa, ('jenis_rekening') : jenis_rekening_badanusaha_prakarsa
        , ('hub_bank_lain') : hubbanklain_badanusaha_prakarsa, ('nama_banklain') : namabanklain_badanusaha_prakarsa, ('tujuan_buka_rekening') : tujuanbukarekening_badanusaha_prakarsa
        , ('status_kirim') : status_kirim_badanusaha_prakarsa, ('tanggal_debitur') : tgldebitur_badanusaha_prakarsa, ('tanggal_akta_awal') : tglaktaakhir_badanusaha_prakarsa
        , ('tanggal_akta_akhir') : tglaktaakhir_badanusaha_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0122_PENGURUS PENJAMIN/0122A_DOKUMEN PENGURUS'), 
    [('nama') : nama_pengurus, ('nik') : nik_pengurus, ('npwp') : npwp_pengurus, ('tempat_lahir') : tempat_lahir_pengurus
        , ('tanggal_lahir') : tgl_lahir_pengurus, ('jenis_kelamin') : jenis_kelamin_pengurus, ('jabatan') : jabatan_pengurus
        , ('share_kepemilikan') : share_kepemilikan_pengurus, ('alamat') : alamat_pengurus, ('kode_pos') : kode_pos_pengurus
        , ('nama_pencarian') : nama_perusahaan_badanusaha_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0122_PENGURUS PENJAMIN/0122B_DOKUMEN PENJAMIN'), 
    [('nama_pencarian') : nama_perusahaan_badanusaha_pemasaran, ('nama_penjamin') : nama_penjamin, ('nik') : nik_penjamin
        , ('npwp') : npwp_penjamin, ('tempat_lahir') : tempat_lahir_penjamin, ('tanggal_lahir') : tgl_lahir_penjamin, ('jenis_kelamin') : jenis_kelamin_penjamin
        , ('alamat') : alamat_penjamin, ('kode_pos') : kode_pos_penjamin], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0124_DOKUMENTASI KREDIT/0124B_DOKUMEN PERIJINAN'), 
    [('nama') : nama_perusahaan_badanusaha_prakarsa, ('jenis_perijinan') : jenis_perijinan, ('lainnya') : lainnya_perijinan
        , ('no_perijinan') : nomor_perijinan, ('issue_date') : issuedate_perijinan, ('expired_date') : expired_date_perijinan], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0124_DOKUMENTASI KREDIT/0124A_DU BDN USAHA'), 
    [('nama') : nama_perusahaan_badanusaha_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0123_STATUS PRESCREENING/0123A_STATUS PRESCREENING'), 
    [('jenis_segmen_produk') : segmentasi_kredit_badanusaha_prakarsa, ('nama') : nama_perusahaan_badanusaha_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251C_TANAH'), 
    [('lokasi') : lokasi_tanah, ('kode_pos') : kodepos_tanah, ('deskripsi_agunan') : deskripsi_agunan_tanah, ('atas_nama') : atas_nama_tanah
        , ('no_sertif') : no_sertif_tanah, ('status_bukti_kepemilikan') : status_bukti_kepemilikan_tanah, ('perpanjang') : perpanjang_tanah
        , ('akses_kendaraan') : akses_kendaraan_tanah, ('tgl_bukti_kepemilikan') : tgl_bukti, ('jangka_waktu_bukti_kepemilikan') : jangka_waktu_tanah
        , ('alamat_ktp') : alamatktp_tanah, ('alamat_agunan') : alamatagunan_tanah, ('rt_agunan') : rtagunan_tanah, ('rw_agunan') : rwagunan_tanah
        , ('kode_pos_agunan') : kodepos_agunan_tanah, ('batas_timur') : batas_timur_tanah, ('batas_utara') : batas_utara_tanah
        , ('batas_barat') : batas_barat_tanah, ('batas_selatan') : batas_selatan_tanah, ('bentuk_tanah') : bentuk_tanah, ('luas_tanah') : luas_tanah
        , ('harga_tanah') : harga_tnh, ('nama_pencarian') : nama_perusahaan_badanusaha_pemasaran], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0126_ANALISIS KUALITATIF/0126A_ANALISIS KUALITATIF'), 
    [('kesediaan_penyampaian_info') : kesediaan_penyampaian, ('tunggakan') : tunggakkan_akualitatif, ('komitmen') : komitmen_akualitatif
        , ('pengelolaan_rekening_bank') : pengelola_rekening, ('reputasi_bisnis') : reputasi_bisnis_akualitatif, ('prilaku_pribadi_debitur') : prilaku_pribadidebitur_akualitatif
        , ('keluhan') : keluhan_akualitatif, ('komunitas_bisnis') : komunitas_bisnis_akualitatif, ('kualitas_produk') : kualitas_produk_akualitatif
        , ('strategi_pemasaran') : strategi_pemasaran_akualitatif, ('ketergantungan_pasar') : ketergantungan_pasar_akualitatif
        , ('lokasi_usaha') : lokasi_usaha_akualitatif, ('perkembangan_pasar') : perkembangan_pasar_akualitatif, ('persaingan') : persaingan_akualitatif
        , ('usaha_oms') : usahaoms_akualitatif, ('konsep_kaderisasi') : konsep_kaderisasi_akualitatif, ('karyawan_bekerja') : karyawanbekerja_akualitatif
        , ('kualifikasi_komersial') : kualifikasi_komersial_akualitatif, ('kualifikasi_teknis') : kualifikasi_teknis, ('prospek_industri') : prospek_industri_akualitatif
        , ('garansi') : garansi_akualitatif, ('coverage_agunan') : coverage_agunan_akualitatif, ('marketabilitas_agunan') : marketabilitas_agunan_akualitatif
        , ('nama') : nama_perusahaan_badanusaha_pemasaran], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0127_ANALISIS 5C/0127A_ANALISIS 5C'), 
    [('analisis_karakter') : analisis_karakter, ('aspek_produksi') : aspek_produksi, ('manajemen') : manajemen, ('strategi_pemasaran') : strategi_pemasaran
        , ('aspek_persaingan') : aspek_persaingan, ('aspek_kondisi') : aspek_kondisidanprospekusaha, ('ratas_penjualan') : ratas_penjualan
        , ('nama_bank') : nama_bank, ('norek') : norek, ('mutasi_debit') : mutasi_debit, ('mutasi_kredit') : mutasi_kredit
        , ('nama') : nama_perusahaan_badanusaha_pemasaran], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

