package com.example.taskmanager

//import androidx.compose.ui.Modifier
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {

            }
        }
    }
}
//don't mind me
@Composable
fun Serotonin(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.luffy)
    Box (modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(100.dp),
            contentScale = ContentScale.Crop
        )
    }
}
//Task Manager application that allows users to add tasks to a list and mark them as completed.

//Composable for the TextField and "Add Task" button.
@Composable
fun TaskInputField(/*modifier: Modifier = Modifier*/) {
    
}

//Composable for displaying the list of tasks.
//Store the list of tasks in a mutableStateListOf().
@Composable
fun TaskList(){
    
}

//Composable for an individual task item (Checkbox, Text, Delete button).
@Composable
fun TaskItem(){
    
}
//Entry point composable.
//Use remember to store UI state.
@Composable
fun MainScreen(){

}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManagerTheme {
        Serotonin()
        TaskInputField()
        TaskList()
        TaskItem()
        MainScreen()
    }
}
/*ToBeDone
* Main Screen Layout

The main screen should display:
A TextField where the user can enter a task.
A Button labeled "Add Task" that, when clicked, adds the task to the list.
A vertically scrolling list (LazyColumn) of tasks where each task has:
A Checkbox to mark the task as completed.
A Text element displaying the task description.
A delete icon (IconButton) to remove the task.
State Management

Use remember,mutableStateOf, and mutableStateListOf to store:
The current text in the TextField.
The list of tasks.
When a task is added:
It should appear in the list immediately.
The TextField should be cleared.
When a task is marked as completed:
It should visually indicate completion (e.g., change text color or add a strikethrough).
When a task is deleted:
It should be removed from the list immediately.
Styling

Apply padding of 16dp around all components.
Add spacing (8dp) between list items.
The "Add Task" button should have a distinct (but tasteful) background color (not the default).
Responsiveness

Ensure the layout adapts to different screen sizes.
The task list should be scrollable if there are many tasks.
*
* Technical Requirements
Use Jetpack Compose for all UI elements.
Follow best practices for state management:
Use remember to store UI state.
Store the list of tasks in a mutableStateListOf().
Separate UI components into functions:
TaskInputField() → Composable for the TextField and "Add Task" button.
TaskList() → Composable for displaying the list of tasks.
TaskItem() → Composable for an individual task item (Checkbox, Text, Delete button).
MainScreen() → Entry point composable.
Follow clean coding practices:
Use meaningful variable names.
Add comments explaining key logic.
*/