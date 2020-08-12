fun main() {
    val a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    val c = a * b

    var i = 0
    while(i < 3) {
        println(a * (b % 10))
        b /= 10
        i++
    }
    print(c)
}