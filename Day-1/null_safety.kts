// Problem:
// You’re handling a nullable user input from a form:

// val userInput: String? = null

// If it’s not null, print: "Received: <value>"

// If it is null, print: "Using default value"

// Use let and ?: — no if/else allowed.

import java.util.Scanner;

val scanner = Scanner(System.`in`)

val userInput: String? = scanner.nextLine()

println( getWelcomeMessage(userInput) )

fun getWelcomeMessage(value:String?):String{
    return userInput.let{"Recieved: $userInput"}?: "Using Default value";
}

