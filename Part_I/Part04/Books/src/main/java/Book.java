/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class Book {
    private String title;
    private int pages;
    private int yearOfPublication;
    
    public Book(String title, int pages, int yearOfPublication){
        this.title = title;
        this.pages = pages;
        this.yearOfPublication = yearOfPublication;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int yearOfPublication(){
        return this.yearOfPublication;
    }
    
    @Override
    public String toString(){
        return this.title +", " + this.pages + " pages, " + this.yearOfPublication;
    }
}
