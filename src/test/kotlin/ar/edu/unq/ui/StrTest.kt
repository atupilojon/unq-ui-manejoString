package ar.edu.unq.ui

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StrTest {

    @Test
    fun reverseTest() {
        val unString = Str()
        assertTrue { unString.revert("interfaces") == "secafretni" }
    }

    @Test
    fun palindromeTest() {
        val  unString = Str()
        assertTrue (unString.isPalindrome("neuquen"))
        assertFalse (unString.isPalindrome("interfaces"))
    }

    @Test
    fun countVowelsTest() {
        val unString = Str()
        assertTrue(unString.vowels("Acido clorhidrico") == 7)
    }

    @Test
    fun countWordTest() {
        val unString = Str()
        assertTrue(unString.words("construnccion de interfaces de usuario") == 5)
    }

    @Test
    fun countParagraphTest() {
        val unString = Str()
        assertTrue(unString.paragraph("Construnccion de interfaces de usuario.\nUNQ.\nFin.") == 3)
    }
}