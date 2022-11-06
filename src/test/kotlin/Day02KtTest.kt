import day02.countingPolicy
import day02.positionPolicy
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day02KtTest {
    @Test
    fun countingPolicyExampleInput() {
        Assertions.assertEquals(2, countingPolicy(File("src/main/resources/day02/example.txt")))
    }

    @Test
    fun countingPolicyPuzzleInput() {
        Assertions.assertEquals(580, countingPolicy(File("src/main/resources/day02/puzzle.txt")))
    }

    @Test
    fun positionPolicyExampleInput() {
        Assertions.assertEquals(1, positionPolicy(File("src/main/resources/day02/example.txt")))
    }

    @Test
    fun positionPolicyPuzzleInput() {
        Assertions.assertEquals(611, positionPolicy(File("src/main/resources/day02/puzzle.txt")))
    }
}