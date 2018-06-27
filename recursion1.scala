object so
{
//  def main(args: Array[String]): Unit = {
//    for (i <- 1 to 10)
//    {
//      println("Factorial of " + i + ": = " + factorial(i))
//    }
//  }
//  def factorial(n: BigInt): BigInt = {
//    if (n <= 1)
//      1
//    else
//      n * factorial(n - 1)
//  }
def main(args: Array[String]): Unit = {
  for(num <- 1 to 5)
    {
      println("Factorial of"+num+ ": = "+factorial(num));
    }
}
  def factorial(n: Int): Int =        //if do not have agrument put unit but if have put int
{
  if(n == 1)
      1
  else

      n * factorial(n - 1);
}
}
