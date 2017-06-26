package com.example.kamonwan.thaispellinggame.model;

/**
 * Created by kamonwan on 6/26/2017.
 */

public class RoyalLearn {
    private String wordOne;
    private String wordTwo;

    public RoyalLearn(String wordOne, String wordTwo) {
        this.wordOne = wordOne;
        this.wordTwo = wordTwo;
    }

    public String getWordOne() {
        return wordOne;
    }

    public void setWordOne(String wordOne) {
        this.wordOne = wordOne;
    }

    public String getWordTwo() {
        return wordTwo;
    }

    public void setWordTwo(String wordTwo) {
        this.wordTwo = wordTwo;
    }

}