package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var cafeAmasya: CafeAmasya
    @Inject
    lateinit var cooker: Cooker
    @Inject
    lateinit var barmen: Barmen
    @Inject
    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println(cafeAmasya.myFunction())
        println(cafeAmasya.secondfunciton())




    }
}
