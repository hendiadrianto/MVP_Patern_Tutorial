package com.hendi.mvp_patern_tutorial.Interface

import com.hendi.mvp_patern_tutorial.Model.model_MVP

interface first_View {
    fun success (hasil : model_MVP)
    fun error()
}