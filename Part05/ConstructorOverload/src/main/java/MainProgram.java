
public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product flour = new Product("jogoo");
        Product sugar = new Product("brown sugar", "households aisle 2");
        Product salt = new Product("kensalt", 1);
        Product roadSideFood = new Product(2, "Mutura");
        
        System.out.println(flour);
        System.out.println(sugar);
        System.out.println(salt);
        System.out.println(roadSideFood);
    }
}
