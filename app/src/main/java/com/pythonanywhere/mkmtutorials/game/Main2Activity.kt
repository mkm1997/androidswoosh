package com.pythonanywhere.mkmtutorials.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : BaseActivity() {

    var selectedLeauge=" "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun mensClicked(View: View)
    {
        womensButton.isChecked=false
        coedButton.isChecked = false
        selectedLeauge="mens"
    }
    fun womenscCicked(View: View)
    {
        mensLeaugeButton.isChecked=false
        coedButton.isChecked = false
        selectedLeauge="womens"
    }
    fun coedClicked(View: View){
        mensLeaugeButton.isChecked = false
        womensButton.isChecked = false
        selectedLeauge = "co-ed"
    }

    fun nextLeauge(View : View){

        if(selectedLeauge!="") {
            val SkillIntent = Intent(this, SkillActivity::class.java)

            SkillIntent.putExtra(EXTRA_LEAUGE,selectedLeauge) //

            startActivity(SkillIntent)
        }else {

            Toast.makeText(this ,"Please select a leauge.",Toast.LENGTH_SHORT).show()

        }

    }
}
