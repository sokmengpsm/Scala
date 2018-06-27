object fooba {
  def main(args: Array[String]): Unit = {
    var i = 0;
    for (i <- 1 to 30) {
      if (i % 3 == 0) {
        println(i + "Foo");
      }
      else if (i % 5 == 0) {
        println(i + "bar")
      }
      else if (i % 5 == 0 && i % 3 == 0) {
        println(i + "foobar")
      }
    }
  }
}
//    for(i<-1 to 30)
//    {
//      if(i%5==0)
//      {
//        println(i+"bar");
//      }
//    }
//    for(i<-1 to 30)
//    {
//      if(i%5==0&&i%3==0)
//      {
//        println(i+"Foobar");
//      }
//    }
//
//  }
//}
