package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentSceneFiveBinding


class SceneFifeFragment : Fragment() {

     lateinit var binding: FragmentSceneFiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSceneFiveBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener{
            MAIN.navController.navigate(R.id.action_sceneFifeFragment_to_plotOneFragment)

        }
    }


}