package abstracttionExample

class HourlyEmployee (val hours: Int) extends Employee {


  override def calculatePay(): Double = hours * 10
}
