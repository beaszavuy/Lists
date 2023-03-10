package com.example.myapplication.model

import com.example.myapplication.R

class GetLista {
    fun now(): ArrayList<Lista> {
        val response = ArrayList<Lista>();

        response.add(Lista(1, R.drawable.ic_launcher_foreground, "2 kilograme", 20, "lei","something"))
        response.add(Lista(2,  R.drawable.ic_launcher_foreground, "1 kilograme", 15, "lei","something"))
        response.add(Lista(3,  R.drawable.ic_launcher_foreground, "3 bucati", 21, "lei","something"))

        return response
    }
}