import javax.print.DocFlavor.INPUT_STREAM
import javax.print.attribute.IntegerSyntax
import kotlin.math.pow

fun main(args: Array<String>) {
    println(convertBinaryToDecimal(101))

    println(convertDecimalToBinary(5))
}

/**
Lecture 6: Binary & Decimal Number System

 **/

fun convertBinaryToDecimal(minput: Int): Int {
    var input = minput
    var answer = 0
    var i = 0
    var defaultBasePower = 2f
    while (input != 0) {

        var bit: Int = input % 10 // digit to binary
        if (bit.equals(1)) {
            answer = answer + defaultBasePower.pow(i).toInt()
        }

        input = input / 10
        i++
    }
    return answer

}

fun convertDecimalToBinary(minput: Int): Int {
    // x&1 = x%2
    // x>>2 == x/2

    var input = minput
    var ans = 0
    var i = 0
    var defaultpower: Float = 10f
    while (input != 0) {
        var bit: Int = input % 2 // last value of bit x&1
        ans = (((bit * defaultpower.pow(i) + ans).toInt()))
        input = input / 2 // shifting remainders  to right or shifting bit values to right

        i++

    }

    return ans

}