package com.example.roompactice

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roompactice.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity(),RecyclerAdaptor.Click{
    lateinit var binding: ActivityMainBinding
    lateinit var recyclerAdaptor: RecyclerAdaptor
    var list= ArrayList<NotesEntity>()
    lateinit var notesDatabase: NotesDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        notesDatabase=NotesDatabase.getInstance(this)
        recyclerAdaptor=RecyclerAdaptor(list,this)
        binding.rv.adapter=recyclerAdaptor
        binding.rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        list.addAll(notesDatabase.notesInterface().get())
        binding.addItem.setOnClickListener(){
            notesDatabase.notesInterface().add(NotesEntity(title =findViewById<EditText>(R.id.name).text.toString() , description = findViewById<EditText>(R.id.subject).text.toString()))
            recyclerAdaptor.notifyDataSetChanged()
            getList()
        }


    }

    override fun update(position: Int) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_layout)
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog.show()
        dialog.findViewById<Button>(R.id.updateBtn).setOnClickListener{
            val loc = list[position].id
            notesDatabase.notesInterface().update(loc,dialog.findViewById<EditText>(R.id.tvsubject).text.toString(),dialog.findViewById<EditText>(R.id.tvdescription).text.toString())
            recyclerAdaptor.notifyDataSetChanged()
            getList()
            dialog.dismiss()
        }

    }

    override fun delete(position: Int) {
        notesDatabase.notesInterface().delete(list[position])
        recyclerAdaptor.notifyDataSetChanged()
        getList()
    }


    fun getList(){
        list.clear()
        list.addAll(notesDatabase.notesInterface().get())
    }
}

