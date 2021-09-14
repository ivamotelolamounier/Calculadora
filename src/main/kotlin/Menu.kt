class Menu(private val calculate: Calculate) {

    private fun interactMenuTwoNumber(): ReturnFun {

        var n1: Int
        var n2: Int

        println("Entre com o primeiro número: ")
        n1 = Integer.valueOf(readLine())

        println("Entre com o segundo número: ")
        n2 = Integer.valueOf(readLine())

        return ReturnFun(n1, n2)
    }

    private fun interactMenuOneNumber(): ReturnFun {

        var n1: Int

        println("Entre com o número: ")
        n1 = Integer.valueOf(readLine())

        return ReturnFun(n1, null)
    }

    fun optionsMenu(choose: String?) {

        when (choose) {
            "1" -> {
                val (n1, n2) = interactMenuTwoNumber()
                var result = calculate.addition(n1.toFloat(), (n2 ?: 0).toFloat())
                printResult(result)
            }
            "2" -> {
                val (n1, n2) = interactMenuTwoNumber()
                var result = calculate.subtraction(n1.toFloat(), (n2 ?: 0).toFloat())
                printResult(result)
            }
            "3" -> {
                val (n1, n2) = interactMenuTwoNumber()
                var result = calculate.multiplication(n1.toFloat(), (n2 ?: 0).toFloat())
                printResult(result)
            }
            "4" -> {
                val (n1, n2) = interactMenuTwoNumber()
                var result = calculate.division(n1.toFloat(), (n2 ?: 0).toFloat())
                printResult(result)
            }
            "5" -> {
                val (n1, n2) = interactMenuTwoNumber()
                var result = calculate.rest(n1.toFloat(), (n2 ?: 0).toFloat())
                printResult(result)
            }
            "6" -> {
                val (n1) = interactMenuOneNumber()
                var result = calculate.factor(n1.toDouble())
                printResult(result.toFloat())
            }
            else -> {
                println("Fim")
            }
        }
    }

    fun printResult(result: Float) {
        println("")
        println("Resultado: $result")
        println("")
    }

    fun menu() {
        var choose: String?

        do {
            println("Menu de opções: ")
            print("")
            print(" [1]- Somar")
            print("")
            print(" [2]- Subtrair")
            print("")
            print(" [3]- Multiplicar")
            print("")
            println(" [4]- Dividir")
            print("")
            print(" [5]- Resto")
            print("")
            print(" [6]- Fatorar")
            print("")
            print("  [7]- Finalizar")
            print("")
            print(" -> Escolha a operação: ")
            choose = readLine()

            optionsMenu(choose)

        } while (choose != "7")
    }
}