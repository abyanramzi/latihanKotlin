import oop.Mobil

fun main() {
    val mobilSuv = Mobil(2500)

    mobilSuv.merk = "Honda"

    println(mobilSuv.merk)
    println(mobilSuv.tenaga)
    mobilSuv.gas()

    val mobilLcgc = Mobil(1000)
    println(mobilLcgc.merk)
    println(mobilLcgc.tenaga)
    mobilLcgc.gas()
}