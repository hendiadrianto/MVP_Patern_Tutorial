package com.hendi.mvp_patern_tutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hendi.mvp_patern_tutorial.Interface.first_Presenter_Imp
import com.hendi.mvp_patern_tutorial.Interface.first_View
import com.hendi.mvp_patern_tutorial.Model.model_MVP
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), first_View {


    lateinit var presenterImp : first_Presenter_Imp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterImp = first_Presenter_Imp(this)

        buttonSubmit.setOnClickListener {
            presenterImp.tambahData(inputText.text.toString())
        }


    }

    override fun success(hasil: model_MVP) {
        Toast.makeText(this,hasil.toString(), Toast.LENGTH_SHORT).show()
    }

    override fun error() {
        Toast.makeText(this,"Kosong", Toast.LENGTH_SHORT).show()

    }
}
