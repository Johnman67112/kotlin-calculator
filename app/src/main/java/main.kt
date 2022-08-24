fun main() {
    println("Olá, bem vindo a calculadora")
    print("Qual operação deseja fazer?(+,-,*,/):")
    var operation:String = readLine()!!

    print("\ndigite um numero:")
    var number1:Float = readLine()!!.toFloat()
    
    print("\ndigite outro numero:")
    var number2:Float = readLine()!!.toFloat()


    var total = calculate(number1, number2, operation)

    println(total)
}

fun calculate(number1:Float, number2:Float, operation:String):Float {
    var total : Float = 0.0f
    when(operation) {
        "+" -> total = number1 + number2
        "-" -> total = number1 - number2
        "*" -> total = number1 * number2
        "/" -> total = number1 / number2
    }

    return total
}