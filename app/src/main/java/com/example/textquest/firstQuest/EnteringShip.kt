package com.example.textquest.firstQuest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.textquest.R
import androidx.fragment.app.Fragment
import com.example.textquest.MAIN
import com.example.textquest.databinding.FragmentEnteringShipBinding


class EnteringShip : Fragment() {

    lateinit var binding: FragmentEnteringShipBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentEnteringShipBinding.inflate(layoutInflater,container,false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val password = view.findViewById<EditText>(R.id.password)
        val btn_pas = view.findViewById<Button>(R.id.button2)
        binding.button.setOnClickListener{




            if (password.getText().toString().equals("11201"))
            {
                MAIN.navController.navigate(R.id.action_enteringShip_to_passwordInput)
            }
            else
            {
                Toast.makeText(context, "Пароль неккоректен", Toast.LENGTH_LONG).show();
                btn_pas.setVisibility(View.VISIBLE)

            }


        }
        binding.button2.setOnClickListener{
            val text = view.findViewById<TextView>(R.id.textView)


            text.setText("Видимо, необходимо ввести числа, которое мне недавно сообщило наше командование...На сколько я помню это было: \n 11201\n")
            btn_pas.setVisibility(View.INVISIBLE)


        }

    }

}