package com.pythonanywhere.mkmtutorials.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getstarted_button.setOnClickListener {



            val getintent = Intent(this,Main2Activity::class.java)  //intent is use for make call the other function
                                                                                        //of the app like calling for open camera caaling for broweser
                                                                                //this refer the context of the same app
            startActivity(getintent)
        }
    }
}
