

object MaxDemo {

  def findMax[T: Ordering](a: T, b: T): T = {
    val ord = implicitly[Ordering[T]]
    if (ord.compare(a,b) > 0) a else b
  }

  implicit val greeting: String = "hello shaon";

  def sayHello(implicit msg: String): Unit = {
    println(msg);
  }

  implicit def intToString(x:Int): String = x.toString

  val str: String = 10


  def main(args: Array[String]): Unit = {
    println(findMax(5,10))
    sayHello;
    println(str)
  }
}