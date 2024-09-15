package com.gogote.shayari

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.gogote.shayari.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    private var shayariList= ArrayList<DataEntity>()

    private val rvAdapter by lazy {
        RvAdapter(this,shayariList)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shayariList.addAll(SampleData.data)
        binding.rvView.layoutManager = LinearLayoutManager(this)
        binding.rvView.adapter = rvAdapter
        rvAdapter.notifyDataSetChanged()


        binding.fab.setOnClickListener { view ->
           startActivity(Intent(this, AddEditActivity::class.java))



        }


    }






}