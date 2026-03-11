package contextBounds

import contextBounds.IDCard.{guestId, teacherId}


object CampusSecurity {


  def enterCampus[T : IdCard](person: T): String ={
    val idCardInstance = implicitly[IdCard[T]]
    val id = idCardInstance.idNumber(person)
    s"Access granted. ID: $id"
  }


  def main(args: Array[String]): Unit = {

    println(enterCampus(Teacher("Rahim")))
    println(enterCampus(Guest("Karim")))
  }

}
