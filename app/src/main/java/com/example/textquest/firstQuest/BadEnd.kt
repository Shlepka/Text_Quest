package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentBadEndBinding
import com.example.textquest.databinding.FragmentEndShipBinding
import com.example.textquest.databinding.FragmentEscapeFiveBinding
import com.example.textquest.databinding.FragmentEscapeFourBinding
import com.example.textquest.databinding.FragmentEscapeThreeBinding
import com.example.textquest.databinding.FragmentEscapeTwoBinding
import com.example.textquest.databinding.FragmentHelpFiveBinding
import com.example.textquest.databinding.FragmentHelpOneBinding
import com.example.textquest.databinding.FragmentHelpSixBinding
import com.example.textquest.databinding.FragmentPlotTwoBinding
import com.example.textquest.databinding.FragmentSalvationFourBinding
import com.example.textquest.databinding.FragmentSalvationOneBinding
import com.example.textquest.databinding.FragmentSalvationThreeBinding
import com.example.textquest.databinding.FragmentSalvationTwoBinding


class BadEnd : Fragment() {

    lateinit var binding: FragmentBadEndBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBadEndBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{
            MAIN.navController.navigate(R.id.action_badEnd_to_salvationOne)
        }
        binding.button2.setOnClickListener{
            MAIN.navController.navigate(R.id.action_badEnd_to_screenFragment)

        }
        binding.button3.setOnClickListener{
            MAIN.navController.navigate(R.id.action_badEnd_to_menuOneFragment)

        }

        }
    }

