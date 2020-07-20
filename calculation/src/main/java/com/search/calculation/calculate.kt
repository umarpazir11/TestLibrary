package com.search.calculation

import android.content.Context
import android.content.Intent

class calculate {

    companion object {

        fun startSdk(context: Context){
            var intent = Intent(context, SdkActivity::class.java)
            context.startActivity(intent)

        }

        fun plus(a: Int, b: Int): Int {
            return a + b
        }

        fun minus(a: Int, b: Int): Int {
            return a - b
        }

        fun divide(a: Int, b: Int): Int {
            require( b !=0 ) { "Divide by zero Error" }
            return a / b
        }

        fun multiply(a: Int, b: Int): Int {
            return a * b
        }
    }
}