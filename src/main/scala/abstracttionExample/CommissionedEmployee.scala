package abstracttionExample

class CommissionedEmployee (val salary: Double, val commission: Double) extends Employee {

  override def calculatePay(): Double = salary + commission
}
