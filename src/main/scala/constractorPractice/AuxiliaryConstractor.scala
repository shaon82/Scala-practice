package constractorPractice

class AuxiliaryConstractor(val width: Int, val height: Int) {

  var area: Int = width * height

  def this(side: Int) = {
    this(side,side)
  }

  override def toString: String = s"Rectangle: area: $area )"

}


object main {

  def main(args: Array[String]): Unit = {
    val auxiliaryConstractor = new AuxiliaryConstractor(4)

    println(auxiliaryConstractor)
  }
}
