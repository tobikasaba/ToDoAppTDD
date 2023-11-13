import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoAppTest {

    ToDoApp taskList = new ToDoApp();
    List<String> testList = new ArrayList<>();
    Task shoppingTask = new Task(1, "Go Shopping", "20/03/2023", "Not started");

    @Test
    void addTaskToList() {
        testList.add("Go shopping");
        testList.add("Get books");
        assertEquals(testList, taskList.addTaskToList());
    }

    @Test
    void removeTaskFromList() {
        testList.remove("Go shopping");
        assertEquals(testList, taskList.removeTaskFromList());
    }

    @Test
    void checkTaskId() {
        assertEquals(1, shoppingTask.taskPriority());
    }

    @Test
    void checkTaskName() {
        assertEquals("Go Shopping", shoppingTask.name());
    }

    @Test
    void checkTaskDate() {
        assertEquals("20/03/2023", shoppingTask.date());
    }

    @Test
    void checkTaskStatus() {
        assertEquals("Not started", shoppingTask.status());
    }

    @Test
    void checkTaskDetails() {
        assertEquals("No: 1, Go Shopping, Date: 20/03/2023, Status: Not started",
                shoppingTask.toString());
    }
}
