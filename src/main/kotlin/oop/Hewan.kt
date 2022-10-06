package oop

open class Hewan {
    open val kaki = 2
    open var mata = 2

    fun makan(){
        println("Amm")
    }
    fun minum(){
        println("Glek")
    }
}

class Kucing : Hewan(){
    override val kaki = 4
    val isMamal = true
}
class Kakatua : Hewan() {
    val isAves = true
}
class Ayam : Hewan(){
    val isMamal = false
}