// Define a data class User(val username: String, val email: String)

// Create a list of users

// Loop through the list using for ((username, email) in users)

// Print a message like:
// 📩 “Sending welcome email to username at email”

// 🔥 Bonus:
// Use .map to convert list of users into a list of Pair<username, domain>, where domain is extracted from the email.

data class User(val username:String,val email:String)

val users=listOf(
    User("user1","user1@gmail.com"),
    User("user2","user2@gmail.com"),
    User("user3","user3@gmail.com"),
    User("user4","user4@gmail.com"),
    User("user5","user5@gmail.com")
)

for((name,email) in users){
    println("Sending welcome email to $name at $email")
}


val userPairs = users.map { (username, email) ->
    username to email.substringAfter("@")
}

println(userPairs)