object soso{
  def main(args: Array[String]): Unit = {
    println("Enter the number 1 or 2 or 3");
    val a = scala.io.StdIn.readInt();
    a match
      {
      case 1 => println("you can go to school")
      case 2 => println("you can go home")
      case 3 => println("why you want to play game in class")

    }
  }

}
