// You’re given a list of tasks like:

// val tasks = listOf(
//     "Bug Fix - Rahul",
//     "Code Review - Nanda",
//     "Feature Dev - Rahul",
//     "Design Discussion - Nanda",
//     "Refactor - Shruti",
//     "Deployment - Rahul"
// )
// 🎯 Tasks:
// Extract a list of unique developers (i.e., names only)

// Group the tasks by developer name

// Count how many tasks each developer has

val tasks = listOf(
    "Bug Fix - Rahul",
    "Code Review - Nanda",
    "Feature Dev - Rahul",
    "Design Discussion - Nanda",
    "Refactor - Shruti",
    "Deployment - Rahul"
)

fun String.getDevName()=this.split("-")[1].trim()

val developers = tasks.map{it.getDevName()}.toSet()

val groupedTasks = tasks.groupBy{it.getDevName()}

for((i,v) in groupedTasks){
    println("Dev="+i+" No.of tasks="+v.count())
}



