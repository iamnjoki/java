/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class Info {
    private String identifier;
    private String name;
    
    public Info(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    
    @Override
    public boolean equals(Object compared){
        Info comparedInfo = (Info) compared;
        return this.identifier.equals(comparedInfo.identifier);    
    }
    
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name + ".";
    }
}
