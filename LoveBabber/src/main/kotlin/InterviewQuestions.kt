fun main() {
    println(reverseString("Sam"))
    println(isStringPalindrome("sas"))
    println(isIntegerPalindrome(101))
    println(findFactorialInt(5))
    println(isAnagram("listen", "speak"))
}

fun reverseString(input: String): String {
    var reverseString = ""
    for (i in input.length - 1 downTo 0) {
        reverseString += input.get(i)
    }
    return reverseString
}

fun isStringPalindrome(input: String): Boolean {
    return input == reverseString(input)
}

fun isIntegerPalindrome(input: Int): Boolean {
    val inputString = input.toString()
    var reverseInt = ""
    for (i in inputString.length - 1 downTo 0) {
        reverseInt += inputString.get(i)
    }
    return inputString == reverseInt
}

fun findFactorialInt(input: Int): Long {
    var result: Long = 1
    for (i in 1..input) {
        result *= i
    }
    return result
}

fun isAnagram(str1: String, str2: String) {
    var char1 = str1.toCharArray().sort()
    var char2 = str2.toCharArray().sort()
    println(char1)
    println(char2)

}