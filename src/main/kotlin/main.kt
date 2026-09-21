data class Point(val x: Int, val y: Int) {
//    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}

operator fun Point.plus(p: Point) = Point(x + p.x, y + p.y)
operator fun Point.times(scale: Double) = Point((x * scale).toInt(), (y * scale).toInt())
operator fun Double.times(p: Point) = p * this

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 * 2.0)
    println(2.0 * p1)
}