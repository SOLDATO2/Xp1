package ex7

class Voo (var numeroDoVoo:Int, var assentosDisponiveis: Array<Int>){

    fun reservarAssento(assento: Int): Boolean{
        if (assentosDisponiveis[assento] == 0){
            assentosDisponiveis[assento] = 1
            return true
        }
        return false
    }



}