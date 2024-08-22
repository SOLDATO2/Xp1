package ex7

class Exercicio7 {
    companion object{
        fun voo(){
            var voo = Voo(1, Array(10){0})

            while(true){
                println("Digite o numero de um assento (0-9), sendo que o indicie representa o numero do assento (-1 para sair): ")
                var assento = readln().toInt()

                if(assento==-1){break}

                var statusAssento = voo.reservarAssento(assento)

                if(statusAssento == true){
                    println("Assento reservado com sucesso!")
                }else{
                    println("Erro! Assento já está reservado.")
                }
            }
        }
    }
}