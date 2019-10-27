package com.redudant.basicmvpkotlin.presenter

import com.redudant.basicmvpkotlin.model.Data

//creat new class
//setelah membuat interface tambahkan val mainView: MainView
class MainPresenter(val mainView: MainView){

    //new fun
    //membuat fungsi untuk menghitung bilangan yang ada di view
    fun hitung(numbOne : Int, numbTwo : Int){

        //buat variable baru
        val hasil = numbOne + numbTwo

        //buat variable baru dan panggil class Model
        val model = Data()

        //panggil variable dataHasil
        model.dataHasil = hasil
        mainView.hasilPresenter(model)
    }
}