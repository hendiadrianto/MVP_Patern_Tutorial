package com.hendi.mvp_patern_tutorial.Interface

import com.hendi.mvp_patern_tutorial.Interface.first_View
import com.hendi.mvp_patern_tutorial.Model.model_MVP

class first_Presenter_Imp (model : first_View) : first_Presenter {

    var viewModel : first_View? = null

    init {
        viewModel = model
    }

    override fun tambahData(msg: String) {
        if (msg.isNotEmpty()){

            viewModel?.success(model_MVP(msg))
        } else {
            viewModel?.error()
        }
    }

}