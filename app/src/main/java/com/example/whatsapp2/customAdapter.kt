package com.example.whatsapp2

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class customAdapter(val context: Context,val dataList: List<dataModel>):BaseAdapter() {
    override fun getCount(): Int {
    return dataList.size
    }

    override fun getItem(p0: Int): Any {
    return dataList[p0]
    }

    override fun getItemId(p0: Int): Long {
    return p0.toLong()
    }

    @SuppressLint("ViewHolder","MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val rowview=LayoutInflater.from(context).inflate(R.layout.list,p2,false)

        val data=dataList[p0]
        val image=rowview.findViewById<ImageView>(R.id.image)
        val name=rowview.findViewById<TextView>(R.id.name)
        val desc=rowview.findViewById<TextView>(R.id.desc)

       Glide.with(context).load(data.image).into(image)
        name.setText(data.name)
        desc.setText(data.desc)

        return rowview

    }
}