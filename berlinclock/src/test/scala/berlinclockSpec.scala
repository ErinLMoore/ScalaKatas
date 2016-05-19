import berlinclock.Main
import org.scalatest._

class berlinclockSpec extends FlatSpec with Matchers {
  val berliner = Main

    "blank" should "blank" in {
      berliner(1) shouldBe "1"

    }

}
