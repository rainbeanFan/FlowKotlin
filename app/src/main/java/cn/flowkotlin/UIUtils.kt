package cn.flowkotlin

import android.app.Activity
import android.content.Context
import android.util.DisplayMetrics
import android.util.Log

/**
 * Created by Lancet at 2022/3/19 14:39
 */
class UIUtils {

    fun getSize(context: Context) {
//        fun one
        val screenWidth = (context as Activity).windowManager.defaultDisplay.width
        val screenHeight = (context as Activity).windowManager.defaultDisplay.height

        Log.d("", "screenWidth====$screenWidth    screenHeight====$screenHeight")

//        fun two
        val displayMetrics = DisplayMetrics()
        context.resources.displayMetrics

        val density = displayMetrics.density
        val densityDPI = displayMetrics.densityDpi

        val xdpi = displayMetrics.xdpi
        val ydpi = displayMetrics.ydpi

        val screenWidth2 = displayMetrics.widthPixels
        val screenHeight2 = displayMetrics.heightPixels

        Log.d("", "screenWidth====$screenWidth2    screenHeight====$screenHeight2")


        val dm = DisplayMetrics()
        context.windowManager.defaultDisplay.getMetrics(dm)

        val density2 = dm.density
        val densityDPI2 = dm.densityDpi

        val xdpi2 = dm.xdpi
        val ydpi2 = dm.ydpi

        val screenWidthDpi = dm.widthPixels
        val screenHeightDpi = dm.heightPixels

        val screenWidth3 = (dm.widthPixels * density2 + 0.5f).toInt()
        val screenHeight3 = (dm.heightPixels * density2 + 0.5f).toInt()

        Log.d("", "screenWidth====$screenWidth3    screenHeight====$screenHeight3")


    }

}