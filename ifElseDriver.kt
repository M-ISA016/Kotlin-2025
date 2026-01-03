fun main() {

        //1. Strings

        val mouse = 1
        val wifi = 1
        val equalStrings = mouse == wifi

        println(equalStrings)

        //2. CNH

        val myAge = 16

        if (myAge >= 18)
            println("You can have a driver's license.")

        else
            println("You cannot have a driver's license.")

        //3. inverted logic - if I cannot drive:

        val agee = 16

        if (agee <= 17) (println("You cannot have a driver's license."))

        else (println("You can have a driver's license."))

        //4. if I am a driver:

        val myAgee = 16

        if (myAgee <= 17) (println("You are not a driver."))

        else (println("You are a driver."))

        //5. inverted logic - if I am not a driver:

        val age = 16

        if (age >= 18) (println("You are a driver."))

        else (println("You are not a driver."))

        //6. discount:

        val product = "iMac"
        val price = 15000
        val percent = 12
        val discount = price/ 100 * percent
        val total = price - discount

        if (product == "iMac") println("Desconto aplicado de 12%. Total a pagar: R$$total,00.")

        else
            println("Desconto não aplicado.")
    }
