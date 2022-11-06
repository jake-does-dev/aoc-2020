import day01.multiplyPair
import day01.multiplyTriple
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

internal class Day01KtTest {

    @Test
    fun multiplyPairExampleInput() {
        assertEquals(514579, multiplyPair(2020, File("src/main/resources/day01/example.txt")))
    }

    @Test
    fun multiplyPairPuzzleInput() {
        assertEquals(1007104, multiplyPair(2020, File("src/main/resources/day01/puzzle.txt")))
    }

    @Test
    fun multiplyTripleExampleInput() {
        assertEquals(241861950, multiplyTriple(2020, File("src/main/resources/day01/example.txt")))
    }

    @Test
    fun multiplyTriplePuzzleInput() {
        assertEquals(18847752, multiplyTriple(2020, File("src/main/resources/day01/puzzle.txt")))
    }
}