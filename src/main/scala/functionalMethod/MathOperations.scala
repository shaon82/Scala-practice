package functionalMethod

class MathOperations {
  
  def applyOperation(x: Int, y: Int, op: (Int,Int) => Int): Int ={
    op(x,y)
  }

}
