package se.linerotech.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import se.linerotech.myapplication.R
import se.linerotech.myapplication.databinding.ActivityAllBreedsBinding
import se.linerotech.myapplication.databinding.ActivityMainBinding

class AllBreedsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAllBreedsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllBreedsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Getting the breed list
        val breedList = intent?.getParcelableArrayListExtra<Parcelable>(KEY_REPOSITORY_DATA3)
        breedList.let {
            //val allBreeds =
        }
    }

    companion object {
        const val KEY_REPOSITORY_DATA3 = "keyRepositoryData"
    }
}