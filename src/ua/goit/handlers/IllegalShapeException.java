package ua.goit.handlers;

public class IllegalShapeException extends Exception {
    IllegalShapeException() {
        super("Unknown shape");
    }
}
