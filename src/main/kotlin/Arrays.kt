fun main (){
    var cars = arrayOf("BMW", "Mustang", "Porsche")

    cars.forEach { car ->
        println ("Ini adalah $car")
    }
    val reward = cars.filter { car ->
        car == "Mustang"
    }
    println(reward)
    var nilaiMahasiswa = arrayOf(30, 50, 70, 90, 80, 60, 40)
    val lulusMatkul = nilaiMahasiswa.filter {nilai ->
        nilai >= 70
    }
    println(lulusMatkul)
}