// Take your same recentOps list from before

// Group expressions by operator using groupBy

// Create a data class Op(val id: Int, val expr: String)

// Make a list of 5 Op objects

// Use associateBy to turn it into a map by ID

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

val groupedOps= recentOps.groupBy{it.split(" ")[1].trim()}

println(groupedOps)

data class Op(val id:Int,val expr:String)

val ops= listOf(
    Op(1,"1+1"),
    Op(2,"1+2"),
    Op(3,"1+3"),
    Op(4,"1+4"),
    Op(5,"1+5"),
)

val mappedOps = ops.associateBy{it.id}

println(mappedOps)

val mapOfIdExpr = ops.associate {it.id to it.expr}

println(mappedOps)