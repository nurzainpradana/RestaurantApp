package com.zainpradana.restaurantapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.zainpradana.restaurantapp.databinding.FragmentPilihMejaBinding

class PilihMejaFragment : Fragment() {

    private lateinit var binding: FragmentPilihMejaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pilih_meja, container, false)

        binding.btnMejaSatu.setOnClickListener {
            view : View ->
            view.findNavController().navigate(PilihMejaFragmentDirections.actionPilihMejaFragmentToMenuFragment(1))
        }
        binding.btnMejaDua.setOnClickListener {
            view : View ->
            view.findNavController().navigate(PilihMejaFragmentDirections.actionPilihMejaFragmentToMenuFragment(2))
        }
        binding.btnMejaTiga.setOnClickListener {
            view : View ->
            view.findNavController().navigate(PilihMejaFragmentDirections.actionPilihMejaFragmentToMenuFragment(3))
        }
        binding.btnMejaEmpat.setOnClickListener {
            view : View ->
            view.findNavController().navigate(PilihMejaFragmentDirections.actionPilihMejaFragmentToMenuFragment(4))
        }

        return binding.root
    }
}