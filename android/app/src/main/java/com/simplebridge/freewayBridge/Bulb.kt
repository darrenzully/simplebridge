package com.simplebridge

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback

class Bulb(reactContext:ReactApplicationContext):ReactContextBaseJavaModule(reactContext) {

    private var isOn = false

    override fun getName(): String {
        return "Bulb"
    }

    @ReactMethod
    fun getStatus(successCallback:Callback) {
        successCallback.invoke(null, isOn)
    }

    @ReactMethod
    fun turnOn() {
        isOn = true
        println("Bulb is turn ON")
    }

    @ReactMethod
    fun turnOff() {
        isOn = false
        println("Bulb is turn OFF")
    }
}