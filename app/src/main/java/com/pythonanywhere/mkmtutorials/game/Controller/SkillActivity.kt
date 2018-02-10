package com.pythonanywhere.mkmtutorials.game.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pythonanywhere.mkmtutorials.game.R
import com.pythonanywhere.mkmtutorials.game.Utilities.EXTRA_LEAUGE
import com.pythonanywhere.mkmtutorials.game.Utilities.EXTRA_SKILLS
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var leauge=""
    var Skills=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        println(leauge)



    }

    fun BeginerSkills(view: View){

        BallerButton.isChecked=false
        Skills="beginer"
    }
    fun BallerSkills(view: View){
        BeginerButton.isChecked=false
        Skills="baller"
    }
    fun FinishNext(view: View){

        if(Skills!="")
        {
            val FinshIntent = Intent(this,FinishActivities::class.java)
            FinshIntent.putExtra(EXTRA_SKILLS,Skills)
            FinshIntent.putExtra(EXTRA_LEAUGE,leauge)
            startActivity(FinshIntent)
        }
        else{
            Toast.makeText(this,"Please select a Level.",Toast.LENGTH_SHORT).show()
        }
    }
}
