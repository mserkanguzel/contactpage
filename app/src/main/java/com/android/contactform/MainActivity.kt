package com.android.contactform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val editTextName by lazy { findViewById<EditText>(R.id.editTextPersonName) }
    private val editTextEmail by lazy { findViewById<EditText>(R.id.editTextEmail) }
    private val editTextPhone by lazy { findViewById<EditText>(R.id.editTextPhone) }
    private val editTextMessage by lazy { findViewById<EditText>(R.id.editTextMessage) }
    private val buttonSubmit by lazy {findViewById<View>(R.id.btn_submit)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSubmit.setOnClickListener {
            submit()
        }
    }

    private fun submit() {
        if(editTextName.text.isNullOrEmpty()) {
            editTextName.error = "Bu alan gerekli"
            editTextName.requestFocus()

        }
        else if (editTextEmail.text.isNullOrEmpty()) {
            editTextEmail.error = "Bu alan gerekli"
            editTextEmail.requestFocus()

        }
        else if (editTextPhone.text.isNullOrEmpty()) {
            editTextPhone.error = "Bu alan gerekli"
            editTextPhone.requestFocus()
        }
        else if (editTextMessage.text.isNullOrEmpty()) {
            editTextMessage.error = "Bu alan gerekli"
            editTextMessage.requestFocus()
        }

        else {
            Log.i("MainActivity","Name Surname: ${editTextName.text}")
            Log.i("MainActivity","Email: ${editTextEmail.text}")
            Log.i("MainActivity","Phone: ${editTextPhone.text}")
            Log.i("MainActivity","Message: ${editTextMessage.text}")
        }
    }
}