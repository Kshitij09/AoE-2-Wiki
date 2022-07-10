package com.kshitijpatil.aoe2.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kshitijpatil.aoe2.Greeting
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    private val mainScope = MainScope()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "Loading..."
        mainScope.launch {
            kotlin.runCatching {
                withContext(Dispatchers.IO) {
                    Greeting().getHtml()
                }
            }.onSuccess {
                tv.text = it
            }.onFailure {
                tv.text = "Error: ${it.localizedMessage}"
            }
        }
    }
}
