
public class MainProgram {

    // update here your exercise progress
    
    //toDo write a test for removing exercises
    
    public static void main(String[] args){
        ExerciseManagement management = new ExerciseManagement();
        String learnOOP = "learn OOP";
        String code = "Code";
        String hike = "Hike";
        
        management.add(learnOOP);
        management.add(code);
        management.add(hike);
        
        System.out.println("Learn OOP done: " + management.isCompleted(learnOOP));
        management.markAsCompleted(learnOOP);
        System.out.println("Learn OOP done: " + management.isCompleted(learnOOP));
        System.out.println();
        System.out.println("Exercises: " + management.exerciseList());
        management.remove("cod");
        management.remove(code);
        System.out.println("Exercises: " + management.exerciseList());
        System.out.println();
        System.out.println("Went hiking: " + management.isCompleted(hike));
    }


    

    



}