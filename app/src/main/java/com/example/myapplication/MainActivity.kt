package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView
import com.example.myapplication.adapter.ListaAdapter
import com.example.myapplication.model.GetLista

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listViewRef =findViewById<ListView>(R.id.listView)
        var listAdapter = ListaAdapter(this, GetLista().now())

        listViewRef.adapter = listAdapter
    }
}
