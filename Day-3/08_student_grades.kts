// 🧠 Problem: Student Grades Dashboard
// You're given this data:

// data class Student(val name: String, val grade: Int)

// val students = listOf(
//     Student("Nanda", 91),
//     Student("Rahul", 77),
//     Student("Shruti", 85),
//     Student("Deepak", 58),
//     Student("Sneha", 94),
//     Student("Vishal", 49)
// )
// 🎯 Tasks:
// Group students by their grade range:

// "A" → 90+

// "B" → 75–89

// "C" → 60–74

// "D" → <60
// (Tip: use groupBy { ... })

// Partition the students into:

// pass (grade ≥ 60)

// fail (grade < 60)

// Create a Map<String, Student> where key = student name (use associateBy)

data class Student(val name: String, val grade: Int)

val students = listOf(
    Student("Nanda", 91),
    Student("Rahul", 77),
    Student("Shruti", 85),
    Student("Deepak", 58),
    Student("Sneha", 94),
    Student("Vishal", 49)
)

val groupedStudents = students.groupBy{
    when {
        it.grade >= 90 -> "A"
        it.grade in 75..89 -> "B"
        it.grade in 60..74 -> "C"
        else -> "D"
    }
}

println(groupedStudents)

val resultGroup= students.groupBy{
    if(it.grade>=60){"Pass"}else{"Fail"}
}

println(resultGroup)

val mappedStudents = students.associateBy{
    it.name
}

println(mappedStudents)