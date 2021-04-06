package com.mood;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyzerTest {
    @Test
     public void testMoodAnalysis() throws Exception {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.message="I am in sad mood";
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("SAD",mood);
    }
}
