package com.mood;

public class MoodAnalysisException extends Exception{
    public exceptionType type;
    public MoodAnalysisException(String message)
    {
        super(message);
        this.type=type;
    }
    public enum exceptionType
    {
        NULL,
        EMPTY
    }


}
