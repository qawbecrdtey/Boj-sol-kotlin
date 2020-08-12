fun main() {
    val nums = readLine()!!.split(" ")
    val a = nums[0].toInt()
    val b = nums[1].toInt()
    val c = nums[2].toInt()
    println((a + b) % c)
    println((a % c + b % c) % c)
    println((a * b) % c)
    print(((a % c) * (b % c)) % c)
}