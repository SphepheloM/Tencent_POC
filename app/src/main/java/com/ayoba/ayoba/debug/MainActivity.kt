package com.ayoba.ayoba.debug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayoba.ayoba.debug.databinding.ActivityMainBinding
import com.tencent.tmf.mini.api.TmfMiniSDK
import com.tencent.tmf.mini.api.bean.MiniApp
import com.tencent.tmf.mini.api.bean.MiniScene
import com.tencent.tmf.mini.api.bean.MiniStartOptions

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { starApplet() }

    }

    private fun starApplet() {
        TmfMiniSDK.startMiniApp(
            this,
            "tmf3z0jbp2yejcjvzz",
            MiniScene.LAUNCH_SCENE_SEARCH,
            MiniApp.TYPE_ONLINE,
            MiniStartOptions()
        )
    }
}