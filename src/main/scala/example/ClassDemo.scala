package example

object ClassDemo {

  case class Student(var rollNo: Int = 11,var name: String = "suyog"){

    def printStudent(): Int={
      println(s"roll No: $rollNo name: $name")
      7
    }

    def >(s2:Student):Boolean ={
      rollNo > s2.rollNo

    }

  }

  def main(args: Array[String]): Unit = {
    val s1 = Student()
    s1.printStudent()

    val s2 = Student(rollNo = 14,name="abc")
    //s2.printStudent()
    println(s2.printStudent())
    println(s2>s1)
  }

}
