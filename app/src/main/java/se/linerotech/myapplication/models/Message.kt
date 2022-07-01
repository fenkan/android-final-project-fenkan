package se.linerotech.myapplication.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Message(
    @SerializedName("affenpinscher")
    val affenpinscher: List<String>? = null,
    @SerializedName("african")
    val african: List<String>? = null,
    @SerializedName("airedale")
    val airedale: List<String>? = null,
    @SerializedName("akita")
    val akita: List<String>? = null,
    @SerializedName("appenzeller")
    val appenzeller: List<String>? = null,
    @SerializedName("australian")
    val australian: List<String>? = null,
    @SerializedName("basenji")
    val basenji: List<String>? = null,
    @SerializedName("beagle")
    val beagle: List<String>? = null,
    @SerializedName("bluetick")
    val bluetick: List<String>? = null,
    @SerializedName("borzoi")
    val borzoi: List<String>? = null,
    @SerializedName("bouvier")
    val bouvier: List<String>? = null,
    @SerializedName("boxer")
    val boxer: List<String>? = null,
    @SerializedName("brabancon")
    val brabancon: List<String>? = null,
    @SerializedName("briard")
    val briard: List<String>? = null,
    @SerializedName("buhund")
    val buhund: List<String>? = null,
    @SerializedName("bulldog")
    val bulldog: List<String>? = null,
    @SerializedName("bullterrier")
    val bullterrier: List<String>? = null,
    @SerializedName("cattledog")
    val cattledog: List<String>? = null,
    @SerializedName("chihuahua")
    val chihuahua: List<String>? = null,
    @SerializedName("chow")
    val chow: List<String>? = null,
    @SerializedName("clumber")
    val clumber: List<String>? = null,
    @SerializedName("cockapoo")
    val cockapoo: List<String>? = null,
    @SerializedName("collie")
    val collie: List<String>? = null,
    @SerializedName("coonhound")
    val coonhound: List<String>? = null,
    @SerializedName("corgi")
    val corgi: List<String>? = null,
    @SerializedName("cotondetulear")
    val cotondetulear: List<String>? = null,
    @SerializedName("dachshund")
    val dachshund: List<String>? = null,
    @SerializedName("dalmatian")
    val dalmatian: List<String>? = null,
    @SerializedName("dane")
    val dane: List<String>? = null,
    @SerializedName("deerhound")
    val deerhound: List<String>? = null,
    @SerializedName("dhole")
    val dhole: List<String>? = null,
    @SerializedName("dingo")
    val dingo: List<String>? = null,
    @SerializedName("doberman")
    val doberman: List<String>? = null,
    @SerializedName("elkhound")
    val elkhound: List<String>? = null,
    @SerializedName("entlebucher")
    val entlebucher: List<String>? = null,
    @SerializedName("eskimo")
    val eskimo: List<String>? = null,
    @SerializedName("finnish")
    val finnish: List<String>? = null,
    @SerializedName("frise")
    val frise: List<String>? = null,
    @SerializedName("germanshepherd")
    val germanshepherd: List<String>? = null,
    @SerializedName("greyhound")
    val greyhound: List<String>? = null,
    @SerializedName("groenendael")
    val groenendael: List<String>? = null,
    @SerializedName("havanese")
    val havanese: List<String>? = null,
    @SerializedName("hound")
    val hound: List<String>? = null,
    @SerializedName("husky")
    val husky: List<String>? = null,
    @SerializedName("keeshond")
    val keeshond: List<String>? = null,
    @SerializedName("kelpie")
    val kelpie: List<String>? = null,
    @SerializedName("komondor")
    val komondor: List<String>? = null,
    @SerializedName("kuvasz")
    val kuvasz: List<String>? = null,
    @SerializedName("labradoodle")
    val labradoodle: List<String>? = null,
    @SerializedName("labrador")
    val labrador: List<String>? = null,
    @SerializedName("leonberg")
    val leonberg: List<String>? = null,
    @SerializedName("lhasa")
    val lhasa: List<String>? = null,
    @SerializedName("malamute")
    val malamute: List<String>? = null,
    @SerializedName("malinois")
    val malinois: List<String>? = null,
    @SerializedName("maltese")
    val maltese: List<String>? = null,
    @SerializedName("mastiff")
    val mastiff: List<String>? = null,
    @SerializedName("mexicanhairless")
    val mexicanhairless: List<String>? = null,
    @SerializedName("mix")
    val mix: List<String>? = null,
    @SerializedName("mountain")
    val mountain: List<String>? = null,
    @SerializedName("newfoundland")
    val newfoundland: List<String>? = null,
    @SerializedName("otterhound")
    val otterhound: List<String>? = null,
    @SerializedName("ovcharka")
    val ovcharka: List<String>? = null,
    @SerializedName("papillon")
    val papillon: List<String>? = null,
    @SerializedName("pekinese")
    val pekinese: List<String>? = null,
    @SerializedName("pembroke")
    val pembroke: List<String>? = null,
    @SerializedName("pinscher")
    val pinscher: List<String>? = null,
    @SerializedName("pitbull")
    val pitbull: List<String>? = null,
    @SerializedName("pointer")
    val pointer: List<String>? = null,
    @SerializedName("pomeranian")
    val pomeranian: List<String>? = null,
    @SerializedName("poodle")
    val poodle: List<String>? = null,
    @SerializedName("pug")
    val pug: List<String>? = null,
    @SerializedName("puggle")
    val puggle: List<String>? = null,
    @SerializedName("pyrenees")
    val pyrenees: List<String>? = null,
    @SerializedName("redbone")
    val redbone: List<String>? = null,
    @SerializedName("retriever")
    val retriever: List<String>? = null,
    @SerializedName("ridgeback")
    val ridgeback: List<String>? = null,
    @SerializedName("rottweiler")
    val rottweiler: List<String>? = null,
    @SerializedName("saluki")
    val saluki: List<String>? = null,
    @SerializedName("samoyed")
    val samoyed: List<String>? = null,
    @SerializedName("schipperke")
    val schipperke: List<String>? = null,
    @SerializedName("schnauzer")
    val schnauzer: List<String>? = null,
    @SerializedName("setter")
    val setter: List<String>? = null,
    @SerializedName("sharpei")
    val sharpei: List<String>? = null,
    @SerializedName("sheepdog")
    val sheepdog: List<String>? = null,
    @SerializedName("shiba")
    val shiba: List<String>? = null,
    @SerializedName("shihtzu")
    val shihtzu: List<String>? = null,
    @SerializedName("spaniel")
    val spaniel: List<String>? = null,
    @SerializedName("springer")
    val springer: List<String>? = null,
    @SerializedName("stbernard")
    val stbernard: List<String>? = null,
    @SerializedName("terrier")
    val terrier: List<String>? = null,
    @SerializedName("tervuren")
    val tervuren: List<String>? = null,
    @SerializedName("vizsla")
    val vizsla: List<String>? = null,
    @SerializedName("waterdog")
    val waterdog: List<String>? = null,
    @SerializedName("weimaraner")
    val weimaraner: List<String>? = null,
    @SerializedName("whippet")
    val whippet: List<String>? = null,
    @SerializedName("wolfhound")
    val wolfhound: List<String>? = null
): Parcelable