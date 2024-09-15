package com.gogote.shayari

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.gogote.shayari.databinding.ActivityAddEditBinding

class AddEditActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = "Add Your Shayari "
//        setSupportActionBar(binding.toolbar)
////        supportActionBar?.setDisplayHomeAsUpEnabled(true)
////        supportActionBar?.setDisplayShowTitleEnabled(true)
//        binding.toolbar.title = "Your Title"

    }
}