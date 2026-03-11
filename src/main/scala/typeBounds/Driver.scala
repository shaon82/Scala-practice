package typeBounds

object Driver {

  def register[T <: Student](student: T):String={
    s"${student.name} registered successfully."
  }

  def main(args: Array[String]): Unit = {

    val s1 = UniversityStudent("Shaon")
    val s2 = SchoolStudent("Ehan")

    println(register(s1))
    println(register(s2))
  }

}
