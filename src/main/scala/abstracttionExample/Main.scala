package abstracttionExample

object Main {

  def main(args: Array[String]): Unit={
    val emp = EmployeeFactory.createEmployee("HOURLY")

    val pay = emp.calculatePay()
    println("Salary = "+pay)
  }

}
