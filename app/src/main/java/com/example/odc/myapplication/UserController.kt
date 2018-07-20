package com.example.odc.myapplication

import com.example.commonlog.Logging
import com.example.commonlog.SplitEmail

const val isFirstLaunch = "isFirstLaunch"

class UserController {

    companion object {
        fun saveUsername(username : String) {
            SharedPrefsManager.sharedPreferences.edit().putString("username", username).apply()
        }

        fun loadUsername() : String? {
            return SharedPrefsManager.sharedPreferences.getString("username", null)
            Logging.logged("hamza")
            SplitEmail.splitEmail("hamza@gmail.com")
        }
    }

}