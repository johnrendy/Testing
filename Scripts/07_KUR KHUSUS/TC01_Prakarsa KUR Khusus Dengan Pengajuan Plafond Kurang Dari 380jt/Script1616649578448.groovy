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

Mobile.callTestCase(findTestCase('01_HOME/011_DATA PEMASARAN/01_DATA PEMASARAN/012_RITEL/TC01_DP TAMBAH PEMASARAN'), [('kode_pos') : kode_pos_pribadi_pemasaran
        , ('lokasi') : lokasi_pribadi_pemasaran, ('nik') : nik_pribadi_pemasaran, ('nama_lengkap') : namalengkap_pribadi_pemasaran
        , ('jenis_kelamin') : jkelamin_pribadi_pemasaran, ('status_perkawinan') : status_perkawinan_pribadi_pemasaran, ('no_hp') : nohp_pribadi_pemasaran
        , ('email') : email_pribadi_pemasaran, ('tmpt_lahir') : tempatlahir_pribadi_pemasaran, ('bidang_usaha') : bidangusaha_pribadi_pemasaran
        , ('alamat') : alamat_pribadi_pemasaran, ('rt') : rt_pribadi_pemasaran, ('rw') : rw_pribadi_pemasaran, ('kodepos_pemohon') : kodepos_pribadi_pemasaran
        , ('status') : status_pribadi_pemasaran, ('jml_permohonan') : jmlpermohonan_pribadi_pemasaran, ('periode') : periode_pribadi_pemasaran
        , ('tujuan') : tujuan_pribadi_pemasaran, ('tgl_lahir') : tgl_lahir_pribadi_pemasaran], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0121_DETAIL DATA PRIBADI/0121B_DETAIL DATA PRIBADI'), 
    [('nik') : nik_pribadi_prakarsa, ('nama_lengkap') : namalengkap_pribadi_prakarsa, ('nama_alias') : namaalias_pribadi_prakarsa
        , ('jenis_kelamin') : jkelamin_pribadi_prakarsa, ('status_perkawinan') : status_pribadi_prakarsa, ('tempat_lahir') : tempatlahir_pribadi_prakarsa
        , ('tgl_lahir') : tgllahir_pribadi_prakarsa, ('pekerjaan') : pekerjaan_pribadi_prakarsa, ('agama') : agama_pribadi_prakarsa
        , ('agama_lainnya') : agama_lainnya_pribadi_prakarsa, ('jenis_pekerjaan') : jenis_pekerjaan_pribadi_prakarsa, ('status_gelar') : statusgelar_pribadi_prakarsa
        , ('jml_tanggungan') : jml_tanggungan_pribadi_prakarsa, ('nama_ibu') : nama_ibu_pribadi_prakarsa, ('no_hp') : nohp_pribadi_prakarsa
        , ('no_telp') : notelp_pribadi_prakarsa, ('email') : email_pribadi_prakarsa, ('bidang_usaha') : bidangusaha_pribadi_prakarsa
        , ('debitur2') : debitur_dua_pribadi_prakarsa, ('debitur3') : debitur_tiga_pribadi_prakarsa, ('debitur4') : debitur_empat_pribadi_prakarsa
        , ('alamat_ktp') : alamat_ktp_pribadi_prakarsa, ('rt_ktp') : rt_ktp_pribadi_prakarsa, ('rw_ktp') : rw_ktp_pribadi_prakarsa
        , ('kodepos_ktp') : kodepos_ktp_pribadi_prakarsa, ('lama_menetap') : lama_menetap_pribadi_prakarsa, ('alamat_domisili_sama') : alamat_sama_pribadi_prakarsa
        , ('alamat_domisili') : alamat_domisili_pribadi_prakarsa, ('kodepos_domisili') : kodepos_domisili_pribadi_prakarsa
        , ('nik_pasangan') : nik_pas_pribadi_prakarsa, ('nama_pasangan') : nama_pas_pribadi_prakarsa, ('tgl_pasangan') : tgl_lahirpas_pribadi_prakarsa
        , ('nama_perusahaan') : nama_perusahaan_pribadi_prakarsa, ('tgl_usaha') : tgl_usaha_pribadi_prakarsa, ('jabatan') : jabatan_pribadi_prakarsa
        , ('npwp') : npwp_pribadi_prakarsa, ('jml_tenaga_kerja') : jml_tenaga_kerja_pribadi_prakarsa, ('alamat_usaha_sama') : alamat_usaha_sama_pribadi_prakarsa
        , ('alamat_usaha') : alamat_pribadi_prakarsa, ('kodepos_usaha') : kode_pos_pribadi_prakars, ('produk_kredit') : produk_kredit_pribadi_prakarsa
        , ('perjanjian_pisah_harta') : pisah_harta_pribadi_prakarsa, ('status_kepemilikan') : status_kepemilikkan_pribadi_prakarsa
        , ('transaksi_normal_harian') : transaksi_normal_harian_pribadi_prakarsa, ('penghasilan_perbulan') : penghasilan_perbulan_pribadi_prakarsa
        , ('pinjam_banklain') : pinjam_bank_lain_pribadi_prakarsa, ('jenisrekening_banklain') : jenis_rekening_bank_lain_pribadi_prakarsa
        , ('nama_banklain') : nama_bank_lain_pribadi_prakarsa, ('tujuan_buka_rekening') : tujuan_buka_rekening_pribadi_prakarsa
        , ('ket_buka_rekening') : keterangan_pribadi_prakarsa, ('status_kirim') : status_kirim_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0122_PENGURUS PENJAMIN/0122B_DOKUMEN PENJAMIN'), 
    [('nama_pencarian') : namalengkap_pribadi_prakarsa, ('nama_penjamin') : nama_penjamin, ('nik') : nik_penjamin, ('npwp') : npwp_penjamin
        , ('tempat_lahir') : tempat_lahir_penjamin, ('tanggal_lahir') : tgl_lahir_penjamin, ('jenis_kelamin') : jenis_kelamin_penjamin
        , ('alamat') : alamat_penjamin, ('kode_pos') : kode_pos_penjamin], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0124_DOKUMENTASI KREDIT/0124B_DOKUMEN PERIJINAN'), 
    [('nama') : namalengkap_pribadi_prakarsa, ('jenis_perijinan') : jenis_perijinan, ('lainnya') : lainnya_perijinan, ('no_perijinan') : nomor_perijinan
        , ('issue_date') : issuedate_perijinan, ('expired_date') : expired_date_perijinan], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0124_DOKUMENTASI KREDIT/0124C_DU PRIBADI'), 
    [('nama') : namalengkap_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251A_RMHTINGGAL'), 
    [('nama_pencarian') : namalengkap_pribadi_prakarsa, ('lokasi') : lokasi_armhtgl, ('kode_pos') : kodepos_armhtgl, ('deskripsi_agunan') : deskripsi_agunan_armhtgl
        , ('atas_nama') : atas_nama_armhtgl, ('no_sertif') : no_sertif_armhtgl, ('status_bukti_kepemilikan') : status_bukti_kepemilikan_armhtgl
        , ('perpanjang') : perpanjang_armhtgl, ('akses_kendaraan') : akses_kendaraan_armhtgl, ('tgl_bukti_kepemilikan') : tgl_bukti_armhtgl
        , ('jangka_waktu_bukti_kepemilikan') : jangka_waktu_armhtgl, ('alamat_ktp') : alamatktp_armhtgl, ('alamat_agunan') : alamatagunan_armhtgl
        , ('rt_agunan') : rt_agunan_armhtgl, ('rw_agunan') : rw_agunan_armhtgl, ('kode_pos_agunan') : kodepos_agunan_armhtgl
        , ('batas_timur') : batas_timur_armhtgl, ('batas_utara') : batas_utara_armhtgl, ('batas_barat') : batas_barat_armhtgl
        , ('batas_selatan') : batas_selatan_armhtgl, ('bentuk_tanah') : bentuk_tanah_armhtgl, ('no_imb') : no_imb_armhtgl
        , ('tgl_imb') : tgl_imb_armhtgl, ('luas_tanah') : luas_tanah_armhtgl, ('harga_tanah') : harga_tnh_armhtgl, ('luas_bangunan') : luas_bangunan_armhtgl
        , ('harga_bangunan') : harga_bangunan_armhtgl, ('jenis_asuransi') : jns_asuransi_armhtgl, ('pluasan_asuransi') : pluasan_asuransi_armhtgl
        , ('nilai_asuransi') : nilai_asuransi_armhtgl, ('jarak_pusat_kota') : jrk_pst_kota_armhtgl, ('lokasi_pasar') : lokasi_pasar_armhtgl
        , ('nama_pasar') : nama_pasar_armhtgl, ('pnilai_agunan') : pnilai_agunan_armhtgl, ('pidenpendent') : pidependen_armhtgl
        , ('okupasi_agunan') : okupasi_agunan_armhtgl, ('dinding') : dinding_armhtgl, ('lantai') : lantai_armhtgl, ('atap') : atap_armhtgl
        , ('rangka') : rangka_armhtgl, ('jmlah_lantai') : jml_lantai_armhtgl], FailureHandling.STOP_ON_FAILURE)

//Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0126_ANALISIS KUALITATIF/0126A_ANALISIS KUALITATIF'), 
//    [('kesediaan_penyampaian_info') : kesediaan_penyampaian, ('tunggakan') : tunggakkan_akualitatif, ('komitmen') : komitmen_akualitatif
//        , ('pengelolaan_rekening_bank') : pengelola_rekening, ('reputasi_bisnis') : reputasi_bisnis_akualitatif, ('prilaku_pribadi_debitur') : prilaku_pribadidebitur_akualitatif
//        , ('keluhan') : keluhan_akualitatif, ('komunitas_bisnis') : komunitas_bisnis_akualitatif, ('kualitas_produk') : kualitas_produk_akualitatif
//        , ('strategi_pemasaran') : strategi_pemasaran_akualitatif, ('ketergantungan_pasar') : ketergantungan_pasar_akualitatif
//        , ('lokasi_usaha') : lokasi_usaha_akualitatif, ('perkembangan_pasar') : perkembangan_pasar_akualitatif, ('persaingan') : persaingan_akualitatif
//        , ('usaha_oms') : usahaoms_akualitatif, ('konsep_kaderisasi') : konsep_kaderisasi_akualitatif, ('karyawan_bekerja') : karyawanbekerja_akualitatif
//        , ('kualifikasi_komersial') : kualifikasi_komersial_akualitatif, ('kualifikasi_teknis') : kualifikasi_teknis, ('prospek_industri') : prospek_industri_akualitatif
//        , ('garansi') : garansi_akualitatif, ('coverage_agunan') : coverage_agunan_akualitatif, ('marketabilitas_agunan') : marketabilitas_agunan_akualitatif
//        , ('nama') : namalengkap_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0127_ANALISIS 5C/0127A_ANALISIS 5C'), 
    [('analisis_karakter') : analisis_karakter, ('aspek_produksi') : aspek_produksi, ('manajemen') : manajemen, ('strategi_pemasaran') : strategi_pemasaran
        , ('aspek_persaingan') : aspek_persaingan, ('aspek_kondisi') : aspek_kondisidanprospekusaha, ('ratas_penjualan') : ratas_penjualan
        , ('nama_bank') : nama_bank, ('norek') : norek, ('mutasi_debit') : mutasi_debit, ('mutasi_kredit') : mutasi_kredit
        , ('nama') : namalengkap_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0123_STATUS PRESCREENING/0123A_STATUS PRESCREENING'), 
    [('nama') : namalengkap_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

