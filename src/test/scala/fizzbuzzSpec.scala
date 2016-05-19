import fizzbuzz.FizzBuzzer
import org.scalaTest._

class fizzbuzzSpec extends FlatSpec with Matchers {
  val fizzandbuzz = FizzBuzzer

  "Fizzbuzz" should "return an int given it" in {
  fizzandbuzz(1) shouldBe 1
    } 
}
