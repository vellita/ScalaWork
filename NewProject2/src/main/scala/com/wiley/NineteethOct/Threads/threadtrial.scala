package com.wiley.NineteethOct.Threads

import java.util.Date
object Foo{
  private var ctr=0L
  def getCtr=this.synchronized{
    ctr=ctr+1
    var datetime = new Date().getTime
    println("in block"+Thread.currentThread().getName)
    println(datetime)
    ctr
  }
  def bar={
    val currCt=getCtr
    currCt
  }
}
class TrialThread extends Thread{
  override  def run(): Unit ={
    this.synchronized {
      println(s"Following thread is executing the code ${Foo.bar} and ${Thread.currentThread().getName}")
    }
  }
}
object Demotrial extends App{
  var t1=new TrialThread()
  t1.start()
  try {
    t1.join()
  }catch {
    case e: Exception => e.printStackTrace ()
  }
  var t2=new TrialThread()
  t2.start()
  try {
    t2.join()
  } catch {
    case e: Exception => e.printStackTrace()
  }

  var t3=new TrialThread()
  t3.start()
  var t4=new TrialThread()
  t4.start()
  try{
  t3.join()
  t4.join()
    } catch {
      case e: Exception => e.printStackTrace()
    }
}