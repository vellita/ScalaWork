import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable

class ExampleSuite extends AnyFunSuite{

  test("pop is invoked on non empty stack"){

    assert(ScalaCollections.result === 21)
    assert(ScalaCollections.stack.size === ScalaCollections.oldSize-1)
  }
  test("pop is invoked on an empty stack"){
    val emptyStack=new mutable.Stack[Int]
    intercept[NoSuchElementException]{
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }
  test("testing index out of bound"){
    val s="hi"
    intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
  }

  test("Testing indexoutofbound with message"){
    val s="hi"
    val thrown=intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
    //  println()
    assert(thrown.getMessage === "Index -1 out of bounds for length 2")
  }

}
