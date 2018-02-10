package com.pythonanywhere.mkmtutorials.game.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.pythonanywhere.mkmtutorials.game.Models.Player
import com.pythonanywhere.mkmtutorials.game.R
//import com.pythonanywhere.mkmtutorials.game.Utilities.EXTRA_LEAUGE
import com.pythonanywhere.mkmtutorials.game.Utilities.EXTRA_PLAYER
//import com.pythonanywhere.mkmtutorials.game.Utilities.EXTRA_SKILLS
import kotlinx.android.synthetic.main.activity_finish_activities.*
import kotlinx.android.synthetic.main.activity_finish_activities.view.*

class FinishActivities : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_activities)

        //val Leauge = intent.getStringExtra(EXTRA_LEAUGE)
        //val Skill = intent.getStringExtra(EXTRA_SKILLS)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        FinishText.text = "Looking for ${player.Leauge} ${player.Skill} leauge near you..."
    }
}
