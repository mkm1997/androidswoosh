package com.pythonanywhere.mkmtutorials.game.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pythonanywhere.mkmtutorials.game.Models.Player
//import com.pythonanywhere.mkmtutorials.game.Utilities.EXTRA_LEAUGE
import com.pythonanywhere.mkmtutorials.game.R
import com.pythonanywhere.mkmtutorials.game.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_leauge.*

class LeaugeActivity : BaseActivity() {

    //var selectedLeauge=""  //using class variable instead of it
    var player = Player("leauge","skill")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)


       /* NextButton.setOnClickListener {
            val SkillIntent = Intent(this,SkillActivity::class.java)
            startActivity(SkillIntent)
        }*/

    }



       fun MensClicked(View: View) {
            womensButton.isChecked = false
            coedButton.isChecked = false
            //selectedLeauge = "mens"
           player.Leauge = "mens"
        }

        fun WomensClicked(View: View) {

            mensButton.isChecked = false
            coedButton.isChecked = false
            //selectedLeauge = "womens"
            player.Leauge = "womens"
        }

        fun CoEdClicked(View: View) {
            mensButton.isChecked = false
            womensButton.isChecked = false
            //selectedLeauge = "co-ed"
            player.Leauge = "co-ed"
        }

        fun NextLeauge(View: View) {

            if (player.Leauge != "") {
                val SkillIntent = Intent(this, SkillActivity::class.java)

                SkillIntent.putExtra(EXTRA_PLAYER,player) //for passing activity of one page to another page

                startActivity(SkillIntent)
            } else {

                Toast.makeText(this, "Please select a leauge.", Toast.LENGTH_SHORT).show()

            }


    }
}
