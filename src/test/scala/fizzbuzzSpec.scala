import fizzbuzz.FizzBuzzer
import org.scalatest._

class BabysitterSpec extends FlatSpec with Matchers {
  val fizzandbuzz = FizzBuzzer

  "Fizzbuzz" should "return an int given it" in {
  fizzandbuzz(1) shouldBe "1"
  fizzandbuzz(2) shouldBe "2"
   }

  "Fizzbuzz" should "return fizz when given 3" in {
    fizzandbuzz(3) shouldBe "fizz"
  }
}
