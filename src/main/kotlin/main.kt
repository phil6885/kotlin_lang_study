data class Point(val x: Int, val y: Int) {
    //    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
    override fun equals(other: Any?): Boolean {
        println("equals function was called")
        if (this === other) return true
        if (other !is Point) return false
        return x == other.x && y == other.y
    }
}
//data class has already overridden it, so extension function does not work
//fun Point.equals(other: Any?): Boolean {
//    if(other === this) return true
//    if(other !is Point) return false
//    return x ==other.x && y == other.y
//}
operator fun Double.times(p: Point) = p * this
operator fun Point.plus(p: Point) = Point(x + p.x, y + p.y)
operator fun Point.times(scale: Double) = Point((x * scale).toInt(), (y * scale).toInt())

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    var p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 * 2.0)
    println(2.0 * p1)
    println(p1 == p2)
    println(p1 != p2)

    p2 += p1
    println(p2)
}