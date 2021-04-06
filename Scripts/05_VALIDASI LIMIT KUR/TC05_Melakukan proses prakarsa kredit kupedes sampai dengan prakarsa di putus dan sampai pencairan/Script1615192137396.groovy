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

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/015 _SURVEY AGUNAN/0151_TAMBAH AGUNAN/0151A_SURVEY AGUNAN RUMAH TINGGAL'),
    [('DESKRIPSI') : deskripsi_armhtgl, ('KEPEMILIKAN') : kepemilikanagunan_armhtgl, ('PEMILIK') : atasnama_armhtgl, ('STATUSKEPEMILIKAN') : statuskepemilikan_armhtgl
        , ('NOSERTIFIKAT') : nomorsertifikat_armhtgl, ('TGLBUKTIKPMLIKAN') : tglbuktikepemilikan_armhtgl, ('STATEAGUNAN') : stateangunan_armhtgl
        , ('KETERANGAN') : keterangan_armhtgl, ('ALAMATSAMA') : alamatsama_armhtgl, ('ALAMAT') : alamat_armhtgl, ('RT') : rt_armhtgl
        , ('RW') : rw_armhtgl, ('KODEPOS') : kodepos_armhtgl, ('KEC') : kec_armhtgl, ('KEL') : kel_armhtgl, ('LUASTANAH') : luastanah_armhtgl
        , ('HARGATANAH') : hargatanah_armhtgl, ('PLIKUIDASITANAH') : likuidasitanah_armhtgl, ('LUASBANGUNAN') : luasbangunan_armhtgl
        , ('HARGABANGUNAN') : hargabangunan_armhtgl, ('PLIKUIDASIBANGUNAN') : likuidasibangunan_armhtgl, ('NAMALENGKAP') : nama_lengkap
        , ('LOKASI') : lokasi_armhtgl], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/015 _SURVEY AGUNAN/0151_TAMBAH AGUNAN/0151B_SURVEY AGUNAN BANGUNAN'), 
    [('DESKRIPSI') : deskripsi_abangunan, ('KEPEMILIKAN') : kepemilikanagunan_abangunan, ('PEMILIK') : atasnama_abangunan
        , ('STATUSKEPEMILIKAN') : statuskepemilikan_abangunan, ('NOSERTIFIKAT') : nomorsertifikat_abangunan, ('TGLBUKTIKPMLIKAN') : tglbuktikepemilikan_abangunan
        , ('STATEAGUNAN') : stateangunan_abangunan, ('KETERANGAN') : keterangan_abangunan, ('ALAMATSAMA') : alamatsama_abangunan
        , ('ALAMAT') : alamat_abangunan, ('RT') : rt_abangunan, ('RW') : rw_abangunan, ('KODEPOS') : kodepos_abangunan, ('KEC') : kec_abangunan
        , ('KEL') : kel_abangunan, ('LUASBANGUNAN') : luasbangunan_abangunan, ('HARGABANGUNAN') : hargabangunan_abangunan
        , ('PLIKUIDASIBANGUNAN') : likuidasibangunan_abangunan, ('NAMALENGKAP') : nama_lengkap, ('LOKASI') : lokasi_abangunan], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/015 _SURVEY AGUNAN/0151_TAMBAH AGUNAN/0151C_SURVEY AGUNAN TANAH'), [('DESKRIPSI') : deskripsi_atanah
        , ('KEPEMILIKAN') : kepemilikanagunan_atanah, ('PEMILIK') : atasnama_atanah, ('STATUSKEPEMILIKAN') : statuskepemilikan_atanah
        , ('NOSERTIFIKAT') : nomorsertifikat_atanah, ('TGLBUKTIKPMLIKAN') : tglbuktikepemilikan_atanah, ('STATEAGUNAN') : stateangunan_atanah
        , ('KETERANGAN') : keterangan_atanah, ('ALAMATSAMA') : alamatsama_atanah, ('ALAMAT') : alamat_atanah, ('RT') : rt_atanah
        , ('RW') : rw_atanah, ('KODEPOS') : kodepos_atanah, ('KEC') : kec_atanah, ('KEL') : kel_atanah, ('LUASTANAH') : luastanah_atanah
        , ('HARGATANAH') : hargatanah_atanah, ('PLIKUIDASITANAH') : likuidasitanah_atanah, ('NAMALENGKAP') : nama_lengkap],
    FailureHandling.STOP_ON_FAILURE)


Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/015 _SURVEY AGUNAN/0151_TAMBAH AGUNAN/0151D_SURVEY AGUNAN PROPERTI KOMERSIAL'), 
    [('DESKRIPSI') : deskripsi_aproperty, ('KEPEMILIKAN') : kepemilikanagunan_aproperty, ('PEMILIK') : atasnama_aproperty
        , ('STATUSKEPEMILIKAN') : statuskepemilikan_aproperty, ('NOSERTIFIKAT') : nomorsertifikat_aproperty, ('TGLBUKTIKPMLIKAN') : tglbuktikepemilikan_aproperty
        , ('STATEAGUNAN') : stateangunan_aproperty, ('KETERANGAN') : keterangan_aproperty, ('ALAMATSAMA') : alamatsama_aproperty
        , ('ALAMAT') : alamat_aproperty, ('RT') : rt_aproperty, ('RW') : rw_aproperty, ('KODEPOS') : kodepos_aproperty, ('KEC') : kec_aproperty
        , ('KEL') : kel_aproperty, ('LUASTANAH') : luastanah_aproperty, ('HARGATANAH') : hargatanah_aproperty, ('PLIKUIDASITANAH') : likuidasitanah_aproperty
        , ('LUASBANGUNAN') : luasbangunan_aproperty, ('HARGABANGUNAN') : hargabangunan_aproperty, ('PLIKUIDASIBANGUNAN') : luasbangunan_aproperty
        , ('NAMALENGKAP') : nama_lengkap, ('LOKASI') : lokasi_aproperty], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('01_HOME/012_DATA PRAKARSA/0121_PRAKARSA/01_MIKRO/015 _SURVEY AGUNAN/0151_TAMBAH AGUNAN/0151E_SURVEY AGUNAN KENDARAAN'), 
    [('DESKRIPSI') : deskripsi_kendaraan, ('KEPEMILIKAN') : kepemilikanagunan_kendaraan, ('PEMILIK') : atasnama_kendaraan
        , ('KLASIFIKASIKENDARAAN') : klasifikasikendaraan, ('MEREKKENDARAAN') : merekkendaraan, ('JENISKENDARAAN') : jeniskendaraan
        , ('WARNAKENDARAAN') : warnakendaraan, ('TAHUNPEMBUATAN') : tahunpembuatan, ('NOMORMESIN') : nomormesin, ('NOMORCHASIS') : nomorchasis
        , ('STATEAGUNAN') : stateangunan_kendaraan, ('NOBPKB') : nobpkb_kendaraan, ('ALAMATSAMA') : alamatsama_kendaraan
        , ('ALAMAT') : alamat_kendaraan, ('RT') : rt_kendaraan, ('RW') : rw_kendaraan, ('KODEPOS') : kodepos_kendaraan, ('NILAIPASARWAJAR') : nilaipasarwajar_kendaraan
        , ('PERSENTASENILAILIKUIDASI') : persentasenilailikuidas_kendaraan, ('NAMALENGKAP') : nama_lengkap, ('TGLBPKB') : tglbuktikepemilikan_kendaraan
        , ('LOKASI') : lokasi_kendaraan], FailureHandling.STOP_ON_FAILURE)

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

