Lab 2 - Building a Task Manager Application
Objective:
This lab assignment assesses your understanding of state in Jetpack Compose, 
including remember, mutableStateOf, lists, and user input handling, 
as covered in the linked materials.

Check list:
 - Main Screen Layout
 - State Management
 - Styling
 - Responsiveness

Technical Requirements
- Use Jetpack Compose for all UI elements.
- Follow best practices for state management:
    Use remember to store UI state.
    Store the list of tasks in a mutableStateListOf().
- Separate UI components into functions:
    TaskInputField() → Composable for the TextField and "Add Task" button.
    TaskList() → Composable for displaying the list of tasks.
    TaskItem() → Composable for an individual task item (Checkbox, Text, Delete button).
    MainScreen() → Entry point composable.
- Follow clean coding practices:
    Use meaningful variable names.
    Add comments explaining key logic.


Experimental code:

    fun main() {
        var taskList = 0
        
        tasksTODO(taskList)
        
        taskList = 51
        
        tasksTODO(taskList)
        
        taskList = 100
        
        tasksTODO(taskList)
    }

    fun tasksTODO(numOfTasks : Int){
        if( numOfTasks == 0){
            println("Start A New Task.")
        }else if(numOfTasks < 100){
            println("$numOfTasks Tasks In TODO.")
        }else{
            println("99+ Tasks In TODO.")
        }
    }