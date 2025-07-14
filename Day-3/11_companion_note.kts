// Create a class Note that:

// Has properties title and content

// Uses companion object to define a constant DEFAULT_TITLE = "Untitled"

// Includes a createEmptyNote() method inside the companion that returns a Note with:

// title = DEFAULT_TITLE

// content = ""

// 💥 Real Android use case: We often use companion objects in Room models or ViewModels to set default states!

class Note(val title:String,val content:String){

    companion object{

      const val DEFAULT_TITLE:String="Untitled"

      fun createEmptyNote():Note{
         return Note(DEFAULT_TITLE,"")
      }

    }

}

val note=Note.createEmptyNote()

println(note.title)