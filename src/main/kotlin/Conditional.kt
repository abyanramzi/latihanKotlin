fun main () {
    val isSamboGuilty = true || false
    val isFalse = false

    if (isSamboGuilty){
        println("He will be jailed")
    }
    else if (isFalse) {
        println("Something wrong with this country")
    }
    else {
        println("...")
    }

    val num = 1
    val result = when {
        num > 5 ->"Healthy"
        num <= 5 && num >0 -> "Sick"
        else -> "Death"
    }
    println(result)

    if (isSamboGuilty) println("He will be jailed")
    else println("Something wrong with this country")
    val lamaTahanan = if (isSamboGuilty) 50 else 0

    println(lamaTahanan)
}