package com.mood;

import java.util.Locale;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message=message;

    }

    public String analyseMood(String message)throws MoodAnalysisException {
        try{
        if(message.toLowerCase(Locale.ROOT).contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
        }catch (NullPointerException e){
            throw new MoodAnalysisException("You have entered,Please try again");
        }

    }
}






