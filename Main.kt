fun main() {

    // Crie um programa capaz de sempre dobrar um número, começando em 2 e mostre ao usuário imprimindo no console.
    //Regra: O limite de interações é 10.

    val limit = 10
    var i = 0
    var double = 1

    while (i < limit) {
        double = double * 2
        println(double)
        i++
    }
    println("fim.")
}
