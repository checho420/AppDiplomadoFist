package com.example.appdiplomadofist

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.relative_layout_activity.*

class FirtActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout_activity)

        btnLogin.setOnClickListener {
            var myIntent = Intent(this, RelativeVSLinearActivity::class.java)
            myIntent.putExtra("user", etUser.text.toString())
            myIntent.putExtra("pass", etPass.text.toString())
            startActivityForResult(myIntent, 12)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 7420){
            val result = data?.getStringExtra("volver")
            Toast.makeText(this, "$result", Toast.LENGTH_LONG).show()
        }


    }



}