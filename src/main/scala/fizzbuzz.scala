package fizzbuzz

object FizzBuzzer{

  def apply (input:Int) : String = input match {
    case x if (x % 15 == 0) => "fizzbuzz"
    case x if (x % 5  == 0) => "buzz"
    case x if (x % 3  == 0) => "fizz"

    case _ => "" + input
  }

}
