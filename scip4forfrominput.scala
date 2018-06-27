object scip4forfrominput
{
  def main(args: Array[String]): Unit = {
    println("Enter the number: ")
    var a = scala.io.StdIn.readInt();
    for(i<- 1 to a)
      {
        if(i%4== 0)
          {

          }
        else
          {
            println(i);
          }
      }
  }
}
