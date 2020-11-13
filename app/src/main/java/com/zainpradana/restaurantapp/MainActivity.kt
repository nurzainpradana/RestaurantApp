package com.zainpradana.restaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.zainpradana.restaurantapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private var total: Int? = 0
    private var nomorMeja: Int = 0

    private val productSatu : Product = Product()
    private val productDua : Product = Product()
    private val productTiga : Product = Product()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //val navController = this.findNavController(R.id.myNavHostFragment)
        /*
        binding.productSatu = productSatu
        binding.productDua = productDua
        binding.productTiga = productTiga
        binding.total = total
         */

    }

/*
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
        binding.apply {
            layoutPilihMeja.visibility = View.GONE
            layoutMenu.visibility = View.VISIBLE


            // Simpan Nomor Meja Pesanan
            nomorMeja = nomorMejaKlik
            tvPesananMeja.text = "Meja - $nomorMeja"
            invalidateAll()
        }
    }

    fun hitung(view: View) {
        // sembunyikan layout menu & tampilkan layout hitung
        binding.apply {
            layoutMenu.visibility = View.GONE
            layoutHitung.visibility = View.VISIBLE
            tvPesananMejaNomor.text = "Meja $nomorMeja"

            // Mengambil data dari layout menu
            if (etNamaMenuSatu.text.toString() != "" || etHargaMenuSatu.text.toString() != "" || etJumlahMenuSatu.text.toString() != "") {
                productSatu?.namaMenu = etNamaMenuSatu.text.toString()
                productSatu?.hargaMenu = etHargaMenuSatu.text.toString().toInt()
                productSatu?.jumlahMenu = etJumlahMenuSatu.text.toString().toInt()

                total = total?.
                plus(productSatu?.subtotal!!)

                // Menampilkan layout menu 1
                llMenuSatu.visibility = View.VISIBLE
            } else {
                llMenuSatu.visibility = View.GONE
            }

            if (etNamaMenuDua.text.toString() != "" || etHargaMenuDua.text.toString() != "" || etJumlahMenuTiga.text.toString() != "") {
                productDua?.namaMenu = etNamaMenuDua.text.toString()
                productDua?.hargaMenu = etHargaMenuDua.text.toString().toInt()
                productDua?.jumlahMenu = etJumlahMenuDua.text.toString().toInt()

                total = total?.plus(productDua?.subtotal!!)

                // Menampilkan layout menu 1
                llMenuDua.visibility = View.VISIBLE
            } else {
                llMenuDua.visibility = View.GONE
            }

            if (etNamaMenuTiga.text.toString() != "" || etHargaMenuTiga.text.toString() != "" || etJumlahMenuTiga.text.toString() != "") {
                productTiga?.namaMenu = etNamaMenuTiga.text.toString()
                productTiga?.hargaMenu = etHargaMenuTiga.text.toString().toInt()
                productTiga?.jumlahMenu = etJumlahMenuTiga.text.toString().toInt()

                total = total?.plus(productTiga?.subtotal!!)

                // Menampilkan layout menu 1
                llMenuTiga.visibility = View.VISIBLE
            } else {
                llMenuTiga.visibility = View.GONE
            }

            if (total != 0) {
                llTotal.visibility = View.VISIBLE
            } else {
                llTotal.visibility = View.GONE
            }
            invalidateAll()
        }
    }

    fun backToPilihMeja(view: View) {
        binding.apply {
            layoutHitung.visibility = View.GONE
            layoutPilihMeja.visibility = View.VISIBLE

            etNamaMenuSatu.text.clear()
            etHargaMenuSatu.text.clear()
            etJumlahMenuSatu.text.clear()

            etNamaMenuDua.text.clear()
            etHargaMenuDua.text.clear()
            etJumlahMenuDua.text.clear()

            etNamaMenuTiga.text.clear()
            etHargaMenuTiga.text.clear()
            etJumlahMenuTiga.text.clear()

            total = 0
        }
    }
    fun backToMenu(view: View) {
        binding.apply {
            layoutHitung.visibility = View.GONE
            layoutMenu.visibility = View.VISIBLE

            total = 0
        }
    }

 */
}