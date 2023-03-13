package com.example.lab1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AnimalDescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_description)

        val ivAnimal = findViewById<ImageView>(R.id.iv_animal)
        val tvDetails = findViewById<TextView>(R.id.tv_details)


        val extras = intent.extras

        if (extras != null) {
            val animal = extras.getString("Animal")
            val description = extras.getString("Description")
            if (animal =="Rabbit"){
                ivAnimal.setImageResource(R.mipmap.ic_rabbit_foreground)
                tvDetails.text = description
            }
            else if (animal =="Hamster"){
                ivAnimal.setImageResource(R.mipmap.ic_hamster_foreground)
                tvDetails.text = description
            }
            else if (animal =="GuineaPig"){
                ivAnimal.setImageResource(R.mipmap.ic_guinea_piggy_foreground)
                tvDetails.text = description
            }
        }

    }
}