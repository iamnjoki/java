/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package default Package;

/**
 *
 * @author pak
 */

import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messages;
    
    
    public MessagingService(){
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message){
        String sms = message.getContent();
        int len = sms.length();
     
        if(len <= 280) messages.add(message);
        
    }
    
    public ArrayList<Message> getMessages(){
        ArrayList<Message> newMessagesList = new ArrayList<>();
        
        for(Message message : messages)
            newMessagesList.add(message);
        
        return newMessagesList;
    }
}

