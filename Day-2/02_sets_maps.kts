// Declares a List<String> of expression strings
// → e.g., "5 + 5 = 10", "2 * 2 = 4", etc.

// Extracts the operators used from each expression
// → Use .split(" ") to get the middle part (e.g., "+")

// Adds them to a Set<String> — to count unique operators

// Tracks how many times each operator was used with a Map<String, Int>

// Finally, prints:

// List of unique operators

// Operator count summary

val recentOps = listOf(
    "5 + 5 = 10",
    "3 * 3 = 9",
    "10 - 2 = 8",
    "6 / 2 = 3",
    "9 % 2 = 1",
    "4 + 4 = 8",
    "7 - 3 = 4",
    "8 * 1 = 8",
    "12 / 4 = 3",
    "6 % 4 = 2"
)




val operators = recentOps.map{it.split(" ")[1]}

val operatorsSet = operators.toSet()

val operatorsCount = mutableMapOf<String,Int>()

for(op in operatorsSet){
    operatorsCount[op] = recentOps.count { it.split(" ")[1] == op }
}

println("Number of operators used "+operatorsSet.count()+" i.e "+operatorsSet)

println(operatorsCount)