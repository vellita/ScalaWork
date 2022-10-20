package com.wiley.NineteethOct

class myThread extends Thread{
  override def run(): Unit ={
    if (Thread.currentThread().isDaemon){
      println("deamon thread")
    }else{
      println("other work")
    }
  }
}

object testdeamon extends App{
  var a = new myThread
  var b = new myThread
  var c = new myThread

  a.setDaemon(true)

  a.start()
  b.start()
  c.start()
}
