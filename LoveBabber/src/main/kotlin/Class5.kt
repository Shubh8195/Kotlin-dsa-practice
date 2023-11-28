fun main(args: Array<String>) {
    val a = 4
    val b = 6
    val c = a shl 3 // 4*4*4 left shift
    val d = a shr 2
    question6()
}

fun question1() {
    var a = 0
    var b = 1;
    a = 10
    if (a == ++a) {
        println(b)
    } else {
        println(++b)
    }
}

fun printTillN() {
    val n = 5
    var sum = 0
    for (i in 0..n) {
        println(i)
        Thread.sleep(1000)

        sum = sum + i
    }
    println(sum)

}

fun printFibonacci() {
    // can also use for prime
    var a = 0
    var b = 1
    for (i in 0..10) {
        println(a + b)
        a++
        b++
    }
}

fun printPrime() {
    // can also use for prime

    var isPrime = true
    val n = 2
    for (i in 2..n - 1) {
        print(i)

        if (n % i == 0) {

            isPrime = false
            break
        }
    }
    if (isPrime) {
        println("Is prime")
    } else {
        println("Not Prime")
    }
}

fun question6() {

    var int = 256
    var sum = 0
    var product = 1
    /*while (int != 0)
        println(int % 10)*/

    /*  int.forEachIndexed { index, c ->
          sum = sum + c.digitToInt()
          product=product*c.digitToInt()

      }
      for (i in int.toCharArray()){
          println(i)
      }
  */
    println(product - sum)

}