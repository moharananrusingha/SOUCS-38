package com.inadev.soucs.presentation.tilesorting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inadev.soucs.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InclusionTilesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inclusion_tiles)
    }
}