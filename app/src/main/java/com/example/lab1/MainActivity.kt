package com.example.lab1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rabbit = Animal("Rabbit", "Fluffy and cute little one.","Rabbits, also known as bunnies or bunny rabbits, are small mammals in the family Leporidae (which also contains the hares) of the order Lagomorpha (which also contains the pikas). Oryctolagus cuniculus includes the European rabbit species and its descendants, the world's 305 breeds of domestic rabbit. Sylvilagus includes 13 wild rabbit species, among them the seven types of cottontail. The European rabbit, which has been introduced on every continent except Antarctica, is familiar throughout the world as a wild prey animal and as a domesticated form of livestock and pet. With its widespread effect on ecologies and cultures, the rabbit is, in many areas of the world, a part of daily life—as food, clothing, a companion, and a source of artistic inspiration.")
        val hamster = Animal("Hamster","Eats grains and sleeps a lot.", "Hamsters are rodents (order Rodentia) belonging to the subfamily Cricetinae, which contains 19 species classified in seven genera. They have become established as popular small pets. The best-known species of hamster is the golden or Syrian hamster (Mesocricetus auratus), which is the type most commonly kept as pets. Other hamster species commonly kept as pets are the three species of dwarf hamster, Campbell's dwarf hamster (Phodopus campbelli), the winter white dwarf hamster (Phodopus sungorus) and the Roborovski hamster (Phodopus roborovskii).")
        val guineaPig = Animal("Guinea Pig", "Do they really come from Guinea?", "The guinea pig or domestic guinea pig (Cavia porcellus), also known as the cavy or domestic cavy, is a species of rodent belonging to the genus Cavia in the family Caviidae. Breeders tend to use the word cavy to describe the animal, while in scientific and laboratory contexts, it is far more commonly referred to by the common name guinea pig. Despite their common name, guinea pigs are not native to Guinea, nor are they closely related biologically to pigs, and the origin of the name is still unclear. They originated in the Andes of South America. Studies based on biochemistry and hybridization suggest they are domesticated animals that do not exist naturally in the wild, descendants of a closely related cavy species such as C. tschudii. They were originally domesticated as livestock for a source of meat, and are still consumed in some parts of the world.")

        val btnRabbit = findViewById<Button>(R.id.btn_rabbit)
        val btnHamster = findViewById<Button>(R.id.btn_hamster)
        val btnGuineaPig = findViewById<Button>(R.id.btn_guinea_pig)

        val rabbitInfo = findViewById<TextView>(R.id.tv_rabbit_info)
        val hamsterInfo = findViewById<TextView>(R.id.tv_hamster_info)
        val guineaPigInfo = findViewById<TextView>(R.id.tv_guineaPig_info)

        val rabbitName = findViewById<TextView>(R.id.tv_rabbit)
        val hamsterName = findViewById<TextView>(R.id.tv_hamster)
        val guineaPigName = findViewById<TextView>(R.id.tv_guineaPig)

        rabbitInfo.text = rabbit.shortInfo
        hamsterInfo.text = hamster.shortInfo
        guineaPigInfo.text = guineaPig.shortInfo

        rabbitName.text = rabbit.name
        hamsterName.text = hamster.name
        guineaPigName.text = guineaPig.name

        var animalChosen:String = ""

        btnRabbit.setOnClickListener{
            val intent = Intent(this, AnimalDescriptionActivity::class.java)
            animalChosen = "Rabbit"
            intent.putExtra("Animal", animalChosen)
            intent.putExtra("Description", rabbit.description)
            startActivity(intent)
        }
        btnHamster.setOnClickListener{
            val intent = Intent(this, AnimalDescriptionActivity::class.java)
            animalChosen = "Hamster"
            intent.putExtra("Animal", animalChosen)
            intent.putExtra("Description", hamster.description)
            startActivity(intent)
        }
        btnGuineaPig.setOnClickListener{
            val intent = Intent(this, AnimalDescriptionActivity::class.java)
            animalChosen = "GuineaPig"
            intent.putExtra("Animal", animalChosen)
            intent.putExtra("Description", guineaPig.description)
            startActivity(intent)
        }
    }
}