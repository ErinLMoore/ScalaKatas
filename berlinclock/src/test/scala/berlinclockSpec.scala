import berlinclock.Main
import org.scalatest._

class berlinclockSpec extends FlatSpec with Matchers {
  val berliner = Main

    "Berliner" should "return the correct single miutues row" in {
      berliner(0) shouldBe 0
      berliner(1) shouldBe 1
      berliner(2) shouldBe 2
      berliner(3) shouldBe 3
      berliner(5) shouldBe 0
    }

}
