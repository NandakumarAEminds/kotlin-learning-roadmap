// Define a function operate(a: Int, b: Int, op: (Int, Int) -> Int): Int

// Pass lambdas to:

// Add

// Subtract

// Multiply

// Print the result of each

// Example usage:

// val sum = operate(5, 3) { a, b -> a + b }
// val diff = operate(5, 3) { a, b -> a - b }
// val product = operate(5, 3) { a, b -> a * b }

fun operate(a:Int,b:Int,op:(Int,Int)->Int):Int{
    return op(a,b)
}

println(operate(5,3,{a, b -> a + b }))
println(operate(5,3,{a, b -> a - b }))
println(operate(5,3,{a, b -> a * b }))