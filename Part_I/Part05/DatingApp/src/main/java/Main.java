
public class Main {

    public static void main(String[] args) {
        // test your program here!
    
    SimpleDate date = new SimpleDate(13, 2, 2015);
    //System.out.println("Friday of the examined week is " + pvm);

    SimpleDate newDate = date.afterNumberOfDays(7);
    
    int week = 1;
    while (week <= 7) {
        System.out.println("Friday after " + week + " weeks is " + newDate);
        newDate = newDate.afterNumberOfDays(7);

        week = week + 1;
    }
    
    System.out.println("Friday after 790 days from 13.2.2015 is... " + date.afterNumberOfDays(790)); 
   
    boolean isBefore = date.before(new SimpleDate(12, 2, 2015));
        System.out.println("Date object is before: " + isBefore);
    }
}
