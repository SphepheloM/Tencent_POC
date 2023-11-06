package com.ayoba.ayoba.debug

import android.app.Application

open class OurApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }

    companion object {
        private lateinit var INSTANCE: OurApplication
        fun get() = INSTANCE
    }

}