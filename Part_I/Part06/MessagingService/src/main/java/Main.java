/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package default Package;

import java.util.ArrayList;

/**
 *
 * @author pak
 */
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService mservice = new MessagingService();
        
        Message msg = new Message("Pauline", "Exited to explore Frankfurt!");
        Message ms = new Message("Key", "Hi, hope you are fine");
        Message m = new Message("Simone", "Are you curious about what oop means in texting?");
        
        mservice.add(msg);
        mservice.add(ms);
        mservice.add(m);
        
        ArrayList<Message> manyMessages = mservice.getMessages();
        System.out.println(manyMessages);
        
    }
    
   
}



