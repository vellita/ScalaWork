import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable
class Example2 extends AnyFunSuite with BeforeAndAfter{
  var s=""
  before{
    val s="hi"
  }
  test("1pop is invoked on non empty stack"){

    assert(ScalaCollections.result === 2)
    assert(ScalaCollections.stack.size === ScalaCollections.oldSize-1)
  }
  test("1pop is invoked on an empty stack"){
    val emptyStack=new mutable.Stack[Int]
    intercept[NoSuchElementException]{
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }
  test("1testing index out of bound"){

    intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
  }

  test("1Testing indexoutofbound with message"){

    val thrown=intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
    assert(thrown.getMessage === "Index -1 out of bounds for length 2")
  }


  after{
    println("Welcome to my world")
  }

}