package se.linerotech.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import se.linerotech.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Defining binding variables
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //binding the buttons
        binding.startRunningButtun.setOnClickListener {
            val intent = Intent(this@MainActivity, MapActivity::class.java)
            startActivity(intent)
        }
        binding.popularRoutesButton.setOnClickListener {
            Toast.makeText(this, "No routes available, find your own", Toast.LENGTH_LONG).show()
        }
    }
}
