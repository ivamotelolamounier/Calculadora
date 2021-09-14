class Calculate {
    public fun addition(a: Float, b: Float): Float{
        return a + b
    }

    public fun subtraction(a: Float , b: Float): Float{
        return a - b
    }

    public fun multiplication(a: Float , b: Float): Float{
        return a * b
    }

    public fun division(a: Float , b: Float): Float{
        if (!(((a.equals(0)) && (b.equals(0))))){
            println("divisão por zero não é permitido")
        }
        return a / b
    }

    public fun rest(a: Float , b: Float): Float {
        return (a % b)
    }

    public fun factor(a: Double): Double {
        if (a.equals(1)){
            return 1.0
        }
        return a * factor(a - 1)
    }
}
