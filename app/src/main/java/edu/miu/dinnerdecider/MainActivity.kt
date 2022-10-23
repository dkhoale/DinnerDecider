package edu.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foods = arrayListOf("Hamburger","Pizza", "American", "Mexican", "Chinese")

        decideBtn.setOnClickListener {
            var pickedIndex: Int = (Math.random() * 100).toInt() % foods.size
            tv.text = foods[pickedIndex]
        }

        addFoodBtn.setOnClickListener {
            if(inputFoodText.text.isNotBlank()){
                foods.add(inputFoodText.text.toString())
            }
        }
    }
}