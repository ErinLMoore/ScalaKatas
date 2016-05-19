import berlinclock.Main
import org.scalatest._

class berlinclockSpec extends FlatSpec with Matchers {
  val berliner = Main

    "Berliner" should "return the correct single miutues row" in {
      berliner.single_minute_row(0) shouldBe 0
      berliner.single_minute_row(1) shouldBe 1
      berliner.single_minute_row(2) shouldBe 2
      berliner.single_minute_row(3) shouldBe 3
      berliner.single_minute_row(5) shouldBe 0
    }
    "Berliner" should "return the correct five minutes row" in {
      berliner.five_minute_row(0) shouldBe 0
      berliner.five_minute_row(5) shouldBe 1
      berliner.five_minute_row(6) shouldBe 1
      berliner.five_minute_row(9) shouldBe 1
    }
}
