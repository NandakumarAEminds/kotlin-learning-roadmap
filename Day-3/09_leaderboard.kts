// 🧠 Problem: Kotlin Leaderboard
// You're building a leaderboard screen for your Kotlin dev team.

// Here’s the data:

// data class Dev(val name: String, val commits: Int, val bugsFixed: Int)

// val devs = listOf(
//     Dev("Nanda", 120, 34),
//     Dev("Rahul", 95, 56),
//     Dev("Shruti", 102, 41),
//     Dev("Sneha", 120, 30),
//     Dev("Deepak", 78, 60)
// )
// 🎯 Tasks:
// Sort developers by commits descending using sortedByDescending

// Sort developers by both:

// commits descending

// then bugsFixed descending (if commits are equal)
// (Hint: use sortedWith + compareByDescending)

// Print the leaderboard:

// 1. Nanda – 120 commits, 34 bugs fixed
// 2. Sneha – 120 commits, 30 bugs fixed
// 3. Shruti – 102 commits, 41 bugs fixed
// ...

data class Dev(val name: String, val commits: Int, val bugsFixed: Int)

val devs = listOf(
    Dev("Nanda", 120, 34),
    Dev("Rahul", 95, 56),
    Dev("Shruti", 102, 41),
    Dev("Sneha", 120, 30),
    Dev("Deepak", 78, 60)
)

val sortedByDescending=devs.sortedByDescending{it.commits}
val sortedByAscending=devs.sortedBy{it.commits}

println(sortedByAscending)


val leaderboard=devs.sortedWith(compareByDescending<Dev> { it.commits }.thenByDescending { it.bugsFixed })

println(leaderboard)

leaderboard.forEachIndexed{ index,item ->
 println("${index+1}."+item.name+ " - "+item.commits+" commits, "+item.bugsFixed+" bugs fixed")
}