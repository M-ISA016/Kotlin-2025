fun main() {
    val user1 = User("Maria",true)
    println(user1.name)
    println(user1.isAdmin)

    val user2 = User("Joao",false)
    println(user2.name)
    println(user2.isAdmin)

    user1.printInfo()
    user2.printInfo()
}

class User(var name: String, var isAdmin: Boolean) {

    fun printInfo() {
        println("Nome: $name, isAdmin: $isAdmin")
    }
}
