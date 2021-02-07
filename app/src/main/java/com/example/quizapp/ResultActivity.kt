package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        val Uname:String=intent.getStringExtra(constants.USER_NAME)
        username.text=Uname
        val Tque=intent.getIntExtra(constants.TotalQuestion,10)
        val CorA=intent.getIntExtra(constants.CORRECT_ANSW,10)
        score.text="Your Score is $CorA/$Tque"
        btnfinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}