package fizzbuzz

object FizzBuzzer{
  def apply (input:Int) : String = {
    if(input == 3) {
      return "fizz"
    }
    return "" + input 
  }
}
