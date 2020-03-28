package com.example.appdiplomadofist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_v_s_linear.*

class RelativeVSLinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_v_s_linear)


        var userFn = intent.extras!!.getString("user")
        ///var pass = intent.extras??.getString("pass")

        etName.setText(userFn)

    }

    override fun onBackPressed() {

        setResult(7420, Intent().apply {
            putExtra("volver", "Regrese a la 1era actividad.")
        })

        super.onBackPressed()
    }


    override fun finish() {
        super.finish()
    }
}
