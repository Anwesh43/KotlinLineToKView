package ui.anwesome.com.kotlinlinetokview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ui.anwesome.com.linetokview.LineToKView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineToKView.create(this)
    }
}
