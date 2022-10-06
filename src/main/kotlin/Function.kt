fun helloPolban (){
    println("Hello Kampus Polban")
}

fun helloSiswa(nama:String){
    println("Apa kabar $nama")
}

fun nilaiAkhir(uts:Int, uas:Int):Int{
    return (uts+uas)/2
}

fun main() {
    val nama = "Farra"
    helloPolban()
    helloSiswa(nama)

    val nilai = nilaiAkhir(85,90)
    println("Nilai akhir $nama adalah $nilai")
}