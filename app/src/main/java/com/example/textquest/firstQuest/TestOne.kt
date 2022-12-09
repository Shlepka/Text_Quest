package com.example.textquest.firstQuest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.example.textquest.R
import androidx.fragment.app.Fragment
import com.example.textquest.MAIN
import com.example.textquest.databinding.FragmentTestOneBinding


class TestOne : Fragment() {

    lateinit var binding: FragmentTestOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTestOneBinding.inflate(layoutInflater,container,false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val password = view.findViewById<EditText>(R.id.password)
//        binding.button.setOnClickListener{
//
//            if (password.getText().toString().equals("123"))
//            {
//                MAIN.navController.navigate(R.id.action_testOne_to_testTwo)
//            }
//            else
//            {
//                Toast.makeText(context, "Пароль неверен", Toast.LENGTH_LONG).show();
//            }
//
//
//        }
    }

}