package ex2

class Exercicio2 {
    companion object{

        fun paragrafo(){
            print("Digite um paragrafo de texto: ")
            val paragrafo = readln()
            val palavras = paragrafo.split(" ")
            println("Quantidade palavras: ${palavras.size}")
        }
    }
}