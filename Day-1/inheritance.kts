// Problem:
// Model a UI system:

// Abstract class Screen with abstract fun render() and fun showBanner()

// Interface Clickable with fun onClick()

// Create HomeScreen : Screen(), Clickable

// Call all functions from main and verify output




abstract class Screen{
   abstract fun render()

   fun showBanner(){
    println("Banner Shown")
   }
}

interface Clickable{
    fun onClick()
}

class HomeScreen:Screen(),Clickable{

  override
  fun render(){
    println("Banner rendered")
  }


  override
  fun onClick(){
     println("Clicked")
  }
}


val home = HomeScreen()
home.onClick()
home.render()
home.showBanner()