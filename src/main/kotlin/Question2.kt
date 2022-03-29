fun main() {

    val truck=Truck()
    truck.salary()

    val van=Van()
    van.salary()

    val sailboat=Sailboat()
    sailboat.salary()

    val yacht=Yacht()
    yacht.salary()

    val helicopter=Helicopter()
    helicopter.salary()

    val blimp=Blimp()
    blimp.salary()
}

abstract class Vehicle{
    abstract fun salary()
}

open class Car : Vehicle(){
    override fun salary() {
        print("Car ")
    }

}

class Truck :Car(){
    override fun salary() {
        super.salary()
        println("Truck is 1000000$ ")
    }
}

class Van :Car(){
    override fun salary() {
        super.salary()
        println("Van is 100000$ ")
    }
}


open class Boat : Vehicle(){
    override fun salary() {
        print("Boat ")
    }

}

class Sailboat :Boat(){
    override fun salary() {
        super.salary()
        println("Sailboat is 5000000$ ")
    }
}

class Yacht :Boat(){
    override fun salary() {
        super.salary()
        println("Yacht is 70000000$ ")
    }
}


open class Aircraf : Vehicle(){
    override fun salary() {
        print("Aircraf ")
    }

}

class Helicopter :Aircraf(){
    override fun salary() {
        super.salary()
        println("Helicopter is 300000000$ ")
    }
}

class Blimp :Aircraf(){
    override fun salary() {
        super.salary()
        println("Blimp is 350000000$ ")
    }
}

