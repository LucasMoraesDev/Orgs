package br.com.alura.orgs.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Product
import br.com.alura.orgs.ui.recyclerview.adapter.ProductListAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a) ao Orgs!", Toast.LENGTH_SHORT).show()
//        val name = findViewById<TextView>(R.id.name)
//        name.text = "Cesta de Frutas"
//        val description = findViewById<TextView>(R.id.description)
//        description.text = "Laranja, mamão, morango"
//        val price = findViewById<TextView>(R.id.price)
//        price.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ProductListAdapter(
            context = this,
            products = listOf(
                Product(
                    name = "teste",
                    description = "teste desc",
                    price = BigDecimal("19.99")
                ),
                Product(
                    name = "teste",
                    description = "teste desc 1",
                    price = BigDecimal("29.99")
                ),
                Product(
                    name = "teste",
                    description = "teste desc 2",
                    price = BigDecimal("39.99")
                ),
            )
        )
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}