val isEven = 20 % 2 == 0

val randValue = math.random()* 10

val x = if (isEven) 42 else 0

var i = 0
var sum = 0

while (i < 3) {
  i += 1
  sum += 1
  println("Hi")
}

var sum = 0

val result = for (i <- 1 to 10 ) {
  sum += i
}