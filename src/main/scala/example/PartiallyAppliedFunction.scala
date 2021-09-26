package example

import java.util.Date

object PartiallyAppliedFunction {

  def log(date:Date,msg: String){
    println(s"$date : $msg")
  }

  def main(args: Array[String]): Unit = {

    val date = new Date()
    val newLog = log(date, _:String)

    val sum = (a:Int,b:Int,c:Int) => a+b+c
    val f = sum(10,20, _:Int)
    newLog(f(20).toString)

    newLog("This is sample log")
  }
}
