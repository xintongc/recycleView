package com.example.zncu.recycleview.data

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.zncu.recycleview.R
import com.example.zncu.recycleview.model.Person

class PersonListAdapter (private val list: ArrayList<Person>, private val context: Context) : RecyclerView.Adapter<PersonListAdapter.ViewHolder>() {

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(person: Person) {
            var name: TextView = itemView.findViewById(R.id.name) as TextView
            var age: TextView = itemView.findViewById(R.id.age) as TextView

            name.text = person.name
            age.text = person.age.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        //create out view from out xml file
        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }
}