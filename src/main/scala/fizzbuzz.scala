package fizzbuzz

object FizzBuzzer{

  def apply (input:Int) : String = (input % 3) match{
    case 0 => "fizz"
    case _ => "" + input
  }

}
