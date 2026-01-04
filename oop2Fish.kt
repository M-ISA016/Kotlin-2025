fun main() {
    val fish1 = fish("Felismina", "Femea")
    println(fish1.name)
    println(fish1.gender)

    val fish2 = fish("Felix", "Macho")
    println(fish2.name)
    println(fish2.gender)

    fish1.printInfo()
    fish2.printInfo()
}
class fish(var name: String, var gender: String) {
    fun printInfo() {
        println("Nome do peixe: $name. O seu peixe é $gender. ")
    }
}
