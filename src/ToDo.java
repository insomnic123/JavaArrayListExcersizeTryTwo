public class ToDo {

    private String name;
    private String priority;
    private java.time.LocalDateTime dueTime;
    private boolean isComplete;

    public ToDo(String name, String priority, java.time.LocalDateTime dueTime) {
        this.name = name;
        this.priority = priority;
        this.dueTime = dueTime;
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public java.time.LocalDateTime getDueDate(ToDo x) {
        return dueTime;
    }

    public boolean getStatus() {
        return isComplete;
    }

    public void setDueTime(java.time.LocalDateTime d){
        this.dueTime = d;
    }

    public void setPriority(String p) {
        this.priority = p;
    }

    public void setName(String n) {
        this.name = n;
    }
    public void markAsComplete() {
        this.isComplete = true;
    }

    public String toString() {
        String status = isComplete ? "Complete" : "Pending";
        return String.format("Task: %s | Priority: %s | Due: %s | Status: %s",
                name, priority, dueTime, status);
    }
}
