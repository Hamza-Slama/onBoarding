package com.example.odc.myapplication

import android.content.Context
import android.content.SharedPreferences

class SharedPrefsManager {

        companion object Factory {
            lateinit var sharedPreferences : SharedPreferences
            fun  create(context: Context) {
                sharedPreferences = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
            }
        }


}