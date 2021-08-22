package com.inadev.soucs.presentation.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.lifecycle.lifecycleScope
import com.inadev.soucs.R
import com.inadev.soucs.presentation.welcome.WelcomeActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        /*lifecycleScope.launch {
            delay(1000)
            val intent = Intent(this@SplashActivity, WelcomeActivity::class.java)
            startActivity(intent)
        }*/
        val intent = Intent(this@SplashActivity, WelcomeActivity::class.java)
        startActivity(intent)
    }
}