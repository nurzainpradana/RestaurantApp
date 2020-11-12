package com.zainpradana.restaurantapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
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

        }
        Toast.makeText(context, args.product1.namaMenu.toString(), Toast.LENGTH_SHORT).show()
        return binding.root
    }
}