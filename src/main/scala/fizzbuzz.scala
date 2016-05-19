package fizzbuzz

object FizzBuzzer{

  def apply (input:Int) : String = (input % 15) match {
    case 3 => "fizz"
    case 6 => "fizz"
    case 9 => "fizz"
    case 12 => "fizz"
    case 5 => "buzz"
    case 10 => "buzz"

    case _ => "" + input
  }

}
