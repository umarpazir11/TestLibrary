package com.search.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.search.calculation.SdkActivity
import com.search.calculation.calculate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnPlus.setOnClickListener{
            Toast.makeText(this, calculate.plus(2,6).toString(),Toast.LENGTH_LONG).show();
            calculate.startSdk(this);
        }

        btnMinus.setOnClickListener{
            Toast.makeText(this, calculate.minus(7,2).toString(),Toast.LENGTH_LONG).show();
        }

        btnDivide.setOnClickListener{
            Toast.makeText(this, calculate.divide(8,2).toString(),Toast.LENGTH_LONG).show();
        }

        btnMultiply.setOnClickListener{
            Toast.makeText(this, calculate.multiply(3,9).toString(),Toast.LENGTH_LONG).show();
        }
    }
}
