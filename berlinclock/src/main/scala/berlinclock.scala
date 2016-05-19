package berlinclock

object Main{

  def single_minute_row (time: Int) : Int = {
    return time % 5
  }
  def five_minute_row (time: Int) : Int = {
    return time / 5
  }

}
