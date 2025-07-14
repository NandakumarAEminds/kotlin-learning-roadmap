// Create an object called Logger that:

// Has a function log(tag: String, message: String)

// Prints like: [CALC] Result is 15

// Keeps track of how many logs were written (as a counter)

object Logger{
    var count:Int=0

    fun log(tag: String, message: String){
        count++
        println("[$tag] Result is $message")
    }

    fun getCount(){
        println("Logger printed $count times")
    }
}

val logger=Logger

logger.log("CALC","Summa")
logger.log("CALC","Summa2")
logger.getCount()