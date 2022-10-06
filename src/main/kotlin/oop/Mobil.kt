package oop

class Mobil (kapasitasTanki:Int) {

    //Contoh GetterSetter untuk Encapsulation
    var merk: String = "Ford"
        get() = field
        set(value) {
            if (value == "Toyota"){
                field = "Toyota Fortuner"
            }
            else {
                field = "Ford"
            }
        }

    val tenaga = kapasitasTanki
    fun gas(){
        println("Gass")
    }
}