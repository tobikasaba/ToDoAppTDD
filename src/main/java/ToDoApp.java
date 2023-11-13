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

    public List<String> removeTaskFromList() {
        taskList.remove("Go shopping");
        return getTaskList();
    }

    public List<String> addTaskToList() {
        taskList.add("Go shopping");
        taskList.add("Get books");
        return getTaskList();
    }


}
