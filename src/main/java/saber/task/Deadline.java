package saber.task;

import saber.time.SaberTime;
import saber.exceptions.SaberTimeParserException;

/**
 * A class to encapsulate a deadline type task
 */
public class Deadline extends Task {

    protected SaberTime by;

    /**
     * A constructor for Deadline type task
     * @param description the description of the deadline task
     * @param by the time the deadline task should be due by
     * @param isDone the completion status of the deadline task
     * @throws SaberTimeParserException if the time is of an unrecognizable format
     */
    public Deadline(String description, String by, boolean isDone) throws SaberTimeParserException {
        super(description, isDone);
        this.by = new SaberTime(by);
    }

    /**
     * A function to get the time of the deadline
     * @return time of the deadline in string
     */
    public String getTimeInString() {
        return by.toString();
    }

    /**
     * A function to return the string representation of a deadline task
     * @return String representation of a deadline task
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}