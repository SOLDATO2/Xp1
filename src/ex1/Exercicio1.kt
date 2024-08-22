package ex1

import kotlin.math.sqrt

class Exercicio1 {

    companion object{
        fun primo(num: Int): Boolean {
            if (num <= 1){ return false }
            if (num == 2) {return true}
            if (num % 2 == 0) {return false}
            for (i in 3..sqrt(num.toDouble()).toInt() step 2) {
                if (num % i == 0) return false
            }
            return true
        }

        fun exPrimo(){
            println("Digite um numero: ")
            if(primo(readln().toInt())){
                println("Numero é primo!")
            }else{
                println("Numero não é primo")
            }
        }



    }

}