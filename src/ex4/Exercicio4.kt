package ex4

class Exercicio4 {
    companion object{
        fun ordenacao(){
            var nomes = Array(10){""}
            println("Digite 10 nomes: ")

            for(i in nomes.indices){
                nomes[i] = readln()
            }
            nomes.sort()
            println("Nomes em ordem alfabetica: ")
            nomes.forEach {
                println("$it")
            }
        }
    }
}