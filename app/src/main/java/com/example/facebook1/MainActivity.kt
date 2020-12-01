package com.example.facebook1

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import java.security.AccessControlContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listview)
        val redColor = Color.parseColor("#FF0000")
        listView.setBackgroundColor(redColor)

        listView.adapter = MyCustomAdapater(this) // custom adapter
    }

    private class MyCustomAdapater (context: Context): BaseAdapter() {

        private val mContext: Context
        init {
            mContext = context
        }

        //how many rows in my list
        override fun getCount(): Int {
            return 5
        }

        //ignore
        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        //ignore
        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        //rendering out each row
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "This is my listview"
            return textView
        }
    }
}