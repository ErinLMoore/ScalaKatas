package berlinclock

object Main {

  def single_minute_row (minutes: Int) : Int = {
    return minutes % 5
  }

  def five_minute_row (minutes: Int) : Int = {
    return minutes / 5
  }

  def single_hours_row (hours: Int) : Int = {
    return hours % 5
  }

  def five_hours_row (hours: Int) : Int = {
    return hours / 5
  }
}
