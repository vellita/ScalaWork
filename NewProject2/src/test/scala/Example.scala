import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable

class Example extends AnyFunSuite{

  test("pop() invoke non empty stack"){
    assert(ScalaCollections.result === 2)
    assert(ScalaCollections.stack.size === ScalaCollections.oldSize-1)
  }
  test("pop() invoke empty stack"){
    val emptyStack = new mutable.Stack[Int]
    //intercept is used to cartch the exception
    intercept[NoSuchElementException]{
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }


}

