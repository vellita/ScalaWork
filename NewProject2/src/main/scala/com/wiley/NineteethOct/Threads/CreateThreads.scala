package com.wiley.NineteethOct.Threads

import java.util.Date

class CreateThreads extends Thread{
  override def run(): Unit ={
    println("Doing in parallel "+Thread.currentThread().getName+"----"+Thread.currentThread().getPriority)
    Thread.sleep(2000)
    println("slept and woken up " +Thread.currentThread().getName+"----"+Thread.currentThread().getPriority)
  }
}
class DateThreadUsingSleep extends Thread{
  override def run():Unit = {}
  while(true) {
    var d2 = new Date()
    print("\r "+d2)
    Thread.sleep(1000)
  }
}

object mainobj extends App{
  /*var t = new CreateThreads
  t.start()
  var t2 = new CreateThreads
  t2.start()
  var t3 = new CreateThreads
  t3.start()
  var t4 = new CreateThreads
  t4.start()
  var t5 = new CreateThreads
  t5.start()
  var t6 = new CreateThreads
  t6.start()

  var dateThread = new DateThreadUsingSleep
  dateThread.run()
  println("welcome")
  print("this is a not a thread")*/
  var t = new CreateThreads
  var t1 = new CreateThreads
  var t2 = new CreateThreads
  var t3 = new CreateThreads
  t.start()
  try{
    println("the current thread "+Thread.currentThread().getName)
    println("and "+t.getName)
    t.join()
  }catch {
    case e:Exception=>e.printStackTrace()
  }
  t1.start()
  try {
    println("the current thread " + Thread.currentThread().getName)
    t1.join()
  } catch {
    case e: Exception => e.printStackTrace()
  }
  t2.start()
  try {
    println("the current thread "+Thread.currentThread().getName)
    t2.join()
  } catch {
    case e: Exception => e.printStackTrace()
  }
  t3.start()
  try {
    println("the current thread "+Thread.currentThread().getName)
    t3.join()
  } catch {
    case e: Exception => e.printStackTrace()
  }
}