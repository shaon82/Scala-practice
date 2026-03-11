package abstracttionExample

object EmployeeFactory {
  
  def createEmployee(empType: String): Employee={
    empType match {
      case "HOURLY" => new HourlyEmployee(40)
      case "SALARIED" => new SalariedEmployee(3000)
      case "COMMISSIONED" => new CommissionedEmployee(3000,2000)
      case _ => throw new RuntimeException("Invalid Type")
    }
  }

}
