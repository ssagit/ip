package duke.taskclass;

/**
 * Task class, since every task is a 'todoTask' currently, todoTask
 * uses this as a default class
 */
public class Task {

    private String taskName;
    private boolean isDone;

    /**
     * Task class constructor
     */
    public Task(String taskName, boolean isDone) {
        this.taskName = taskName;
        this.isDone = isDone;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public String getTaskName() {
        return this.taskName;
    }

    /**
     * Function to mark a task as completed
     */
    public void markDone() {
        this.isDone = true;
    }

    /**
     * Returns a formatted string of the state of the task
     */
    public String toString() {
        if (isDone) {
            return "todo | done | " + taskName;
        }
        return "todo | not done | " + taskName;
    }

    /**
     * Used when adding tasks
     * @return More human readable toString()
     */
    public String toFormattedString() {
        if (isDone) {
            return "[T][X] " + taskName;
        }
        return "[T][ ] " + taskName;
    }

    /**
     * Used when outputting to file, date format will be parsable when file is fed in again
     * @return String format viable for use by FileWriter
     */
    public String toOutputFileString() {
        return this.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object other) {
        final Task task = (Task) other;
        if (task == this) {
            return true;
        }
        if (this.taskName.equals(task.taskName)) {
            return true;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.taskName != null ? this.taskName.hashCode() : 0);
        return hash;
    }
}
