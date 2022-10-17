import scala.collection.mutable

object ScalaCollections {

  var stack = new mutable.Stack[Int]
  stack.push(1)
  stack.push(2)
  val oldSize=stack.size
  val result=stack.pop()
}
