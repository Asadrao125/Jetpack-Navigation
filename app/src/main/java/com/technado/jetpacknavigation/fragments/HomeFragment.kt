package com.technado.jetpacknavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.technado.jetpacknavigation.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =   inflater.inflate(R.layout.fragment_home, container, false)

        val button = view.findViewById<Button>(R.id.btnData)
        val btnPhoto = view.findViewById<Button>(R.id.btnPhoto)

        button.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_dataFragment)
        })

        btnPhoto.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_photoFragment)
        })

        return view
    }
}