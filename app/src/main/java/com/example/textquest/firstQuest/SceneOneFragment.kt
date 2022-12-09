package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentSceneOneBinding


class SceneOneFragment : Fragment() {

  lateinit var binding: FragmentSceneOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSceneOneBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{
            MAIN.navController.navigate(R.id.action_sceneOneFragment_to_sceneTriFragment)

        }
        binding.button1.setOnClickListener{
            MAIN.navController.navigate(R.id.action_sceneOneFragment_to_sceneFourFragment)

        }
    }


    }
