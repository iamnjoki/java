
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Empty room? " + room.isEmpty());
        
        Person p = new Person("Paul", 210);
        room.add(new Person("Pauline", 120));
        room.add(p);
        
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());
       
        
        System.out.println();
        room.getPersons().forEach(prs -> {
            System.out.println(prs);
        });
        
        System.out.println();
        System.out.println("Shortest: " + room.shortest());
        System.out.println();
        
        System.out.println("Shortest to remove: " + room.take());
        System.out.println();
        
        room.getPersons().forEach(person -> {
            System.out.println(person);
        });

    }
}
