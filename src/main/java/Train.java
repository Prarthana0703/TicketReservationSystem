/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakha
 */
public class Train {
    String model;
    int trainId;

    public Train(String model, int trainId) {
        this.model = model;
        this.trainId = trainId;
    }

    public void showTrain() {   // ✅ THIS METHOD MUST EXIST
        System.out.println("Train ID: " + trainId + ", Model: " + model);
    }
}