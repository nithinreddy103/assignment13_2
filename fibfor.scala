import scala.collection.mutable.ListBuffer

class fibfor(n:Int) {

  var a = 0
  var b = 0
  var i = 0
  var A = new ListBuffer[Int]()

  for (x <- 1 to n) {
    if (x == 1) {
      a=1
      A += 1
    }
    else {
      i = a + b
      A += i
      a = b
      b = i
    }
  }

  def printfib():Unit={
    println("Fibonacci series for " + n + "th term is " + A.toList.mkString(""))
  }
}

object fibforlist extends App {
  var new1 = new fibfor(5).printfib()
  var new2 = new fibfor(16).printfib()
  var new3 = new fibfor(8).printfib()
  var new4 = new fib(24).printfib()
}
