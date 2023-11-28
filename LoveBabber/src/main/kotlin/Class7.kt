import javax.print.DocFlavor.INPUT_STREAM
import javax.print.attribute.IntegerSyntax
import kotlin.math.pow

fun main(args: Array<String>) {
    print(bitwiseComplement(5))


}

/**
: Lecture 7: LeetCode Problem Solving Session

 **/


fun reverseInteger(i: Int): Int {
    var input = i

    var answer = 0
    var defaultBasePower = 10f
    while (input != 0) {
        var digit = input % 10 // last digit
        println(" digit  $digit")
        answer = (answer * defaultBasePower).toInt() + digit // append
        println(" answer  $answer")
        input = input / 10
        println(" input  $input")
    }
    println(" final answer $answer")
    return answer
}

fun reverseIntegerHandle64Bit(i: Int): Int {
    var input = i

    var answer = 0
    var defaultBasePower = 10f
    while (input != 0) {

        if ((input > Int.MAX_VALUE / 10) || (input < Int.MIN_VALUE / 10)) {
            return 0
        }
        var digit = input % 10 // last digit
        answer = (answer * defaultBasePower).toInt() + digit // append

        input = input / 10

    }
    println(" int max  ${Int.MAX_VALUE / 10}  int min  ${Int.MIN_VALUE / 10}")
    return answer
}

fun IntegerToCompliment(input: Int) {
    // 101 to 010
    var mInput = input
    var answer = 0
    var defaultPowerBase = 10f
    var i = 0
    while (mInput != 0) {
        var bit = mInput % 2
        if (bit == 1) {
            bit = 0
        } else if (bit == 0) {
            bit = 1
        }

        answer = (((bit * defaultPowerBase.pow(i) + answer).toInt()))
        mInput = mInput / 2
        i++
    }
    println(convertBinaryToDecimal(answer))
}

fun bitwiseComplement(n: Int): Int {

     var input = n
    var answer = 0
    var mask = 0
    var i = 0
    while (input != 0) {
        mask = (mask shl 1) or 1
        input = input shr 1

    }
    answer =  n.inv() and mask


    return answer
}

fun convertBinarytoDecimal2(k: Int): Int {
    var input = k
    var answer = 0
    var i = 0
    var defaultBasePower = 2f
    while (input != 0) {
        var digit = input % 10
        if (digit.equals(1)) {
            answer = answer + defaultBasePower.pow(i).toInt()
        }
        input = input / 10
        i++

    }
    return answer

}

