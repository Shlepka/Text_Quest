package com.example.textquest.firstQuest

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentMenuBinding
import com.example.textquest.databinding.FragmentMenuoneBinding
import com.example.textquest.databinding.FragmentMenutwoBinding


class MenuTwoFragment : Fragment() {

    lateinit var binding: FragmentMenutwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMenutwoBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageButton1.setOnClickListener{
            MAIN.navController.navigate(R.id.action_menuTwoFragment_to_menuThreeFragment)

        }
        binding.imageButton2.setOnClickListener{

            MAIN.navController.navigate(R.id.action_menuTwoFragment_to_menuOneFragment)
        }
        binding.button.setOnClickListener{

            Toast.makeText(context, "В разработке", Toast.LENGTH_LONG).show();
        }
        binding.imageButton5.setOnClickListener {

            val infoText: TextView = view.findViewById(R.id.infoText)
            if (infoText.getVisibility() == View.INVISIBLE) {
                infoText.setVisibility(View.VISIBLE)
            } else {
                infoText.setVisibility(View.INVISIBLE)
            }
        }
        binding.imageButton8.setOnClickListener {

            MAIN.navController.navigate(R.id.action_menuTwoFragment_to_menuFragment)
        }
        binding.imageButton7.setOnClickListener{

            val builder =  AlertDialog.Builder(this.context);
            builder.setTitle("Информация о приложении")
            builder.setMessage("Разработчик: Лавинский Степан \nДобро пожаловать в мою игру, выберите заинтересовавший вас квест " +
                    "и погрузитесь в его мир, обдумывайте каждое свое действие, так как оно будет влиять на дальнейший сюжет")
            builder.setCancelable(true)
            builder.setPositiveButton("ОК",
                { dialog, which ->

                    // Кнопка Да
                    dialog.dismiss() // Отпускает диалоговое окно

                    Log.i("Info", "--выбрали удалить")
                })

            val dialog: AlertDialog = builder.create()
            dialog.show()



        }

        }
    }


