

object find{
  def main(args: Array[String]): Unit = {

    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0;


    for(i <- "sok mengee")
    {

      if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
      {
        vowels = vowels +1;
      }
      else if((i >= 'a'&& i <= 'z')) {
        consonants = consonants+1;
      }
      else if( i >= '0' && i <= '9')
      {
        digits = digits +1;
      }
      else if (i ==' ')
      {
         spaces = spaces +1;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
  }
}