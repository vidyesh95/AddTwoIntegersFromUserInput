import java.util.*

fun main() {
    val readNumber = Scanner(System.`in`)
    print("Enter first integer:")
    val firstNumber = readNumber.nextInt()
    print("Enter second integer:")
    val secondNumber = readNumber.nextInt()
    val sum = firstNumber + secondNumber
    print("sum=$sum")
}