// IF ELSE CONCEPT EXAMPLE 1
object Demo1 extends App {
  var x = 10
   if(x<20){
     println("This is if statement")
   }
}
// IF ELSE CONCEPT EXAMPLE 2
object Demo2 extends App {
   var x = 30
   if(x<20){println("hello")}
   else{println("goodbye")}

   }
// IF ELES CONCEPT EXAMPEL 3
object Demo3 extends App {
  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  println(factorial(10))
}
// function
object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))
}
//greating fuction

object Function extends App {
  def greetingForKids(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."

  println(greetingForKids("praveen", 15))
}