package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentEscapeFiveBinding
import com.example.textquest.databinding.FragmentEscapeFourBinding
import com.example.textquest.databinding.FragmentEscapeThreeBinding
import com.example.textquest.databinding.FragmentEscapeTwoBinding
import com.example.textquest.databinding.FragmentHelpOneBinding
import com.example.textquest.databinding.FragmentPlotTwoBinding
import com.example.textquest.databinding.FragmentSalvationFourBinding
import com.example.textquest.databinding.FragmentSalvationOneBinding
import com.example.textquest.databinding.FragmentSalvationThreeBinding
import com.example.textquest.databinding.FragmentSalvationTwoBinding
import com.example.textquest.databinding.FragmentTestFiveBinding
import com.example.textquest.databinding.FragmentTestOneBinding


class TestFive : Fragment() {

    lateinit var binding: FragmentTestFiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTestFiveBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {


//            if (arguments?.getString("Fon") != null)
//            {
//                MAIN.navController.navigate(R.id.action_testFive_to_testSev)
//            }
//            else
//            {
//                Toast.makeText(context, "Нет фонарика", Toast.LENGTH_LONG).show();
//            }
//
//
//        }
//        binding.button2.setOnClickListener{
//
//            MAIN.navController.navigate(R.id.action_testFive_to_testSix)
//        }

        }


    }
}