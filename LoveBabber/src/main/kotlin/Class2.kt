fun main(args: Array<String>) {

    val value = 'b'
    if (value >= 'a' || value <= 'z') {
        println("Lower Case")
    } else if (value >= 'A' || value <= 'Z') {
        println("Upper Case")
    } else if (value >= '0' || value <= '9') {
        println("Number")
    }


    var sum = 0
    var n = 5
    var i = 1


    while (i <= n) {
        if (i % 2 == 0) {
            sum = sum + i
        }


        i++
    }


    println("total sum $sum")
    //  printPrimeNumber()
    printPatternTriangle12()

}

fun printPrimeNumber() {
    var n = 5
    var i = 2
    while (i < n) {
        if (i % n == 0) {
            println("prime number $i")
        }
        i = i + 1
    }
}

fun printPatternStar() {
    val max_row = 5
    var column = 1
    while (column <= max_row) {
        var j = 1
        while (j < column) {
            print("*")
            j++
        }
        println()
        column++
    }
}

fun printPatternNumbers2() {
    val max_row = 5
    var column = 1
    while (column <= max_row) {
        var j = 1
        while (j <= max_row) {
            print(" $column")
            j++
        }
        println()
        column++
    }
}


fun printPatternNumbers3() {
    val max_row = 4
    var column = 1
    while (column <= max_row) {
        var j = 1
        while (j <= max_row) {
            print(" $j")
            j++
        }
        println()
        column++
    }
}

fun printPatternNumbers4Reverse() {
    val max_row = 4
    var column = 1
    while (column <= max_row) {
        var j = 1
        while (j < max_row) {
            print(" ${max_row - j}")
            j++
        }
        println()
        column++
    }
}

fun printPatternNumbers5() {
    val max_row = 3
    var column = 1
    var col_count = 1

    while (column <= max_row) {
        var j = 1
        while (j <= max_row) {
            print("$col_count")
            j++
            col_count++
        }
        println()
        column++
    }
}

fun printPatternTriangle6() {
    val max_row = 3
    var column = 1
    var col_count = 1

    while (column <= max_row) {
        var j = 1
        while (j <= column) {
            print("* ")
            j++

        }
        println()
        column++
    }
}

fun printPatternTriangle7() {
    val max_row = 3
    var column = 1

    while (column <= max_row) {
        var j = 1
        while (j <= column) {
            print("$column ")
            j++

        }
        println()
        column++
    }
}

fun printPatternTriangle8() {
    val max_row = 3
    var column = 1
    var count = 1
    while (column <= max_row) {
        var j = 1
        while (j <= column) {
            print("$count ")
            j++
            count++

        }
        println()
        column++
    }
}


fun printPatternTriangle9() {
    val max_row = 3
    var column = 1
    var count = 1
    while (column <= max_row) {
        var j = 1
        while (j <= column) {
            print("${column - j + 1} ")


            j++
            count++

        }
        println()
        column++
    }
}

fun printPatternTriangle10() {
    val max_row = 'C'
    var column = 'A'
    var count = 'A'
    while (column <= max_row) {
        var j = 'A'
        while (j <= max_row) {
            print("${count} ")
            count++

            j++


        }
        println()
        column++
    }
}

fun printPatternTriangle11() {
    val max_row = 'C'
    var column = 'A'
    var count = 'A'
    while (column <= max_row) {
        var j = 'A'
        while (j <= column) {


            print("${count} ")

            count++
            j++


        }
        println()
        column++
    }
}

fun printPatternTriangle12() {
    val max_row = 4
    var column = 1
    var space = 0
    while (column <= max_row) {


        while (space == max_row - column) {
            print(" ")
            space = space - 1


        }
        var j = 1
        while (j <= column) {
            print("*")
            j++
        }
        println()


        column++
    }
}