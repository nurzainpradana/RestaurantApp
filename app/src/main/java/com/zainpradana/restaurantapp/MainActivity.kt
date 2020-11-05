package com.zainpradana.restaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nomorMeja: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun pesanMejaSatu(view: View) {
        pesan(1)
    }
    fun pesanMejaDua(view: View) {
        pesan(2)
    }
    fun pesanMejaTiga(view: View) {
        pesan(3)
    }
    fun pesanMejaEmpat(view: View) {
        pesan(4)
    }

    fun pesan(nomorMejaKlik: Int){
        // sembunyikan layout pilih meja & tampilkan layout menu
        layout_pilih_meja.visibility = View.GONE
        layout_menu.visibility = View.VISIBLE

        // Simpan Nomor Meja Pesanan
        nomorMeja = nomorMejaKlik

        // Tampil Nomor Meja Ke TextView
        tv_pesanan_meja.text = "Pesanan Meja $nomorMeja"
    }

    fun hitung(view: View) {
        // sembunyikan layout menu & tampilkan layout hitung
        layout_menu.visibility = View.GONE
        layout_hitung.visibility = View.VISIBLE

        tv_pesanan_meja_nomor.text = "Meja $nomorMeja"

        var total = 0

        // Mengambil data dari layout menu
        if (et_nama_menu_satu.text.toString() != "" || et_harga_menu_satu.text.toString() != "" || et_jumlah_menu_satu.text.toString() != ""){
            var namaMenuSatu = et_nama_menu_satu.text.toString()
            var hargaMenuSatu = et_harga_menu_satu.text.toString().toInt()
            var jumlahMenuSatu = et_jumlah_menu_satu.text.toString().toInt()
            var subTotalMenuSatu: Int = hargaMenuSatu * jumlahMenuSatu
            total += subTotalMenuSatu

            // Menampilkan layout menu 1
            ll_menu_satu.visibility = View.VISIBLE

            // Menampilkan Nama Menu 1 dan subtotal menu 1
            tv_nama_menu_satu.text = namaMenuSatu
            tv_subtotal_menu_satu.text = subTotalMenuSatu.toString()
        } else {
            ll_menu_satu.visibility = View.GONE
        }

        if (et_nama_menu_dua.text.toString() != "" || et_harga_menu_dua.text.toString() != "" || et_jumlah_menu_dua.text.toString() != ""){
            var namaMenuDua = et_nama_menu_dua.text.toString()
            var hargaMenuDua = et_harga_menu_dua.text.toString().toInt()
            var jumlahMenuDua = et_jumlah_menu_dua.text.toString().toInt()
            var subTotalMenuDua: Int = hargaMenuDua * jumlahMenuDua
            total += subTotalMenuDua

            // Menampilkan layout menu 1
            ll_menu_dua.visibility = View.VISIBLE

            // Menampilkan Nama Menu 1 dan subtotal menu 1
            tv_nama_menu_dua.text = namaMenuDua
            tv_subtotal_menu_dua.text = subTotalMenuDua.toString()
        } else {
            ll_menu_dua.visibility = View.GONE
        }

        if (et_nama_menu_tiga.text.toString() != "" || et_harga_menu_tiga.text.toString() != "" || et_jumlah_menu_tiga.text.toString() != ""){
            var namaMenuTiga = et_nama_menu_tiga.text.toString()
            var hargaMenuTiga = et_harga_menu_tiga.text.toString().toInt()
            var jumlahMenuTiga = et_jumlah_menu_tiga.text.toString().toInt()
            var subTotalMenuTiga: Int = hargaMenuTiga * jumlahMenuTiga
            total += subTotalMenuTiga

            // Menampilkan layout menu 1
            ll_menu_tiga.visibility = View.VISIBLE

            // Menampilkan Nama Menu 1 dan subtotal menu 1
            tv_nama_menu_tiga.text = namaMenuTiga
            tv_subtotal_menu_tiga.text = subTotalMenuTiga.toString()
        } else {
            ll_menu_tiga.visibility = View.GONE
        }

        if (total > 0){
            ll_total.visibility = View.VISIBLE
            tv_total.text = total.toString()
        } else {
            ll_total.visibility = View.GONE
        }

    }

    fun backToPilihMeja(view: View) {
        layout_hitung.visibility = View.GONE
        layout_pilih_meja.visibility = View.VISIBLE
    }
    fun backToMenu(view: View) {
        layout_hitung.visibility = View.GONE
        layout_menu.visibility = View.VISIBLE
    }
}