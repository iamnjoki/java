
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    @Override
    public boolean equals(Object compared){
        
        if(!(compared instanceof Person))
            return false;
        
        
        if(this == compared)
            return true;
        
        
        Person person = (Person) compared;
        
        if(this.name.equals(person.name) &&
            this.birthday.equals(person.birthday)&&
            this.height == person.height &&
            this.weight == person.weight )
                return true;
        
       return false;
    }

    /*@Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.birthday);
        hash = 61 * hash + this.height;
        hash = 61 * hash + this.weight;
        return hash;
    }*/
    
}
