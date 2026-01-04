fun main() {
    /*  Object-Oriented Programming treats everything as an object. ex.: cars, animals, dog, user, person, RG, CPF,
     button, text field, password validator, database...

    - Template (molde)
    car example: Imagine you will create an application to sell cars. Each car (object) has its characters (wheels,
    model, color, price).

    These characters are properties (functions), and the set of them form a template. Ex.: */

    val car1 = Car()  //object
    car1.brand = "Hyundai" // prop.
    car1.model = "hb20"   //prop.
    car1.accelerate()    //prop. -> set of properties = template

    val car2 = Car()
    car2.brand = "Honda"
    car2.model = "HR-V"
    car2.accelerate()
}
    class Car {
        var brand: String = ""
        var model: String = ""

        fun accelerate() {
            println("The car of the brand $brand, model $model is accelerating...")
        }
    }
// classes are written with CamelCase (first letter in uppercase).
