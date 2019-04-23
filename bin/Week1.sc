object Week1 {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val a = List(1, 2, 3, 4)                        //> a  : List[Int] = List(1, 2, 3, 4)
  val b = a.zip(a)                                //> b  : List[(Int, Int)] = List((1,1), (2,2), (3,3), (4,4))

  val rdd = for {
    x <- 1 to 3
    y <- 1 to 2
  } yield (x, None)                               //> rdd  : scala.collection.immutable.IndexedSeq[(Int, None.type)] = Vector((1,N
                                                  //| one), (1,None), (2,None), (2,None), (3,None), (3,None))
   
   val str  = "cosnonant"                         //> str  : String = cosnonant
   
   
}