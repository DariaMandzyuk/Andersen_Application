package com.mandarin.andersenapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.mandarin.andersenapplication.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val button = findViewById<Button>(id.open_next_page)
        button.setOnClickListener {
            Toast.makeText(this, "Кнопка была нажата", Toast.LENGTH_SHORT).show()
        }
    }
}
