package com.hyojeong96.addnums.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyojeong96.addnums.AddNums
import com.hyojeong96.addnums.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = AddNums().addNums(1, 2).toString()
    }
}