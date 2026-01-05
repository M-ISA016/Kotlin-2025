fun main(){ /* From a comment of a functions overload class, but I adapted. */

    cadastrar("lucas", 27, false)
}

fun cadastrar(name:String, age:Int, admin:Boolean = false){
    println("Usuario:$name , age:$age , admin:$admin")
}
