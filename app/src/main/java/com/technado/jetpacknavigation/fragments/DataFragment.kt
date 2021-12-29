package com.technado.jetpacknavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.technado.jetpacknavigation.R

class DataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_data, container, false)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_dataFragment_to_homeFragment3)
        })

        return view
    }
}