package fizzbuzz

object FizzBuzzer{
  def apply (input:Int) : String = {
    if(input % 3 == 0) {
      return "fizz"
    }
    return "" + input
  }
}
