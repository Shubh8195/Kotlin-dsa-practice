fun main(args: Array<String>) {


    // isTriangle(1, 1, 1)
    //  tryLoop(1, 100)
    // printEven(1, 100)
    // printODD(1, 5)
//    sumladder(10)
    // findFactorial(6)
    checkIfPrimeNumber(5)
}

fun isTriangle(a: Int, b: Int, c: Int) {
    if (a + b > c) {
        println("Triangle")
    } else if (b + c > a) {
        println("Triangle")
    } else if (c + a > b) {
        println("Triangle")
    } else {
        println("NOT Triangle")
    }
}

fun tryLoop(start: Int, end: Int) {
    /* for (i in start..end) {
         Thread.sleep(1000)
         println(i)
     }*/
    var i = start
    do {
        println(i)
        i++

    } while (i <= end)
}

fun printEven(start: Int, end: Int) {
    val mstart = start

    for (i in mstart..end) {
        if (i % 2 == 0) {
            println("$i")
        }
    }
    var i = 2
    while (i <= 20) {
        if (i % 2 == 0) {
            println("even $i")
        }
        i++
    }
}

fun printODD(start: Int, end: Int) {
    /*for (i in start..end) {
        if (i % 2 != 0) {
            println(i)
        }
    }*/
    var mstart = start

}

fun sumladder(n: Int) {
    val n: Int = n
    var number = 1
    var sum = 0

    while (number <= n) {
        sum = sum + number
        System.out.println(sum)
        ++number
    }

}

fun findFactorial(n: Int) {
    val n = n;
    var number = 1
    var factorial = 1
    while (number <= n) {
        factorial = factorial * number
        number++


    }
    System.out.println(factorial)

}

fun checkIfPrimeNumber(n: Int) {
    var number = 2
    while (number < n) {

        if (n % number == 0) {
            System.out.println("This is prime" + n)
        }

        number++
    }
}




