package ex8

class Exercicio8 {
    companion object{
        fun produto(){
            var produtos = mutableListOf<Produto>()
            while (true) {
                println("Escolha uma opção: \n 1. Cadastrar produto \n 2. Consultar estoque \n 3. Comprar produto \n4. Sair\n")
                var escolha = readln().toInt()

                if(escolha==1){
                    if (produtos.size == 5){
                        println("Não é possível adicionar mais produtos pois a lista está cheia")
                        continue
                    }
                    print("Digite o nome do produto: ")
                    var nome = readln()
                    print("Digite a quantidade inicial do estoque: ")
                    var quantidade = readln().toInt()
                    print("Digite o nivel minimo de estoque: ")
                    var nivelMinimo = readln().toInt()
                    print("Digite o nivel maximo de estoque: ")
                    var nivelMaximo = readln().toInt()

                    produtos.addLast(Produto(nome, quantidade, nivelMinimo, nivelMaximo))
                    println("Produto cadastrado.")
                }else if(escolha==2){
                    if(produtos.size == 0){
                        println("Não existem produtos cadastrados para consultar.")
                        continue
                    }

                    var index = 0
                    println("Escolha um produto:")
                    produtos.forEach{
                        print("$index. ${it.toString()}")
                        index++
                    }
                    index = 0

                    val escolhaProduto = readln().toInt()

                    val qntProduto = produtos[escolhaProduto].obterQuantidade()
                    val nivelMinimo = produtos[escolhaProduto].obterNivelMinimo()

                    println("Quantidade do produto: $qntProduto")

                    if(qntProduto < nivelMinimo){
                        println("Produto está com estoque abaixo do minimo...adicionando mais!")
                        produtos[escolhaProduto].reporEstoque()
                    }

                }else if(escolha == 3){
                    if (produtos.size == 0){
                        println("Não existem produtos cadastrados para comprar.")
                        continue
                    }
                    var index = 0
                    println("Escolha um produto:")
                    produtos.forEach{
                        print("$index. ${it.toString()}")
                        index++
                    }
                    index = 0

                    val escolhaProduto = readln().toInt()
                    if(produtos[escolhaProduto].obterQuantidade() != 0){
                        while (true){
                            println("Digite uma qtd para comprar!: ")
                            var qtd = readln().toInt()
                            if(qtd <= produtos[escolhaProduto].obterQuantidade()){
                                produtos[escolhaProduto].diminuirProduto(qtd)
                                println("Transação concluida!")
                                break
                            }else {
                                println("Erro! Quantidade digitada é maior do que a quantidade em estoque.")
                            }
                        }
                    }else{
                        println("Produto fora de estoque")
                    }
                }else if(escolha==4){
                    break
                }else{
                    println("Escolha invalida")
                }
            }
        }



    }

}