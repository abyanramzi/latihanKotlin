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
        if (lamaParkir3 >=1 && lamaParkir3 <=5){
            var biayaParkir2 = (lamaParkir3 * tarifSatu).toFloat()
        }
        else if (lamaParkir3 >5 && lamaParkir3<=24){
            var biayaParkir2 = ((5 * tarifSatu)+ lamaParkir3 * tarifDua).toFloat()
        }
        biayaParkir = ((5*tarifSatu)+(19*tarifDua)).toFloat()
    }
    println("Lama Parkir : $lamaParkir")
    println("Biaya Parkir : $biayaParkir")
}