package com.example.superrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superrecycler.adapter.paisAdapter
import com.example.superrecycler.modelo.pais
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    var miRecycler:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.myrecycler)
        val listaPaises = ArrayList<pais>()

        listaPaises.add(pais("Mexico", "https://www.google.com/search?q=mexico&sxsrf=ALeKk00a6ZSKv9F0VYwkZLMNzrgmuyD59Q:1605744882589&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj_gs7qqY3tAhUCPa0KHeeYAOEQ_AUoAnoECCgQBA&biw=1366&bih=657#imgrc=FpN3Gw-xtEHbeM"))
        listaPaises.add(pais("Francia", "https://bit.ly/2HeSp09"))
        listaPaises.add(pais("USA", "https://bit.ly/3lWoBo0"))

        miRecycler!!.layoutManager = GridLayoutManager(this, 1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter = paisAdapter(listaPaises,this)




    }
}