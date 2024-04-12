package org.example.multi_module_cmp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import com.example.kotlin_lib.KotlinLib

/**
 * Author: Zukhriddin Kamolov
 * Date: 12-Apr-24, 11:42 PM.
 * Project: Multi-Module-CMP
 */
class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { App() }

        // Kotlin module
        val myModule = KotlinLib()
    }
}