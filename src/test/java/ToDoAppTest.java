import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoAppTest {

    ToDoApp taskList = new ToDoApp();
    List<String> testList = new ArrayList<>();

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
}
