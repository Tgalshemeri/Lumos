package com.elmaravilla.lumos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import java.util.Calendar

class Lumos {


//// Turn ON Dark Mode.
    fun setDarkON(activity: AppCompatActivity) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        activity.delegate.applyDayNight()
    }

    // Turn OFF Dark Mode.
    fun setDarkOFF(activity: AppCompatActivity) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        activity.delegate.applyDayNight()
    }


    // Turn ON Dark Mode at range of Time.
    fun setDarkSchedule(activity: AppCompatActivity, startHour:Int , endHour:Int ) {
        val cal = Calendar.getInstance()
        val nowHour = cal.get(Calendar.HOUR_OF_DAY)
        if (startHour < endHour) {
            //Same Day
            if (nowHour in startHour until endHour){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                activity.delegate.applyDayNight()
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                activity.delegate.applyDayNight()
            }
        } else {
            // The night mode time range spans across two days
            if (nowHour >= startHour || nowHour < endHour) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                activity.delegate.applyDayNight()
            }
        }

    }

}