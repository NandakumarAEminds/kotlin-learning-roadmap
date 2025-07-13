// Problem:
// Create a function:

// fun formatUser(name: String = "Guest", age: Int = 0): String

// Call it with and without parameters

// Print the returned string like: "Name: Nanda, Age: 25"

// Use string templates inside the return

fun formatUser(name:String ="User",age:Int=18):String{
    return "Name: $name, Age:$age"
}


println(formatUser())
println(formatUser("nanda",24))

