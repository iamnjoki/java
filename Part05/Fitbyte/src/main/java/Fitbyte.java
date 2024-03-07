/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int rhb){
        this.age = age;
        this.restingHeartRate = rhb;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = 206.3 - (0.711 * age);
        return (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}
