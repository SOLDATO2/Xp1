import objetos.Xp

fun main(){

    while (true) {
        print("Escolha o exercicio: ")
        var escolha = readln().toInt()

        when(escolha){
            1 -> Xp.exercicio1()
            2 -> Xp.exercicio2()
            3 -> Xp.exercicio3()
            4 -> Xp.exercicio4()
            5 -> Xp.exercicio5()
            6 -> Xp.exercicio6()
            7 -> Xp.exercicio7()
            8 -> Xp.exercicio8()

        }
    }
}