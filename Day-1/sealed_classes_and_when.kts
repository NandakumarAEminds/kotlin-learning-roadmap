// Problem:
// Simulate API Response using:

// sealed class ApiResponse
// data class Success(val data: String): ApiResponse()
// data class Failure(val error: String): ApiResponse()
// object Loading: ApiResponse()
// Create a function handle(response: ApiResponse) that prints appropriate messages

// Pass different response types and test your when


sealed class ApiResponse

data class Success(val data: String): ApiResponse()
data class Failure(val error: String): ApiResponse()
object Ended:ApiResponse()
object Loading:ApiResponse()

fun handle(response: ApiResponse):String{
    return when(response){
        is Success -> "Successfully LoggedIn "+ response.data
        is Failure -> "Oops!"+response.error
        Loading -> "Loading bro!Please wait"
        else -> "Done"
    }
}


var response:ApiResponse=Loading

println(handle(response))

response=Failure("Test bro")
println(handle(response))

response=Success("Hey!nanda")
println(handle(response))

response=Ended
println(handle(response))
