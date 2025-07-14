// Create a data class Book(val title: String, var pages: Int)

// Create a book object

// Use apply to update its page count

// Use also to log before/after update

// Use let to check if pages > 100, then print summary

data class Book(val title: String, var pages: Int)

val book:Book=Book("Thirukural",1333)

book.also{
    println("Before "+it.pages)
}

book.apply{
    pages=1330
}

book.also{
    println("After "+it.pages)
}

book.let{
    if(it.pages>100){
        println("Total pages:"+it.pages)
    }
}