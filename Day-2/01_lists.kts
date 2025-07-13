// Create a List<String> called recentOps:

// Add 5 expressions like: "5 + 5 = 10"

// Print:

// Only the + operations using filter

// The result part only (after =) using map

// Each operation using forEach

val operators=listOf("+","-","*","/","%")

val recentOps=mutableListOf<String>("5 + 5 = 10")

recentOps.add("5 - 5 = 0")
recentOps.add("2 + 2 = 4")
recentOps.add("2 * 2 = 4")

val filteredList=recentOps.filter{ it.contains("+") }

println(filteredList)

val resultList=recentOps.map{ it.split("=")[1].trim() }

println(resultList)

recentOps.forEachIndexed{index,it ->
    println("[$index] $it")
}
