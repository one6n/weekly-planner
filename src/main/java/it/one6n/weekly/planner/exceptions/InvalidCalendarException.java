package it.one6n.weekly.planner.exceptions;

public class InvalidCalendarException extends RuntimeException {

	private static final long serialVersionUID = 2623116399540819813L;

	public InvalidCalendarException() {
		super();
	}

	public InvalidCalendarException(String message) {
		super(message);
	}

	public InvalidCalendarException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidCalendarException(Throwable cause) {
		super(cause);
	}
}
