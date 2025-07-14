// Create a Kotlin script day03/01_lambda_basics.kt that:

// Has a list of item names: "Pencil", "Pen", "Notebook", "Eraser"

// Use map to convert each to uppercase

// Use filter to keep only names longer than 4 letters

// Print the final result

val stationaries=listOf("Pencil","Pen","Notebook","Eraser")

val result=stationaries.map{it.uppercase()}.filter{it.length>4}

println(result)