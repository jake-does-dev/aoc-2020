package day02

import day02.PasswordWithPolicy.Companion.passwordWithPolicy
import java.io.File

fun countingPolicy(file: File) : Int {
    return file.readLines()
        .map { it.passwordWithPolicy() }
        .count(PasswordWithPolicy::validCount)
}

fun positionPolicy(file: File) : Int {
    return file.readLines()
        .map { it.passwordWithPolicy() }
        .count(PasswordWithPolicy::validPosition)
}

data class PasswordWithPolicy(
    val start: Int,
    val end: Int,
    val policyLetter: Char,
    val password: String
) {

    companion object {
        private val readerRegex = Regex("""(\d+)-(\d+) (\w): (\w+)""")

        fun String.passwordWithPolicy(): PasswordWithPolicy {
            return readerRegex.find(this)
                .let { match ->
                    if (match != null) {
                        val (start, end, policyLetter, password) = match.destructured
                        PasswordWithPolicy(start.toInt(), end.toInt(), policyLetter.first(), password)
                    } else throw RuntimeException(String.format("Unable to parse password with policy %s", this))
                }
        }
    }

    fun validCount(): Boolean =
        password.count { it == policyLetter } in start..end

    fun validPosition() : Boolean =
        (password[start - 1] == policyLetter) xor (password[end - 1] == policyLetter)
}