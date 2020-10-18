package com.taghavi.androidbottomsheettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OptionsBottomSheetFragment.ItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainTextView.setOnClickListener {
            supportFragmentManager.let {
                OptionsBottomSheetFragment.newInstance(Bundle()).apply {
                    show(it, tag)
                }
            }
        }
    }

    override fun onItemClick(item: String) {
        when (item) {
            "Download" -> {
                Toast.makeText(this, "Download", Toast.LENGTH_SHORT).show()
            }
            "Copy" -> {
                Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show()
            }
            "Share" -> {
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(this, "else", Toast.LENGTH_SHORT).show()
            }
        }
    }
}