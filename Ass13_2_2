object Ass13_2_2 {
  def fibonacci(i : Int) : Int = {
    def h(last : Int, cur: Int, num : Int) : Int = {
      if ( num == 0) cur
      else h(cur, last + cur, num - 1)
    }

    if (i < 0) - 1
    else if (i == 0 || i == 1) 1
    else h(1,2,i - 2)
  }

  def main(args: Array[String]){
    (0 to 10).foreach( (x : Int) => print(fibonacci(x) + " "))
  }
}
