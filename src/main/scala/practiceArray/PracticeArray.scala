package practiceArray

object PracticeArray {


  def main(args: Array[String]): Unit = {
    var z: Array[String] = new Array[String](2)

    var x = new Array[String](3)

    var myList = Array(1.9,2.9,3.9,4.9)

    for (x <- myList){
      println(x)
    }


    var total = 0.0

    for (i <- 0 to  (myList.length -1)){
      total += myList(i )
    }

    println("Total is : "+total)


//    multi dimension array

    var matrix = Array.ofDim[Int](3,3)

    matrix(0)(0) = 1;
    matrix(0)(1) = 2;
    matrix(0)(2) = 3
    matrix(1)(0) = 4;
    matrix(1)(1) = 5;
    matrix(1)(2) = 6;
    matrix(2)(0) = 7;
    matrix(2)(1) = 8;
    matrix(2)(2) = 9;

    for (i <- 0 to 2){
      for(j <- 0 to 2){
        print(matrix(i)(j)+ "\t")
      }
      println()
    }


  }

}
