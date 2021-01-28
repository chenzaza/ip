package duke.task;

public class Todo extends Task {

    public Todo(String description, int status) {
        super(description,status);
    }

    @Override
    public String toTxt(){
        return "T " + super.toTxt() + "\n";
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}