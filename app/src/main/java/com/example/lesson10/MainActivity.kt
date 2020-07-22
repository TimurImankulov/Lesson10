package com.example.lesson10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var recyclerView1: RecyclerView? = null

    var category = "Природа"
    var title = "Острова"
    var description = "Остров находиться в тихом океане"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView1 = findViewById(R.id.recyclerView1)

        val list = arrayListOf<CountryExampleModel>()
        val list1 = arrayListOf<NatureExampleModel>()

        for (i in 1..10){
            list.add(CountryExampleModel("Страны тихоокеанского региона", getImageID(i)))
        }
        val adapter = CountryAdapter(list)
        recyclerView?.adapter = adapter


        for (i in 1..10){
            list1.add(NatureExampleModel(category, title, description, getImageID1(i)))
        }
        val adapter1 = NatureAdapter(list1)
        recyclerView1?.adapter = adapter1
    }

    private fun getImageID(position: Int): Int {
        val result = position % 3
        var image = 0

        when(result){
            0-> image = R.drawable.flag1
            1-> image = R.drawable.flag2
            2-> image = R.drawable.flag3
        }
        return image
    }

    private fun getImageID1(position: Int): Int {
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