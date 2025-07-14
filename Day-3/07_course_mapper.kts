// 🧠 Problem: Courses by Instructor
// You’re given a nested list of instructors and their courses:

// val instructors = listOf(
//     "Nanda" to listOf("Kotlin", "Android", "Jetpack"),
//     "Rahul" to listOf("Java", "Spring Boot"),
//     "Shruti" to listOf("UI/UX", "Figma"),
//     "Nanda" to listOf("CI/CD", "Ktor")
// )

// 🎯 Tasks:
// Flatten all courses using flatMap

// Print the list of unique courses

// Create a data class Course(val instructor: String, val title: String)

// Convert the nested list into a flat list of Course objects

val instructors = listOf(
    "Nanda" to listOf("Kotlin", "Android", "Jetpack"),
    "Rahul" to listOf("Java", "Spring Boot"),
    "Shruti" to listOf("UI/UX", "Figma"),
    "Nanda" to listOf("CI/CD", "Ktor")
)

val courses = instructors.flatMap{it.second}

println(courses.toSet())

data class Course(val instructor: String, val title: String)

val courseObjectList=instructors.flatMap{
    (instructor,courses) ->
    courses.map{
        course -> courseObjectList.add(Course(instructor,course))
    }
}

println(courseObjectList)


