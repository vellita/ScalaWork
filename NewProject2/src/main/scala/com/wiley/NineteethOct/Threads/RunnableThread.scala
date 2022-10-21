package com.wiley.NineteethOct.Threads

class RunnableThread extends Runnable {

  override def run(): Unit ={
    println("Hello, this is a thread " + Thread.currentThread().getName)
  }

}

object runRunnableTread extends App{
  for (x <- 1 to 3){
    var newThread = new Thread(new RunnableThread())
    newThread.setName(x.toString)
    newThread.start()
  }
}