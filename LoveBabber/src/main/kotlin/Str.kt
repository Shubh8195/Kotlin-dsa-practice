fun main(args: Array<String>) {
    val para = "I am a senior Android developer with three years of experience, writing to express my interest in the Android developer position at [Company Name]. I have a strong command of the Android SDK, Java, Kotlin, and relevant frameworks. I excel at designing user-friendly interfaces, integrating APIs, and optimizing app performance. I have successfully led a team in launching a high-profile application and possess strong problem-solving skills. I am eager to contribute to [Company Name]'s success. Thank you for considering my application."

    val findChar = "I"
    var occurance = 0
    var x = 0
    for (i in para) {
       if (findChar==para.get(x++).toString()){
           occurance++
       }
    }
    /*para.forEachIndexed { index, c ->

        if (c.toString() == findChar) {
            // println("$index")
            occurance++
        }

    }*/
    println("occurent times " + occurance )
}