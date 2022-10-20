package com.wiley.NineteethOct

object moreThreads extends App {
  var t = new CreateThreads
  var t1 = new CreateThreads
  var t2 = new CreateThreads
  var t3 = new CreateThreads
  t.setPriority(5)
  t1.setPriority(9)
  t2.setPriority(2)
  t3.setPriority(10)

  t.start()
  t1.start()
  t2.start()
  t3.start()
}
