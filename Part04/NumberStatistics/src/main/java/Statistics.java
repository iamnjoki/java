
public class Statistics {
    private int count = 0;
    private int sum = 0;
    
    
    public Statistics(){
        this.count = 0;
    }
    
    public void addNumber(int number){
        this.count++;
        this.sum += number;
     }
    
    public int getCount(){ 
        return count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
      double avg;
      
      if(this.count == 0){
          avg = 0;
          return avg;
      }
          
      return  1.0 * this.sum / this.count;
    }
}
