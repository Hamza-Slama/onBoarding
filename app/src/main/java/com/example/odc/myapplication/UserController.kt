package com.example.odc.myapplication

const val isFirstLaunch = "isFirstLaunch"

class UserController {

    companion object {
        fun saveUsername(username : String) {
            SharedPrefsManager.sharedPreferences.edit().putString("username", username).apply()
        }

        fun loadUsername() : String? {
            return SharedPrefsManager.sharedPreferences.getString("username", null)
        }
    }

}