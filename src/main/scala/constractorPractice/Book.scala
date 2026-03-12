package constractorPractice

class Book (val title: String, val author: String, val year: Int){

  var edition: Int = 1


  def this(title: String, author: String)={
    this(title,author,-1)
  }

  def this(title: String)={
    this(title,"Unknown Author")
  }

  override def toString: String = s"Book(title: $title, author: $author, year: $year, edition: $edition)"

}


object Demo {
  def main(args: Array[String]): Unit = {
    val book1 = new Book("1984", "George Orwell", 1949)
    val book2 = new Book("To Kill a Mockingbird", "Harper Lee")
    val book3 = new Book("Unknown Title")
    println(book1)
    println(book2)
    println(book3)
  }
}
