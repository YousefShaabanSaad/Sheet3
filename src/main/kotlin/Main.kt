import kotlin.math.pow

fun main() {

    val rectangle=Rectangle()
    println("Height Rect")
    rectangle.setHeight(readLine()!!.toDouble())
    println("Width Rect")
    rectangle.setWidth(readLine()!!.toDouble())
    println("Area Rect ${rectangle.calculateArea()}")
    println("Parameter Rect ${rectangle.calculateParameter()}")
    val square=Square()
    println("Area Square ${square.calculateArea()}")
    println("Parameter Square ${square.calculateParameter()}")


    val triangle=Triangle()
    println("Height Triangle")
    triangle.setHeight(readLine()!!.toDouble())
    println("Width Triangle")
    triangle.setWidth(readLine()!!.toDouble())
    println("Base Triangle")
    triangle.setBase(readLine()!!.toDouble())
    println("Area Triangle ${triangle.calculateArea()}")
    println("Parameter Triangle ${triangle.calculateParameter()}")


    val ellipse=Ellipse()
    println("Radius Ellipse")
    ellipse.setRadius(readLine()!!.toDouble())
    println("Radius2 Ellipse")
    ellipse.setRadius2(readLine()!!.toDouble())
    println("Area Ellipse ${ellipse.calculateArea()}")
    println("Parameter Ellipse ${ellipse.calculateParameter()}")

    val circle=Circle()
    println("Area Circle ${circle.calculateArea()}")
    println("Parameter Circle ${circle.calculateParameter()}")



}

interface Shape{
    fun calculateArea():Double
    fun calculateParameter():Double
}

open class Rectangle : Shape{
    private var width:Double=0.0
    private var height:Double=0.0

    fun setHeight(height:Double){
        this.height=height
    }
    fun getHeight():Double{
       return height
    }

    fun setWidth(width:Double){
        this.width=width
    }
    fun getWidth():Double{
        return width
    }
    override fun calculateArea():Double{
        return width*height
    }

    override fun calculateParameter(): Double {
        return (width+height)*2
    }
}

class Triangle : Shape{
    private var base:Double=0.0
    private var width:Double=0.0
    private var height:Double=0.0

    fun setBase(base:Double){
        this.base=base
    }
    fun setHeight(height:Double){
        this.height=height
    }
    fun setWidth(width:Double){
        this.width=width
    }


    override fun calculateArea():Double{
        return  0.5*base*height
    }

    override fun calculateParameter(): Double {
        return base+width+base
    }
}

open class Ellipse : Shape{
    private var radius:Double=0.0
    private var radius2:Double=0.0

    fun setRadius(radius:Double){
        this.radius=radius
    }

    fun setRadius2(radius2:Double){
        this.radius2=radius2
    }

    fun getRadius():Double{
        return radius
    }

    fun getRadius2():Double{
        return radius2
    }

    override fun calculateArea():Double{
        return  Math.PI*radius*radius2
    }

    override fun calculateParameter(): Double {
        val r1=radius.pow(2)
        val r2=radius2.pow(2)
        val r3=r1+r2
        val r4=r3/2
        val root= r4.pow(0.5)
        return 2*Math.PI*root
    }
}

class Square : Rectangle(){
    override fun calculateArea():Double{
        return  getHeight()*getHeight()
    }

    override fun calculateParameter(): Double {
        return getHeight()*4
    }
}

class Circle : Ellipse(){
    override fun calculateArea():Double{
        return  Math.PI*getRadius().pow(2)
    }
    override fun calculateParameter(): Double {
        return 2*Math.PI*getRadius()
    }
}