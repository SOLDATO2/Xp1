package ex5

class Exercicio5 {
    companion object{
        fun lancamentos(){
            print("Digite quantos lançamentos você quer efetuar?: ")

            val lancamentos = readln().toInt()
            val lancamentosArray = Array(lancamentos){0}
            for (i in lancamentosArray.indices){
                var dado1 = (1..6).random()
                var dado2 = (1..6).random()

                var dadoFinal = dado1 + dado2
                lancamentosArray[i] = dadoFinal
            }

            for(i in lancamentosArray.indices){
                println("Lançamento ${i+1}: ${lancamentosArray[i]}")
            }
        }
    }
}