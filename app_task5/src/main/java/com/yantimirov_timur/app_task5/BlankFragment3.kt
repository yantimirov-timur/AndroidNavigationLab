package com.yantimirov_timur.app_task5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class BlankFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank3, container, false)

        view.findViewById<Button>(R.id.toFirstFragment).setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment3_to_blankFragment1)
        }
        view.findViewById<Button>(R.id.toSecondFragment).setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment3_to_blankFragment2)
        }

        // Inflate the layout for this fragment
        return view
    }


}