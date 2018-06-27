object donotwantdublicatevalue
{ var num =0;
  var enum = 0;
  var anum = 0;
  var inum = 0;
  var onum =0;
  var unum = 0;
  def main(args: Array[String]): Unit = {


    for(c <- "iooo")
      {
        if(c == " a")
          {
            if(anum == 0)
              {
                num = num+1
                anum = anum + 1;
              }
          }
        if(c == "e")
          {
            if(enum == 0)
              {
                num = num +1;
                enum = enum + 1;
              }
          }
        if(c == "i")
          {
            if(inum == 0)
              {
                num = num + 1;
                inum = inum + 1;
              }
          }
        if(c == "o")
          {
            if(onum == 0)
              {
                num = num +1;
                onum = onum + 1;
              }
          }
        if(c == "u")
          {
            if(unum == 0)
              {
                num = num + 1;
                unum = unum + 1;
              }
          }
      }
    println("The number that not dublicate")
    println(num)
  }
}
