package com.example.stockmoney

import android.os.Bundle
import android.util.Log
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity


class Guest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)

        val search = findViewById<AutoCompleteTextView>(R.id.searchBarOfMain)

        val names = arrayListOf(
            "Android",
            "java",
            "TATA",
            "RELIANCE",
            "BIRLA",
            "TATA motors",
            "TATA STEEL",
            "JIO",
            "ACC"
        )
        val adapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        search.setAdapter(adapter)

//        Log.d("Check","${}")

        search.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            Log.d(
                "Check",
                search.text.toString()
            )
        }
    }
}