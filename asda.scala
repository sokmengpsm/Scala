  object TimeTable
  {
    def main(args:Array[String]): Unit = {
      println("Enter a number to  ");
      val a = scala.io.StdIn.readInt()
      var num = 0;
      for (num <- 1 to 10)
      {
        println(a+ "*" +num+ "=" +(a*num));
      }
    }
  }
