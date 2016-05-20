import berlinclock.Main
import org.scalatest._

class berlinclockSpec extends FlatSpec with Matchers {
  val berliner = Main

    "Berliner" should "return the correct single miutues row" in {
      berliner.singles_row(0) shouldBe 0
      berliner.singles_row(1) shouldBe 1
      berliner.singles_row(2) shouldBe 2
      berliner.singles_row(3) shouldBe 3
      berliner.singles_row(5) shouldBe 0
    }

    "Berliner" should "return the correct five minutes row" in {
      berliner.fives_row(0) shouldBe 0
      berliner.fives_row(5) shouldBe 1
      berliner.fives_row(6) shouldBe 1
      berliner.fives_row(9) shouldBe 1
    }

    "Berliner" should "return the correct single hours row" in {
      berliner.singles_row(0) shouldBe 0
      berliner.singles_row(2) shouldBe 2
      berliner.singles_row(3) shouldBe 3
      berliner.singles_row(5) shouldBe 0
    }

    "Berliner" should "return the correct five hours row" in {
      berliner.fives_row(0) shouldBe 0
      berliner.fives_row(2) shouldBe 0
      berliner.fives_row(3) shouldBe 0
      berliner.fives_row(5) shouldBe 1
    }

    "Berliner" should "return the correct seconds row" in {
      berliner.seconds_row(0) shouldBe 1
      berliner.seconds_row(1) shouldBe 0

    }

}
