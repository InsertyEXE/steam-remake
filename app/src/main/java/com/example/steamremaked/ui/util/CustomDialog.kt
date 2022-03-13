package com.example.steamremaked.ui.util

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.steamremaked.databinding.ActivityCustomDialogBinding

class CustomDialog(context: Context): Dialog(context) {

    private lateinit var binding: ActivityCustomDialogBinding
    private lateinit var txtButtons: Array<TextView>
    var titleDialog: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCustomDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


    fun addBotao(vararg opcoesTextos: Int, listenerClick: View.OnClickListener){

        txtButtons = Array(opcoesTextos.size){
            TextView(context)
        }

        opcoesTextos.forEachIndexed { index, texto ->
            txtButtons[index].id = texto
            txtButtons[index].setText(texto)
            txtButtons[index].setOnClickListener {
                listenerClick.onClick(it)
            }
        }
    }


    override fun setTitle(titleDialog: Int) {
        this.titleDialog = titleDialog
    }


    override fun show() {
        super.show()

        //Pegando o titulo que foi enviado para cá
        titleDialog?.let {
            binding.dialogTitle.setText(it)
        }


        for (opcoes in txtButtons){
            val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            layoutParams.setMargins(30, 50, 30, 50)

            binding.dialogLayout.addView(opcoes, layoutParams)
        }

    }

}


