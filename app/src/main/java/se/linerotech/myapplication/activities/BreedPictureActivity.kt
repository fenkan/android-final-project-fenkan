package se.linerotech.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_breed_picture.*
import se.linerotech.myapplication.R

class BreedPictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breed_picture)



        // Getting the breed data
        val breedImageData = intent?.getParcelableArrayListExtra<Parcelable>(KEY_REPOSITORY_DATA)
        breedImageData?.let {

            // Load a random dog image
            Glide.with(this)
                .load(it.toArray().random())
                .into(imageViewDogBreed)
        }
    }


    companion object {
        const val KEY_REPOSITORY_DATA = "keyRepositoryData"
    }
}