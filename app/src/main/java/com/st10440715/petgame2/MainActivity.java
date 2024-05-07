package com.st10440715.petgame2;

import android.app.Activity;

public class MainActivity extends Activity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
                btnStart.setOnClickListener {
            val activiy_actions =mainactivity2
            startActivity(activiy_actions.xml)
        }
    }
}
}
