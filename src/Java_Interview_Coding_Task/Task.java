package Java_Interview_Coding_Task;

public class Task {
    private String name;
    private String departman;
    private int id;

    public Task(String name, String departman, int id) {
        this.name = name;
        this.departman = departman;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", departman='" + departman + '\'' +
                ", id=" + id +
                '}';
    }
}

