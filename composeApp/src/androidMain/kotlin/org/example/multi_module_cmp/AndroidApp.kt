package org.example.multi_module_cmp


import android.app.Application
import android.content.Intent
import android.net.Uri

class AndroidApp : Application() {
    companion object {
        lateinit var INSTANCE: AndroidApp
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}
