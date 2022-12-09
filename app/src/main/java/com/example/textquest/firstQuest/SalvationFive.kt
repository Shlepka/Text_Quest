package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentEscapeFiveBinding
import com.example.textquest.databinding.FragmentEscapeFourBinding
import com.example.textquest.databinding.FragmentEscapeThreeBinding
import com.example.textquest.databinding.FragmentEscapeTwoBinding
import com.example.textquest.databinding.FragmentPlotTwoBinding
import com.example.textquest.databinding.FragmentSalvationFiveBinding
import com.example.textquest.databinding.FragmentSalvationFourBinding
import com.example.textquest.databinding.FragmentSalvationOneBinding
import com.example.textquest.databinding.FragmentSalvationThreeBinding
import com.example.textquest.databinding.FragmentSalvationTwoBinding


class SalvationFive : Fragment() {

    lateinit var binding: FragmentSalvationFiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSalvationFiveBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{
            MAIN.navController.navigate(R.id.action_salvationFive_to_helpOne)

        }
    }

}