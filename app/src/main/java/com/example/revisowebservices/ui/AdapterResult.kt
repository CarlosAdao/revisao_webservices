package com.example.revisowebservices.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.revisowebservices.R
import kotlinx.android.synthetic.main.item_result.view.*

class AdapterResult(): RecyclerView.Adapter<AdapterResult.ResultViewHolder>() {
    var listResult = ArrayList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_result, parent,false)
        return ResultViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        var item = listResult[position]
        holder.tvResult.text = item
    }

    override fun getItemCount() = listResult.size

    fun addList(list: ArrayList<String>){
        listResult.addAll(list)
        notifyDataSetChanged()
    }

    class ResultViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvResult: TextView = view.tvResult
    }
}