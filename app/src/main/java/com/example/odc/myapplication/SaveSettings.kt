package com.example.odc.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences


class SaveSettings{
    var context: Context?=null
    var sharedRef: SharedPreferences?=null
    constructor(context:Context){
        this.context=context
        sharedRef=context.getSharedPreferences("myRef",Context.MODE_PRIVATE)
    }

    fun saveSettings(){
        val editor=sharedRef!!.edit()
        editor.putBoolean("isFirstLaunch",true)
        editor.commit()
        loadSettings()
    }

    fun loadSettings(){
        isFirstLaunch= sharedRef!!.getBoolean("isFirstLaunch",false)

        if (isFirstLaunch==false){
            val intent = Intent(context, TutorialActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            isFirstLaunch = true
            context!!.startActivity(intent)
        }
    }


    companion object {
         var isFirstLaunch : Boolean ?=null
    }
}