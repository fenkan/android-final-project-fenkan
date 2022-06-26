package se.linerotech.myapplication.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Message(
    @SerializedName("affenpinscher")
    val affenpinscher: List<Any>? = null,
    @SerializedName("african")
    val african: List<Any>? = null,
    @SerializedName("airedale")
    val airedale: List<Any>? = null,
    @SerializedName("akita")
    val akita: List<Any>? = null,
    @SerializedName("appenzeller")
    val appenzeller: List<Any>? = null,
    @SerializedName("australian")
    val australian: List<String>? = null,
    @SerializedName("basenji")
    val basenji: List<Any>? = null,
    @SerializedName("beagle")
    val beagle: List<Any>? = null,
    @SerializedName("bluetick")
    val bluetick: List<Any>? = null,
    @SerializedName("borzoi")
    val borzoi: List<Any>? = null,
    @SerializedName("bouvier")
    val bouvier: List<Any>? = null,
    @SerializedName("boxer")
    val boxer: List<Any>? = null,
    @SerializedName("brabancon")
    val brabancon: List<Any>? = null,
    @SerializedName("briard")
    val briard: List<Any>? = null,
    @SerializedName("buhund")
    val buhund: List<String>? = null,
    @SerializedName("bulldog")
    val bulldog: List<String>? = null,
    @SerializedName("bullterrier")
    val bullterrier: List<String>? = null,
    @SerializedName("cattledog")
    val cattledog: List<String>? = null,
    @SerializedName("chihuahua")
    val chihuahua: List<Any>? = null,
    @SerializedName("chow")
    val chow: List<Any>? = null,
    @SerializedName("clumber")
    val clumber: List<Any>? = null,
    @SerializedName("cockapoo")
    val cockapoo: List<Any>? = null,
    @SerializedName("collie")
    val collie: List<String>? = null,
    @SerializedName("coonhound")
    val coonhound: List<Any>? = null,
    @SerializedName("corgi")
    val corgi: List<String>? = null,
    @SerializedName("cotondetulear")
    val cotondetulear: List<Any>? = null,
    @SerializedName("dachshund")
    val dachshund: List<Any>? = null,
    @SerializedName("dalmatian")
    val dalmatian: List<Any>? = null,
    @SerializedName("dane")
    val dane: List<String>? = null,
    @SerializedName("deerhound")
    val deerhound: List<String>? = null,
    @SerializedName("dhole")
    val dhole: List<Any>? = null,
    @SerializedName("dingo")
    val dingo: List<Any>? = null,
    @SerializedName("doberman")
    val doberman: List<Any>? = null,
    @SerializedName("elkhound")
    val elkhound: List<String>? = null,
    @SerializedName("entlebucher")
    val entlebucher: List<Any>? = null,
    @SerializedName("eskimo")
    val eskimo: List<Any>? = null,
    @SerializedName("finnish")
    val finnish: List<String>? = null,
    @SerializedName("frise")
    val frise: List<String>? = null,
    @SerializedName("germanshepherd")
    val germanshepherd: List<Any>? = null,
    @SerializedName("greyhound")
    val greyhound: List<String>? = null,
    @SerializedName("groenendael")
    val groenendael: List<Any>? = null,
    @SerializedName("havanese")
    val havanese: List<Any>? = null,
    @SerializedName("hound")
    val hound: List<String>? = null,
    @SerializedName("husky")
    val husky: List<Any>? = null,
    @SerializedName("keeshond")
    val keeshond: List<Any>? = null,
    @SerializedName("kelpie")
    val kelpie: List<Any>? = null,
    @SerializedName("komondor")
    val komondor: List<Any>? = null,
    @SerializedName("kuvasz")
    val kuvasz: List<Any>? = null,
    @SerializedName("labradoodle")
    val labradoodle: List<Any>? = null,
    @SerializedName("labrador")
    val labrador: List<Any>? = null,
    @SerializedName("leonberg")
    val leonberg: List<Any>? = null,
    @SerializedName("lhasa")
    val lhasa: List<Any>? = null,
    @SerializedName("malamute")
    val malamute: List<Any>? = null,
    @SerializedName("malinois")
    val malinois: List<Any>? = null,
    @SerializedName("maltese")
    val maltese: List<Any>? = null,
    @SerializedName("mastiff")
    val mastiff: List<String>? = null,
    @SerializedName("mexicanhairless")
    val mexicanhairless: List<Any>? = null,
    @SerializedName("mix")
    val mix: List<Any>? = null,
    @SerializedName("mountain")
    val mountain: List<String>? = null,
    @SerializedName("newfoundland")
    val newfoundland: List<Any>? = null,
    @SerializedName("otterhound")
    val otterhound: List<Any>? = null,
    @SerializedName("ovcharka")
    val ovcharka: List<String>? = null,
    @SerializedName("papillon")
    val papillon: List<Any>? = null,
    @SerializedName("pekinese")
    val pekinese: List<Any>? = null,
    @SerializedName("pembroke")
    val pembroke: List<Any>? = null,
    @SerializedName("pinscher")
    val pinscher: List<String>? = null,
    @SerializedName("pitbull")
    val pitbull: List<Any>? = null,
    @SerializedName("pointer")
    val pointer: List<String>? = null,
    @SerializedName("pomeranian")
    val pomeranian: List<Any>? = null,
    @SerializedName("poodle")
    val poodle: List<String>? = null,
    @SerializedName("pug")
    val pug: List<Any>? = null,
    @SerializedName("puggle")
    val puggle: List<Any>? = null,
    @SerializedName("pyrenees")
    val pyrenees: List<Any>? = null,
    @SerializedName("redbone")
    val redbone: List<Any>? = null,
    @SerializedName("retriever")
    val retriever: List<String>? = null,
    @SerializedName("ridgeback")
    val ridgeback: List<String>? = null,
    @SerializedName("rottweiler")
    val rottweiler: List<Any>? = null,
    @SerializedName("saluki")
    val saluki: List<Any>? = null,
    @SerializedName("samoyed")
    val samoyed: List<Any>? = null,
    @SerializedName("schipperke")
    val schipperke: List<Any>? = null,
    @SerializedName("schnauzer")
    val schnauzer: List<String>? = null,
    @SerializedName("setter")
    val setter: List<String>? = null,
    @SerializedName("sharpei")
    val sharpei: List<Any>? = null,
    @SerializedName("sheepdog")
    val sheepdog: List<String>? = null,
    @SerializedName("shiba")
    val shiba: List<Any>? = null,
    @SerializedName("shihtzu")
    val shihtzu: List<Any>? = null,
    @SerializedName("spaniel")
    val spaniel: List<String>? = null,
    @SerializedName("springer")
    val springer: List<String>? = null,
    @SerializedName("stbernard")
    val stbernard: List<Any>? = null,
    @SerializedName("terrier")
    val terrier: List<String>? = null,
    @SerializedName("tervuren")
    val tervuren: List<Any>? = null,
    @SerializedName("vizsla")
    val vizsla: List<Any>? = null,
    @SerializedName("waterdog")
    val waterdog: List<String>? = null,
    @SerializedName("weimaraner")
    val weimaraner: List<Any>? = null,
    @SerializedName("whippet")
    val whippet: List<Any>? = null,
    @SerializedName("wolfhound")
    val wolfhound: List<String>? = null
): Parcelable