object findbigtosmall
{
  def main(args: Array[String]): Unit = {
    {

      var ar: Array[Int] = new Array[Int](4)
      println("Enter three number : ")
      for(i <- 0 until ar.length)
      {
        ar(i) = scala.io.StdIn.readInt()
      }
      for(i <- 0 until ar.length)
      {
        for(j <- i+1 until ar.length)
        {
          if(ar(i)<ar(j))
          {
            var temp = ar(i)
            ar(i) = ar(j)
            ar(j) = temp
          }
        }
      }
      println("The ascending order of that number is : ")
      for(i <- 0 until ar.length)
      {
        println(ar(i))
      }

    }
  }
}
