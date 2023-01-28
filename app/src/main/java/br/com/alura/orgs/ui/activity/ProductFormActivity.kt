package br.com.alura.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import br.com.alura.orgs.R

class ProductFormActivity : AppCompatActivity(R.layout.activity_product_form) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nameField = findViewById<EditText>(R.id.name)
        val name = nameField.text.toString()
        Log.i("ProductFormActivity","onCreate: $name")
    }
}