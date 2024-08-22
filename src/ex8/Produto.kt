package ex8

class Produto(var nome:String, var quantidade:Int, var nivelMinimo:Int, var nivelMaximo:Int) {
    fun reporEstoque(){
        quantidade = nivelMaximo
    }

    fun diminuirProduto(sub: Int) {
        if (sub <= quantidade) {
            quantidade -= sub
        } else {
            println("Erro! Quantidade a diminuir é maior do que a quantidade em estoque.")
        }
    }


    fun obterQuantidade(): Int {
        return quantidade
    }
    fun obterNivelMinimo(): Int{
        return nivelMinimo
    }


    override fun toString(): String {
        return "'$nome'"
    }


}