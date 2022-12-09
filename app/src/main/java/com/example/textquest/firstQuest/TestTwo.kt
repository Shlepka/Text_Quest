package com.example.textquest.firstQuest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentTestTwoBinding


class TestTwo : Fragment() {

    lateinit var binding: FragmentTestTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTestTwoBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val bundle = Bundle()
//        bundle.putString("Fon", "Fon")
//
//
//        binding.button.setOnClickListener{
//
//
//            MAIN.navController.navigate(R.id.action_testTwo_to_testThree,bundle)
//
//        }
//        binding.button2.setOnClickListener{
//            MAIN.navController.navigate(R.id.action_testTwo_to_testThree)
//
//        }
    }

}