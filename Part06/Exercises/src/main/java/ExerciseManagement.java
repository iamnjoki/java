
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
      }
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        
        exercises.forEach(ex -> {
            list.add(ex.getName());
        });
            return list;
    }
    
    public void add(String exercise){
        exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise){
        for (Exercise ex : exercises){
            if(ex.getName().equals(exercise))
                ex.setCompleted(true);
        }
    }
    
    public boolean isCompleted(String exercise){
        for( Exercise ex : exercises){
            if(ex.getName().equals(exercise))
               return ex.isCompleted();
        }
        
        return false;
    }
    
    public void remove(String toRemove){
        boolean onTheList = false;
        
        for(Exercise e : exercises){
            if(e.getName().equals(toRemove)){
                onTheList = true;
                exercises.remove(e);
            }
        }
        
        if(!onTheList)
            System.out.println("Not on the list");
    }
    
}
