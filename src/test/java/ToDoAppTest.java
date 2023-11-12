import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoAppTest {

    @Test
    public void taskListIsEmpty() {
        ToDoApp taskList = new ToDoApp();

        assertTrue(taskList.getTaskList().isEmpty());
    }
}
