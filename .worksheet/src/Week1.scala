object Week1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 

  println("Welcome to the Scala worksheet");$skip(27); 
  val a = List(1, 2, 3, 4);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(19); 
  val b = a.zip(a);System.out.println("""b  : List[(Int, Int)] = """ + $show(b ));$skip(72); 

  val rdd = for {
    x <- 1 to 3
    y <- 1 to 2
  } yield (x, None);System.out.println("""rdd  : scala.collection.immutable.IndexedSeq[(Int, None.type)] = """ + $show(rdd ));$skip(30); 
   
   val str  = "cosnonant";System.out.println("""str  : String = """ + $show(str ))}
   
   
}
