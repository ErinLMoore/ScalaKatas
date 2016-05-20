package berlinclock

object Main {

  def singles_row (minutes_or_hours: Int) : Int = {
    return minutes_or_hours % 5
  }

  def fives_row(minutes_or_hours: Int) : Int = {
    return minutes_or_hours / 5
  }

  def seconds_row(seconds: Int) : Int ={
    return (seconds+1)%2
  }

}
