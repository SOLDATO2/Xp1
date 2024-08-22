package ex6

class Exercicio6 {
    companion object{
        fun temperatura(){
            println("Digite a temperatura de 30 dias.")
            val diasDoMes = Array<Float>(5){ 0.0F }
            for (i in diasDoMes.indices){
                diasDoMes[i] = readln().toFloat()
            }
            var indicieMax = 0
            var max = diasDoMes[0]
            var indicieMin = 0
            var min = diasDoMes[0]

            for(i in diasDoMes.indices){
                if(diasDoMes[i] > max){
                    indicieMax = i
                    max = diasDoMes[i]
                }
                if(diasDoMes[i] < min){
                    indicieMin = i
                    min = diasDoMes[i]
                }
            }
            println("Dia: ${indicieMax+1}| Temperatura max:${diasDoMes.max()}")
            println("Dia: ${indicieMin+1}| Temperatura min:${diasDoMes.min()}")
            println("Temperatura média:${diasDoMes.average()}")
        }
    }
}