package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentPasswordInputBinding
import com.example.textquest.databinding.FragmentSceneTriBinding


class PasswordInput : Fragment() {  //    Handler(Looper.getMainLooper()).postDelayed({
                                        //view?.findNavController()?.navigate(R.id.beginningFragment)


//},3000)

    lateinit var binding: FragmentPasswordInputBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPasswordInputBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener{
            MAIN.navController.navigate(R.id.action_passwordInput_to_plotOneFragment)

        }
        binding.button3.setOnClickListener{
            MAIN.navController.navigate(R.id.action_passwordInput_to_sceneFifeFragment)

        }

    }


}