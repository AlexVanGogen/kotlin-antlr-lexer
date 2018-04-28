package ru.spbau.mit.fl.grammar;

import org.antlr.v4.runtime.RecognitionException;

public class ParserException extends Exception {
    public ParserException(String message) {
        super(message);
    }
}
