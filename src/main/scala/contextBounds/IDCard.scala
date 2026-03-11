package contextBounds

object IDCard {

      implicit val teacherId: IdCard[Teacher] =
        new IdCard[Teacher] {
          override def idNumber(value: Teacher): String =
            s"T-${value.name.take(3).toUpperCase}-123"
        }

    implicit val guestId: IdCard[Guest] =
      new IdCard[Guest] {
        override def idNumber(value: Guest): String =
          s"G-${value.name.take(3).toUpperCase}-999"
      }



}
