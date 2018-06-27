object lo
{
  def main(args: Array[String]): Unit = {
    println("Input the value of it = ")
    val a = scala.io.StdIn.readInt();
    val arr = new Array[Int](a)
    var sum = 0;
    var i = 0;
    for(i <- 0 to a)
      {
        if(i==0)
          {
            println(i);
          }
        else
          {
            sum = sum+i;
            sum = sum -i;

          }
      }
  }
}
