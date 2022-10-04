fun main () {

    var lamaParkir:Int
    var biayaParkir:Float

    // Tiaya Parkir
    val tarifSatu = 1.0
    val tarifDua = 0.5
    val tarifTiga = 15

    //Lama Parkir
    lamaParkir = 26

    // Biaya Parkir
    if (lamaParkir >= 0 && lamaParkir<= 5){
        biayaParkir = (lamaParkir * tarifSatu).toFloat()
    }
    else if (lamaParkir >5 && lamaParkir<=24){
        var lamaParkir2 = lamaParkir-5
        biayaParkir = ((5 * tarifSatu)+ lamaParkir2 * tarifDua).toFloat()
    }
    else {
        var lamaParkir3 = lamaParkir-24
        biayaParkir = ((5*tarifSatu)+(19*tarifDua)+lamaParkir3 * tarifTiga).toFloat()
    }
    println("Lama Parkir : $lamaParkir")
    println("Biaya Parkir : $biayaParkir")
}