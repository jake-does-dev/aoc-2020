package day01

import java.io.File

fun multiplyPair(sum: Int, file: File) : Int? =
    file.readLines()
        .map(String::toInt)
        .multiplyPairThatSumsTo(sum)

fun multiplyTriple(sum: Int, file: File) : Int? =
    file.readLines()
        .map(String::toInt)
        .multiplyTripleThatSumsTo(sum)

private fun List<Int>.multiplyPairThatSumsTo(sum: Int): Int? =
    findPairThatSumsTo(sum)?.multiply()

private fun List<Int>.multiplyTripleThatSumsTo(sum: Int): Int? =
    findTripleThatSumsTo(sum)?.multiply()

private fun List<Int>.findPairThatSumsTo(sum: Int): Pair<Int, Int>? {
    val complements = associateBy { sum - it }
    val pair = firstNotNullOfOrNull { number ->
        val complement = complements[number]
        if (complement != null) {
            Pair(number, complement)
        } else null
    }
    return pair
}

private fun List<Int>.findTripleThatSumsTo(sum: Int): Triple<Int, Int, Int>? =
    firstNotNullOfOrNull { number ->
        val pair = findPairThatSumsTo(sum - number)
        if (pair != null) return Triple(number, pair.first, pair.second) else null
    }

private fun Pair<Int, Int>.multiply() : Int =
    first * second

private fun Triple<Int, Int, Int>.multiply() : Int =
    first * second * third
