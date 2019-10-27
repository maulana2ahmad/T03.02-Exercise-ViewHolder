package com.redudant.basicmvpkotlin.presenter

import com.redudant.basicmvpkotlin.model.Data

interface MainView {

    //interface ini menghubungkan antara view dengan presenter
    //panggil class model
    fun  hasilPresenter(data: Data)
}