package com.mj.handleactivitystates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    var Tag: String="SecondActivity"
    var navigateToThird:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Utils.printStates(Tag,"onCreate")

        navigateToThird= findViewById<Button>(R.id.navigate_third)
        navigateToThird!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intent)
        })
    }

    override fun onStart() {
        super.onStart()
        Utils.printStates(Tag,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Utils.printStates(Tag,"onResume")

    }

    override fun onPause() {
        super.onPause()
        Utils.printStates(Tag,"onPause")

    }

    override fun onStop() {
        super.onStop()
        Utils.printStates(Tag,"onStop")


    }

    override fun onDestroy() {
        super.onDestroy()
        Utils.printStates(Tag,"onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Utils.printStates(Tag,"onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Utils.printStates(Tag,"onSaveInstanceState")
    }

}
