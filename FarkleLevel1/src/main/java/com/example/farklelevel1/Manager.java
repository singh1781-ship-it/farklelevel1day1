package com.example.farklelevel1;

import java.util.ArrayList;

public class Manager {

    private Player player = new Player();
    private Scoring scoring = new Scoring();

    private int[] rolls = new int[6];
    private boolean[] diceKept = new boolean[6];
    private ArrayList<Integer> diceScoring = new ArrayList<>();
    private ArrayList<Integer> players = new ArrayList<>();

    private int score;


    private int[] diceRoll(){

        for (int i = 0; i < 6; i++) {
            rolls[i] = (int)(Math.random() * (6) + 1);
            System.out.println(rolls[i]);
        }
        return rolls;
    }



}
