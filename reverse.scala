
object ReverseConcat {
  import scala.collection.mutable.ListBuffer
  def main(args: Array[String]): Unit = {
    var List1Buffer = new ListBuffer[Int]()
    var List3Buffer = new ListBuffer[Int]()
    var List2Buffer = new ListBuffer[Int]()
    var i = 0
    var num = 0
    var num1 = 0
    var num2 = 0
    println("Enter the size of each List")
    var length1 = scala.io.StdIn.readInt()
    var length2 = length1
    var length3 = length1
    var length4 = length1
    for(i <- 0 to length1)
    {
      println("Enter the number in List1")
      var ele = scala.io.StdIn.readInt()
      List1Buffer+=ele
      println("Enter the number in List2")
      var ala = scala.io.StdIn.readInt()
      List2Buffer+=ala
      List3Buffer+=ele
      List3Buffer+=ala
    }
    println("List 1" + List1Buffer)
    println("List 2" + List2Buffer)
    println("List 3" + List3Buffer)
    println("List 1 Reverse: " + List1Buffer.reverse)
    println("List 2 Reverse: " + List2Buffer.reverse)
    println("List 3 Reverse: " + List3Buffer.reverse)
    for(num <- 0 to length2)
    {
      if(List1Buffer(num) % 2 != 0)
      {
        println(List1Buffer(num))
      }
    }
    for(num1 <- 0 to length3)
    {
      if(List2Buffer(num1) % 2 != 0)
      {
        println(List2Buffer(num1))
      }
    }
    for(num2 <- 0 to length4)
    {
      if(List3Buffer(num2) % 2 != 0)
      {
        println(List3Buffer(num2))
      }
    }
    println("List1BufferString" + List1Buffer.mkString)
    println("List2BufferString" + List2Buffer.mkString)
    println("List3BufferString" + List3Buffer.mkString)
    println("List1Buffer Xlastone" + List1Buffer.init)
    println("List2Buffer Xlastone" + List2Buffer.init)
    println("List3Buffer Xlastone" + List3Buffer.init)
  }
}