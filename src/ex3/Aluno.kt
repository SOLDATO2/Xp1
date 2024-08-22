package ex3



class Aluno(private var nome:String, private var notas: Array<Int>) {



    fun calcularMedia(): Double {
        return notas.average()
    }
    fun verificarAprovacao(){
        if(notas.average() >= 7.0){
            println("Aprovado")
        }else{
            println("Reprovado")
        }
    }

    override fun toString(): String {
        return "Aluno(nome='$nome')"
    }
}