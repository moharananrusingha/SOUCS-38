package com.inadev.soucs

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.core.app.launchActivity
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun testActivity() {
        launchActivity<MainActivity>()
    }
}