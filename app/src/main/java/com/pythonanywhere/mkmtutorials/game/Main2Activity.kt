package com.pythonanywhere.mkmtutorials.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2Activity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun nextLeauge(View : View){
        val SkillIntent = Intent(this, SkillActivity::class.java )

        startActivity(SkillIntent)

    }
}
