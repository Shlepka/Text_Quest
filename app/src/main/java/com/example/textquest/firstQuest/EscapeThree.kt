package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentEscapeThreeBinding
import com.example.textquest.databinding.FragmentEscapeTwoBinding
import com.example.textquest.databinding.FragmentPlotTwoBinding


class EscapeThree : Fragment() {

    lateinit var binding: FragmentEscapeThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentEscapeThreeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{
            MAIN.navController.navigate(R.id.action_escapeThree_to_plotFourFragment)

        }
        binding.button2.setOnClickListener{
            MAIN.navController.navigate(R.id.action_escapeThree_to_screenFragment)

        }
        binding.button3.setOnClickListener{
            MAIN.navController.navigate(R.id.action_escapeThree_to_menuOneFragment)

        }
    }

}