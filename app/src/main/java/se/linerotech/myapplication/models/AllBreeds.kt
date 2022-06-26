package se.linerotech.myapplication.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AllBreeds(
    @SerializedName("message")
    val message: Message? = null,
    @SerializedName("status")
    val status: String? = null
): Parcelable