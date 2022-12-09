package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentPlotThreeBinding


class PlotThreeFragment : Fragment() {

    lateinit var binding: FragmentPlotThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPlotThreeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{
            MAIN.navController.navigate(R.id.action_plotThreeFragment_to_plotFiveFragment)

        }
        binding.button2.setOnClickListener{
            MAIN.navController.navigate(R.id.action_plotThreeFragment_to_sceneSixFragment)

        }
    }

}