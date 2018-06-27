object whitch
{
  def main(args: Array[String]): Unit = {
    println("Enter the number")
    val a = scala.io.StdIn.readInt()
     if (a % 4 == 0 && a % 3 == 0) {
       println(a + " " + "foobar")
     }
     else if (a % 3 == 0)
     {
        println(a + " " + "Foo");
      }
      else if (a % 4 == 0)
     {
        println(a + " "+ "bar")
      }
     else
        {
          println(a + " "+"you in put not true the situation")
        }
    }

}
