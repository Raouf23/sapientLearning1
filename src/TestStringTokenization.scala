import scala.collection.mutable.ArrayBuffer


object TestStringTokenization {

  def main(args: Array[String]): Unit = {

    val str = "Hello"

   
    val window = 4
    val tokens = generateToken(str, window)
    tokens.map(println _)

   // val encryptionString  = generateEncryption(tokens)
   
  }
  
/*  def generateEncryption(list:ArrayBuffer[String]):String ={
    var enStr = ""
    list.map(x => println(x(0)))
    enStr
  }*/
  
  def isCharConsonantOrVowel(c:Char):Int = {
    if (c == 'a' | c == 'e' | c == 'i' | c== 'o'| c== 'u') 1
    else 0
  }
  
    def generateToken(s: String, windowSize:Int): ArrayBuffer[String] = {
      var arr = ArrayBuffer[String]()
      for (i <- 0 to s.length() - 1) {
        if (i + windowSize < s.length()+1)  
        {
         arr +=  s.substring(i ,i+windowSize)
         }
      }
      arr
    }

}

