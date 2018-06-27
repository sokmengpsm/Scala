class student(id:Int,name:String,age:Int,batch:Int)
{
  def work()
  {
    println("id"+" "+id + " "+"name:" + name+" "+"age:"+age+" "+"batch:"+batch)
  }
}
  object classhaveobject
  {
    def main(args: Array[String]): Unit =
    {
      var student1 = new student(1,"sokmeng",18,4)
      var student2 = new student(2,"kaka",19,3)
      student1.work();
      student2.work();
    }
  }

