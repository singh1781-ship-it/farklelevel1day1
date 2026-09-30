package com.example.farklelevel1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

import java.util.ArrayList;

public class HelloController {

    public ToggleButton btnDice1,btnDice2,btnDice3,btnDice4,btnDice5,btnDice6;
    private ArrayList<ToggleButton> toggles = new ArrayList<>();
    private Manager manager = new Manager();

    @FXML

    public void initialize(){
        toggles.add(btnDice1);
        toggles.add(btnDice2);
        toggles.add(btnDice3);
        toggles.add(btnDice4);
        toggles.add(btnDice5);
        toggles.add(btnDice6);

        String[] example = {"a", "b", "c"};

        for (int i = 0; i < toggles.size(); i++) {
            toggles.get(i).setText(example[i]);
        }
    }

    public void btnRoll(ActionEvent actionEvent) {

    }

    public void btnDice1(ActionEvent actionEvent) {
    }
    public void btnDice2(ActionEvent actionEvent) {
    }
    public void btnDice3(ActionEvent actionEvent) {
    }
    public void btnDice4(ActionEvent actionEvent) {
    }
    public void btnDice5(ActionEvent actionEvent) {
    }
    public void btnDice6(ActionEvent actionEvent) {
    }

}
