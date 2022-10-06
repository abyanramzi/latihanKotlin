fun main () {

    var lamaParkir:Int
    var biayaParkir:Float

    // Tiaya Parkir
    val tarifSatu = 1.0
    val tarifDua = 0.5
    val tarifTiga = 15

    //Lama Parkir
    lamaParkir = 50

    // Biaya Parkir
    if (lamaParkir >= 0 && lamaParkir<= 5){
        biayaParkir = (lamaParkir * tarifSatu).toFloat()
    }
    else if (lamaParkir >5 && lamaParkir<=24){
        var lamaParkir2 = lamaParkir-5
        biayaParkir = ((5 * tarifSatu)+ lamaParkir2 * tarifDua).toFloat()
    }
    else {
        if(lamaParkir%24 == 0){
            val lamaParkir3 = lamaParkir/24
            biayaParkir = (lamaParkir3*tarifTiga).toFloat()
        }
        else {
            val lamaParkir3 = lamaParkir%24
            val jumlahHari = (lamaParkir/24).toFloat()
            biayaParkir = (lamaParkir3*tarifDua+(jumlahHari*15)).toFloat()
            println(jumlahHari)
        }
    }
    println("Lama Parkir : $lamaParkir")
    println("Biaya Parkir : $biayaParkir")
}