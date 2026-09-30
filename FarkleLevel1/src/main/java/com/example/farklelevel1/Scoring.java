package com.example.farklelevel1;

import java.util.ArrayList;

public class Scoring {

    private int scoreRolls(ArrayList<Integer> diceScoring){

        int num1s = 0;
        int num5s = 0;

        int numPairs = 0;

        int score = 0;

        for (int i = 0; i < diceScoring.size(); i++) {
            //figure out what is in the array
            if (diceScoring.get(i) == 1){
                num1s+=1;
            }
            if (diceScoring.get(i) == 5){
                num5s+=1;
            }
            //actual scoring below

            //singles
            if (num1s == 1){
                score+=100;
            }
            if (num5s == 5){
                score+=50;
            }
            //triples
            //four of a kind
            //five of a kind
            //six of a kind
            //straight
            //three pairs
            //four of a kind + pair
            //two triples
        }
        return score;
    }

}
