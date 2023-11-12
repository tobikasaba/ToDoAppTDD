import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class ToDoApp {

    List<String> taskList;

    public ToDoApp() {
        this.taskList = new ArrayList<>();
    }

    public List<String> getTaskList() {
        return taskList;
    }
}
