
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        Book comparedBook = (Book) compared;
        if(this.name.equals(comparedBook.getName()) && 
            this.publicationYear == comparedBook.getPublicationYear())
                return true;
        return false;
    }

}