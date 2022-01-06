# CharactersInfo

Project in an app development course.  <br />
The app shows the main characters from the film AVENGES:ENDGAME with a description of who they are, their abilities and their role in the movie.<br />

## App description:
The app contains a MainActivity and 2 Fragments and uses Safe Args to navigate with type-safety between destinations.<br />
The RecyclerView in the HomeFragment contains several MaterialDesignCardView for each Character added with the help of an Adapter.<br />
To transfer the selected Character from the RecyclerView between the fragments, I used the Safe Args wich transferd a JsonString of the Character from the HomeFragment to the destination Fragment.<br />

<img src = "gif-maker.gif" height="580">

## App created with:
* Android version: 12
* SDK version: 31
