package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_dialog.setOnClickListener {
         val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.dialog_layout,null)
            val close = view.findViewById<ImageView>(R.id.imageView2)
            close.setOnClickListener {
                dialog.dismiss()
            }
            val but = view.findViewById<Button>(R.id.button)
            but.setOnClickListener {
                Toast.makeText(this, "OK CHECKED", Toast.LENGTH_SHORT).show()
            }
            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()


        }
    }
}