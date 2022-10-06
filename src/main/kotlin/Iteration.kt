fun main () {
    val cars = arrayOf("BMW", "Posrche", "Mustang")

    for (car in cars){
        val message = "Ini adalah mobil $car"
        println(message)
    }

    for (x in 1 .. 9){
        println(x)
    }
}