package com.pythonanywhere.mkmtutorials.game.Controller

import android.content.Intent
import android.os.Bundle
import com.pythonanywhere.mkmtutorials.game.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getstarted_button.setOnClickListener {

            val getintent = Intent(this, LeaugeActivity::class.java)  //intent is use for make call the other function
                                                                                        //of the app like calling for open camera caaling for broweser //this refer the context of the same app
            startActivity(getintent)
        }
    }
}
