package functionalMethod

object MathTest {

  def addition(a: Int)(b: Int): Int={
    a+b
  }

  def main(args: Array[String]): Unit = {

    val mathOps = new MathOperations();

    val add = (a: Int, b: Int) => a+b

    val multiply = (a: Int, b: Int) => a*b

    println(mathOps.applyOperation(2,3,add))
    println(mathOps.applyOperation(2,3,multiply))

    val addFive = addition(5)
    val sum = addFive(3)

    println(sum)

  }

}
