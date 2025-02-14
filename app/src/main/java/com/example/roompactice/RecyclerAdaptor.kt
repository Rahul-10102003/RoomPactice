package com.example.roompactice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdaptor(var list : ArrayList<NotesEntity>, var listinterface : Click):RecyclerView.Adapter<RecyclerAdaptor.Viewholder>(){

    class Viewholder (var view: View):RecyclerView.ViewHolder(view){
        var roll = view.findViewById<TextView>(R.id.setroll)
        var name = view.findViewById<TextView>(R.id.setname)
        var subject = view.findViewById<TextView>(R.id.setsubject)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return Viewholder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.apply{
            roll.text=list[position].id.toString()
            name.text = list[position].title
            subject.text = list[position].description
            view.setOnClickListener(){
                listinterface.update(position)
            }
            view.setOnLongClickListener(){
                listinterface.delete(position)
                return@setOnLongClickListener true
            }

        }
    }

    interface Click{
        fun update(position : Int)
        fun delete(position: Int)
    }
}