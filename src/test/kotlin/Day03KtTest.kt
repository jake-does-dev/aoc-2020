import day03.Slope
import day03.multiplyTrees
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day03KtTest {
    private val partOneSlope = Slope(rightStep = 3, downStep = 1)
    private val slopes = setOf(
        Slope(rightStep = 1, downStep = 1),
        partOneSlope,
        Slope(rightStep = 5, downStep = 1),
        Slope(rightStep = 7, downStep = 1),
        Slope(rightStep = 1, downStep = 2),
    )

    @Test
    fun countTreesExampleInput() {
        Assertions.assertEquals(7, multiplyTrees(File("src/main/resources/day03/example.txt"), setOf(partOneSlope)))
    }

    @Test
    fun countTreesPuzzleInput() {
        Assertions.assertEquals(162, multiplyTrees(File("src/main/resources/day03/puzzle.txt"), setOf(partOneSlope)))
    }

    @Test
    fun multiplyTreesExampleInput() {
        Assertions.assertEquals(336, multiplyTrees(File("src/main/resources/day03/example.txt"), slopes))
    }

    @Test
    fun multiplyTreesPuzzleInput() {
        Assertions.assertEquals(3064612320, multiplyTrees(File("src/main/resources/day03/puzzle.txt"), slopes))
    }
}