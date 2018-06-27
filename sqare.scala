object sqare
{
  def main(args: Array[String]): Unit = {
    println("Input the number of the first sqare")
    var a = scala.io.StdIn.readInt();
    var b=a*a;
    println(b);
    println("Input the number of the secord sqare")
    var c = scala.io.StdIn.readInt();
    var d = c*c;
    println(d)
    var e = d+b
    println("The sum fo two sqare:"+e)
    println("Now test yourself")
    println("Input the number: ")
    var f = scala.io.StdIn.readInt();
    var g = f*f;
    println("What is your answer")
    var h=0

    while(h!=g+1||h!=g-1 )
   {  h = scala.io.StdIn.readInt();
     if(h==g+1||h==g-1)
       {
         println("Your answer is nearly correct")
       }
     else if(h==g)
     {
       println("Your answer is correct")

     }
     else if(h!=g+1||h!=g-1)
       {
         println("your anwer must be"+(g-h))
         println("Try again")
       }

   }


  }
}
