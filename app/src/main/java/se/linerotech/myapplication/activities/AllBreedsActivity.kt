package se.linerotech.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import se.linerotech.myapplication.R

class AllBreedsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_breeds)
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