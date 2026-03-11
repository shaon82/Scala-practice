package abstracttionExample

class SalariedEmployee (val salary: Double) extends Employee {


  override def calculatePay(): Double = salary
}
