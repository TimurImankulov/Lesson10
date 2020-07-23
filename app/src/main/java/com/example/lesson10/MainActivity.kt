package com.example.lesson10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var recyclerView1: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        setAdapterCountry()
        setAdapterNature()
    }

    private fun initView(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView1 = findViewById(R.id.recyclerView1)
    }

    private fun setAdapterCountry() {
        val list = arrayListOf<CountryExampleModel>()

        for (i in 1..10){
            list.add(CountryExampleModel("Страны тихоокеанского региона", getImageOfCountry(i)))
        }
        val adapter = CountryAdapter(list)
        recyclerView?.adapter = adapter
    }

    private fun setAdapterNature() {
        val list1 = arrayListOf<NatureExampleModel>()

        for (i in 1..10){
            list1.add(NatureExampleModel("Природа", "Острова", "Остров находиться в тихом океане", getImageOfNature(i)))
        }
        val adapter1 = NatureAdapter(list1)
        recyclerView1?.adapter = adapter1
    }

    private fun getImageOfCountry(position: Int): Int {
        val result = position % 3
        var image = 0

        when(result){
            0-> image = R.drawable.flag1
            1-> image = R.drawable.flag2
            2-> image = R.drawable.flag3
        }
        return image
    }
    
    private fun getImageOfNature(position: Int): Int {
        val result = position % 3
        var image = 0

        when(result){
            0-> image = R.drawable.island1
            1-> image = R.drawable.island2
            2-> image = R.drawable.island3
        }
        return image
    }
}