package com.zainpradana.restaurantapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.zainpradana.restaurantapp.databinding.FragmentHitungBinding

class HitungFragment : Fragment() {
    private lateinit var binding: FragmentHitungBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_hitung, container, false)
        val args = HitungFragmentArgs.fromBundle(requireArguments())

        binding.apply {
            productSatu = args.product1
            productDua = args.product2
            productTiga = args.product3
            total = args.total
            nomorMeja = args.nomorMeja

            if (args.product1.namaMenu == ""){
                llMenuSatu.visibility = View.GONE
            } else {
                llMenuSatu.visibility = View.VISIBLE
            }

            if (args.product2.namaMenu == ""){
                llMenuDua.visibility = View.GONE
            } else {
                llMenuDua.visibility = View.VISIBLE
            }

            if (args.product3.namaMenu == ""){
                llMenuTiga.visibility = View.GONE
            } else {
                llMenuTiga.visibility = View.VISIBLE
            }

            if (args.total == 0){
                llTotal.visibility = View.GONE
            } else {
                llTotal.visibility = View.VISIBLE
            }

            btnBackToMenu.setOnClickListener {
                view : View ->
                //view.findNavController().navigate(HitungFragmentDirections.actionHitungFragmentToMenuFragment(args.nomorMeja))
                view.findNavController().popBackStack()
            }

            btnBackToPilihMeja.setOnClickListener {
                view : View ->
                view.findNavController().navigate(HitungFragmentDirections.actionHitungFragmentToPilihMejaFragment())
            }
        }
        return binding.root
    }
}