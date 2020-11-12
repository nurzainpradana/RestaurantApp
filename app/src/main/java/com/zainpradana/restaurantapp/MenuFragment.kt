package com.zainpradana.restaurantapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.zainpradana.restaurantapp.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentMenuBinding>(inflater, R.layout.fragment_menu, container, false)

        val args = MenuFragmentArgs.fromBundle(requireArguments())
        binding.nomorMeja = args.nomorMeja


        return binding.root
    }
}
