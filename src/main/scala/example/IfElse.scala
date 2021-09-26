package example

object IfElse{
  def main(args:Array[String]){
    val x = 20
    var res1 = ""
    if(x == 20)
      res1 = "x == 20"
    else if (x < 0)
      res1 = "x != 20"

    println(res1)

    val res2 = if (x != 20) "x != 20" else "x == 20"

    println(res2)

  }
}