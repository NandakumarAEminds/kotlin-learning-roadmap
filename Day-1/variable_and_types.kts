// Problem statement
// You’re logging app sessions. Create:

// A val that stores the app version

// A var for number of active users (starts with 0)

// Simulate 3 user joins by incrementing the count

// Print a welcome message each time:
// “App v1.0 — User joined! Total users: 1”


   val appVersion = "v1.0"
   var activeUsers = 0
   for(i in 1..3) {
       activeUsers++
       println("App $appVersion — User joined! Total users: $activeUsers")
   }