package com.zainpradana.restaurantapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.zainpradana.restaurantapp.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding
    lateinit var productSatu: Product
    lateinit var productDua: Product
    lateinit var productTiga: Product
    private var total = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container, false)
        binding.apply {
            val args = MenuFragmentArgs.fromBundle(requireArguments())
            nomorMeja = args.nomorMeja

            btnHitung.setOnClickListener { view : View ->
                ambilData(binding)
                view.findNavController().navigate(MenuFragmentDirections.actionMenuFragmentToHitungFragment(productSatu, productDua, productTiga, args.nomorMeja, total))

            }
            return binding.root
        }
    }

    private fun ambilData(binding: FragmentMenuBinding) {
        total = 0
        productSatu = Product()
        productDua = Product()
        productTiga = Product()

        binding.apply {
            if (etNamaMenuSatu.text.toString() != "" && etJumlahMenuSatu.text.toString() != "" && etHargaMenuSatu.text.toString() != "" ) {
                productSatu.namaMenu = etNamaMenuSatu.text.toString()
                productSatu.hargaMenu = etHargaMenuSatu.text.toString().toInt()
                productSatu.jumlahMenu = etJumlahMenuSatu.text.toString().toInt()
                total += productSatu.subtotal
            }
            if (etNamaMenuDua.text.toString() != "" && etJumlahMenuDua.text.toString() != "" && etHargaMenuDua.text.toString() != "" ) {
                productDua.namaMenu = etNamaMenuDua.text.toString()
                productDua.hargaMenu = etHargaMenuDua.text.toString().toInt()
                productDua.jumlahMenu = etJumlahMenuDua.text.toString().toInt()
                total += productDua.subtotal
            }
            if (etNamaMenuTiga.text.toString() != "" && etJumlahMenuTiga.text.toString() != ""  && etHargaMenuTiga.text.toString() != "" ) {
                productTiga.namaMenu = etNamaMenuTiga.text.toString()
                productTiga.hargaMenu = etHargaMenuTiga.text.toString().toInt()
                productTiga.jumlahMenu = etJumlahMenuTiga.text.toString().toInt()
                total += productTiga.subtotal
            }
        }
    }
}
