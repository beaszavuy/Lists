package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.model.Lista
import javax.xml.transform.Templates

class ListaAdapter(
    private val context: Context,
    private val dataSource: ArrayList<Lista>):BaseAdapter(){

    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(index: Int): Lista {
        return dataSource[index]
    }

    override fun getItemId(index: Int): Long {
        return dataSource[index].id.toLong()
    }

    override fun getView(index: Int, existingTemplates: View?, elementGroup: ViewGroup?): View {
        val rowView = existingTemplates?:inflater.inflate(R.layout.activity_list_element, elementGroup, false)

        val titleRef = rowView.findViewById<TextView>(R.id.titleList)
        titleRef.text = getItem(index).title

        val descriptionRef = rowView.findViewById<TextView>(R.id.descriptionList)
        descriptionRef.text = getItem(index).description

        val pretRef = rowView.findViewById<TextView>(R.id.pretList)
        pretRef.text = getItem(index).pret.toString()+""+getItem(index).valuta

        return rowView
    }

}

