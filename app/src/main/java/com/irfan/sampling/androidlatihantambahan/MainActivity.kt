package com.irfan.sampling.androidlatihantambahan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.irfan.sampling.androidlatihantambahan.activitiesAnimation.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recylcerview = findViewById<RecyclerView>(R.id.recycler_view)
        recylcerview.layoutManager = LinearLayoutManager(this)

        val items = ArrayList<RocketAnimationItem>()

        items.add(RocketAnimationItem("Lepas Landas",
            Intent(this, LaunchRocketValue::class.java)))
        items.add(RocketAnimationItem("Rocket Muter",
            Intent(this, RocketMuter::class.java)))
        items.add(RocketAnimationItem("Rocket Tambah Cepet",
            Intent(this, RocketTambahCepet::class.java)))
        items.add(RocketAnimationItem("Objek Lepas Landas",
            Intent(this, LaunchRocketObject::class.java)))
        items.add(RocketAnimationItem("Mainin Background",
            Intent(this, MaininBackground::class.java)))
        items.add(RocketAnimationItem("Muter Ngegas",
            Intent(this, MuterNgegas::class.java)))
        items.add(RocketAnimationItem("Muter Ngegas Versi 2",
            Intent(this, MuterNgegasV2::class.java)))
        items.add(RocketAnimationItem("Terbang Bareng",
            Intent(this, TerbangBareng::class.java)))
        items.add(RocketAnimationItem("With Listener",
            Intent(this, WithListener::class.java)))
        items.add(RocketAnimationItem("Ada yang kelupaan",
            Intent(this, MajuMundurCantik::class.java)))
        items.add(RocketAnimationItem("Kedip Kedip",
            Intent(this, MenggunakanXML::class.java)))
        recylcerview.adapter = RocketAdapter(this, items)
    }
}

//https://techdai.info/animation-in-android-with-kotlin/
//TugasAndroidAnimation
//push github
