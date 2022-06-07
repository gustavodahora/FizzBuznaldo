fun main() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuss")
        } else if (i % 5 == 0) {
            println("buss")
        } else if (i % 3 == 0) {
            println("fizz")
        }
        println(i)
    }
}