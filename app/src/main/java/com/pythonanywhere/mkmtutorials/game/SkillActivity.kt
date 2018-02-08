package com.pythonanywhere.mkmtutorials.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var leauge=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        leauge = intent.getStringExtra(EXTRA_LEAUGE)
        println(leauge)


    }
}
