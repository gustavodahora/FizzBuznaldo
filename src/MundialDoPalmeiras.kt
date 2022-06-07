fun main() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuss")
            continue
        } else if (i % 5 == 0) {
            println("buss")
            continue
        } else if (i % 3 == 0) {
            println("fizz")
            continue
        }
        println(i)
    }
}