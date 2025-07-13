// 🔧 Problem Statement:
// You need to process a list of expression strings like:

// val recentOps = listOf(
//     "5 + 5 = 10",
//     "3 * 3 = 9",
//     "10 - 2 = 8",
//     "6 / 2 = 3",
//     "4 + 4 = 8"
// )
// 🧱 Tasks:
// Chain operations:

// Filter only + operations

// Map to the result part (after =)

// Convert each to Int

// Sum all results

// Create an extension function on String:

// fun String.operatorUsed(): String
// It should return the operator (middle value after .split(" "))


val recentOps = listOf(
    "5 + 5 = 10",
    "3 * 3 = 9",
    "10 - 2 = 8",
    "6 / 2 = 3",
    "4 + 4 = 8"
)

val results=recentOps.filter{it.operatorUsed()=="+"}.map{it.split("=")[1].trim().toInt()}

println(results.sum())

fun String.operatorUsed():String = this.split(" ")[1]

recentOps.forEach{
    println(it.operatorUsed())
}