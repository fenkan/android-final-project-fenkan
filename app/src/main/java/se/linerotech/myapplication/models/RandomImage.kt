package se.linerotech.myapplication.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RandomImage(
    @SerializedName("message")
    val message: List<String>? = null,
    @SerializedName("status")
    val status: String? = null
): Parcelable