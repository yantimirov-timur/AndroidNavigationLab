package com.yantimirov_timur.app_task5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class BlankFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank1, container, false)

        view.findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment1_to_blankFragment2)
        }

        return view
    }

}