
public class Main {

    public static void main(String[] args) {
        // Test your program here
        
        IOU iou = new IOU();
        
        String personOne = "John";
        String personTwo = "Reachel";
        String personThree = "Them";
        
        iou.setSum(personOne, 2.40);
        iou.setSum(personTwo, 11.50);
        iou.setSum(personThree, 22.12);
        
        double howMuch = iou.howMuchDoIOweTo(personThree);
        System.out.println(howMuch);
    }
}
