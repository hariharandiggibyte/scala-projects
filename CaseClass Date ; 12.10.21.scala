
object CaseClass extends App {

  case class Person(name: String, age: Int)

  val ram = Person("Ram", 34)
  println(ram.name)

  // sensible toString

  println(ram)

  //equals and hashCod

  val ram2 = Person("Ram", 34)
  println(ram == ram2)

  val ram3 = Person("Ram", 50)
  println(ram == ram2)

  // copy method in case class

  val ram4 = ram.copy(age = 45)
  println(ram4)


  case class student(name: String, roll: Int)

  var ravi = student( "Ravi",  30)
  println(ravi.name)

  var tommy =  student("tommy", 34)
  println(tommy)

  var tommy2 = tommy.copy(roll= 20)
  println(tommy2)
}