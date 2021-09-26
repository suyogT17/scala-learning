package example

/**
 * object keyword creates an singleton instance
 */

object HelloWorld{
  def main(args: Array[String]){ // main method
    val name =  "suyog";
    val age = 23
    println(name+" is "+age+" years old")
    println(s"$name is $age years old") //not type safe
    println(f"$name%s is $age%d years old")
    println(s"Hello \nWorld");      // printing
    println(raw"Hello '\nWorld");    //raw string interpolation
  }
}