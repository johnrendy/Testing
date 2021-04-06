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
    [('nama') : nama_penjamin, ('nik') : nik_penjamin, ('npwp') : npwp_penjamin, ('tempat_lahir') : tempat_lahir_penjamin
        , ('tanggal_lahir') : tgl_lahir_penjamin, ('jenis_kelamin') : jenis_kelamin_penjamin, ('alamat') : alamat_penjamin
        , ('kode_pos') : kode_pos_penjamin], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0124_DOKUMENTASI KREDIT/0124C_DU PRIBADI'), 
    [('nama') : namalengkap_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0124_DOKUMENTASI KREDIT/0124B_DOKUMEN PERIJINAN'), 
    [('nama') : namalengkap_pribadi_prakarsa, ('jenis_perijinan') : jenis_perijinan, ('lainnya') : lainnya_perijinan, ('no_perijinan') : nomor_perijinan
        , ('issue_date') : issuedate_perijinan, ('expired_date') : expired_date_perijinan], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251A_RMHTINGGAL'), 
    [('lokasi') : lokasi_armhtgl, ('kode_pos') : kodepos_armhtgl, ('deskripsi_agunan') : deskripsi_agunan_armhtgl, ('atas_nama') : atas_nama_armhtgl
        , ('no_sertif') : no_sertif_armhtgl, ('status_bukti_kepemilikan') : status_bukti_kepemilikan_armhtgl, ('perpanjang') : perpanjang_armhtgl
        , ('akses_kendaraan') : akses_kendaraan_armhtgl, ('tgl_bukti_kepemilikan') : tgl_bukti_armhtgl, ('jangka_waktu_bukti_kepemilikan') : jangka_waktu_armhtgl
        , ('alamat_ktp') : alamatktp_armhtgl, ('alamat_agunan') : alamatagunan_armhtgl, ('rt_agunan') : rt_agunan_armhtgl
        , ('rw_agunan') : rw_agunan_armhtgl, ('kode_pos_agunan') : kodepos_agunan_armhtgl, ('batas_timur') : batas_timur_armhtgl
        , ('batas_utara') : batas_utara_armhtgl, ('batas_barat') : batas_barat_armhtgl, ('batas_selatan') : batas_selatan_armhtgl
        , ('bentuk_tanah') : bentuk_tanah_armhtgl, ('no_imb') : no_imb_armhtgl, ('tgl_imb') : tgl_imb_armhtgl, ('luas_tanah') : luas_tanah_armhtgl
        , ('harga_tanah') : harga_tnh_armhtgl, ('luas_bangunan') : luas_bangunan_armhtgl, ('harga_bangunan') : harga_bangunan_armhtgl
        , ('jenis_asuransi') : jns_asuransi_armhtgl, ('pluasan_asuransi') : pluasan_asuransi_armhtgl, ('nilai_asuransi') : nilai_asuransi_armhtgl
        , ('jarak_pusat_kota') : jrk_pst_kota_armhtgl, ('lokasi_pasar') : lokasi_pasar_armhtgl, ('nama_pasar') : nama_pasar_armhtgl
        , ('pnilai_agunan') : pnilai_agunan_armhtgl, ('pidenpendent') : pidependen_armhtgl, ('okupasi_agunan') : okupasi_agunan_armhtgl
        , ('dinding') : dinding_armhtgl, ('lantai') : lantai_armhtgl, ('atap') : atap_armhtgl, ('rangka') : rangka_armhtgl
        , ('jmlah_lantai') : jml_lantai_armhtgl], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251B_KENDARAAN'), 
    [('lokasi') : lokasi_akendaraan, ('kode_pos') : kodepos_akendaraan, ('deskripsi_agunan') : deskripsi_akendaraan, ('atas_nama') : atas_nama_akendaraan
        , ('klasifikasi_kendaraan') : klasifikasikendaraan, ('jenis_kendaraan') : jnskendaraan, ('merk_kendaraan') : merkkendaraan
        , ('tipe_merk') : tipemerk_akendaraan, ('warna_kendaraan') : warnakendaraan, ('thn_pembuatan') : tahunpembuatan_akendaraan
        , ('no_mesin') : nomormesin_akendaraan, ('no_chasis') : nomorchasis_akendaraan, ('no_bukti_kepemilikan') : nomorbuktikepemilikan_akendaraan
        , ('tgl_kepemilikan') : tglkepemilikan_akendaraan, ('jns_penggunaan') : jnspengunaan_akendaraan, ('nopol') : nopol_akendaraan
        , ('alamat_ktp') : alamatktp_akendaraan, ('alamat_agunan') : alamatagunan_akendaraan, ('rt_agunan') : rt_agunan_akendaraan
        , ('rw_agunan') : rw_agunan_akendaraan, ('kode_pos_agunan') : kodepos_agunan_akendaraan, ('pkt_asuransi') : pkt_asuransi_akendaraan
        , ('prluasan_asuransi') : pluasan_asuransi_akendaraan, ('nilai_psr_wajar') : nilai_pasar_wajar_akendaraan, ('pnilai_agunan') : pnilai_agunan_akendaraan
        , ('pidenpedent') : pidependen_akendaraan, ('tgl_pnilai') : tglpnilai_akendaraan, ('nilai_asuransi') : nilai_asuransi_akendaraan], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251C_TANAH'), 
    [('lokasi') : lokasi_tanah, ('kode_pos') : kodepos_tanah, ('deskripsi_agunan') : deskripsi_agunan_tanah, ('atas_nama') : atas_nama_tanah
        , ('no_sertif') : no_sertif_tanah, ('status_bukti_kepemilikan') : status_bukti_kepemilikan_tanah, ('perpanjang') : perpanjang_tanah
        , ('akses_kendaraan') : akses_kendaraan_tanah, ('tgl_bukti_kepemilikan') : tgl_bukti, ('jangka_waktu_bukti_kepemilikan') : jangka_waktu_tanah
        , ('alamat_ktp') : alamatktp_tanah, ('alamat_agunan') : alamatagunan_tanah, ('rt_agunan') : rtagunan_tanah, ('rw_agunan') : rw_agunan_akendaraan
        , ('kode_pos_agunan') : kodepos_agunan_tanah, ('batas_timur') : batas_timur_tanah, ('batas_utara') : batas_utara_tanah
        , ('batas_barat') : batas_barat_tanah, ('batas_selatan') : batas_selatan_tanah, ('bentuk_tanah') : bentuk_tanah, ('luas_tanah') : luas_tanah
        , ('harga_tanah') : harga_tnh], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251D_BANGUNAN'), 
    [('lokasi') : lokasi_bgnan, ('kode_pos') : kodepos_bgnan, ('deskripsi_agunan') : deskripsi_agunan_bgnan, ('atas_nama') : atas_nama_bgnan
        , ('no_sertif') : nosertif_bgnan, ('status_bukti_kepemilikan') : status_bukti_kepemilikan_bgnan, ('perpanjang') : perpanjang_bgnan
        , ('akses_kendaraan') : akses_kendaraan_bgnan, ('tgl_bukti_kepemilikan') : tgl_bukti_bgnan, ('jangka_waktu_bukti_kepemilikan') : jangka_waktu_bgnan
        , ('alamat_ktp') : alamatktp_bgnan, ('alamat_agunan') : alamatagunan_bgnan, ('rt_agunan') : rtagunan_bgnan, ('rw_agunan') : rwagunan_bgnan
        , ('kode_pos_agunan') : kodepos_agunan_bgnan, ('batas_timur') : batas_timur_bgnan, ('batas_utara') : batas_utara_bgnan
        , ('batas_barat') : batas_barat_bgnan, ('batas_selatan') : batas_selatan_bgnan, ('bentuk_tanah') : bentuk_tanah_bgnan
        , ('no_imb') : no_imb_bgnan, ('tgl_imb') : tgl_imb_bgnan, ('luas_tanah') : luas_tanah_bgnan, ('harga_tanah') : harga_tnh_bgnan
        , ('luas_bangunan') : luas_bangunan, ('harga_bangunan') : harga_bangunan, ('jenis_asuransi') : jns_asuransi_property
        , ('pluasan_asuransi') : pluasan_asuransi_bgnan, ('nilai_asuransi') : nilai_asuransi_bgnan, ('jarak_pusat_kota') : jrk_pstkota_bgnan
        , ('lokasi_pasar') : lokasi_pasar_bgnan, ('nama_pasar') : nama_pasar_bgnan, ('pnilai_agunan') : pnilai_agunan_bgnan
        , ('pidenpendent') : pidependen_bgnan, ('okupasi_agunan') : okupasi_agunan_bgnan, ('dinding') : dinding_bgnan, ('lantai') : lantai_bgnan
        , ('atap') : atap_bgnan, ('rangka') : rangka_bgnan, ('jmlah_lantai') : jml_lantai_bgnan], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251E_PROPERTI KOMERSIAL'), 
    [('lokasi') : lokasi_property, ('kode_pos') : kodepos_property, ('deskripsi_agunan') : deskripsi_agunan_property, ('atas_nama') : atas_nama_property
        , ('no_sertif') : nosertif_property, ('status_bukti_kepemilikan') : status_bukti_kepemilikan_property, ('perpanjang') : perpanjang_property
        , ('akses_kendaraan') : akseskendaraan_property, ('tgl_bukti_kepemilikan') : tgl_bukti_property, ('jangka_waktu_bukti_kepemilikan') : jangka_waktu_property
        , ('alamat_ktp') : alamatktp_property, ('alamat_agunan') : alamatagunan_property, ('rt_agunan') : rtagunan_property
        , ('rw_agunan') : rwagunan_property, ('kode_pos_agunan') : kodepos_agunan_property, ('batas_timur') : batas_timur_property
        , ('batas_utara') : batas_utara_property, ('batas_barat') : batas_barat_property, ('batas_selatan') : batas_selatan_property
        , ('bentuk_tanah') : bentuk_tanah_property, ('no_imb') : no_imb_property, ('tgl_imb') : tgl_imb_property, ('luas_tanah') : luas_tanah_property
        , ('harga_tanah') : harga_tnh_property, ('luas_bangunan') : luas_bangunan_property, ('harga_bangunan') : harga_bangunan_property
        , ('jenis_asuransi') : jns_asuransi_property, ('pluasan_asuransi') : pluasan_asuransi_property, ('nilai_asuransi') : nilai_asuransi_property
        , ('jarak_pusat_kota') : jrk_pst_kota_property, ('lokasi_pasar') : lokasi_pasar_property, ('nama_pasar') : nama_pasar_property
        , ('pnilai_agunan') : pnilai_agunan_property, ('pidenpendent') : pidependent_property, ('okupasi_agunan') : okupasi_agunan_property
        , ('dinding') : dinding_property, ('lantai') : lantai_property, ('atap') : atap_property, ('rangka') : rangka_property
        , ('jmlah_lantai') : jml_lantai_property], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251F_KAS'), 
    [('lokasi') : lokasi_kas, ('kode_pos') : kodepos_kas, ('deskripsi_agunan') : deskripsi_agunan_kas, ('tipe_kas') : tipe_kas
        , ('no_bukti') : nobuktikepemilikan_kas, ('tgl_bukti') : tgl_bukti_kas, ('nominal') : nominal_kas, ('pnilaiagunan') : penilai_agunan_kas
        , ('atas_nama') : atas_nama_kas, ('status_buktikepemilikan') : status_kepemilikan_kas, ('alamat_ktp') : alamatktp_kas
        , ('alamat') : alamat_kas, ('kode_pos_alamat') : kodeposagunan_kas, ('jangka_waktu') : jangka_waktu_kas, ('tgl_jthtempo') : tgl_jatuh_kas
        , ('perpanjangan_otomatis') : perpanjang_kas, ('nilai_pasar_wajar') : nilaipasar_kas, ('no_rek') : norek_kas, ('nama_bank') : namabank_kas], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251G_PIUTANG'), 
    [('lokasi') : lokasi_piutang, ('kode_pos') : kodepos_piutang, ('nama_debitur') : nama_debitur_piutang, ('deskripsi_agunan') : deskripsi_agunan_piutang
        , ('piutang_kepada') : piutang_kepada, ('status_buktikepemilikan') : statusbukti_kepemilikan_piutang, ('atas_nama_pemilik') : atas_nama_piutang
        , ('no_bukti_pemilik') : nobuktikepemilikan_piutang, ('tgl_bukti_kpemilikan') : tgl_bukti_piutang, ('alamat_ktp') : alamatktp_piutang
        , ('alamat_agunan') : alamatagunan_piutang, ('kode_pos_agunan') : kodeposagunan_piutang, ('rt_agunan') : rtagunan_piutang
        , ('rw_agunan') : rwagunan_piutang, ('nilai_pasar_wajar') : nilaipasar_piutang, ('penilaian_agunan') : penilai_agunan_piutang
        , ('penilaian_idependen') : pidependen_piutang, ('tgl_penilaian_akhir') : tglpenilaian_piutang], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251H_MESINALAT'), 
    [('lokasi') : lokasi_mesin, ('kode_pos') : kodepos_mesin, ('jenis_mesin_alat') : jenis_mesin, ('no_seri') : noseri_mesin
        , ('pil_okupasi_alat') : pilokupasi_alat_mesin, ('no_rangka') : norangka_mesin, ('no_mesin') : norangka_mesin, ('jns_penggunaan') : jnspenggunaan_mesin
        , ('deskripsi') : deskripsi_mesin, ('merk') : merk_mesin, ('thn_pembuatan') : thnpembuatan_mesin, ('atas_nama_pemilik') : atas_nama_mesin
        , ('no_bukti_kepemilikan') : nobuktikepemilikan_mesin, ('alamat_ktp') : alamatktp_mesin, ('alamat') : alamatpemilik_mesin
        , ('kode_pos_alamat') : kodeposktp_mesin, ('alamat_ktpa') : kodeposagunan_mesin, ('alamat_agunan') : alamatagunan_mesin
        , ('kodepos_agunan') : kodeposagunan_mesin, ('pkt_asuransi') : asuransi_mesin, ('pluasan_asuransi') : pasuransi_mesin
        , ('flag_paripasu') : flagparipasu_mesin, ('value_paripasu') : valueparipasu_mesin, ('nilai_pasar_wajar') : nilaipasar_mesin
        , ('pagunan') : penilai_oleh_mesin, ('pidependent') : pidenpenden_mesin, ('tgl_penilai_asuransi') : tgl_penilaian_mesin
        , ('nilai_asuransi') : nilaiasuransi_mesin, ('pil_okupasi_mesin') : pilokupasi_mesin_mesin], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0125_SURVEY AGUNAN/01251_ISISENDIRI/01251I_LAINNYA'), 
    [('lokasi') : lokasi_lainnya, ('kode_pos') : kodepos_lainnya, ('deskripsi_agunan') : deskripsi_agunan_lainnya, ('nama_brng') : namabarang_lainnya
        , ('atas_nama_pemilik') : atas_nama_lainnya, ('bukti_kepemilikan') : buktikepemilikan_lainnya, ('no_bukti_kepemilikan') : no_bukti_lainnya
        , ('tgl_bukti') : tgl_bukti_lainnya, ('alamat_ktp') : alamatktp_lainnya, ('alamat') : alamatpemilik_lainnya, ('kode_pos_alamat') : kodeposktp_lainnya
        , ('eligibility') : eligibility_lainnya, ('penilai_oleh') : penilai_oleh, ('tgl_agunan_akhir') : tgl_penilaian_lainnya
        , ('nilai_pasar_wajar') : nilaipsrwjr_lainnya, ('pidenpendent') : pidenpenden_lainnya], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0126_ANALISIS KUALITATIF/0126A_ANALISIS KUALITATIF'), 
    [('kesediaan_penyampaian_info') : kesediaan_penyampaian, ('tunggakan') : tunggakkan_akualitatif, ('komitmen') : komitmen_akualitatif
        , ('pengelolaan_rekening_bank') : pengelola_rekening, ('reputasi_bisnis') : reputasi_bisnis_akualitatif, ('prilaku_pribadi_debitur') : prilaku_pribadidebitur_akualitatif
        , ('keluhan') : keluhan_akualitatif, ('komunitas_bisnis') : komunitas_bisnis_akualitatif, ('kualitas_produk') : kualitas_produk_akualitatif
        , ('strategi_pemasaran') : strategi_pemasaran_akualitatif, ('ketergantungan_pasar') : ketergantungan_pasar_akualitatif
        , ('lokasi_usaha') : lokasi_usaha_akualitatif, ('perkembangan_pasar') : perkembangan_pasar_akualitatif, ('persaingan') : persaingan_akualitatif
        , ('usaha_oms') : usahaoms_akualitatif, ('konsep_kaderisasi') : konsep_kaderisasi_akualitatif, ('karyawan_bekerja') : karyawanbekerja_akualitatif
        , ('kualifikasi_komersial') : kualifikasi_komersial_akualitatif, ('kualifikasi_teknis') : kualifikasi_teknis, ('prospek_industri') : prospek_industri_akualitatif
        , ('garansi') : garansi_akualitatif, ('coverage_agunan') : coverage_agunan_akualitatif, ('marketabilitas_agunan') : marketabilitas_agunan_akualitatif
        , ('nama') : namalengkap_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0127_ANALISIS 5C/0127A_ANALISIS 5C'), 
    [('analisis_karakter') : analisis_karakter, ('aspek_produksi') : aspek_produksi, ('manajemen') : manajemen, ('strategi_pemasaran') : strategi_pemasaran
        , ('aspek_persaingan') : aspek_persaingan, ('aspek_kondisi') : aspek_kondisidanprospekusaha, ('ratas_penjualan') : ratas_penjualan
        , ('nama_bank') : nama_bank, ('norek') : norek, ('mutasi_debit') : mutasi_debit, ('mutasi_kredit') : mutasi_kredit
        , ('nama') : namalengkap_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/02_RITEL/0123_STATUS PRESCREENING/0123A_STATUS PRESCREENING'), 
    [('nama') : namalengkap_pribadi_prakarsa], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

