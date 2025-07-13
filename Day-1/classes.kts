// Problem:
// Model a Note:

// data class Note(val title: String, val content: String)
// Create 2 identical notes

// Print both and check if they are equal

// Then create a regular class Note (non-data) and do the same

// Compare output difference (toString, ==)

data class NoteModel(
    val title:String,
    val content:String
)

class NoteClass(
    val title:String,
    val content:String
)


val noteModel1=NoteModel("Brushing","Daily brush two times")
val noteModel2=NoteModel("Brushing","Daily brush two times")

println(noteModel1==noteModel2)

val note1=NoteClass("Watering","Water the plants")
val note2=NoteClass("Watering","Water the plants")

println(note1==note2)