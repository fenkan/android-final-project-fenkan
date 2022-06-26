package se.linerotech.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_random_image.*
import se.linerotech.myapplication.R


class RandomPictureActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_image)
        // Getting the breed data
        val breedImageData = intent?.getParcelableArrayListExtra<Parcelable>(KEY_REPOSITORY_DATA2)
        breedImageData?.let {
            // Load 3 random dog images
            Glide.with(this)
                .load(it.toArray()[0])
                .into(imageViewRandomDog)

           Glide.with(this)
                .load(it.toArray()[1])
                .into(imageViewRandomDog2)

            Glide.with(this)
                .load(it.toArray()[2])
                .into(imageViewRandomDog3)
        }


    }
    companion object {
        const val KEY_REPOSITORY_DATA2 = "keyRepositoryData"
    }
}