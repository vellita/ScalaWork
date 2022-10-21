import com.wiley.SeventeenthOct.Collection.Queue.TestQueue
import org.scalatest.funsuite.AnyFunSuite

import scala.collection.immutable.Queue

class QueueTest extends AnyFunSuite {
  test("geting first element from queue"){
    val q = new TestQueue
    val initaliseQue = Queue(1, 2, 4, 8, 16, 32)
    assert(q.getFirstElement(initaliseQue) === 1)
  }

  test("gwt second element from list"){
    val q = new TestQueue
    val initaliseQue = Queue(1, 2, 4, 8, 16, 32)
    assert(q.getElement(initaliseQue, 1) === 2)
  }

  test("Check for empty queue") {
    val q = new TestQueue
    val initaliseQue = Queue(1, 2, 4, 8, 16, 32)
    assert(q.isQueueEmpty(initaliseQue) === false)
  }
}
