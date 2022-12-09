package com.example.textquest.firstQuest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMenuBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageButton.setOnClickListener{
            MAIN.navController.navigate(R.id.action_menuFragment_to_menuOneFragment)

        }
        binding.imageButton3.setOnClickListener{

            MAIN.navController.navigate(R.id.action_menuFragment_to_menuThreeFragment)
        }
        binding.imageButton4.setOnClickListener{

            MAIN.navController.navigate(R.id.action_menuFragment_to_menuTwoFragment)
        }


        }
    }


