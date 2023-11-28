fun main(args: Array<String>) {

    val array = intArrayOf(2, 5, 4)
    ssort(array)

    println(array.joinToString())
 /*   sort(array)
    println(array.joinToString())
    println(reverseString("Sam"))
    println(isStringPalindrome("sas"))
    println(isIntegerPalindrome(101))
    println(findFactorialInt(5))
    println(isAnagram("tac", "mat"))
    println(isPrime(1))
    println(sumOfElementInArray(intArrayOf(1, 22, 44)))
    println(maxValueArray(intArrayOf(2, 88, 8, 6)))
    println(findSecondThirdLargest(intArrayOf(2, 100, 77, 6)))
    println(countOccurrence(intArrayOf(2, 3, 2, 2, 5, 22), 2))
    val newArray = removeDuplicates(intArrayOf(2, 3, 2, 2, 5, 22))
    println("Array without duplicates: ${newArray.joinToString()}")
    // println(findTheMissingNumber(intArrayOf(1, 2, 3, 4, 6, 7)))

    println(findTheSecondNonRepeating("mom"))
    println(reverseArray())*/

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


fun isAnagram(str1: String, str2: String): Boolean {
    var char1 = str1.toLowerCase().toCharArray().sorted()
    var char2 = str2.toLowerCase().toCharArray().sorted()
    return char1 == char2
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

fun sumOfElementInArray(array: IntArray): Long {
    var sum = 0
    array.forEachIndexed { index, i ->
        sum += i
    }
    return sum.toLong()
}

fun maxValueArray(array: IntArray) {
    var max = Int.MIN_VALUE
    /*  for (num in array) {
          if (num > max) {
              max = num
          }
      }*/
    val reverseArray = array.sort()
    //Arrays.sort()//java

    println(array[0])
}

fun findSecondThirdLargest(array: IntArray): Int {
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (element in array) {
        if (element > largest) {

            secondLargest = largest
            largest = element
            println(largest)
        } else if (element > secondLargest && element < largest) {
            secondLargest = element
        }
    }
    return secondLargest
}

fun countOccurrence(array: IntArray, target: Int) {
    var count = 0
    array.forEachIndexed { index, i ->
        if (i == target) {
            count++
        }
    }
    println(count)
}

fun removeDuplicates(array: IntArray): IntArray {
    val distinctArray = LinkedHashSet<Int>()
    for (num in array) {
        distinctArray.add(num)
    }
    // another array.distinct()
    return distinctArray.toIntArray()

}

fun findTheMissingNumber(array: IntArray): Int {
    val n = array.size + 1
    val totalSum = (n * (n + 1) / 2) // sum of consecutive
    var arraySum = 0

    for (num in array) {
        arraySum += num
    }
    return totalSum - arraySum
}

fun findTheSecondNonRepeating(input: String): Char? {
    val charFrequency = HashMap<Char, Int>()
    for (char in input) {
        charFrequency[char] = charFrequency.getOrDefault(char, 0) + 1
    }
    for (char in input) {
        if (charFrequency[char] == 1) {
            return char
        }
    }
    return null
}

fun reverseArray() {
    val arr = intArrayOf(2, 4, 6, 7)
    val reverseArray = arrayListOf<Int>()

    for (i in arr.size - 1 downTo 0) {
        reverseArray.add(arr.get(i))
    }
    println(reverseArray.joinToString())
}

fun bubbleSortDescending(array: IntArray) {
    val n = array.size

    for (i in 0 until n - 1) {
        var swapped = false
        for (j in 0 until n - i - 1) {
            if (array[j] < array[j + 1]) {
                // Swap array[j] and array[j + 1]
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                swapped = true
            }
        }

        // If no two elements were swapped in the inner loop, the array is already sorted
        if (!swapped) {
            break
        }
    }
}

fun sort(array: IntArray) {
    val n = array.size

    for (i in 0 until n - 1) {
        var swap = false
        for (j in 0 until n - i - 1) {

            if (array[j] < array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                swap = true
            }
        }
        if (!swap) {
            break
        }
    }

}

fun sortDec(array: IntArray) {
    val n = array.size
    for (i in 0 until n) {

        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                var swapped = false

                var temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                swapped = true
            }

        }

    }

}

fun ssort(array: IntArray) {
    val n = array.size
    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
             if (array[j]< array[j+1]){
                 val temp=array[j]
                 array[j]= array[j+1]
                 array[j+1]=temp

             }
        }
    }

}

fun bubbleSort(array: IntArray) {
    val n = array.size

    for (i in 0 until n - 1) {
        var swapped = false
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                // Swap array[j] and array[j + 1]
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                swapped = true
            }
        }

        // If no two elements were swapped in the inner loop, the array is already sorted
        if (!swapped) {
            break
        }
    }
}