import scala.annotation.tailrec

def myFunction (x: Int, y: String): String = {
  val combined = x + " and " + y
  val greet = "Hello, "

  greet + combined
}

//body of a function is always an expression

var myResult = myFunction (1, "Yura")

//nested functions

def isPrime (x: Int): Boolean = {
  def isPrimeUntil (n: Int): Boolean =
    if (n == 1) true
    else (x % n != 0) && isPrimeUntil(n - 1)

  isPrimeUntil(x / 2)
}

isPrime(5)

//recursive functions need specified result type
//example of stack recursion below wil give a stack overflow if arg is a big number

def stackFactorial (n: Int): Int = {
  if (n <= 1) 1
  else n * stackFactorial (n - 1)
}

stackFactorial (30)

// tail recursion is when recursive call is the last one

@tailrec def tailFactorial (x: Int, acc: Int = 1): Int = {
  if (x <= 1) acc
  else tailFactorial (x - 1, x * acc)
}

val resTailFactorial = tailFactorial (30)

