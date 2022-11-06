package day03

import java.io.File

private const val TREE = '#'

fun multiplyTrees(file: File, slopes: Set<Slope>) : Long {
    val lines = file.readLines()

    return slopes
        .map { countTrees(lines, it) }
        .fold(1) { runningMultiple, nextTreeCount -> runningMultiple * nextTreeCount}
}

fun countTrees(lines: List<String>, slope: Slope) : Int =
    lines
        .filterIndexed { index, row -> isTree(row, index, slope) }
        .count()

fun isTree(row: String, index: Int, slope: Slope) : Boolean =
    when(index % slope.downStep) {
        0 -> row[(index * slope.rightStep / slope.downStep) % row.length] == TREE
        else -> false
    }

data class Slope(
    val rightStep: Int,
    val downStep: Int
)