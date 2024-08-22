package ex3

class Exercicio3 {

    companion object{
        fun aluno(){
            var alunos = mutableListOf<Aluno>()
            while (true){
                println("Escolha uma opção: \n 1. Cadastrar Aluno \n 2. Calcular média de aluno \n 3. Sair\n")
                var input = readln().toInt()

                if (input == 1){
                    if (alunos.size == 5){
                        println("Impossivel cadastrar mais alunos (Lista cheia).")
                        continue
                    }

                    print("Digite o nome do aluno: ")
                    var nome = readln()
                    println("Digite as 3 nota do aluno separados por Enter: ")
                    var notas = Array(3){0}
                    for (i in notas.indices){
                        print("Nota $i: ")
                        notas[i] = readln().toInt()
                    }
                    alunos.addLast(Aluno(nome, notas))
                    println("Aluno cadastrado!")

                } else if (input == 2){
                    if(alunos.size == 0) {
                        println("A lista de alunos está vazia.")
                        continue
                    }

                    println("Escolha um aluno: ")
                    var indicie = 0
                    alunos.forEach{
                        indicie++
                        print("$indicie. ${it.toString()}\n")
                    }
                    indicie = 0

                    var escolha = readln().toInt()
                    print("Media: ${alunos[escolha-1].calcularMedia()}\n")
                    alunos[escolha-1].verificarAprovacao()

                }else if(input == 3){
                    break
                }else{
                    println("Comando invalido.")
                }


            }
        }
    }

}