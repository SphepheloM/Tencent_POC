package com.ayoba.ayoba.debug

import android.app.Application
import com.tencent.tmf.mini.api.bean.MiniInitConfig
import com.tencent.tmf.mini.api.proxy.MiniConfigProxy
import com.tencent.tmfmini.sdk.annotation.ProxyService

@ProxyService(proxy = MiniConfigProxy::class)
class MiniConfigProxyImpl : MiniConfigProxy() {
    override fun getApp(): Application {
        return OurApplication.get()
    }

    override fun buildConfig(): MiniInitConfig {
        val builder = MiniInitConfig.Builder()
        return  builder
            .configAssetName("tmf-android-configurations.json")
            .imei("IMEI")
            .debug(true)
            .verifyPkg(false)
            .build()
    }
}