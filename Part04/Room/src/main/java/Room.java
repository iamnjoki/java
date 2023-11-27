/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class Room {
    private String code;
    private int seats;
    
    
    public Room(){
        this.code = "12";
        this.seats = 2;
    }
    
    public Room(String classCode, int numberOfSeats){
        this.code = classCode;
        this.seats = numberOfSeats;
    }
    
    @Override
    public String toString(){
        return "The room code is: " + this.code + ", the num of seats is: " + this.seats;
    }
}

