package ar.edu.unq.ui

class Str {

    fun revert(unString: String): String {
        // recibe una cadena de caracteres y retorna una cadena
        // ordenada en el sentido opuesto
        var reverso: String = ""
        for (char in unString) {
            reverso = char + reverso
        }
        return reverso
    }

    fun isPalindrome(unString: String): Boolean {
        // palindromo o capicua requiere un string de al menos tres
        // caracteres y que sea que la cadena sea la misma al derecho o reves
        if (unString.length > 2) {
            return this.revert(unString) == unString
        }
        else {
            return false
        }
    }

    fun vowels(unString: String): Int {
        // retorna la cantidad de vocales de una cadena de string
        var countVowels = 0
        for (char in unString) {
            if (char.toLowerCase() in "aeiou") {
                countVowels +=1
            }
        }
        return countVowels
    }

    fun words(unString: String): Int {
        // retorna la cantidad de palabras de una cadena de string
        val countWords = unString.split(" ").count()
        return countWords
    }

    fun paragraph(unString: String): Int {
        // retorna la cantidad de parrafos de una cadena de string.
        // se toma como separador de parrafo al salto de linea
        var countParagraph = 1
        for (char in unString) {
            if (char == '\n') {
                countParagraph += 1
            }
        }
        return countParagraph
    }
}