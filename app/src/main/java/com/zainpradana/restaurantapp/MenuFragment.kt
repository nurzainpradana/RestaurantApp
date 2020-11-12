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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding.apply {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container, false)

            val args = MenuFragmentArgs.fromBundle(requireArguments())
            nomorMeja = args.nomorMeja

            btnHitung.setOnClickListener { view : View ->
                ambilData(binding)
                view.findNavController().navigate(MenuFragmentDirections.actionMenuFragmentToHitungFragment(productSatu, productDua, productTiga, nomorMeja))
            }
            return binding.root
        }
    }

    private fun ambilData(binding: FragmentMenuBinding) {
        binding.apply {
            if (etNamaMenuSatu.text.isNotEmpty() || etJumlahMenuSatu.text.isNotEmpty() || etHargaMenuSatu.text.isNotEmpty()) {
                productSatu.namaMenu = etNamaMenuSatu.text.toString()
                productSatu.hargaMenu = etHargaMenuSatu.text.toString().toInt()
                productSatu.jumlahMenu = etJumlahMenuSatu.text.toString().toInt()
            }
            if (etNamaMenuDua.text.isNotEmpty() || etJumlahMenuDua.text.isNotEmpty() || etHargaMenuDua.text.isNotEmpty()) {
                productDua.namaMenu = etNamaMenuDua.text.toString()
                productDua.hargaMenu = etHargaMenuDua.text.toString().toInt()
                productDua.jumlahMenu = etJumlahMenuDua.text.toString().toInt()
            }
            if (etNamaMenuTiga.text.isNotEmpty() || etJumlahMenuTiga.text.isNotEmpty() || etHargaMenuTiga.text.isNotEmpty()) {
                productTiga.namaMenu = etNamaMenuTiga.text.toString()
                productTiga.hargaMenu = etHargaMenuTiga.text.toString().toInt()
                productTiga.jumlahMenu = etJumlahMenuTiga.text.toString().toInt()
            }
        }
    }
}
