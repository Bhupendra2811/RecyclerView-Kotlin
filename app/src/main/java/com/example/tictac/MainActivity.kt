package com.example.tictac

import android.content.AbstractThreadedSyncAdapter
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tictac.databinding.ActivityMainBinding

val  countries = arrayOf(Country("ar","Argentina","Buenous aires",R.drawable.ar1),
    Country("us","United States of America","Washington D.C",R.drawable.us),
Country("in","India0","Delhi",R.drawable.`in`))
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countryList = findViewById<RecyclerView>(R.id.country_list).apply{
            layoutManager = LinearLayoutManager(this@MainActivity)


            adapter = CountryAdapter()
            setHasFixedSize(true)
        }

        val showCountries = findViewById<Button>(R.id.show_countries)
         showCountries.setOnClickListener{
             (countryList.adapter as CountryAdapter).countryData = countries
         }
    }
}